import unittest
from py_backwards.transformers.six_moves import MovedAttribute, MovedModule, SixMovesTransformer, _get_rewrites


class TestMovedAttribute(unittest.TestCase):
    def test_init_with_all_params(self):
        attr = MovedAttribute("test", "old_mod", "new_mod", "old_attr", "new_attr")
        self.assertEqual(attr.name, "test")
        self.assertEqual(attr.new_mod, "new_mod")
        self.assertEqual(attr.new_attr, "new_attr")

    def test_init_with_default_new_mod(self):
        attr = MovedAttribute("test", "old_mod", None, "old_attr", "new_attr")
        self.assertEqual(attr.new_mod, "test")

    def test_init_with_default_new_attr(self):
        attr = MovedAttribute("test", "old_mod", "new_mod", "old_attr", None)
        self.assertEqual(attr.new_attr, "old_attr")

    def test_init_with_default_old_and_new_attr(self):
        attr = MovedAttribute("test", "old_mod", "new_mod", None, None)
        self.assertEqual(attr.new_attr, "test")

class TestMovedModule(unittest.TestCase):
    def test_init_with_all_params(self):
        mod = MovedModule("test", "old", "new")
        self.assertEqual(mod.name, "test")
        self.assertEqual(mod.new, "new")

    def test_init_with_default_new(self):
        mod = MovedModule("test", "old", None)
        self.assertEqual(mod.new, "test")

class TestSixMovesTransformer(unittest.TestCase):
    def test_target(self):
        self.assertEqual(SixMovesTransformer.target, (2, 7))

    def test_dependencies(self):
        self.assertEqual(SixMovesTransformer.dependencies, ['six'])

    def test_rewrites(self):
        rewrites = list(SixMovesTransformer.rewrites)
        self.assertTrue(len(rewrites) > 0)
        self.assertIsInstance(rewrites[0], tuple)

class TestGetRewrites(unittest.TestCase):
    def test_get_rewrites(self):
        rewrites = list(_get_rewrites())
        self.assertTrue(len(rewrites) > 0)
        self.assertIsInstance(rewrites[0], tuple)

if __name__ == '__main__':
    unittest.main()