import unittest
from py_backwards.transformers.metaclass import MetaclassTransformer
from typed_ast import ast3 as ast


class TestMetaclassTransformer(unittest.TestCase):
    def test_visit_module(self):
        node = ast.Module()
        transformer = MetaclassTransformer(tree=None)
        result = transformer.visit_Module(node)
        self.assertEqual(result, node)

    def test_visit_class_def(self):
        node = ast.ClassDef(name='Test', bases=[], keywords=[])
        transformer = MetaclassTransformer(tree=None)
        result = transformer.visit_ClassDef(node)
        self.assertEqual(result, node)

if __name__ == '__main__':
    unittest.main()