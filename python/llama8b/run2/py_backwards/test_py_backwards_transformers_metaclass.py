import unittest
from unittest.mock import patch
from typed_ast import ast3 as ast
from utils.snippet import snippe
from ..utils.tree import insert_at
from .base import BaseNodeTransformer
from py_backwards.transformers.metaclass import MetaclassTransformer, six_import, class_bases


class TestMetaclassTransformer(unittest.TestCase):
    @patch('py_backwards.transformers.metaclass.snippet')
    @patch('py_backwards.transformers.metaclass.insert_at')
    def test_visit_Module(self, mock_insert_at, mock_snippet):
        node = ast.Module()
        transformer = MetaclassTransformer()
        result = transformer.visit_Module(node)
        self.assertEqual(result, node)
        mock_insert_at.assert_called_once_with(0, node, six_import.get_body())

    @patch('py_backwards.transformers.metaclass.snippet')
    @patch('py_backwards.transformers.metaclass.insert_at')
    def test_visit_ClassDef(self, mock_insert_at, mock_snippet):
        node = ast.ClassDef()
        transformer = MetaclassTransformer()
        result = transformer.visit_ClassDef(node)
        self.assertEqual(result, node)
        mock_insert_at.assert_called_once_with(0, node, six_import.get_body())

    def test_class_bases(self):
        metaclass = 'metaclass'
        bases = ['base1', 'base2']
        result = class_bases(metaclass, bases)
        self.assertEqual(result, ['base1', 'base2', metaclass])

    def test_six_import(self):
        result = six_import()
        self.assertEqual(result, six_import.get_body())

if __name__ == '__main__':
    unittest.main()