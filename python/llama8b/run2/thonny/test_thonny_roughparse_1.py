import unittest
from thonny.roughparse import StringTranslatePseudoMapping, _synchre, _junkre, _match_stringre, _itemre, _closere, _chew_ordinaryre, _ASCII_ID_CHARS, _ASCII_ID_FIRST_CHARS, _IS_ASCII_ID_CHAR, _IS_ASCII_ID_FIRST_CHAR


class TestStringTranslatePseudoMapping(unittest.TestCase):
    def test_init(self):
        mapping = StringTranslatePseudoMapping({'a': 1, 'b': 2}, 3)
        self.assertEqual(mapping._non_defaults, {'a': 1, 'b': 2})
        self.assertEqual(mapping._default_value, 3)

    def test_getitem(self):
        mapping = StringTranslatePseudoMapping({'a': 1, 'b': 2}, 3)
        self.assertEqual(mapping['a'], 1)
        self.assertEqual(mapping['b'], 2)
        self.assertEqual(mapping['c'], 3)

    def test_len(self):
        mapping = StringTranslatePseudoMapping({'a': 1, 'b': 2}, 3)
        self.assertEqual(len(mapping), 2)

    def test_iter(self):
        mapping = StringTranslatePseudoMapping({'a': 1, 'b': 2}, 3)
        self.assertEqual(list(mapping), ['a', 'b'])

    def test_get(self):
        mapping = StringTranslatePseudoMapping({'a': 1, 'b': 2}, 3)
        self.assertEqual(mapping.get('a'), 1)
        self.assertEqual(mapping.get('b'), 2)
        self.assertEqual(mapping.get('c'), 3)

class TestRegex(unittest.TestCase):
    def test_synchre(self):
        self.assertIsNone(_synchre('while\n    ^\n    [ \\t]*\n    (?: while\n    |   else\n    |   def\n    |   return\n    |   assert\n    |   break\n    |   class\n    |   continue\n    |   elif\n    |   try\n    |   except\n    |   raise\n    |   import\n    |   yield\n    )\n    \\b\n'))

    def test_junkre(self):
        self.assertIsNone(_junkre('    [ \\t]*\n    (?: \\n'))

    def test_match_stringre(self):
        self.assertIsNone(_match_stringre('    " hello "'))
        self.assertIsNone(_match_stringre('    \'hello\''))
        self.assertIsNone(_match_stringre('    \'\'\'hello\'\'\''))

    def test_itemre(self):
        self.assertIsNone(_itemre('    [ \\t]*\n    [^\\s'))

    def test_closere(self):
        self.assertIsNone(_closere('    \\s*\n    (?: return\n    |   break\n    |   continue\n    |   raise\n    |   pass\n    )\n    \\b\n'))

class TestASCII_ID(unittest.TestCase):
    def test_ASCII_ID_CHARS(self):
        for char in _ASCII_ID_CHARS:
            self.assertTrue(char in _ASCII_ID_CHARS)

    def test_ASCII_ID_FIRST_CHARS(self):
        for char in _ASCII_ID_FIRST_CHARS:
            self.assertTrue(char in _ASCII_ID_FIRST_CHARS)

    def test_IS_ASCII_ID_CHAR(self):
        for i in range(128):
            self.assertTrue(_IS_ASCII_ID_CHAR[i])

    def test_IS_ASCII_ID_FIRST_CHAR(self):
        for i in range(128):
            self.assertTrue(_IS_ASCII_ID_FIRST_CHAR[i])

if __name__ == '__main__':
    unittest.main()