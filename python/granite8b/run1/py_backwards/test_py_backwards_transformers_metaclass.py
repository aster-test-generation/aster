import unittest
from py_backwards.transformers.metaclass import MetaclassTransformer


class TestMetaclassTransformer(unittest.TestCase):
    def test_transform_class_with_metaclass(self):
        tree = ast.parse(text)
        tree = ast.parse("""
        class MyClass(metaclass=MyMetaclass):
            pass
        """)
        expected_tree = ast.parse("""
        from six import with_metaclass as _py_backwards_six_withmetaclass
        _py_backwards_six_withmetaclass(MyMetaclass, object)
        class MyClass:
            pass
        """)
        transformed_tree = transformer.visit(tree)
        self.assertEqual(str(transformed_tree), str(expected_tree))

    def test_transform_class_with_keywords(self):
        transformer = MetaclassTransformer(tree)
        tree = ast.parse("""
        class MyClass(object, metaclass=MyMetaclass):
            pass
        """)
        expected_tree = ast.parse("""
        from six import with_metaclass as _py_backwards_six_withmetaclass
        _py_backwards_six_withmetaclass(MyMetaclass, object, object)
        class MyClass:
            pass
        """)
        transformed_tree = transformer.visit(tree)
        self.assertEqual(str(transformed_tree), str(expected_tree))

    def test_transform_class_without_metaclass(self):
        tree = ast.parse("class A(object): pass")
        tree = ast.parse("""
        class MyClass:
            pass
        """)
        expected_tree = ast.parse("""
        class MyClass:
            pass
        """)
        transformed_tree = transformer.visit(tree)
        self.assertEqual(str(transformed_tree), str(expected_tree))

if __name__ == '__main__':
    unittest.main()