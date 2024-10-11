import unittest
from py_backwards.transformers.yield_from import YieldFromTransformer


class TestYieldFromTransformer(unittest.TestCase):
    def test_result_assignment(self):
        exc = Exception()
        exc.value = 5
        target = None
        result = YieldFromTransformer._handle_assignments(exc, target)
        self.assertEqual(result, 5)

    def test_yield_from(self):
        generator = [1, 2, 3]
        exc = Exception()
        assignment = []
        result = YieldFromTransformer._yield_from(generator, exc, assignment)
        self.assertEqual(list(result), [1, 2, 3])

    def test_get_yield_from_index(self):
        node = ast.FunctionDef(body=[ast.Assign(targets=[ast.Name(id='x', ctx=ast.Store())], value=ast.YieldFrom(value=ast.Name(id='y', ctx=ast.Load())))], name='test')
        result = YieldFromTransformer._get_yield_from_index(node, ast.Assign)
        self.assertEqual(result, 0)

    def test_emulate_yield_from(self):
        target = ast.Name(id='x', ctx=ast.Store())
        node = ast.YieldFrom(value=ast.Name(id='y', ctx=ast.Load()))
        result = YieldFromTransformer._emulate_yield_from(target, node)
        self.assertEqual(len(result), 2)

    def test_handle_assignments(self):
        node = ast.FunctionDef(body=[ast.Assign(targets=[ast.Name(id='x', ctx=ast.Store())], value=ast.YieldFrom(value=ast.Name(id='y', ctx=ast.Load())))], name='test')
        result = YieldFromTransformer._handle_assignments(node)
        self.assertEqual(len(result.body), 2)

    def test_handle_expressions(self):
        node = ast.FunctionDef(body=[ast.Expr(value=ast.YieldFrom(value=ast.Name(id='y', ctx=ast.Load())))], returns=ast.Name(id='int', ctx=ast.Load()))
        result = YieldFromTransformer._handle_expressions(node)
        self.assertEqual(len(result.body), 2)

    def test_visit(self):
        node = ast.FunctionDef(body=[ast.Assign(targets=[ast.Name(id='x', ctx=ast.Store())], value=ast.YieldFrom(value=ast.Name(id='y', ctx=ast.Load())))], returns=ast.Name(id='None', ctx=ast.Load()))
        result = YieldFromTransformer().visit(node)
        self.assertEqual(len(result.body), 2)

if __name__ == '__main__':
    unittest.main()