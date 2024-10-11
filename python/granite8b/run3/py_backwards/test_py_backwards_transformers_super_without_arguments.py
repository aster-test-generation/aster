import ast
import unittest
from py_backwards.transformers.super_without_arguments import SuperWithoutArgumentsTransformer


class TestSuperWithoutArgumentsTransformer(unittest.TestCase):
    def test_replace_super_args(self):
        tree = ast.parse('def func(self): super()')
        transformer = SuperWithoutArgumentsTransformer(tree)
        transformer.visit(tree)
        self.assertEqual(str(tree), 'def func(self): super(func, self)')

    def test_visit_Call(self):
        tree = ast.parse('def func(self): super()')
        transformer = SuperWithoutArgumentsTransformer(tree)
        transformer.visit(tree)
        self.assertEqual(str(tree), 'def func(self): super(func, self)')

if __name__ == '__main__':
    unittest.main()