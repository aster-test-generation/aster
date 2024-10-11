import unittest
from typed_ast import ast3 as ast
from py_backwards.transformers.base import BaseTransformer, BaseNodeTransformer, BaseImportRewrite
from py_backwards.types import TransformationResult
    def test_replace_import_from_module(self):
        node = ast.ImportFrom(module='old.module', names=[ast.alias(name='name', asname=None)], level=0)
        result = self.rewrite._replace_import_from_module(node, 'old', 'new')
        self.assertIsInstance(result, ast.Try)
    def test_get_replaced_import_from_part(self):
        node = ast.ImportFrom(module='old', names=[ast.alias(name='module', asname=None)], level=0)
        result = self.rewrite._get_replaced_import_from_part(node, alias, names_to_replace)
        self.assertIsInstance(result, ast.ImportFrom)
    def test_replace_import_from_names(self):
        node = ast.ImportFrom(module='old', names=[ast.alias(name='module', asname=None)], level=0)
        result = self.rewrite._replace_import_from_names(node, names_to_replace)
        self.assertIsInstance(result, ast.Try)


class TestBaseTransformer(unittest.TestCase):
    def test_transform(self):
        with self.assertRaises(TypeError):
            BaseTransformer.transform(ast.AST())

class TestBaseNodeTransformer(unittest.TestCase):
    def test_init(self):
        tree = ast.AST()
        transformer = BaseNodeTransformer(tree)
        self.assertEqual(transformer._tree, tree)
        self.assertFalse(transformer._tree_changed)

    def test_transform(self):
        tree = ast.AST()
        result = BaseNodeTransformer.transform(tree)
        self.assertIsInstance(result, TransformationResult)
        self.assertEqual(result.tree, tree)
        self.assertFalse(result.tree_changed)
        self.assertEqual(result.dependencies, [])

class TestBaseImportRewrite(unittest.TestCase):
    def setUp(self):
        self.tree = ast.AST()
        self.rewrite = BaseImportRewrite(self.tree)
        self.rewrite.rewrites = [('old', 'new')]

    def test_get_matched_rewrite(self):
        result = self.rewrite._get_matched_rewrite('old')
        self.assertEqual(result, ('old', 'new'))

    def test_get_matched_rewrite_none(self):
        result = self.rewrite._get_matched_rewrite('nonexistent')
        self.assertIsNone(result)

    def test_replace_import(self):
        node = ast.Import(names=[ast.alias(name='old.module', asname=None)])
        result = self.rewrite._replace_import(node, 'old', 'new')
        self.assertIsInstance(result, ast.Try)

    def test_visit_Import(self):
        node = ast.Import(names=[ast.alias(name='old.module', asname=None)])
        result = self.rewrite.visit_Import(node)
        self.assertIsInstance(result, ast.Try)


    def test_get_names_to_replace(self):
        node = ast.ImportFrom(module='old', names=[ast.alias(name='module', asname=None)], level=0)
        result = list(self.rewrite._get_names_to_replace(node))
        self.assertEqual(result, [('old.module', ('old', 'new'))])

        alias = ast.alias(name='module', asname=None)
        names_to_replace = {'old.module': ('old', 'new')}

        names_to_replace = {'old.module': ('old', 'new')}

    def test_visit_ImportFrom(self):
        node = ast.ImportFrom(module='old', names=[ast.alias(name='module', asname=None)], level=0)
        result = self.rewrite.visit_ImportFrom(node)
        self.assertIsInstance(result, ast.Try)

if __name__ == '__main__':
    unittest.main()