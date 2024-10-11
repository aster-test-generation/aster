import unittest
from py_backwards.transformers.yield_from import *


class TestYieldFromTransformer(unittest.TestCase):
    def test_visit(self):
        instance = YieldFromTransformer(tree)
        result = instance.visit(None)
        self.assertEqual(result, None)

    def test_handle_assignments(self):
        instance = YieldFromTransformer(tree)
        result = instance._handle_assignments(None)
        self.assertEqual(result, None)

    def test_handle_expressions(self):
        instance = YieldFromTransformer(tree)
        result = instance._handle_expressions(None)
        self.assertEqual(result, None)

    def test_get_yield_from_index(self):
        instance = YieldFromTransformer(tree)
        result = instance._get_yield_from_index(None, None)
        self.assertEqual(result, None)

    def test_emulate_yield_from(self):
        instance = YieldFromTransformer(tree)
        result = instance._emulate_yield_from(None, None)
        self.assertEqual(result, None)

if __name__ == '__main__':
    unittest.main()