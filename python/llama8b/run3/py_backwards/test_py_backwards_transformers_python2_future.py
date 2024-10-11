import unittest
from typed_ast import ast3 as ast
from utils.snippet import snippe
from .base import BaseNodeTransformer
from py_backwards.transformers.python2_future import Python2FutureTransformer


class TestPython2FutureTransformer(unittest.TestCase):
    def test_visit_Module(self):
        transformer = Python2FutureTransformer()
        node = ast.Module(body=[ast.Expr(ast.Name('print', ctx=ast.Load()))])
        result = transformer.visit_Module(node)
        self.assertEqual(len(result.body), 2)

    def test_imports(self):
        imports = snippet.get_body(future='__future__')
        self.assertIn(ast.Import(names=[ast.alias(name='absolute_import', asname=None)]), imports)
        self.assertIn(ast.Import(names=[ast.alias(name='division', asname=None)]), imports)
        self.assertIn(ast.Import(names=[ast.alias(name='print_function', asname=None)]), imports)
        self.assertIn(ast.Import(names=[ast.alias(name='unicode_literals', asname=None)]), imports)

    def test_target(self):
        self.assertEqual(Python2FutureTransformer.target, (2, 7))

    def test_visit_Module_private(self):
        transformer = Python2FutureTransformer()
        node = ast.Module(body=[ast.Expr(ast.Name('__private_method', ctx=ast.Load()))])
        with self.assertRaises(AttributeError):
            transformer.visit_Module(node)

    def test_visit_Module_protected(self):
        transformer = Python2FutureTransformer()
        node = ast.Module(body=[ast.Expr(ast.Name('_protected_method', ctx=ast.Load()))])
        with self.assertRaises(AttributeError):
            transformer.visit_Module(node)

    def test_visit_Module_magic(self):
        transformer = Python2FutureTransformer()
        node = ast.Module(body=[ast.Expr(ast.Name('__str__', ctx=ast.Load()))])
        result = transformer.visit_Module(node)
        self.assertEqual(len(result.body), 1)

    def test_visit_Module_magic_repr(self):
        transformer = Python2FutureTransformer()
        node = ast.Module(body=[ast.Expr(ast.Name('__repr__', ctx=ast.Load()))])
        result = transformer.visit_Module(node)
        self.assertEqual(len(result.body), 1)

if __name__ == '__main__':
    unittest.main()