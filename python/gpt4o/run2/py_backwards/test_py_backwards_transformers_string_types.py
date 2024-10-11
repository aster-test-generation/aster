import unittest
from typed_ast import ast3 as ast
from py_backwards.transformers.string_types import StringTypesTransformer
from py_backwards.types import TransformationResult
from py_backwards.utils.tree import find


class TestStringTypesTransformer(unittest.TestCase):
    def test_transform(self):
        tree = ast.parse("a = str('test')")
        result = StringTypesTransformer.transform(tree)
        self.assertIsInstance(result, TransformationResult)
        self.assertTrue(result.tree_changed)
        self.assertEqual(result.tree.body[0].value.func.id, 'unicode')

    def test_transform_no_change(self):
        tree = ast.parse("a = unicode('test')")
        result = StringTypesTransformer.transform(tree)
        self.assertIsInstance(result, TransformationResult)
        self.assertFalse(result.tree_changed)
        self.assertEqual(result.tree.body[0].value.func.id, 'unicode')

    def test_target(self):
        self.assertEqual(StringTypesTransformer.target, (2, 7))

if __name__ == '__main__':
    unittest.main()