import unittest
from typed_ast import ast3 as ast
from py_backwards.transformers.base import BaseNodeTransformer, BaseImportRewrite
from py_backwards.types import TransformationResult
    def test_replace_import_from_module(self):
        node = ast.ImportFrom(module='os', names=[ast.alias(name='path', asname=None)], level=0)
        result = self.rewrite._replace_import_from_module(node, 'os', 'os_new')
        self.assertIsInstance(result, ast.Try)
    def test_get_replaced_import_from_part(self):
        node = ast.ImportFrom(module='os', names=[ast.alias(name='path', asname=None)], level=0)
        result = self.rewrite._get_replaced_import_from_part(node, alias, names_to_replace)
        self.assertIsInstance(result, ast.ImportFrom)
    def test_replace_import_from_names(self):
        node = ast.ImportFrom(module='os', names=[ast.alias(name='path', asname=None)], level=0)
        result = self.rewrite._replace_import_from_names(node, names_to_replace)
        self.assertIsInstance(result, ast.Try)
from py_backwards.transformers.base import BaseNodeTransformer, BaseImportRewrite, import_rewrite
    def test_replace_import_from_module(self):
        node = ast.ImportFrom(module='os', names=[ast.alias(name='path', asname=None)], level=0)
        result = self.transformer._replace_import_from_module(node, 'os', 'os_new')
        self.assertIsInstance(result, ast.Try)
    def test_get_replaced_import_from_part(self):
        node = ast.ImportFrom(module='os', names=[ast.alias(name='path', asname=None)], level=0)
        result = self.transformer._get_replaced_import_from_part(node, node.names[0], names_to_replace)
        self.assertIsInstance(result, ast.ImportFrom)
    def test_replace_import_from_names(self):
        node = ast.ImportFrom(module='os', names=[ast.alias(name='path', asname=None)], level=0)
        result = self.transformer._replace_import_from_names(node, names_to_replace)
        self.assertIsInstance(result, ast.Try)


class TestBaseNodeTransformer(unittest.TestCase):
    def setUp(self):
        self.tree = ast.parse("import os")
        self.transformer = BaseNodeTransformer(self.tree)

    def test_init(self):
        self.assertIsInstance(self.transformer, BaseNodeTransformer)
        self.assertEqual(self.transformer._tree, self.tree)
        self.assertFalse(self.transformer._tree_changed)

    def test_transform(self):
        result = BaseNodeTransformer.transform(self.tree)
        self.assertIsInstance(result, TransformationResult)
        self.assertEqual(result.tree, self.tree)
        self.assertFalse(result.tree_changed)
        self.assertEqual(result.dependencies, [])

class TestBaseImportRewrite(unittest.TestCase):
    def setUp(self):
        self.tree = ast.parse("import os")
        self.rewrite = BaseImportRewrite(self.tree)
        self.rewrite.rewrites = [('os', 'os_new')]

    def test_get_matched_rewrite(self):
        result = self.rewrite._get_matched_rewrite('os')
        self.assertEqual(result, ('os', 'os_new'))

    def test_replace_import(self):
        node = ast.Import(names=[ast.alias(name='os', asname=None)])
        result = self.rewrite._replace_import(node, 'os', 'os_new')
        self.assertIsInstance(result, ast.Try)

    def test_visit_Import(self):
        node = ast.Import(names=[ast.alias(name='os', asname=None)])
        result = self.rewrite.visit_Import(node)
        self.assertIsInstance(result, ast.Try)


    def test_get_names_to_replace(self):
        node = ast.ImportFrom(module='os', names=[ast.alias(name='path', asname=None)], level=0)
        result = list(self.rewrite._get_names_to_replace(node))
        self.assertEqual(result, [('os.path', ('os', 'os_new'))])

        names_to_replace = {'os.path': ('os', 'os_new')}
        alias = ast.alias(name='path', asname=None)

        names_to_replace = {'os.path': ('os', 'os_new')}

    def test_visit_ImportFrom(self):
        node = ast.ImportFrom(module='os', names=[ast.alias(name='path', asname=None)], level=0)
        result = self.rewrite.visit_ImportFrom(node)
        self.assertIsInstance(result, ast.Try)

class TestBaseNodeTransformer(unittest.TestCase):
    def test_init(self):
        tree = ast.parse("import os")
        transformer = BaseNodeTransformer(tree)
        self.assertEqual(transformer._tree, tree)
        self.assertFalse(transformer._tree_changed)

    def test_transform(self):
        tree = ast.parse("import os")
        result = BaseNodeTransformer.transform(tree)
        self.assertIsInstance(result, TransformationResult)
        self.assertEqual(result.tree, tree)
        self.assertFalse(result.tree_changed)
        self.assertEqual(result.dependencies, [])

class TestBaseImportRewrite(unittest.TestCase):
    def setUp(self):
        self.tree = ast.parse("import os")
        self.transformer = BaseImportRewrite(self.tree)
        self.transformer.rewrites = [('os', 'os_new')]

    def test_get_matched_rewrite(self):
        result = self.transformer._get_matched_rewrite('os')
        self.assertEqual(result, ('os', 'os_new'))

    def test_get_matched_rewrite_none(self):
        result = self.transformer._get_matched_rewrite('sys')
        self.assertIsNone(result)

    def test_replace_import(self):
        node = ast.Import(names=[ast.alias(name='os', asname=None)])
        result = self.transformer._replace_import(node, 'os', 'os_new')
        self.assertIsInstance(result, ast.Try)
        self.assertTrue(self.transformer._tree_changed)

    def test_visit_Import(self):
        node = ast.Import(names=[ast.alias(name='os', asname=None)])
        result = self.transformer.visit_Import(node)
        self.assertIsInstance(result, ast.Try)

        self.assertTrue(self.transformer._tree_changed)

    def test_get_names_to_replace(self):
        node = ast.ImportFrom(module='os', names=[ast.alias(name='path', asname=None)], level=0)
        result = list(self.transformer._get_names_to_replace(node))
        self.assertEqual(result, [('os.path', ('os', 'os_new'))])

        names_to_replace = {'os.path': ('os', 'os_new')}
        self.assertEqual(result.module, 'os_new')
        self.assertEqual(result.names[0].name, 'path')

        names_to_replace = {'os.path': ('os', 'os_new')}
        self.assertTrue(self.transformer._tree_changed)

    def test_visit_ImportFrom(self):
        node = ast.ImportFrom(module='os', names=[ast.alias(name='path', asname=None)], level=0)
        result = self.transformer.visit_ImportFrom(node)
        self.assertIsInstance(result, ast.Try)

if __name__ == '__main__':
    unittest.main()