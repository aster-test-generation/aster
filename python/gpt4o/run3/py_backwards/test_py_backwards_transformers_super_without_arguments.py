import unittest
from unittest.mock import MagicMock, patch
from py_backwards.transformers.super_without_arguments import SuperWithoutArgumentsTransformer
from typed_ast import ast3 as ast
from py_backwards.utils.tree import get_closest_parent_of
from py_backwards.utils.helpers import warn
from py_backwards.exceptions import NodeNotFound


class TestSuperWithoutArgumentsTransformer(unittest.TestCase):
    def setUp(self):
        self.transformer = SuperWithoutArgumentsTransformer(tree)
        self.transformer._tree = MagicMock()

    def test_replace_super_args_function_not_found(self):
        node = ast.Call()
        with patch('py_backwards.utils.tree.get_closest_parent_of', side_effect=NodeNotFound):
            with patch('py_backwards.utils.helpers.warn') as mock_warn:
                self.transformer._replace_super_args(node)
                mock_warn.assert_called_once_with('super() outside of function')

    def test_replace_super_args_class_not_found(self):
        node = ast.Call()
        with patch('py_backwards.utils.tree.get_closest_parent_of', side_effect=[MagicMock(), NodeNotFound]):
            with patch('py_backwards.utils.helpers.warn') as mock_warn:
                self.transformer._replace_super_args(node)
                mock_warn.assert_called_once_with('super() outside of class')

    def test_replace_super_args_success(self):
        node = ast.Call()
        func_mock = MagicMock()
        func_mock.args.args = [MagicMock(arg='self')]
        cls_mock = MagicMock()
        cls_mock.name = 'TestClass'
        with patch('py_backwards.utils.tree.get_closest_parent_of', side_effect=[func_mock, cls_mock]):
            self.transformer._replace_super_args(node)
            self.assertEqual(node.args[0].id, 'TestClass')
            self.assertEqual(node.args[1].id, 'self')

    def test_visit_Call_super_without_args(self):
        node = ast.Call(func=ast.Name(id='super'), args=[])
        with patch.object(self.transformer, '_replace_super_args') as mock_replace_super_args:
            self.transformer.visit_Call(node)
            mock_replace_super_args.assert_called_once_with(node)
            self.assertTrue(self.transformer._tree_changed)

    def test_visit_Call_not_super(self):
        node = ast.Call(func=ast.Name(id='not_super'), args=[])
        result = self.transformer.visit_Call(node)
        self.assertEqual(result, node)

    def test_visit_Call_super_with_args(self):
        node = ast.Call(func=ast.Name(id='super'), args=[ast.Name(id='arg1')])
        result = self.transformer.visit_Call(node)
        self.assertEqual(result, node)

if __name__ == '__main__':
    unittest.main()