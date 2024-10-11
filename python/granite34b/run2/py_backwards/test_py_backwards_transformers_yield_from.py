import unittest
from py_backwards.transformers.yield_from import YieldFromTransformer


class TestYieldFromTransformer(unittest.TestCase):
    def test_result_assignment(self):
        exc = Exception()
        exc.value = 10
        target = 0
        result_assignment = YieldFromTransformer._handle_assignments(exc, target)
        self.assertEqual(result_assignment, 10)

    def test_yield_from(self):
        generator = [1, 2, 3]
        exc = Exception()
        assignment = 0
        result = YieldFromTransformer._yield_from(generator, exc, assignment)
        self.assertEqual(list(result), [1, 2, 3])

    def test_get_yield_from_index(self):
        node = ast.FunctionDef(body=[ast.Assign(targets=[ast.Name(id='target', ctx=ast.Store())], value=ast.YieldFrom(value=ast.Name(id='generator', ctx=ast.Load())))], decorator_list=[])
        index = YieldFromTransformer._get_yield_from_index(node, ast.Assign)
        self.assertEqual(index, 0)

    def test_emulate_yield_from(self):
        target = ast.Name(id='target', ctx=ast.Load())
        node = ast.YieldFrom(value=ast.Name(id='generator', ctx=ast.Load()))
        result = YieldFromTransformer._emulate_yield_from(target, node)
        self.assertEqual(len(result), 3)

    def test_handle_assignments(self):
        node = ast.FunctionDef(body=[ast.Assign(targets=[ast.Name(id='target', ctx=ast.Store())], value=ast.YieldFrom(value=ast.Name(id='generator', ctx=ast.Load())))], decorator_list=[])
        result = YieldFromTransformer._handle_assignments(node)
        self.assertEqual(len(result.body), 3)

    def test_handle_expressions(self):
        node = ast.FunctionDef(body=[ast.Expr(value=ast.YieldFrom(value=ast.Name(id='generator', ctx=ast.Load())))], name='test')
        result = YieldFromTransformer._handle_expressions(node)
        self.assertEqual(len(result.body), 3)

    def test_visit(self):
        node = ast.FunctionDef(body=[ast.Assign(targets=[ast.Name(id='target', ctx=ast.Store())], value=ast.YieldFrom(value=ast.Name(id='generator', ctx=ast.Load())))])
        result = YieldFromTransformer().visit(node)
        self.assertEqual(len(result.body), 3)

if __name__ == '__main__':
    unittest.main()