import unittest
from py_backwards.transformers.six_moves import MovedAttribute, MovedModule


class TestMovedAttribute(unittest.TestCase):
    def test_init(self):
        attr = MovedAttribute("name", "old_mod", "new_mod", "old_attr", "new_attr")
        self.assertEqual(attr.name, "name")
        self.assertEqual(attr.new_mod, "new_mod")
        self.assertEqual(attr.new_attr, "new_attr")

    def test_eq(self):
        attr1 = MovedAttribute("name", "old_mod", "new_mod", "old_attr", "new_attr")
        attr2 = MovedAttribute("name", "old_mod", "new_mod", "old_attr", "new_attr")
        self.assertEqual(attr1.__class__, attr2.__class__)

    def test_ne(self):
        attr1 = MovedAttribute("name1", "old_mod", "new_mod", "old_attr", "new_attr")
        attr2 = MovedAttribute("name2", "old_mod", "new_mod", "old_attr", "new_attr")
        self.assertNotEqual(attr1, attr2)

class TestMovedModule(unittest.TestCase):
    def test_init(self):
        mod = MovedModule("name", "old", "new")
        self.assertEqual(mod.name, "name")
        self.assertEqual(mod.new, "new")

    def test_eq(self):
        mod1 = MovedModule("name", "old", "new")
        mod2 = MovedModule("name", "old", "new")
        self.assertEqual(mod1.__name__, mod2.__name__)

    def test_ne(self):
        mod1 = MovedModule("name1", "old", "new")
        mod2 = MovedModule("name2", "old", "new")
        self.assertNotEqual(mod1, mod2)

if __name__ == '__main__':
    unittest.main()