import unittest
from typed_ast import ast3 as ast
from py_backwards.transformers.string_types import StringTypesTransformer
from py_backwards.types import TransformationResult
from py_backwards.utils.tree import find


class TestStringTypesTransformer(unittest.TestCase):
    def test_transform_no_change(self):
        tree = ast.parse("x = 1")
        result = StringTypesTransformer.transform(tree)
        self.assertIsInstance(result, TransformationResult)
        self.assertFalse(result.tree_changed)
        self.assertEqual(result.tree, tree)

    def test_transform_with_change(self):
        tree = ast.parse("x = str(1)")
        result = StringTypesTransformer.transform(tree)
        self.assertIsInstance(result, TransformationResult)
        self.assertTrue(result.tree_changed)
        self.assertEqual(result.tree.body[0].value.func.id, 'unicode')

    def test_transform_empty_tree(self):
        tree = ast.parse("")
        result = StringTypesTransformer.transform(tree)
        self.assertIsInstance(result, TransformationResult)
        self.assertFalse(result.tree_changed)
        self.assertEqual(result.tree, tree)

    def test_transform_multiple_changes(self):
        tree = ast.parse("a = str(1)\nb = str(2)")
        result = StringTypesTransformer.transform(tree)
        self.assertIsInstance(result, TransformationResult)
        self.assertTrue(result.tree_changed)
        self.assertEqual(result.tree.body[0].value.func.id, 'unicode')
        self.assertEqual(result.tree.body[1].value.func.id, 'unicode')

    def test_transform_mixed_changes(self):
        tree = ast.parse("a = str(1)\nb = 2")
        result = StringTypesTransformer.transform(tree)
        self.assertIsInstance(result, TransformationResult)
        self.assertTrue(result.tree_changed)
        self.assertEqual(result.tree.body[0].value.func.id, 'unicode')
        self.assertEqual(result.tree.body[1].value.n, 2)

if __name__ == '__main__':
    unittest.main()