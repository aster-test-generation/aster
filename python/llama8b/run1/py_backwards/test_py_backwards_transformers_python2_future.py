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

    def test_visit_Module_tree_changed(self):
        transformer = Python2FutureTransformer()
        node = ast.Module(body=[ast.Expr(ast.Name('print', ctx=ast.Load()))])
        self.assertFalse(transformer._tree_changed)
        transformer.visit_Module(node)
        self.assertTrue(transformer._tree_changed)

    def test_visit_Module_generic_visit(self):
        transformer = Python2FutureTransformer()
        node = ast.Module(body=[ast.Expr(ast.Name('print', ctx=ast.Load()))])
        result = transformer.visit_Module(node)
        self.assertEqual(len(result.body), 1)

    def test_init(self):
        transformer = Python2FutureTransformer()
        self.assertEqual(transformer.target, (2, 7))

    def test_str(self):
        transformer = Python2FutureTransformer()
        self.assertEqual(str(transformer), 'Python2FutureTransformer')

    def test_repr(self):
        transformer = Python2FutureTransformer()
        self.assertEqual(repr(transformer), 'Python2FutureTransformer((2, 7))')

if __name__ == '__main__':
    unittest.main()