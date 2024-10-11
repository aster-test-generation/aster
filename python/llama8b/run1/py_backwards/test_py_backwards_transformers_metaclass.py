import unittest
from unittest.mock import patch
from typed_ast import ast3 as ast
from utils.snippet import snippe
from ..utils.tree import insert_at
from .base import BaseNodeTransformer
from py_backwards.transformers.metaclass import MetaclassTransformer, six_import, class_bases


class TestMetaclassTransformer(unittest.TestCase):
    def test_visit_Module(self):
        with patch('py_backwards.transformers.metaclass.snippet.get_body') as get_body:
            get_body.return_value = ast.parse('import six')
            node = ast.parse('module')
            transformer = MetaclassTransformer()
            result = transformer.visit_Module(node)
            self.assertEqual(result, node)
            get_body.assert_called_once()

    def test_visit_ClassDef(self):
        node = ast.parse('class MyClass:')
        node.keywords = [ast.keyword(arg='metaclass', value=ast.Name(id='MyMeta'))]
        node.bases = [ast.Name(id='object')]
        transformer = MetaclassTransformer()
        result = transformer.visit_ClassDef(node)
        self.assertEqual(result, node)
        self.assertEqual(node.bases, [class_bases(metaclass=ast.Name(id='MyMeta'), bases=[ast.Name(id='object')])])
        self.assertEqual(node.keywords, [])

    def test_visit_ClassDef_no_metaclass(self):
        node = ast.parse('class MyClass:')
        node.bases = [ast.Name(id='object')]
        transformer = MetaclassTransformer()
        result = transformer.visit_ClassDef(node)
        self.assertEqual(result, node)
        self.assertEqual(node.bases, [ast.Name(id='object')])

    def test_visit_ClassDef_invalid_metaclass(self):
        node = ast.parse('class MyClass:')
        node.keywords = [ast.keyword(arg='metaclass', value=ast.Name(id='InvalidMeta'))]
        node.bases = [ast.Name(id='object')]
        transformer = MetaclassTransformer()
        with self.assertRaises(ValueError):
            transformer.visit_ClassDef(node)

    def test_visit_ClassDef_multiple_metaclasses(self):
        node = ast.parse('class MyClass:')
        node.keywords = [ast.keyword(arg='metaclass', value=ast.Name(id='Meta1')), ast.keyword(arg='metaclass', value=ast.Name(id='Meta2'))]
        node.bases = [ast.Name(id='object')]
        transformer = MetaclassTransformer()
        with self.assertRaises(ValueError):
            transformer.visit_ClassDef(node)

if __name__ == '__main__':
    unittest.main()