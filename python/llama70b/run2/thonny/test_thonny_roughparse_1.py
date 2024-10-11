import unittest
from thonny.roughparse import *


class TestStringTranslatePseudoMapping(unittest.TestCase):
    def test_init(self):
        instance = StringTranslatePseudoMapping({}, 'default_value')
        self.assertIsNotNone(instance)

    def test_getitem(self):
        instance = StringTranslatePseudoMapping({'key': 'value'}, 'default_value')
        result = instance['key']
        self.assertEqual(result, 'value')

    def test_len(self):
        instance = StringTranslatePseudoMapping({'key1': 'value1', 'key2': 'value2'}, 'default_value')
        result = len(instance)
        self.assertEqual(result, 2)

    def test_iter(self):
        instance = StringTranslatePseudoMapping({'key1': 'value1', 'key2': 'value2'}, 'default_value')
        result = list(iter(instance))
        self.assertEqual(result, ['key1', 'key2'])

    def test_get(self):
        instance = StringTranslatePseudoMapping({'key': 'value'}, 'default_value')
        result = instance.get('key')
        self.assertEqual(result, 'value')

    def test_get_default(self):
        instance = StringTranslatePseudoMapping({}, 'default_value')
        result = instance.get('key')
        self.assertEqual(result, 'default_value')

    def test_private__get(self):
        instance = StringTranslatePseudoMapping({'key': 'value'}, 'default_value')
        result = instance._StringTranslatePseudoMapping__get('key')
        self.assertEqual(result, 'value')

    def test_str_method(self):
        instance = StringTranslatePseudoMapping({}, 'default_value')
        result = str(instance)
        self.assertEqual(result, '{}')

    def test_repr_method(self):
        instance = StringTranslatePseudoMapping({}, 'default_value')
        result = repr(instance)
        self.assertEqual(result, 'StringTranslatePseudoMapping({}, \'default_value\')')

class TestRegexPatterns(unittest.TestCase):
    def test_synchre(self):
        result = _synchre.search('    while\n    ')
        self.assertIsNotNone(result)

    def test_junkre(self):
        result = _junkre.search('    "hello world"')
        self.assertIsNotNone(result)

    def test_match_stringre(self):
        result = _match_stringre.match('    "hello world"')
        self.assertIsNotNone(result)

    def test_itemre(self):
        result = _itemre.search('    item')
        self.assertIsNotNone(result)

    def test_closere(self):
        result = _closere.search('    return')
        self.assertIsNotNone(result)

    def test_chew_ordinaryre(self):
        result = _chew_ordinaryre.search('    ordinary')
        self.assertIsNotNone(result)

if __name__ == '__main__':
    unittest.main()