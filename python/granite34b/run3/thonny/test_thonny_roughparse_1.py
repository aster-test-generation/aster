import unittest
from thonny.roughparse import *


class TestStringTranslatePseudoMapping(unittest.TestCase):
    def test_get_non_default_value(self):
        non_defaults = {'key': 'value'}
        default_value = 'default'
        mapping = StringTranslatePseudoMapping(non_defaults, default_value)
        self.assertEqual(mapping['key'], 'value')

    def test_get_default_value(self):
        non_defaults = {}
        default_value = 'default'
        mapping = StringTranslatePseudoMapping(non_defaults, default_value)
        self.assertEqual(mapping['key'], 'default')

    def test_len(self):
        non_defaults = {'key': 'value'}
        default_value = 'default'
        mapping = StringTranslatePseudoMapping(non_defaults, default_value)
        self.assertEqual(len(mapping), 1)

    def test_iter(self):
        non_defaults = {'key': 'value'}
        default_value = 'default'
        mapping = StringTranslatePseudoMapping(non_defaults, default_value)
        self.assertEqual(list(mapping), ['key'])

    def test_get_method(self):
        non_defaults = {'key': 'value'}
        default_value = 'default'
        mapping = StringTranslatePseudoMapping(non_defaults, default_value)
        self.assertEqual(mapping.get('key'), 'value')
        self.assertEqual(mapping.get('other_key'), 'default')

if __name__ == '__main__':
    unittest.main()