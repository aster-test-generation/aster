import unittest
from py_backwards.transformers.string_types import StringTypesTransformer


class TestStringTypesTransformer(unittest.TestCase):
    def test_transform_method(self):
        import ast
        result = StringTypesTransformer.transform(tree)
        self.assertEqual(result.transformed_source, "a = unicode()")

    def test_transform_method_with_args(self):
        import ast
        result = StringTypesTransformer.transform(tree)
        self.assertEqual(result.transformed_source, "a = unicode(1)")

    def test_transform_method_with_kwargs(self):
        tree = ast.parse("a = str(1)")
        result = StringTypesTransformer.transform(tree)
        self.assertEqual(result.transformed_source, "a = unicode(x=1)")

    def test_transform_method_with_args_and_kwargs(self):
        tree = ast.parse("a = str(1, 2)")
        result = StringTypesTransformer.transform(tree)
        self.assertEqual(result.transformed_source, "a = unicode(1, x=2)")

    def test_transform_method_with_starred_args(self):
        tree = ast.parse("a = str(*args)")
        result = StringTypesTransformer.transform(tree)
        self.assertEqual(result.transformed_source, "a = unicode(*args)")

    def test_transform_method_with_double_starred_kwargs(self):
        tree = ast.parse("a = str()")
        result = StringTypesTransformer.transform(tree)
        self.assertEqual(result.transformed_source, "a = unicode(**kwargs)")

    def test_transform_method_with_starred_args_and_kwargs(self):
        tree = ast.parse("a = str()")
        result = StringTypesTransformer.transform(tree)
        self.assertEqual(result.transformed_source, "a = unicode(*args, **kwargs)")

    def test_transform_method_with_lambda(self):
        tree = ast.parse("a = str(lambda x: x)")
        result = StringTypesTransformer.transform(tree)
        self.assertEqual(result.transformed_source, "a = unicode(lambda x: x)")

    def test_transform_method_with_lambda_and_args(self):
        tree = ast.parse("a = str(lambda x: x, 1)")
        result = StringTypesTransformer.transform(tree)
        self.assertEqual(result.transformed_source, "a = unicode(lambda x: x, 1)")

    def test_transform_method_with_lambda_and_kwargs(self):
        tree = ast.parse("a = str(lambda x: x, x=1)")
        result = StringTypesTransformer.transform(tree)
        self.assertEqual(result.transformed_source, "a = unicode(lambda x: x, x=1)")

    def test_transform_method_with_lambda_and_args_and_kwargs(self):
        tree = ast.parse("a = str(lambda x: x, 1, x=2)")
        result = StringTypesTransformer.transform(tree)
        self.assertEqual(result.transformed_source, "a = unicode(lambda x: x, 1, x=2)")

    def test_transform_method_with_lambda_and_starred_args(self):
        tree = ast.parse("a = str(lambda x, *args: x)")
        result = StringTypesTransformer.transform(tree)
        self.assertEqual(result.transformed_source, "a = unicode(lambda x: x, *args)")

    def test_transform_method_with_lambda_and_double_starred_kwargs(self):
        tree = ast.parse("a = str(lambda x: x, **kwargs)")
        result = StringTypesTransformer.transform(tree)
        self.assertEqual(result.transformed_source, "a = unicode(lambda x: x, **kwargs)")

    def test_transform_method_with_lambda_and_starred_args_and_kwargs(self):
        tree = ast.parse("a = str(lambda x: x, *args, **kwargs)")
        result = StringTypesTransformer.transform(tree)
        self.assertEqual(result.transformed_source, "a = unicode(lambda x: x, *args, **kwargs)")

if __name__ == '__main__':
    unittest.main()