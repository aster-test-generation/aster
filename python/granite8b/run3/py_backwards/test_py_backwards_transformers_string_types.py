import ast
import unittest
from py_backwards.transformers.string_types import StringTypesTransformer


class TestStringTypesTransformer(unittest.TestCase):
    def test_transform(self):
        tree = ast.parse('str(1)')
        result = StringTypesTransformer.transform(tree)
        self.assertEqual(result.tree.body[0].value.func.id, 'str')

    def test_transform_no_change(self):
        tree = ast.parse('int(1)')
        result = StringTypesTransformer.transform(tree)
        self.assertEqual(result.tree, tree)

    def test_transform_private_method(self):
        tree = ast.parse('str.__init__(1)')
        result = StringTypesTransformer.transform(tree)
        self.assertEqual(result.tree.body[0].value.func.attr, '__init__')

    def test_transform_protected_method(self):
        tree = ast.parse('str._protected_method(1)')
        result = StringTypesTransformer.transform(tree)
        self.assertEqual(result.tree.body[0].value.func.attr, '_protected_method')

    def test_transform_magic_method(self):
        tree = ast.parse('str.__str__(1)')
        result = StringTypesTransformer.transform(tree)
        self.assertEqual(result.tree.body[0].value.func.attr, '__str__')

    def test_transform_magic_method_with_args(self):
        tree = ast.parse('str.__str__(1, 2)')
        result = StringTypesTransformer.transform(tree)
        self.assertEqual(result.tree.body[0].value.func.attr, '__str__')
        self.assertEqual(result.tree.body[0].args[0].n, 1)
        self.assertEqual(result.tree.body[0].args[1].n, 2)

if __name__ == '__main__':
    unittest.main()