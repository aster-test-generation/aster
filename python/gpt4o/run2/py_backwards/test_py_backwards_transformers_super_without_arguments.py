import unittest
from typed_ast import ast3 as ast
from py_backwards.transformers.super_without_arguments import SuperWithoutArgumentsTransformer
from py_backwards.utils.tree import get_closest_parent_of
from py_backwards.utils.helpers import warn
from py_backwards.exceptions import NodeNotFound
from py_backwards.transformers.base import BaseNodeTransformer


class TestSuperWithoutArgumentsTransformer(unittest.TestCase):
    def setUp(self):
        self.transformer = SuperWithoutArgumentsTransformer(tree)
        self.transformer._tree = ast.Module()

    def test_replace_super_args_function_not_found(self):
        node = ast.Call()
        with self.assertRaises(NodeNotFound):
            get_closest_parent_of(self.transformer._tree, node, ast.FunctionDef)
        with self.assertWarns(UserWarning):
            self.transformer._replace_super_args(node)

    def test_replace_super_args_class_not_found(self):
        node = ast.Call()
        func = ast.FunctionDef(name='test_func', args=ast.arguments(args=[ast.arg(arg='self')], vararg=None, kwarg=None, defaults=[]))
        self.transformer._tree.body.append(func)
        with self.assertRaises(NodeNotFound):
            get_closest_parent_of(self.transformer._tree, node, ast.ClassDef)
        with self.assertWarns(UserWarning):
            self.transformer._replace_super_args(node)

    def test_replace_super_args_success(self):
        node = ast.Call()
        func = ast.FunctionDef(name='test_func', args=ast.arguments(args=[ast.arg(arg='self')], vararg=None, kwarg=None, defaults=[]))
        cls = ast.ClassDef(name='TestClass', body=[func])
        self.transformer._tree.body.append(cls)
        self.transformer._replace_super_args(node)
        self.assertEqual(len(node.args), 2)
        self.assertEqual(node.args[0].id, 'TestClass')
        self.assertEqual(node.args[1].id, 'self')

    def test_visit_Call_with_super(self):
        node = ast.Call(func=ast.Name(id='super'), args=[])
        self.transformer.visit_Call(node)
        self.assertTrue(self.transformer._tree_changed)

    def test_visit_Call_without_super(self):
        node = ast.Call(func=ast.Name(id='not_super'), args=[])
        result = self.transformer.visit_Call(node)
        self.assertEqual(result, node)

    def test_visit_Call_with_super_with_args(self):
        node = ast.Call(func=ast.Name(id='super'), args=[ast.Name(id='arg1')])
        result = self.transformer.visit_Call(node)
        self.assertEqual(result, node)

if __name__ == '__main__':
    unittest.main()