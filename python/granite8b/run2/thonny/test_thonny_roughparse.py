import unittest
from thonny.roughparse import *


class TestStringTranslatePseudoMapping(unittest.TestCase):
    def test_get_item(self):
        mapping = StringTranslatePseudoMapping({'a': 1, 'b': 2}, 3)
        self.assertEqual(mapping['a'], 1)
        self.assertEqual(mapping['b'], 2)
        self.assertEqual(mapping['c'], 3)

    def test_get(self):
        mapping = StringTranslatePseudoMapping({'a': 1, 'b': 2}, 3)
        self.assertEqual(mapping.get('a'), 1)
        self.assertEqual(mapping.get('b'), 2)
        self.assertEqual(mapping.get('c'), 3)
        self.assertEqual(mapping.get('c', 4), 4)

    def test_len(self):
        mapping = StringTranslatePseudoMapping({'a': 1, 'b': 2}, 3)
        self.assertEqual(len(mapping), 2)

    def test_iter(self):
        mapping = StringTranslatePseudoMapping({'a': 1, 'b': 2}, 3)
        self.assertEqual(list(iter(mapping)), ['a', 'b'])

if __name__ == '__main__':
    unittest.main()