import unittest
from thonny.roughparse import *

class TestStringTranslatePseudoMapping(unittest.TestCase):
    def test_init(self):
        non_defaults = {'a': 1, 'b': 2}
        default_value = 3
        instance = StringTranslatePseudoMapping(non_defaults, default_value)
        self.assertEqual(instance._non_defaults, non_defaults)
        self.assertEqual(instance._default_value, default_value)

    def test_getitem(self):
        non_defaults = {'a': 1, 'b': 2}
        default_value = 3
        instance = StringTranslatePseudoMapping(non_defaults, default_value)
        self.assertEqual(instance['a'], 1)
        self.assertEqual(instance['b'], 2)
        self.assertEqual(instance['c'], default_value)

    def test_len(self):
        non_defaults = {'a': 1, 'b': 2}
        default_value = 3
        instance = StringTranslatePseudoMapping(non_defaults, default_value)
        self.assertEqual(len(instance), len(non_defaults))

    def test_iter(self):
        non_defaults = {'a': 1, 'b': 2}
        default_value = 3
        instance = StringTranslatePseudoMapping(non_defaults, default_value)
        self.assertEqual(list(instance), list(non_defaults))

    def test_get(self):
        non_defaults = {'a': 1, 'b': 2}
        default_value = 3
        instance = StringTranslatePseudoMapping(non_defaults, default_value)
        self.assertEqual(instance.get('a'), 1)
        self.assertEqual(instance.get('b'), 2)
        self.assertEqual(instance.get('c'), default_value)
        self.assertEqual(instance.get('c', 4), 3)

if __name__ == '__main__':
    unittest.main()