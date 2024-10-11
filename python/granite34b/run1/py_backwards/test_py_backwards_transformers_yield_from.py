import unittest
from py_backwards.transformers.yield_from import YieldFromTransformer


class TestYieldFromTransformer(unittest.TestCase):
    def test_result_assignment(self):
        exc = Exception()
        exc.value = 1
        target = 0
        result_assignment = YieldFromTransformer._handle_assignments(exc, target)
        self.assertEqual(result_assignment, 1)

    def test_yield_from(self):
        generator = [1, 2, 3]
        exc = Exception()
        assignment = []
        yield_from = YieldFromTransformer._yield_from(generator, exc, assignment)
        self.assertEqual(list(yield_from), [1, 2, 3])

    def test_get_yield_from_index(self):
        node = ast.FunctionDef(body=[ast.Assign(targets=[ast.Num(1)], value=ast.YieldFrom(ast.Num(1)))])
        index = YieldFromTransformer._get_yield_from_index(node, ast.Assign)
        self.assertEqual(index, 0)

    def test_emulate_yield_from(self):
        target = 1
        node = ast.Yield(1)
        emulate_yield_from = YieldFromTransformer._emulate_yield_from(target, node)
        self.assertEqual(len(emulate_yield_from), 2)

    def test_handle_assignments(self):
        node = ast.FunctionDef(body=[ast.Assign(targets=[1], value=ast.YieldFrom(1))])
        handle_assignments = YieldFromTransformer._handle_assignments(node)
        self.assertEqual(len(handle_assignments.body), 2)

    def test_handle_expressions(self):
        node = ast.FunctionDef(body=[ast.Expr(value=ast.Yield(1))])
        handle_expressions = YieldFromTransformer._handle_expressions(node)
        self.assertEqual(len(handle_expressions.body), 2)

    def test_visit(self):
        node = ast.FunctionDef(body=[ast.Assign(targets=[ast.Num(1)], value=ast.YieldFrom(ast.Num(1)))])
        visit = YieldFromTransformer().visit(node)
        self.assertEqual(len(visit.body), 2)

if __name__ == '__main__':
    unittest.main()