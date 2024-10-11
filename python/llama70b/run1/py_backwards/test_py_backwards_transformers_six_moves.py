import unittest
from py_backwards.transformers.six_moves import *


class TestMovedAttribute(unittest.TestCase):
    def test_init(self):
        instance = MovedAttribute("cStringIO", "cStringIO", "io", "StringIO")
        self.assertEqual(instance.name, "cStringIO")
        self.assertEqual(instance.new_mod, "io")
        self.assertEqual(instance.new_attr, "StringIO")

    def test_private_method(self):
        instance = MovedAttribute("cStringIO", "cStringIO", "io", "StringIO")
        result = instance._MovedAttribute__init__("cStringIO", "cStringIO", "io", "StringIO")
        self.assertIsNone(result)

class TestMovedModule(unittest.TestCase):
    def test_init(self):
        instance = MovedModule("builtins", "__builtin__")
        self.assertEqual(instance.name, "builtins")
        self.assertEqual(instance.new, "builtins")

    def test_private_method(self):
        instance = MovedModule("builtins", "__builtin__")
        result = instance._MovedModule__init__("builtins", "__builtin__")
        self.assertIsNone(result)

class TestSixMovesTransformer(unittest.TestCase):
    def test_init(self):
        instance = SixMovesTransformer()
        self.assertEqual(instance.target, (2, 7))
        self.assertIsNotNone(instance.rewrites)
        self.assertEqual(instance.dependencies, ['six'])

    def test_get_rewrites(self):
        result = _get_rewrites()
        self.assertIsNotNone(result)

    def test_private_method(self):
        instance = SixMovesTransformer()
        result = instance._SixMovesTransformer__init__()
        self.assertIsNone(result)

if __name__ == '__main__':
    unittest.main()