import unittest
from unittest.mock import patch
from typed_ast import ast3 as ast
from utils.tree import get_closest_parent_o
from ..utils.helpers import warn
from ..exceptions import NodeNotFound
from .base import BaseNodeTransformer
from py_backwards.transformers.super_without_arguments import SuperWithoutArgumentsTransformer


class TestSuperWithoutArgumentsTransformer(unittest.TestCase):
    def test_replace_super_args(self):
        transformer = SuperWithoutArgumentsTransformer()
        node = ast.Call(func=ast.Name(id='super'), args=[])
        transformer._replace_super_args(node)
        self.assertEqual(len(node.args), 2)
        self.assertEqual(node.args[0].id, 'super')
        self.assertEqual(node.args[1].id, 'func')

    @patch('py_backwards.transformers.super_without_arguments.get_closest_parent_of')
    def test_visit_Call_super(self, mock_get_closest_parent_of):
        transformer = SuperWithoutArgumentsTransformer()
        node = ast.Call(func=ast.Name(id='super'), args=[])
        mock_get_closest_parent_of.return_value = (ast.ClassDef(name='cls'), ast.FunctionDef(name='func'))
        result = transformer.visit_Call(node)
        self.assertEqual(result, node)
        self.assertTrue(transformer._tree_changed)

    @patch('py_backwards.transformers.super_without_arguments.get_closest_parent_of')
    def test_visit_Call_super_outside_function(self, mock_get_closest_parent_of):
        transformer = SuperWithoutArgumentsTransformer()
        node = ast.Call(func=ast.Name(id='super'), args=[])
        mock_get_closest_parent_of.side_effect = NodeNotFound()
        result = transformer.visit_Call(node)
        self.assertEqual(result, node)
        self.assertFalse(transformer._tree_changed)

    @patch('py_backwards.transformers.super_without_arguments.get_closest_parent_of')
    def test_visit_Call_super_outside_class(self, mock_get_closest_parent_of):
        transformer = SuperWithoutArgumentsTransformer()
        node = ast.Call(func=ast.Name(id='super'), args=[])
        mock_get_closest_parent_of.side_effect = NodeNotFound()
        result = transformer.visit_Call(node)
        self.assertEqual(result, node)
        self.assertFalse(transformer._tree_changed)

    def test_visit_Call_not_super(self):
        transformer = SuperWithoutArgumentsTransformer()
        node = ast.Call(func=ast.Name(id='other'), args=[])
        result = transformer.visit_Call(node)
        self.assertEqual(result, node)

class TestSuperWithoutArgumentsTransformer(unittest.TestCase):
    def test_replace_super_args(self):
        transformer = SuperWithoutArgumentsTransformer()
        node = ast.Call(ast.Name(id='super'), [])
        transformer._replace_super_args(node)
        self.assertEqual(node.args, [ast.Name(id='BaseNodeTransformer'), ast.Name(id='func')])

    @patch('py_backwards.transformers.super_without_arguments.get_closest_parent_of')
    def test_visit_Call(self, mock_get_closest_parent_of):
        transformer = SuperWithoutArgumentsTransformer()
        node = ast.Call(ast.Name(id='super'), [])
        mock_get_closest_parent_of.return_value = (ast.ClassDef(name='cls'), ast.FunctionDef(name='func'))
        result = transformer.visit_Call(node)
        self.assertEqual(result, node)
        self.assertTrue(transformer._tree_changed)

    def test_visit_Call_no_super(self):
        transformer = SuperWithoutArgumentsTransformer()
        node = ast.Call(ast.Name(id='other'), [])
        result = transformer.visit_Call(node)
        self.assertEqual(result, node)

    def test_visit_Call_super_with_args(self):
        transformer = SuperWithoutArgumentsTransformer()
        node = ast.Call(ast.Name(id='super'), [ast.arg(arg='arg')])
        result = transformer.visit_Call(node)
        self.assertEqual(result, node)

    def test_visit_Call_super_outside_function(self):
        transformer = SuperWithoutArgumentsTransformer()
        node = ast.Call(ast.Name(id='super'), [], parent=ast.Module())
        result = transformer.visit_Call(node)
        self.assertEqual(result, node)

    def test_visit_Call_super_outside_class(self):
        transformer = SuperWithoutArgumentsTransformer()
        node = ast.Call(ast.Name(id='super'), [], parent=ast.Module())
        result = transformer.visit_Call(node)
        self.assertEqual(result, node)

if __name__ == '__main__':
    unittest.main()