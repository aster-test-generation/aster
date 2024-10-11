import unittest
from py_backwards.transformers.string_types import StringTypesTransformer
from typed_ast import ast3 as ast
from utils.tree import find
from ..types import TransformationResult


class TestStringTypesTransformer(unittest.TestCase):
    def test_transform_name(self):
        tree = ast.parse('x = str("hello")')
        result = StringTypesTransformer.transform(tree)
        self.assertEqual(result.transformed_source, 'x = unicode("hello")')

    def test_transform_name_no_change(self):
        tree = ast.parse('x = "hello"')
        result = StringTypesTransformer.transform(tree)
        self.assertEqual(result.transformed_source, 'x = "hello"')

    def test_transform_name_no_change_unicode(self):
        tree = ast.parse('x = unicode("hello")')
        result = StringTypesTransformer.transform(tree)
        self.assertEqual(result.transformed_source, 'x = unicode("hello")')

    def test_transform_name_no_change_bytes(self):
        tree = ast.parse('x = bytes("hello")')
        result = StringTypesTransformer.transform(tree)
        self.assertEqual(result.transformed_source, 'x = bytes("hello")')

    def test_transform_name_no_change_bytearray(self):
        tree = ast.parse('x = bytearray("hello")')
        result = StringTypesTransformer.transform(tree)
        self.assertEqual(result.transformed_source, 'x = bytearray("hello")')

    def test_transform_name_no_change_memoryview(self):
        tree = ast.parse('x = memoryview("hello")')
        result = StringTypesTransformer.transform(tree)
        self.assertEqual(result.transformed_source, 'x = memoryview("hello")')

if __name__ == '__main__':
    unittest.main()