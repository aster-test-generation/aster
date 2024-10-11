import unittest
from typed_ast import ast3 as ast
from py_backwards.transformers.metaclass import MetaclassTransformer, six_import, class_bases
from py_backwards.utils.snippet import CodeSnippet as Snippet
from py_backwards.utils.tree import insert_at


class TestMetaclassTransformer(unittest.TestCase):
    def setUp(self):
        self.transformer = MetaclassTransformer()

    def test_visit_Module(self):
        node = ast.Module(body=[])
        result = self.transformer.visit_Module(node)
        self.assertIsInstance(result, ast.Module)
        self.assertEqual(len(result.body), 1)
        self.assertIsInstance(result.body[0], ast.ImportFrom)

    def test_visit_ClassDef_no_keywords(self):
        node = ast.ClassDef(name='Test', bases=[], keywords=[], body=[], decorator_list=[])
        result = self.transformer.visit_ClassDef(node)
        self.assertIsInstance(result, ast.ClassDef)
        self.assertEqual(result.keywords, [])
        self.assertEqual(result.bases, [])

    def test_visit_ClassDef_with_keywords(self):
        metaclass = ast.Name(id='Meta', ctx=ast.Load())
        keyword = ast.keyword(arg='metaclass', value=metaclass)
        node = ast.ClassDef(name='Test', bases=[], keywords=[keyword], body=[], decorator_list=[])
        result = self.transformer.visit_ClassDef(node)
        self.assertIsInstance(result, ast.ClassDef)
        self.assertEqual(result.keywords, [])
        self.assertTrue(self.transformer._tree_changed)

    def test_six_import_snippet(self):
        snippet_body = six_import.get_body()
        self.assertIsInstance(snippet_body, list)
        self.assertIsInstance(snippet_body[0], ast.ImportFrom)

    def test_class_bases_snippet(self):
        metaclass = ast.Name(id='Meta', ctx=ast.Load())
        bases = ast.List(elts=[ast.Name(id='Base', ctx=ast.Load())])
        snippet_body = class_bases.get_body(metaclass=metaclass, bases=bases)
        self.assertIsInstance(snippet_body, list)
        self.assertIsInstance(snippet_body[0], ast.Expr)

if __name__ == '__main__':
    unittest.main()