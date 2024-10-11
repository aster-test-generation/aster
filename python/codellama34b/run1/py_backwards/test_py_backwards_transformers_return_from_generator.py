import unittest
from py_backwards.transformers.return_from_generator import *


class TestReturnFromGeneratorTransformer(unittest.TestCase):
    def test_visit_FunctionDef(self):
        instance = ReturnFromGeneratorTransformer(tree)
        result = instance.visit_FunctionDef(ast.FunctionDef())
        self.assertEqual(result, None)

    def test__find_generator_returns(self):
        instance = ReturnFromGeneratorTransformer(tree)
        result = instance._find_generator_returns(ast.FunctionDef())
        self.assertEqual(result, None)

    def test__replace_return(self):
        instance = ReturnFromGeneratorTransformer(tree)
        result = instance._replace_return(None, ast.Return())
        self.assertEqual(result, None)

if __name__ == '__main__':
    unittest.main()