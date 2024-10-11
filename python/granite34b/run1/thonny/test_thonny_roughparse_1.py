import unittest
from thonny.roughparse import *


class TestStringTranslatePseudoMapping(unittest.TestCase):
    def test_get_non_default_value(self):
        non_defaults = {'key1': 'value1', 'key2': 'value2'}
        default_value = 'default'
        mapping = StringTranslatePseudoMapping(non_defaults, default_value)
        self.assertEqual(mapping['key1'], 'value1')
        self.assertEqual(mapping['key2'], 'value2')

    def test_get_default_value(self):
        non_defaults = {'key1': 'value1', 'key2': 'value2'}
        default_value = 'default'
        mapping = StringTranslatePseudoMapping(non_defaults, default_value)
        self.assertEqual(mapping['key3'], default_value)

    def test_len(self):
        non_defaults = {'key1': 'value1', 'key2': 'value2'}
        default_value = 'default'
        mapping = StringTranslatePseudoMapping(non_defaults, default_value)
        self.assertEqual(len(mapping), len(non_defaults))

    def test_iter(self):
        non_defaults = {'key1': 'value1', 'key2': 'value2'}
        default_value = 'default'
        mapping = StringTranslatePseudoMapping(non_defaults, default_value)
        self.assertEqual(set(mapping), set(non_defaults))

    def test_get_method(self):
        non_defaults = {'key1': 'value1', 'key2': 'value2'}
        default_value = 'default'
        mapping = StringTranslatePseudoMapping(non_defaults, default_value)
        self.assertEqual(mapping.get('key1'), 'value1')
        self.assertEqual(mapping.get('key2'), 'value2')
        self.assertEqual(mapping.get('key3'), default_value)

if __name__ == '__main__':
    unittest.main()