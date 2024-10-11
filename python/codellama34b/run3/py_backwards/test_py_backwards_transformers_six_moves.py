import unittest
from py_backwards.transformers.six_moves import *



class TestMovedAttribute(unittest.TestCase):
    def test_init(self):
        instance = MovedAttribute("cStringIO", "cStringIO", "io", "StringIO")
        self.assertEqual(instance.name, "cStringIO")
        self.assertEqual(instance.new_mod, "io")
        self.assertEqual(instance.new_attr, "StringIO")

    def test_init_new_mod_none(self):
        instance = MovedAttribute("cStringIO", "cStringIO", None, "StringIO")
        self.assertEqual(instance.name, "cStringIO")
        self.assertEqual(instance.new_mod, "cStringIO")
        self.assertEqual(instance.new_attr, "StringIO")

    def test_init_new_attr_none(self):
        instance = MovedAttribute("cStringIO", "cStringIO", "io", None)
        self.assertEqual(instance.name, "cStringIO")
        self.assertEqual(instance.new_mod, "io")
        self.assertEqual(instance.new_attr, "cStringIO")

    def test_init_old_attr_none(self):
        instance = MovedAttribute("cStringIO", "cStringIO", "io", "StringIO", None)
        self.assertEqual(instance.name, "cStringIO")
        self.assertEqual(instance.new_mod, "io")
        self.assertEqual(instance.new_attr, "StringIO")

    def test_init_old_attr_none_new_attr_none(self):
        instance = MovedAttribute("cStringIO", "cStringIO", "io", None, None)
        self.assertEqual(instance.name, "cStringIO")
        self.assertEqual(instance.new_mod, "io")
        self.assertEqual(instance.new_attr, "cStringIO")

class TestMovedModule(unittest.TestCase):
    def test_init(self):
        instance = MovedModule("builtins", "__builtin__")
        self.assertEqual(instance.name, "builtins")
        self.assertEqual(instance.new, "builtins")

    def test_init_new_none(self):
        instance = MovedModule("builtins", None)
        self.assertEqual(instance.name, "builtins")
        self.assertEqual(instance.new, "builtins")

class TestSixMovesTransformer(unittest.TestCase):
    def test_init(self):
        instance = SixMovesTransformer(tree)
        self.assertEqual(instance.target, (2, 7))
        self.assertEqual(instance.rewrites, _get_rewrites())
        self.assertEqual(instance.dependencies, ['six'])

    def test_get_rewrites(self):
        instance = SixMovesTransformer(tree)
        self.assertEqual(instance._get_rewrites(), _get_rewrites())

    def test_get_rewrites_prefixed_moves(self):
        instance = SixMovesTransformer(tree)
        self.assertEqual(instance._get_rewrites(), _get_rewrites())

    def test_get_rewrites_prefixed_moves_prefix(self):
        instance = SixMovesTransformer(tree)
        self.assertEqual(instance._get_rewrites(), _get_rewrites())

    def test_get_rewrites_prefixed_moves_prefix_moves(self):
        instance = SixMovesTransformer(tree)
        self.assertEqual(instance._get_rewrites(), _get_rewrites())

    def test_get_rewrites_prefixed_moves_prefix_moves_move(self):
        instance = SixMovesTransformer(tree)
        self.assertEqual(instance._get_rewrites(), _get_rewrites())

if __name__ == '__main__':
    unittest.main()