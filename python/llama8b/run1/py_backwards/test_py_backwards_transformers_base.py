import unittest
from py_backwards.transformers.base import BaseTransformer, BaseNodeTransformer, BaseImportRewrite
from typed_ast import ast3 as ast
        result = transformer._replace_import(node, from_, to)
        self.assertIsInstance(result, ast.Try)
    def test_get_replaced_import_from_part(self):
        transformer = BaseImportRewrite(ast.AST())
        result = transformer._get_replaced_import_from_part(node, alias, names_to_replace)
        self.assertIsInstance(result, ast.ImportFrom)
    def test_replace_import_from_names(self):
        transformer = BaseImportRewrite(ast.AST())
        result = transformer._replace_import_from_names(node, names_to_replace)
        self.assertIsInstance(result, ast.Try)
    def test_visit_import_from(self):
        transformer = BaseImportRewrite(ast.AST())
        result = transformer.visit_import_from(node)
        self.assertIsInstance(result, (ast.ImportFrom, ast.Try))


class TestBaseTransformer(unittest.TestCase):
    def test_transform(self):
        transformer = BaseTransformer()
        with self.assertRaises(NotImplementedError):
            transformer.transform(ast.AST())

class TestBaseNodeTransformer(unittest.TestCase):
    def test_transform(self):
        transformer = BaseNodeTransformer(ast.AST())
        result = transformer.transform(ast.AST())
        self.assertIsInstance(result, TransformationResult)

    def test_visit(self):
        transformer = BaseNodeTransformer(ast.AST())
        with self.assertRaises(NotImplementedError):
            transformer.visit(ast.AST())

class TestBaseImportRewrite(unittest.TestCase):
    def test_get_matched_rewrite(self):
        transformer = BaseImportRewrite(ast.AST())
        self.assertIsNone(transformer._get_matched_rewrite(None))

    def test_replace_import(self):
        transformer = BaseImportRewrite(ast.AST())
        node = ast.Import([ast.alias('from_module', 'from_name')])
        from_, to = 'from_module', 'to_module'

    def test_visit_import(self):
        transformer = BaseImportRewrite(ast.AST())
        node = ast.Import([ast.alias('from_module', 'from_name')])
        result = transformer.visit_import(node)
        self.assertIsInstance(result, (ast.Import, ast.Try))

    def test_get_names_to_replace(self):
        transformer = BaseImportRewrite(ast.AST())
        node = ast.ImportFrom('module', [ast.alias('name', 'asname')], 0)
        result = list(transformer._get_names_to_replace(node))
        self.assertEqual(len(result), 1)

        node = ast.ImportFrom('module', [ast.alias('name', 'asname')], 0)
        alias = ast.alias('name', 'asname')
        names_to_replace = {'module.name': ('from_module', 'to_module')}

        node = ast.ImportFrom('module', [ast.alias('name', 'asname')], 0)
        names_to_replace = {'module.name': ('from_module', 'to_module')}

        node = ast.ImportFrom('module', [ast.alias('name', 'asname')], 0)

if __name__ == '__main__':
    unittest.main()