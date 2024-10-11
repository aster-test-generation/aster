import ast
import unittest
from py_backwards.transformers.string_types import StringTypesTransformer


class TestStringTypesTransformer(unittest.TestCase):
    def test_transform(self):
        tree = ast.parse("s = 'str'")
        result = StringTypesTransformer().transform(tree)
        self.assertTrue(result.tree_changed)
        self.assertEqual(result.tree.ast_node_names(), ['s', 'unicode'])

    def test_transform_no_match(self):
        tree = ast.parse("s = 5")
        result = StringTypesTransformer().transform(tree)
        self.assertFalse(result.tree_changed)
        self.assertEqual(result.tree.ast_node_names(), ['s'])

    def test_transform_multiple_matches(self):
        tree = ast.parse("s = 'str'; t = 'str'")
        result = StringTypesTransformer().transform(tree)
        self.assertTrue(result.tree_changed)
        self.assertEqual(result.tree.ast_node_names(), ['s', 'unicode', 't', 'unicode'])

    def test_transform_no_nodes(self):
        tree = ast.parse("")
        result = StringTypesTransformer().transform(tree)
        self.assertFalse(result.tree_changed)
        self.assertEqual(result.tree.ast_node_names(), [])

    def test_transform_node_not_name(self):
        tree = ast.parse("s = ast")
        result = StringTypesTransformer().transform(tree)
        self.assertFalse(result.tree_changed)
        self.assertEqual(result.tree.ast_node_names(), ['s'])

    def test_transform_node_not_match(self):
        tree = ast.parse("s = 'int'")
        result = StringTypesTransformer().transform(tree)
        self.assertFalse(result.tree_changed)
        self.assertEqual(result.tree.ast_node_names(), ['s'])

    def test_transform_node_match(self):
        tree = ast.parse("s = 'str'")
        result = StringTypesTransformer().transform(tree)
        self.assertTrue(result.tree_changed)
        self.assertEqual(result.tree.ast_node_names(), ['s', 'unicode'])

    def test_transform_node_multiple_matches(self):
        tree = ast.parse("s = 'str'; t = 'str'")
        result = StringTypesTransformer().transform(tree)
        self.assertTrue(result.tree_changed)
        self.assertEqual(result.tree.ast_node_names(), ['s', 'unicode', 't', 'unicode'])

if __name__ == '__main__':
    unittest.main()