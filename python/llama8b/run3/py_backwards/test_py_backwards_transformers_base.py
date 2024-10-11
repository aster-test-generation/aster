import unittest
from py_backwards.transformers.base import BaseTransformer, BaseNodeTransformer, BaseImportRewrite
from typed_ast import ast3 as ast
        result = transformer._replace_import(node, from_, to)
        self.assertEqual(result, ast.Try())
    def test_replace_import_from_module(self):
        transformer = BaseImportRewrite(ast.AST())
        result = transformer._replace_import_from_module(node, from_, to)
        self.assertEqual(result, ast.Try())
    def test_get_replaced_import_from_part(self):
        transformer = BaseImportRewrite(ast.AST())
        result = transformer._get_replaced_import_from_part(node, alias, names_to_replace)
        self.assertEqual(result, ast.ImportFrom('bar.bar', [ast.alias('bar', asname=None)], 0))
    def test_replace_import_from_names(self):
        transformer = BaseImportRewrite(ast.AST())
        result = transformer._replace_import_from_names(node, names_to_replace)
        self.assertEqual(result, ast.Try())
    def test_visit_import_from(self):
        transformer = BaseImportRewrite(ast.AST())
        self.assertEqual(transformer.visit_import_from(node), node)

if __name__ == '__main__':
    unittest.main()

class TestBaseTransformer(unittest.TestCase):
    def test_transform(self):
        transformer = BaseTransformer()
        with self.assertRaises(NotImplementedError):
            transformer.transform(ast.AST())

    def test_init(self):
        transformer = BaseNodeTransformer(ast.AST())
        self.assertEqual(transformer._tree, ast.AST())
        self.assertFalse(transformer._tree_changed)

class TestBaseNodeTransformer(unittest.TestCase):
    def test_visit(self):
        transformer = BaseNodeTransformer(ast.AST())
        with self.assertRaises(NotImplementedError):
            transformer.visit(ast.AST())

    def test_init(self):
        transformer = BaseNodeTransformer(ast.AST())
        self.assertEqual(transformer._tree, ast.AST())
        self.assertFalse(transformer._tree_changed)

if __name__ == '__main__':
    unittest.main()