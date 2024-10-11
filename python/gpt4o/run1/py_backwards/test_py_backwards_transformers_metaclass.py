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
        self.assertEqual(len(result.body), 1)
        self.assertIsInstance(result.body[0], ast.ImportFrom)

    def test_visit_ClassDef_no_keywords(self):
        node = ast.ClassDef(name='Test', bases=[], keywords=[], body=[], decorator_list=[])
        result = self.transformer.visit_ClassDef(node)
        self.assertEqual(result, node)

    def test_visit_ClassDef_with_keywords(self):
        keyword = ast.keyword(arg='metaclass', value=ast.Name(id='Meta', ctx=ast.Load()))
        node = ast.ClassDef(name='Test', bases=[], keywords=[keyword], body=[], decorator_list=[])
        result = self.transformer.visit_ClassDef(node)
        self.assertEqual(len(result.bases.elts), 0)
        self.assertEqual(result.keywords, [])
        self.assertTrue(self.transformer._tree_changed)

    def test_six_import_snippet(self):
        snippet_body = six_import.get_body()
        self.assertIsInstance(snippet_body[0], ast.ImportFrom)
        self.assertEqual(snippet_body[0].module, 'six')

    def test_class_bases_snippet(self):
        metaclass = ast.Name(id='Meta', ctx=ast.Load())
        bases = []
        snippet_body = class_bases.get_body(metaclass=metaclass, bases=bases)
        self.assertIsInstance(snippet_body[0], ast.Expr)
        self.assertIsInstance(snippet_body[0].value, ast.Call)
        self.assertEqual(snippet_body[0].value.func.attr, 'with_metaclass')

if __name__ == '__main__':
    unittest.main()