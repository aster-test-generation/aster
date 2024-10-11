import unittest
from py_backwards.transformers.yield_from import *


class TestYieldFromTransformer(unittest.TestCase):
    def test_get_yield_from_index(self):
        node = ast.AST()
        type_ = ast.Assign
        result = YieldFromTransformer(node)._get_yield_from_index(node, type_)
        self.assertEqual(result, None)

    def test_emulate_yield_from(self):
        target = ast.Assign()
        node = ast.YieldFrom()
        result = YieldFromTransformer(tree)._emulate_yield_from(target, node)
        self.assertEqual(result, [])

    def test_handle_assignments(self):
        node = ast.Module()
        result = YieldFromTransformer()._handle_assignments(node, tree)
        self.assertEqual(result, node)

    def test_handle_expressions(self):
        node = ast.Module()
        result = YieldFromTransformer(node)._handle_expressions(node)
        self.assertEqual(result, node)

    def test_visit(self):
        node = ast.AST()
        result = YieldFromTransformer(node).visit(node)
        self.assertEqual(result, node)

if __name__ == '__main__':
    unittest.main()