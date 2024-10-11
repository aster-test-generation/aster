import unittest
from py_backwards.transformers.six_moves import MovedAttribute, MovedModule, _get_rewrites, SixMovesTransformer


class TestMovedAttribute(unittest.TestCase):
    def test_init(self):
        ma = MovedAttribute("cStringIO", "cStringIO", "io", "StringIO")
        self.assertEqual(ma.name, "cStringIO")
        self.assertEqual(ma.new_mod, "io")
        self.assertEqual(ma.new_attr, "StringIO")

    def test_str(self):
        ma = MovedAttribute("cStringIO", "cStringIO", "io", "StringIO")
        self.assertEqual(str(ma), "MovedAttribute(cStringIO, cStringIO, io, StringIO)")

    def test_repr(self):
        ma = MovedAttribute("cStringIO", "cStringIO", "io", "StringIO")
        self.assertEqual(repr(ma), "MovedAttribute('cStringIO', 'cStringIO', 'io', 'StringIO')")

class TestMovedModule(unittest.TestCase):
    def test_init(self):
        mm = MovedModule("builtins", "__builtin__")
        self.assertEqual(mm.name, "builtins")
        self.assertEqual(mm.new, "builtins")

    def test_str(self):
        mm = MovedModule("builtins", "__builtin__")
        self.assertEqual(str(mm), "MovedModule(builtins, __builtin__)")

    def test_repr(self):
        mm = MovedModule("builtins", "__builtin__")
        self.assertEqual(repr(mm), "MovedModule('builtins', '__builtin__')")

class TestGetRewrites(unittest.TestCase):
    def test_get_rewrites(self):
        rewrites = list(_get_rewrites())
        self.assertGreater(len(rewrites), 0)

class TestSixMovesTransformer(unittest.TestCase):
    def test_init(self):
        smt = SixMovesTransformer()
        self.assertEqual(smt.target, (2, 7))
        self.assertEqual(smt.dependencies, ['six'])

    def test_rewrites(self):
        smt = SixMovesTransformer()
        self.assertEqual(smt.rewrites, _get_rewrites())

    def test_str(self):
        smt = SixMovesTransformer()
        self.assertEqual(str(smt), "SixMovesTransformer")

    def test_repr(self):
        smt = SixMovesTransformer()
        self.assertEqual(repr(smt), "SixMovesTransformer()")

if __name__ == '__main__':
    unittest.main()