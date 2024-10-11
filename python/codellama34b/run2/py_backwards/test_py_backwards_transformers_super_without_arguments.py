import unittest
from py_backwards.transformers.super_without_arguments import *


class TestSuperWithoutArgumentsTransformer(unittest.TestCase):
    def test_visit_Call(self):
        instance = SuperWithoutArgumentsTransformer(tree)
        result = instance.visit_Call(ast.Call())
        self.assertEqual(result, None)

    def test_replace_super_args(self):
        instance = SuperWithoutArgumentsTransformer(tree)
        result = instance._replace_super_args(ast.Call())
        self.assertEqual(result, None)

if __name__ == '__main__':
    unittest.main()