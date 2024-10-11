import unittest
from py_backwards.transformers.six_moves import MovedAttribute, MovedModule


class TestMovedAttribute(unittest.TestCase):
    def test_init(self):
        attr = MovedAttribute('name', 'old_mod', 'new_mod', 'old_attr', 'new_attr')
        self.assertEqual(attr.name, 'name')
        self.assertEqual(attr.new_mod, 'new_mod')
        self.assertEqual(attr.new_mod, 'new_mod')
        self.assertEqual(attr.old_attr, 'old_attr')
        self.assertEqual(attr.new_attr, 'new_attr')

class TestMovedModule(unittest.TestCase):
    def test_init(self):
        mod = MovedModule('name', 'old', 'new')
        self.assertEqual(mod.name, 'name')
        self.assertEqual(mod.new, 'new')
        self.assertEqual(mod.new, 'new')

if __name__ == '__main__':
    unittest.main()