import unittest
from py_backwards.transformers.yield_from import YieldFromTransformer
from typed_ast import ast3 as ast


class TestYieldFromTransformer(unittest.TestCase):
    def setUp(self):
        self.transformer = YieldFromTransformer(tree=None)

    def test_get_yield_from_index_with_yield_from(self):
        node = ast.FunctionDef(
            name='test',
            args=ast.arguments(args=[], vararg=None, kwonlyargs=[], kw_defaults=[], kwarg=None, defaults=[]),
            body=[ast.Expr(value=ast.YieldFrom(value=ast.Name(id='gen', ctx=ast.Load())))],
            decorator_list=[]
        )
        result = self.transformer._get_yield_from_index(node, ast.Expr)
        self.assertEqual(result, 0)

    def test_get_yield_from_index_without_yield_from(self):
        node = ast.FunctionDef(
            name='test',
            args=ast.arguments(args=[], vararg=None, kwonlyargs=[], kw_defaults=[], kwarg=None, defaults=[]),
            body=[ast.Expr(value=ast.Name(id='gen', ctx=ast.Load()))],
            decorator_list=[]
        )
        result = self.transformer._get_yield_from_index(node, ast.Expr)
        self.assertIsNone(result)

    def test_emulate_yield_from_with_target(self):
        node = ast.YieldFrom(value=ast.Name(id='gen', ctx=ast.Load()))
        target = ast.Name(id='result', ctx=ast.Store())
        result = self.transformer._emulate_yield_from(target, node)
        self.assertIsInstance(result, list)

    def test_emulate_yield_from_without_target(self):
        node = ast.YieldFrom(value=ast.Name(id='gen', ctx=ast.Load()))
        result = self.transformer._emulate_yield_from(None, node)
        self.assertIsInstance(result, list)

    def test_handle_assignments(self):
        node = ast.FunctionDef(
            name='test',
            args=ast.arguments(args=[], vararg=None, kwonlyargs=[], kw_defaults=[], kwarg=None, defaults=[]),
            body=[ast.Assign(targets=[ast.Name(id='result', ctx=ast.Store())], value=ast.YieldFrom(value=ast.Name(id='gen', ctx=ast.Load())))],
            decorator_list=[]
        )
        result = self.transformer._handle_assignments(node)
        self.assertIsInstance(result, ast.FunctionDef)

    def test_handle_expressions(self):
        node = ast.FunctionDef(
            name='test',
            args=ast.arguments(args=[], vararg=None, kwonlyargs=[], kw_defaults=[], kwarg=None, defaults=[]),
            body=[ast.Expr(value=ast.YieldFrom(value=ast.Name(id='gen', ctx=ast.Load())))],
            decorator_list=[]
        )
        result = self.transformer._handle_expressions(node)
        self.assertIsInstance(result, ast.FunctionDef)

    def test_visit(self):
        node = ast.FunctionDef(
            name='test',
            args=ast.arguments(args=[], vararg=None, kwonlyargs=[], kw_defaults=[], kwarg=None, defaults=[]),
            body=[ast.Expr(value=ast.YieldFrom(value=ast.Name(id='gen', ctx=ast.Load())))],
            decorator_list=[]
        )
        result = self.transformer.visit(node)
        self.assertIsInstance(result, ast.FunctionDef)

if __name__ == '__main__':
    unittest.main()