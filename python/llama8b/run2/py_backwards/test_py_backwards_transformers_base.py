import unittest
from py_backwards.transformers.base import BaseTransformer, BaseNodeTransformer, BaseImportRewrite
from typed_ast import ast3 as ast
        result = transformer._replace_import(node, from_, to)
        self.assertEqual(result, import_rewrite.get_body(previous=node, current=ast.Import(names=[ast.alias(name='new_module', asname=None)]))[0])
    def test_replace_import_from_module(self):
        transformer = BaseImportRewrite()
        result = transformer._replace_import_from_module(node, from_, to)
        self.assertEqual(result, import_rewrite.get_body(previous=node, current=ast.ImportFrom(module='new_module', names=[ast.alias(name='imported', asname=None)], level=0))[0])
    def test_get_replaced_import_from_part(self):
        transformer = BaseImportRewrite()
        result = transformer._get_replaced_import_from_part(node, alias, names_to_replace)
        self.assertEqual(result.module, 'new_module')
    def test_replace_import_from_names(self):
        transformer = BaseImportRewrite()
        result = transformer._replace_import_from_names(node, names_to_replace)
        self.assertEqual(result, import_rewrite.get_body(previous=node, current=[ast.ImportFrom(module='new_module', names=[ast.alias(name='imported', asname=None)], level=0)])[0])


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

    def test_visit_Import(self):
        transformer = BaseImportRewrite(ast.Import(names=[ast.alias(name='imported', asname=None)]))
        result = transformer.visit_Import(ast.Import(names=[ast.alias(name='imported', asname=None)]))
        self.assertEqual(result, ast.Import(names=[ast.alias(name='imported', asname=None)]))

    def test_visit_ImportFrom(self):
        transformer = BaseImportRewrite(ast.ImportFrom(module='module', names=[ast.alias(name='imported', asname=None)], level=0))
        result = transformer.visit_ImportFrom(ast.ImportFrom(module='module', names=[ast.alias(name='imported', asname=None)], level=0))
        self.assertEqual(result, ast.ImportFrom(module='module', names=[ast.alias(name='imported', asname=None)], level=0))

class TestBaseImportRewrite(unittest.TestCase):
    def test_get_matched_rewrite(self):
        transformer = BaseImportRewrite()
        self.assertIsNone(transformer._get_matched_rewrite(None))
        self.assertIsNone(transformer._get_matched_rewrite('imported'))
        self.assertEqual(transformer._get_matched_rewrite('module.imported'), ('module.imported', 'module.imported'))

    def test_replace_import(self):
        transformer = BaseImportRewrite()
        node = ast.Import(names=[ast.alias(name='imported', asname=None)])
        from_, to = 'module', 'new_module'

        node = ast.ImportFrom(module='module', names=[ast.alias(name='imported', asname=None)], level=0)
        from_, to = 'module', 'new_module'

    def test_get_names_to_replace(self):
        transformer = BaseImportRewrite()
        node = ast.ImportFrom(module='module', names=[ast.alias(name='imported', asname=None)], level=0)
        result = list(transformer._get_names_to_replace(node))
        self.assertEqual(len(result), 1)
        self.assertEqual(result[0][0], 'module.imported')
        self.assertEqual(result[0][1], ('module.imported', 'new_module.imported'))

        node = ast.ImportFrom(module='module', names=[ast.alias(name='imported', asname=None)], level=0)
        alias = ast.alias(name='imported', asname=None)
        names_to_replace = {'module.imported': ('module.imported', 'new_module.imported')}
        self.assertEqual(result.names[0].name, 'imported')
        self.assertEqual(result.names[0].asname, None)

        node = ast.ImportFrom(module='module', names=[ast.alias(name='imported', asname=None)], level=0)
        names_to_replace = {'module.imported': ('module.imported', 'new_module.imported')}

if __name__ == '__main__':
    unittest.main()