import unittest
from py_backwards.transformers.yield_from import YieldFromTransformer
from py_backwards.transformers.yield_from import result_assignment
from py_backwards.transformers.yield_from import yield_from
from py_backwards.transformers.yield_from import BaseNodeTransformer
from py_backwards.transformers.yield_from import VariablesGenerator
from py_backwards.transformers.yield_from import Node
from py_backwards.transformers.yield_from import Holder
from typed_ast import ast3 as ast



class TestYieldFromTransformer(unittest.TestCase):
    def test_get_yield_from_index(self):
        instance = YieldFromTransformer(tree)
        node = ast.Module()
        result = instance._get_yield_from_index(node, ast.Assign)
        self.assertEqual(result, None)

    def test_emulate_yield_from(self):
        instance = YieldFromTransformer(tree)
        node = ast.YieldFrom()
        result = instance._emulate_yield_from(None, node)
        self.assertEqual(result, [])

    def test_handle_assignments(self):
        instance = YieldFromTransformer(tree)
        node = ast.Module()
        result = instance._handle_assignments(node)
        self.assertEqual(result, node)

    def test_handle_expressions(self):
        instance = YieldFromTransformer(tree)
        node = ast.Module()
        result = instance._handle_expressions(node)
        self.assertEqual(result, node)

    def test_visit(self):
        instance = YieldFromTransformer(tree)
        node = ast.Module()
        result = instance.visit(node)
        self.assertEqual(result, node)

    def test_result_assignment(self):
        instance = result_assignment()
        result = instance.result_assignment(None, None)
        self.assertEqual(result, None)

    def test_yield_from(self):
        instance = yield_from(1)
        result = instance.yield_from(None, None, None)
        self.assertEqual(result, None)

    def test_BaseNodeTransformer(self):
        instance = BaseNodeTransformer(tree)
        result = instance.BaseNodeTransformer()
        self.assertEqual(result, None)

    def test_VariablesGenerator(self):
        instance = VariablesGenerator()
        result = instance.VariablesGenerator
        self.assertEqual(result, None)

    def test_Node(self):
        instance = Node(None, None)
        result = instance.Node()
        self.assertEqual(result, None)

if __name__ == '__main__':
    unittest.main()