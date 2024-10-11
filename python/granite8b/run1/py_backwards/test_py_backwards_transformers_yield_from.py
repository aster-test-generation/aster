import unittest
from py_backwards.transformers.yield_from import YieldFromTransformer


class TestYieldFromTransformer(unittest.TestCase):
    def test_handle_assignments(self):
        node = ast.Module(body=[
            ast.Assign(targets=[ast.Name(id='x', ctx=ast.Store())],
                       value=ast.YieldFrom(value=ast.List(elts=[
                           ast.Num(n=1),
                           ast.Num(n=2),
                           ast.Num(n=3)
                       ], ctx=ast.Load())))
        ])
        expected = ast.Module(body=[
            ast.Assign(targets=[ast.Name(id='x', ctx=ast.Store())],
                       value=ast.Name(id='x', ctx=ast.Load()))
        ])
        transformer = YieldFromTransformer()
        actual = transformer.visit(node)
        self.assertEqual(str(actual), str(expected))

    def test_handle_expressions(self):
        node = ast.Module(body=[
            ast.Expr(value=ast.YieldFrom(value=ast.List(elts=[
                ast.Num(n=1),
                ast.Num(n=2),
                ast.Num(n=3)
            ], ctx=ast.Load())))
        ])
        expected = ast.Module(body=[
            ast.Expr(value=ast.Name(id='x', ctx=ast.Load()))
        ])
        transformer = YieldFromTransformer()
        actual = transformer.visit(node)
        self.assertEqual(str(actual), str(expected))

if __name__ == '__main__':
    unittest.main()