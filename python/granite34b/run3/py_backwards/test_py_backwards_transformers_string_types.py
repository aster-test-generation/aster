import unittest
from py_backwards.transformers.string_types import StringTypesTransformer
from typed_ast import ast3 as ast
from utils.tree import find
from ..types import TransformationResult


class TestStringTypesTransformer(unittest.TestCase):
    def test_transform_no_change(self):
        tree = ast.parse("x = 'hello'")
        result = StringTypesTransformer.transform(tree)
        self.assertEqual(result.transformed_source, "x = 'hello'")

    def test_transform_change(self):
        tree = ast.parse("x = str('hello')")
        result = StringTypesTransformer.transform(tree)
        self.assertEqual(result.transformed_source, "x = unicode('hello')")

    def test_transform_change_twice(self):
        tree = ast.parse("x = str(str('hello'))")
        result = StringTypesTransformer.transform(tree)
        self.assertEqual(result.transformed_source, "x = unicode(unicode('hello'))")

    def test_transform_no_change_function_call(self):
        tree = ast.parse("x = len('hello')")
        result = StringTypesTransformer.transform(tree)
        self.assertEqual(result.transformed_source, "x = len('hello')")

    def test_transform_change_function_call(self):
        tree = ast.parse("x = len(str('hello'))")
        result = StringTypesTransformer.transform(tree)
        self.assertEqual(result.transformed_source, "x = len(unicode('hello'))")

    def test_transform_change_function_call_twice(self):
        tree = ast.parse("x = len(str(str('hello')))")
        result = StringTypesTransformer.transform(tree)
        self.assertEqual(result.transformed_source, "x = len(unicode(unicode('hello')))")

if __name__ == '__main__':
    unittest.main()