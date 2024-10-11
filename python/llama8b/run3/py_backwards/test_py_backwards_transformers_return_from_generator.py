import unittest
from unittest.mock import patch
from py_backwards.transformers.return_from_generator import ReturnFromGeneratorTransformer, return_from_generator
from typed_ast import ast3 as ast
from utils.snippet import snippet, le
from .base import BaseNodeTransformer


class TestReturnFromGeneratorTransformer(unittest.TestCase):
    def test_visit_FunctionDef(self):
        transformer = ReturnFromGeneratorTransformer()
        node = ast.FunctionDef(name='test', args=ast.arguments(args=[], vararg=None, kwonlyargs=[], kw_defaults=[], kwarg=None), body=[ast.Return(ast.Num(n=1))], decorator_list=[], returns=None)
        result = transformer.visit_FunctionDef(node)
        self.assertEqual(result, node)

    def test_find_generator_returns(self):
        transformer = ReturnFromGeneratorTransformer()
        node = ast.FunctionDef(name='test', args=ast.arguments(args=[], vararg=None, kwonlyargs=[], kw_defaults=[], kwarg=None), body=[ast.Yield(), ast.Return(ast.Num(n=1))], decorator_list=[], returns=None)
        result = transformer._find_generator_returns(node)
        self.assertEqual(len(result), 1)

    def test_replace_return(self):
        transformer = ReturnFromGeneratorTransformer()
        node = ast.FunctionDef(name='test', args=ast.arguments(args=[], vararg=None, kwonlyargs=[], kw_defaults=[], kwarg=None), body=[ast.Return(ast.Num(n=1))], decorator_list=[], returns=None)
        return_ = node.body[0]
        transformer._replace_return(node, return_)
        self.assertNotIn(return_, node.body)

    def test_get_body(self):
        transformer = ReturnFromGeneratorTransformer()
        result = return_from_generator.get_body(return_value=1)
        self.assertEqual(len(result), 1)

    def test_tree_changed(self):
        transformer = ReturnFromGeneratorTransformer()
        self.assertFalse(transformer._tree_changed)
        transformer._tree_changed = True
        self.assertTrue(transformer._tree_changed)

if __name__ == '__main__':
    unittest.main()