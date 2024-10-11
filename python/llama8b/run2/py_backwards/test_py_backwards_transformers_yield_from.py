import unittest
from py_backwards.transformers.yield_from import YieldFromTransformer
from typed_ast import ast3 as ast
from utils.tree import insert_a
from ..utils.snippet import snippet, let, extend
from ..utils.helpers import VariablesGenerator
from ..utils.tree import insert_at
from ..base import BaseNodeTransformer


class TestYieldFromTransformer(unittest.TestCase):
    def test_get_yield_from_index(self):
        transformer = YieldFromTransformer()
        node = ast.If()
        node.body = [ast.Assign()]
        result = transformer._get_yield_from_index(node, ast.Assign)
        self.assertEqual(result, 0)

    def test_emulate_yield_from(self):
        transformer = YieldFromTransformer()
        node = ast.YieldFrom()
        result = transformer._emulate_yield_from(None, node)
        self.assertIsInstance(result, list)

    def test_handle_assignments(self):
        transformer = YieldFromTransformer()
        node = ast.Try()
        node.body = [ast.Assign()]
        result = transformer._handle_assignments(node)
        self.assertIsInstance(result, ast.Try)

    def test_handle_expressions(self):
        transformer = YieldFromTransformer()
        node = ast.If()
        node.body = [ast.Expr()]
        result = transformer._handle_expressions(node)
        self.assertIsInstance(result, ast.If)

    def test_visit(self):
        transformer = YieldFromTransformer()
        node = ast.Module()
        result = transformer.visit(node)
        self.assertIsInstance(result, ast.Module)

    def test_visit_private_method(self):
        transformer = YieldFromTransformer()
        node = ast.YieldFrom()
        result = transformer._YieldFromTransformer__private_method(node)
        self.assertIsNone(result)

    def test_str_method(self):
        transformer = YieldFromTransformer()
        result = str(transformer)
        self.assertEqual(result, "YieldFromTransformer")

    def test_repr_method(self):
        transformer = YieldFromTransformer()
        result = repr(transformer)
        self.assertEqual(result, "YieldFromTransformer()")

if __name__ == '__main__':
    unittest.main()