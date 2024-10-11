import unittest
from typed_ast import ast3 as ast
from py_backwards.transformers.string_types import StringTypesTransformer
from py_backwards.types import TransformationResult
from py_backwards.utils.tree import find


class TestStringTypesTransformer(unittest.TestCase):
    def test_transform_no_change(self):
        tree = ast.parse("a = 1")
        result = StringTypesTransformer.transform(tree)
        self.assertFalse(result.tree_changed)

    def test_transform_with_change(self):
        tree = ast.parse("a = str(1)")
        result = StringTypesTransformer.transform(tree)
        self.assertTrue(result.tree_changed)
        self.assertEqual(result.tree.body[0].value.func.id, 'unicode')

    def test_transform_result_type(self):
        tree = ast.parse("a = str(1)")
        result = StringTypesTransformer.transform(tree)
        self.assertIsInstance(result, TransformationResult)

    def test_transform_result_tree(self):
        tree = ast.parse("a = str(1)")
        result = StringTypesTransformer.transform(tree)
        self.assertIsInstance(result.tree, ast.AST)

    def test_transform_result_tree_changed(self):
        tree = ast.parse("a = str(1)")
        result = StringTypesTransformer.transform(tree)
        self.assertTrue(result.tree_changed)

    def test_transform_result_errors(self):
        tree = ast.parse("a = str(1)")
        result = StringTypesTransformer.transform(tree)
        self.assertEqual(result.error_messages, [])

if __name__ == '__main__':
    unittest.main()