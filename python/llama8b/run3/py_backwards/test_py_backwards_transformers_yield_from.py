import unittest
from py_backwards.transformers.yield_from import YieldFromTransformer


class TestYieldFromTransformer(unittest.TestCase):
    def test_get_yield_from_index(self):
        transformer = YieldFromTransformer()
        node = ast.If()
        node.body = [ast.Assign(), ast.YieldFrom()]
        self.assertEqual(transformer._get_yield_from_index(node, ast.Assign), 0)

    def test_emulate_yield_from(self):
        transformer = YieldFromTransformer()
        node = ast.YieldFrom()
        target = ast.Assign()
        assignment = transformer._emulate_yield_from(target, node)
        self.assertIsInstance(assignment, list)

    def test_handle_assignments(self):
        transformer = YieldFromTransformer()
        node = ast.Module()
        node.body = [ast.Assign(), ast.YieldFrom()]
        transformer._handle_assignments(node)
        self.assertEqual(len(node.body), 2)

    def test_handle_expressions(self):
        transformer = YieldFromTransformer()
        node = ast.Module()
        node.body = [ast.Expr(), ast.YieldFrom()]
        transformer._handle_expressions(node)
        self.assertEqual(len(node.body), 2)

    def test_visit(self):
        transformer = YieldFromTransformer()
        node = ast.Module()
        node.body = [ast.Assign(), ast.YieldFrom()]
        result = transformer.visit(node)
        self.assertEqual(len(result.body), 2)

    def test_visit_private_method(self):
        transformer = YieldFromTransformer()
        node = ast.Module()
        node.body = [ast.Assign(), ast.YieldFrom()]
        result = transformer._YieldFromTransformer__private_method(node)
        self.assertEqual(len(result.body), 2)

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