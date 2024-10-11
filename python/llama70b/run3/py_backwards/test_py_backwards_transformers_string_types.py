import unittest
from py_backwards.transformers.string_types import StringTypesTransformer, BaseTransformer


class TestStringTypesTransformer(unittest.TestCase):
    def test_transform(self):
        tree = ast.parse("str")  # create a simple AST tree
        result = StringTypesTransformer.transform(tree)
        self.assertIsInstance(result, TransformationResult)
        self.assertTrue(result.tree_changed)

    def test_transform_no_change(self):
        tree = ast.parse("int")  # create a simple AST tree that won't be changed
        result = StringTypesTransformer.transform(tree)
        self.assertIsInstance(result, TransformationResult)
        self.assertFalse(result.tree_changed)

    def test_target(self):
        self.assertEqual(StringTypesTransformer.target, (2, 7))

    def test___init__(self):
        instance = StringTypesTransformer()
        self.assertIsInstance(instance, BaseTransformer)

    def test___str__(self):
        instance = StringTypesTransformer()
        result = instance.__str__()
        self.assertEqual(result, "StringTypesTransformer")

    def test___repr__(self):
        instance = StringTypesTransformer()
        result = instance.__repr__()
        self.assertEqual(result, "StringTypesTransformer()")

    def test___eq__(self):
        instance1 = StringTypesTransformer()
        instance2 = StringTypesTransformer()
        self.assertTrue(instance1 == instance2)

    def test__transform(self):
        # This is a protected method, so we need to access it using the class name
        tree = ast.parse("str")  # create a simple AST tree
        result = StringTypesTransformer._StringTypesTransformer__transform(tree)
        self.assertIsInstance(result, TransformationResult)
        self.assertTrue(result.tree_changed)

if __name__ == '__main__':
    unittest.main()