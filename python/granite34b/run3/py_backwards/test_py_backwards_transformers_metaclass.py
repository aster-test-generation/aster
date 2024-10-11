import unittest
from py_backwards.transformers.metaclass import MetaclassTransformer
        self.assertIn("from six import with_metaclass as _py_backwards_six_withmetaclass", result.body[0].value.s)

    def test_visit_class_def(self):


class TestMetaclassTransformer(unittest.TestCase):
    def test_visit_module(self):
        transformer = MetaclassTransformer(tree=None)
        node = ast.parse("class MyClass:\n    pass")
        result = transformer.visit_Module(node)
        transformer = MetaclassTransformer(tree=None)
        node = ast.parse("class MyClass(metaclass=MyMetaClass):\n    pass")
        result = transformer.visit_ClassDef(node)
        self.assertEqual(result.bases.elts[0].id, "_py_backwards_six_withmetaclass")
        self.assertEqual(result.keywords, [])

if __name__ == '__main__':
    unittest.main()