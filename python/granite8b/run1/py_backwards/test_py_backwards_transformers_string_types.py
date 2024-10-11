import ast
import unittest
from py_backwards.transformers.string_types import StringTypesTransformer


class TestStringTypesTransformer(unittest.TestCase):
    def test_transform_str_name(self):
        tree = ast.parse('str x = "hello"')
        result = StringTypesTransformer.transform(tree)
        self.assertEqual(result.tree.body[0].targets[0].id, 'unicode')

    def test_transform_str_attribute(self):
        tree = ast.parse('x.str')
        result = StringTypesTransformer.transform(tree)
        self.assertEqual(result.tree.body[0].value.attr, 'str')

    def test_transform_str_function_call(self):
        tree = ast.parse('str("hello")')
        result = StringTypesTransformer.transform(tree)
        self.assertEqual(result.tree.body[0].value.id, 'unicode')

    def test_transform_str_function_call_with_args(self):
        tree = ast.parse('str("hello", "utf-8")')
        result = StringTypesTransformer.transform(tree)
        self.assertEqual(result.tree.body[0].value.id, 'unicode')

    def test_transform_str_function_call_with_kwargs(self):
        tree = ast.parse('str("hello", encoding="utf-8")')
        result = StringTypesTransformer.transform(tree)
        self.assertEqual(result.tree.body[0].value.id, 'unicode')

    def test_transform_str_function_call_with_star_args(self):
        tree = ast.parse('str(*args)')
        result = StringTypesTransformer.transform(tree)
        self.assertEqual(result.tree.body[0].value.id, 'unicode')

    def test_transform_str_function_call_with_star_kwargs(self):
        tree = ast.parse('str(**kwargs)')
        result = StringTypesTransformer.transform(tree)
        self.assertEqual(result.tree.body[0].value.id, 'unicode')

    def test_transform_str_function_call_with_double_star_kwargs(self):
        tree = ast.parse('str(**kwargs)')
        result = StringTypesTransformer.transform(tree)
        self.assertEqual(result.tree.body[0].value.id, 'unicode')

    def test_transform_str_function_call_with_multiple_args_and_kwargs(self):
        tree = ast.parse('str("hello", *args, encoding="utf-8", **kwargs)')
        result = StringTypesTransformer.transform(tree)
        self.assertEqual(result.tree.body[0].value.id, 'unicode')

if __name__ == '__main__':
    unittest.main()