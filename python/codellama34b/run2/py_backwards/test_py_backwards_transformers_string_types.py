import unittest
from py_backwards.transformers.string_types import *


class TestStringTypesTransformer(unittest.TestCase):
    def test_transform(self):
        tree = ast.AST()
        result = StringTypesTransformer.transform(tree)
        self.assertEqual(result.tree, tree)
        self.assertEqual(result.tree_changed, False)
        self.assertEqual(result.warnings, None)

    def test_target(self):
        self.assertEqual(StringTypesTransformer.target, (2, 7))

if __name__ == '__main__':
    unittest.main()