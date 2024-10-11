import unittest
from typed_ast import ast3 as ast
from py_backwards.transformers.metaclass import MetaclassTransformer, six_import, class_bases
from py_backwards.utils.snippet import CodeSnippet
from py_backwards.utils.tree import insert_at


class TestMetaclassTransformer(unittest.TestCase):
    def setUp(self):
        self.transformer = MetaclassTransformer()

    def test_visit_Module(self):
        node = ast.Module(body=[])
        result = self.transformer.visit_Module(node)
        self.assertIsInstance(result, ast.Module)
        self.assertTrue(any(isinstance(stmt, ast.ImportFrom) for stmt in result.body))

    def test_visit_ClassDef_no_keywords(self):
        node = ast.ClassDef(name='Test', bases=[], keywords=[], body=[], decorator_list=[])
        result = self.transformer.visit_ClassDef(node)
        self.assertIsInstance(result, ast.ClassDef)
        self.assertFalse(self.transformer._tree_changed)

    def test_visit_ClassDef_with_keywords(self):
        keyword = ast.keyword(arg='metaclass', value=ast.Name(id='Meta', ctx=ast.Load()))
        node = ast.ClassDef(name='Test', bases=[], keywords=[keyword], body=[], decorator_list=[])
        result = self.transformer.visit_ClassDef(node)
        self.assertIsInstance(result, ast.ClassDef)
        self.assertTrue(self.transformer._tree_changed)
        self.assertEqual(len(result.keywords), 0)
        self.assertTrue(any(isinstance(base, ast.Call) for base in result.bases.elts))

    def test_six_import_snippet(self):
        snippet_body = six_import.get_body()
        self.assertIsInstance(snippet_body, list)
        self.assertTrue(any(isinstance(stmt, ast.ImportFrom) for stmt in snippet_body))

    def test_class_bases_snippet(self):
        snippet_body = class_bases.get_body(metaclass=ast.Name(id='Meta', ctx=ast.Load()), bases=[])
        self.assertIsInstance(snippet_body, list)
        self.assertTrue(any(isinstance(stmt, ast.Call) for stmt in snippet_body))

if __name__ == '__main__':
    unittest.main()