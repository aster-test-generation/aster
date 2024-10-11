import unittest
from py_backwards.transformers.return_from_generator import *


class TestReturnFromGeneratorTransformer(unittest.TestCase):
    def test_find_generator_returns(self):
        instance = ReturnFromGeneratorTransformer(tree)
        result = instance._find_generator_returns(ast.FunctionDef())
        self.assertEqual(result, [])

    def test_replace_return(self):
        instance = ReturnFromGeneratorTransformer(tree)
        instance._replace_return(ast.FunctionDef(), ast.Return())

    def test_visit_FunctionDef(self):
        instance = ReturnFromGeneratorTransformer(tree)
        result = instance.visit_FunctionDef(ast.FunctionDef())
        self.assertEqual(result, ast.FunctionDef())

if __name__ == '__main__':
    unittest.main()