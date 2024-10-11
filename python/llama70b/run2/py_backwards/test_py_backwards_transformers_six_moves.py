import unittest
from py_backwards.transformers.six_moves import *


class TestMovedAttribute(unittest.TestCase):
    def test_init(self):
        ma = MovedAttribute("cStringIO", "cStringIO", "io", "StringIO")
        self.assertEqual(ma.name, "cStringIO")
        self.assertEqual(ma.new_mod, "io")
        self.assertEqual(ma.new_attr, "StringIO")

    def test_private_method(self):
        ma = MovedAttribute("cStringIO", "cStringIO", "io", "StringIO")
        result = ma._MovedAttribute__init__("cStringIO", "cStringIO", "io", "StringIO")
        self.assertIsNone(result)

class TestMovedModule(unittest.TestCase):
    def test_init(self):
        mm = MovedModule("builtins", "__builtin__")
        self.assertEqual(mm.name, "builtins")
        self.assertEqual(mm.new, "builtins")

    def test_private_method(self):
        mm = MovedModule("builtins", "__builtin__")
        result = mm._MovedModule__init__("builtins", "__builtin__")
        self.assertIsNone(result)

class TestSixMovesTransformer(unittest.TestCase):
    def test_init(self):
        smt = SixMovesTransformer()
        self.assertEqual(smt.target, (2, 7))
        self.assertIsNotNone(smt.rewrites)
        self.assertEqual(smt.dependencies, ['six'])

    def test_get_rewrites(self):
        smt = SixMovesTransformer()
        rewrites = list(smt.rewrites)
        self.assertGreater(len(rewrites), 0)

    def test_private_method(self):
        smt = SixMovesTransformer()
        result = smt._SixMovesTransformer__init__()
        self.assertIsNone(result)

class TestEager(unittest.TestCase):
    def test_eager_decorator(self):
        @eager
        def test_func():
            return "eager"
        self.assertEqual(test_func(), "eager")

if __name__ == '__main__':
    unittest.main()