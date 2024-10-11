import unittest
from py_backwards.transformers.metaclass import MetaclassTransformer, six_import, class_bases


class TestMetaclassTransformer(unittest.TestCase):
    def test_visit_Module(self):
        transformer = MetaclassTransformer()
        node = ast.Module(body=[])
        result = transformer.visit_Module(node)
        self.assertIsInstance(result, ast.Module)

    def test_visit_ClassDef(self):
        transformer = MetaclassTransformer()
        node = ast.ClassDef(name='TestClass', bases=[ast.Name(id='object', ctx=ast.Load())], body=[])
        result = transformer.visit_ClassDef(node)
        self.assertIsInstance(result, ast.ClassDef)

    def test_generic_visit(self):
        transformer = MetaclassTransformer()
        node = ast.Module(body=[])
        result = transformer.generic_visit(node)
        self.assertIsInstance(result, ast.Module)

    def test_tree_changed(self):
        transformer = MetaclassTransformer()
        self.assertFalse(transformer._tree_changed)
        transformer._tree_changed = True
        self.assertTrue(transformer._tree_changed)

    def test___init__(self):
        transformer = MetaclassTransformer()
        self.assertIsInstance(transformer, MetaclassTransformer)

    def test___str__(self):
        transformer = MetaclassTransformer()
        result = str(transformer)
        self.assertIsInstance(result, str)

    def test___repr__(self):
        transformer = MetaclassTransformer()
        result = repr(transformer)
        self.assertIsInstance(result, str)

    def test___eq__(self):
        transformer1 = MetaclassTransformer()
        transformer2 = MetaclassTransformer()
        self.assertNotEqual(transformer1, transformer2)

class TestSixImport(unittest.TestCase):
    def test_get_body(self):
        result = six_import.get_body()
        self.assertIsInstance(result, list)

class TestClassBases(unittest.TestCase):
    def test_get_body(self):
        result = class_bases.get_body(metaclass='metaclass', bases=[])
        self.assertIsInstance(result, list)

if __name__ == '__main__':
    unittest.main()