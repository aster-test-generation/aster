import unittest
from py_backwards.transformers.metaclass import *


class TestMetaclassTransformer(unittest.TestCase):
    def test_visit_Module(self):
        instance = MetaclassTransformer(tree)
        result = instance.visit_Module(ast.Module())
        self.assertEqual(result, None)

    def test_visit_ClassDef(self):
        instance = MetaclassTransformer(tree)
        result = instance.visit_ClassDef(ast.ClassDef())
        self.assertEqual(result, None)

if __name__ == '__main__':
    unittest.main()