import unittest
from thonny.roughparse import *


class TestStringTranslatePseudoMapping(unittest.TestCase):
    def test_init(self):
        instance = StringTranslatePseudoMapping({}, 'default_value')
        self.assertIsNotNone(instance)

    def test_getitem(self):
        instance = StringTranslatePseudoMapping({'key': 'value'}, 'default_value')
        result = instance.__getitem__('key')
        self.assertEqual(result, 'value')

    def test_len(self):
        instance = StringTranslatePseudoMapping({'key1': 'value1', 'key2': 'value2'}, 'default_value')
        result = instance.__len__()
        self.assertEqual(result, 2)

    def test_iter(self):
        instance = StringTranslatePseudoMapping({'key1': 'value1', 'key2': 'value2'}, 'default_value')
        result = list(instance.__iter__())
        self.assertEqual(result, ['key1', 'key2'])

    def test_get(self):
        instance = StringTranslatePseudoMapping({'key': 'value'}, 'default_value')
        result = instance.get('key')
        self.assertEqual(result, 'value')

    def test_get_default(self):
        instance = StringTranslatePseudoMapping({}, 'default_value')
        result = instance.get('key')
        self.assertEqual(result, 'default_value')

    def test_str(self):
        instance = StringTranslatePseudoMapping({}, 'default_value')
        result = instance.__str__()
        self.assertEqual(result, '{}')

    def test_repr(self):
        instance = StringTranslatePseudoMapping({}, 'default_value')
        result = instance.__repr__()
        self.assertEqual(result, 'StringTranslatePseudoMapping({}, \'default_value\')')

    def test_eq(self):
        instance1 = StringTranslatePseudoMapping({}, 'default_value')
        instance2 = StringTranslatePseudoMapping({}, 'default_value')
        self.assertTrue(instance1 == instance2)

class TestRegexFunctions(unittest.TestCase):
    def test_synchre(self):
        result = _synchre('    while\n    ')
        self.assertIsNotNone(result)

    def test_junkre(self):
        result = _junkre('    ')
        self.assertIsNotNone(result)

    def test_match_stringre(self):
        result = _match_stringre('    "hello"')
        self.assertIsNotNone(result)

    def test_itemre(self):
        result = _itemre('    item')
        self.assertIsNotNone(result)

    def test_closere(self):
        result = _closere('    return')
        self.assertIsNotNone(result)

    def test_chew_ordinaryre(self):
        result = _chew_ordinaryre('    ordinary')
        self.assertIsNotNone(result)

if __name__ == '__main__':
    unittest.main()