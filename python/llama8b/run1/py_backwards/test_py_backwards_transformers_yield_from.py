import unittest
from py_backwards.transformers.yield_from import YieldFromTransformer


class TestYieldFromTransformer(unittest.TestCase):
    def test_get_yield_from_index(self):
        transformer = YieldFromTransformer()
        node = ast.If()
        node.body = [ast.Assign()]
        node.body[0].targets = [ast.Name()]
        node.body[0].value = ast.YieldFrom()
        result = transformer._get_yield_from_index(node, ast.Assign)
        self.assertEqual(result, 0)

    def test_emulate_yield_from(self):
        transformer = YieldFromTransformer()
        node = ast.YieldFrom()
        target = ast.Name()
        result = transformer._emulate_yield_from(target, node)
        self.assertIsInstance(result, list)

    def test_handle_assignments(self):
        transformer = YieldFromTransformer()
        node = ast.Module()
        node.body = [ast.Assign()]
        node.body[0].targets = [ast.Name()]
        node.body[0].value = ast.YieldFrom()
        result = transformer._handle_assignments(node)
        self.assertIsInstance(result, ast.Module)

    def test_handle_expressions(self):
        transformer = YieldFromTransformer()
        node = ast.Module()
        node.body = [ast.Expr()]
        node.body[0].value = ast.YieldFrom()
        result = transformer._handle_expressions(node)
        self.assertIsInstance(result, ast.Module)

    def test_visit(self):
        transformer = YieldFromTransformer()
        node = ast.Module()
        node.body = [ast.Assign(), ast.Expr()]
        node.body[0].targets = [ast.Name()]
        node.body[0].value = ast.YieldFrom()
        node.body[1].value = ast.YieldFrom()
        result = transformer.visit(node)
        self.assertIsInstance(result, ast.Module)

if __name__ == '__main__':
    unittest.main()