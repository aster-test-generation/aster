import unittest
from typed_ast import ast3 as ast
from py_backwards.transformers.yield_from import YieldFromTransformer
from py_backwards.utils.helpers import VariablesGenerator


class TestYieldFromTransformer(unittest.TestCase):
    def setUp(self):
        self.transformer = YieldFromTransformer(tree)

    def test_get_yield_from_index_with_yield_from(self):
        node = ast.FunctionDef(
            name='test',
            args=ast.arguments(args=[], vararg=None, kwarg=None, defaults=[]),
            body=[ast.Expr(value=ast.YieldFrom(value=ast.Name(id='gen', ctx=ast.Load())))],
            decorator_list=[]
        )
        result = self.transformer._get_yield_from_index(node, ast.Expr)
        self.assertEqual(result, 0)

    def test_get_yield_from_index_without_yield_from(self):
        node = ast.FunctionDef(
            name='test',
            args=ast.arguments(args=[], vararg=None, kwarg=None, defaults=[]),
            body=[ast.Expr(value=ast.Name(id='gen', ctx=ast.Load()))],
            decorator_list=[]
        )
        result = self.transformer._get_yield_from_index(node, ast.Expr)
        self.assertIsNone(result)

    def test_emulate_yield_from_with_target(self):
        node = ast.YieldFrom(value=ast.Name(id='gen', ctx=ast.Load()))
        target = ast.Name(id='result', ctx=ast.Store())
        VariablesGenerator.reset()
        result = self.transformer._emulate_yield_from(target, node)
        self.assertIsInstance(result, list)

    def test_emulate_yield_from_without_target(self):
        node = ast.YieldFrom(value=ast.Name(id='gen', ctx=ast.Load()))
        VariablesGenerator.reset()
        result = self.transformer._emulate_yield_from(None, node)
        self.assertIsInstance(result, list)

    def test_handle_assignments_with_yield_from(self):
        node = ast.FunctionDef(
            name='test',
            args=ast.arguments(args=[], vararg=None, kwarg=None, defaults=[]),
            body=[ast.Assign(targets=[ast.Name(id='result', ctx=ast.Store())], value=ast.YieldFrom(value=ast.Name(id='gen', ctx=ast.Load())))],
            decorator_list=[]
        )
        result = self.transformer._handle_assignments(node)
        self.assertTrue(self.transformer._tree_changed)

    def test_handle_assignments_without_yield_from(self):
        node = ast.FunctionDef(
            name='test',
            args=ast.arguments(args=[], vararg=None, kwarg=None, defaults=[]),
            body=[ast.Assign(targets=[ast.Name(id='result', ctx=ast.Store())], value=ast.Name(id='gen', ctx=ast.Load()))],
            decorator_list=[]
        )
        result = self.transformer._handle_assignments(node)
        self.assertFalse(self.transformer._tree_changed)

    def test_handle_expressions_with_yield_from(self):
        node = ast.FunctionDef(
            name='test',
            args=ast.arguments(args=[], vararg=None, kwarg=None, defaults=[]),
            body=[ast.Expr(value=ast.YieldFrom(value=ast.Name(id='gen', ctx=ast.Load())))],
            decorator_list=[]
        )
        result = self.transformer._handle_expressions(node)
        self.assertTrue(self.transformer._tree_changed)

    def test_handle_expressions_without_yield_from(self):
        node = ast.FunctionDef(
            name='test',
            args=ast.arguments(args=[], vararg=None, kwarg=None, defaults=[]),
            body=[ast.Expr(value=ast.Name(id='gen', ctx=ast.Load()))],
            decorator_list=[]
        )
        result = self.transformer._handle_expressions(node)
        self.assertFalse(self.transformer._tree_changed)

    def test_visit(self):
        node = ast.FunctionDef(
            name='test',
            args=ast.arguments(args=[], vararg=None, kwarg=None, defaults=[]),
            body=[ast.Expr(value=ast.YieldFrom(value=ast.Name(id='gen', ctx=ast.Load())))],
            decorator_list=[]
        )
        result = self.transformer.visit(node)
        self.assertIsInstance(result, ast.AST)

if __name__ == '__main__':
    unittest.main()