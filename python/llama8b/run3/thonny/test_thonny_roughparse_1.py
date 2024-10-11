import unittest
from thonny.roughparse import *


class TestStringTranslatePseudoMapping(unittest.TestCase):
    def test_getitem(self):
        mapping = StringTranslatePseudoMapping({'a': 1, 'b': 2}, 0)
        self.assertEqual(mapping['a'], 1)
        self.assertEqual(mapping['b'], 2)
        self.assertEqual(mapping['c'], 0)

    def test_get(self):
        mapping = StringTranslatePseudoMapping({'a': 1, 'b': 2}, 0)
        self.assertEqual(mapping.get('a'), 1)
        self.assertEqual(mapping.get('b'), 2)
        self.assertEqual(mapping.get('c'), 0)
        self.assertIsNone(mapping.get('d'))

    def test_len(self):
        mapping = StringTranslatePseudoMapping({'a': 1, 'b': 2}, 0)
        self.assertEqual(len(mapping), 2)

    def test_iter(self):
        mapping = StringTranslatePseudoMapping({'a': 1, 'b': 2}, 0)
        self.assertEqual(list(mapping), ['a', 'b'])

    def test_eq(self):
        mapping1 = StringTranslatePseudoMapping({'a': 1, 'b': 2}, 0)
        mapping2 = StringTranslatePseudoMapping({'a': 1, 'b': 2}, 0)
        self.assertEqual(mapping1, mapping2)

    def test_ne(self):
        mapping1 = StringTranslatePseudoMapping({'a': 1, 'b': 2}, 0)
        mapping2 = StringTranslatePseudoMapping({'a': 1, 'b': 3}, 0)
        self.assertNotEqual(mapping1, mapping2)

class TestRoughParse(unittest.TestCase):
    def test_synchre(self):
        text = 'while\n    x = 1\n    print(x)'
        match = _synchre(text)
        self.assertIsNotNone(match)

    def test_junkre(self):
        text = '    foo = 1\n    bar = 2'
        match = _junkre(text)
        self.assertIsNone(match)

    def test_match_stringre(self):
        text = '    "hello"'
        match = _match_stringre(text)
        self.assertIsNotNone(match)

    def test_itemre(self):
        text = '    foo = 1\n    bar = 2'
        match = _itemre(text)
        self.assertIsNone(match)

    def test_closere(self):
        text = '    return 1'
        match = _closere(text)
        self.assertIsNotNone(match)

    def test_chew_ordinaryre(self):
        text = '    foo = 1'
        match = _chew_ordinaryre(text)
        self.assertIsNone(match)

if __name__ == '__main__':
    unittest.main()