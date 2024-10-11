import unittest
from typed_ast import ast3 as ast
from utils.tree import fin
from ..types import TransformationResult
from .base import BaseTransformer
from py_backwards.transformers.string_types import StringTypesTransformer


class TestStringTypesTransformer(unittest.TestCase):
    def test_transform(self):
        tree = ast.parse("a = str('hello')")
        result = StringTypesTransformer().transform(tree)
        self.assertTrue(result.tree_changed)
        self.assertEqual(result.tree.ast_node_names(), ['a', 'unicode'])

    def test_transform_no_change(self):
        tree = ast.parse("a = 1")
        result = StringTypesTransformer().transform(tree)
        self.assertFalse(result.tree_changed)
        self.assertEqual(result.tree.ast_node_names(), ['a'])

    def test_transform_multiple_nodes(self):
        tree = ast.parse("a = str('hello'); b = str('world')")
        result = StringTypesTransformer().transform(tree)
        self.assertTrue(result.tree_changed)
        self.assertEqual(result.tree.ast_node_names(), ['a', 'unicode', 'b', 'unicode'])

    def test_transform_no_str_node(self):
        tree = ast.parse("a = 1 + 2")
        result = StringTypesTransformer().transform(tree)
        self.assertFalse(result.tree_changed)
        self.assertEqual(result.tree.ast_node_names(), ['a'])

    def test_transform_str_node_not_changed(self):
        tree = ast.parse("a = 'hello'")
        result = StringTypesTransformer().transform(tree)
        self.assertFalse(result.tree_changed)
        self.assertEqual(result.tree.ast_node_names(), ['a'])

    def test_transform_str_node_changed(self):
        tree = ast.parse("a = str('hello')")
        result = StringTypesTransformer().transform(tree)
        self.assertTrue(result.tree_changed)
        self.assertEqual(result.tree.ast_node_names(), ['a', 'unicode'])

if __name__ == '__main__':
    unittest.main()