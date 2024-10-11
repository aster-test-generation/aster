import unittest
from py_backwards.transformers.metaclass import MetaclassTransformer
from typed_ast import ast3 as ast
from six import with_metaclass as _py_backwards_six_withmetaclass


class TestMetaclassTransformer(unittest.TestCase):
    def test_metaclass_transformer(self):
        tree = ast.parse(source)
        tree = ast.parse("""
class MyClass(metaclass=MyMetaclass):
    pass
""")
        expected_tree = ast.parse("""
class MyClass(_py_backwards_six_withmetaclass(MyMetaclass)):
    pass
""")
        transformed_tree = transformer.visit(tree)
        self.assertEqual(str(transformed_tree), str(expected_tree))

if __name__ == '__main__':
    unittest.main()