import unittest
from unittest.mock import patch
from typed_ast import ast3 as ast
from utils.tree import get_closest_parent_o
from ..utils.helpers import warn
from ..exceptions import NodeNotFound
from .base import BaseNodeTransformer
from py_backwards.transformers.super_without_arguments import SuperWithoutArgumentsTransformer


class TestSuperWithoutArgumentsTransformer(unittest.TestCase):
    def setUp(self):
        self.transformer = SuperWithoutArgumentsTransformer()

    def test_replace_super_args(self):
        node = ast.Call(func=ast.Name(id='super'), args=[])
        self.transformer._replace_super_args(node)
        self.assertEqual(node.args, [ast.Name(id='super'), ast.Name(id='func')])

    def test_visit_Call(self):
        node = ast.Call(func=ast.Name(id='super'), args=[])
        result = self.transformer.visit_Call(node)
        self.assertEqual(result, node)
        self.assertTrue(self.transformer._tree_changed)

    @patch('py_backwards.transformers.super_without_arguments.get_closest_parent_of')
    def test_visit_Call_get_closest_parent_of_NodeNotFound(self, mock_get_closest_parent_of):
        node = ast.Call(func=ast.Name(id='super'), args=[])
        mock_get_closest_parent_of.side_effect = NodeNotFound
        result = self.transformer.visit_Call(node)
        self.assertEqual(result, node)
        self.assertFalse(self.transformer._tree_changed)
        self.assertEqual(warn.call_args[0][0], 'super() outside of function')

    @patch('py_backwards.transformers.super_without_arguments.get_closest_parent_of')
    def test_visit_Call_get_closest_parent_of_FunctionDef(self, mock_get_closest_parent_of):
        node = ast.Call(func=ast.Name(id='super'), args=[])
        mock_get_closest_parent_of.return_value = ast.FunctionDef
        result = self.transformer.visit_Call(node)
        self.assertEqual(result, node)
        self.assertFalse(self.transformer._tree_changed)

    @patch('py_backwards.transformers.super_without_arguments.get_closest_parent_of')
    def test_visit_Call_get_closest_parent_of_ClassDef(self, mock_get_closest_parent_of):
        node = ast.Call(func=ast.Name(id='super'), args=[])
        mock_get_closest_parent_of.return_value = ast.ClassDef
        result = self.transformer.visit_Call(node)
        self.assertEqual(result, node)
        self.assertFalse(self.transformer._tree_changed)

if __name__ == '__main__':
    unittest.main()