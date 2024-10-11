import unittest
from ansible.utils.context_objects import *



class TestCLIArgs(unittest.TestCase):
    def test_init(self):
        mapping = {}
        result = CLIArgs(mapping)
        self.assertEqual(result, ImmutableDict({}))

    def test_from_options(self):
        options = {}
        result = CLIArgs.from_options(options)
        self.assertEqual(result, {})

    def test_getitem(self):
        mapping = {'key': 'value'}
        result = CLIArgs(mapping)
        self.assertEqual(result['key'], 'value')

    def test_setitem(self):
        mapping = {'key': 'value'}
        result = CLIArgs(mapping)
        result['key'] = 'new_value'
        self.assertEqual(result['key'], 'new_value')

    def test_delitem(self):
        mapping = {'key': 'value'}
        result = CLIArgs(mapping)
        del result['key']
        self.assertEqual(result, {})

    def test_iter(self):
        mapping = {'key': 'value'}
        result = CLIArgs(mapping)
        self.assertEqual(list(result), ['key'])

    def test_len(self):
        mapping = {'key': 'value'}
        result = CLIArgs(mapping)
        self.assertEqual(len(result), 1)

    def test_contains(self):
        mapping = {'key': 'value'}
        result = CLIArgs(mapping)
        self.assertTrue('key' in result)

    def test_keys(self):
        mapping = {'key': 'value'}
        result = CLIArgs(mapping)
        self.assertEqual(list(result.keys()), ['key'])

    def test_values(self):
        mapping = {'key': 'value'}
        result = CLIArgs(mapping)
        self.assertEqual(list(result.values()), ['value'])

    def test_items(self):
        mapping = {'key': 'value'}
        result = CLIArgs(mapping)
        self.assertEqual(list(result.items()), [('key', 'value')])

    def test_get(self):
        mapping = {'key': 'value'}
        result = CLIArgs(mapping)
        self.assertEqual(result.get('key'), 'value')

    def test_copy(self):
        mapping = {'key': 'value'}
        result = CLIArgs(mapping)
        self.assertEqual(result, {'key': 'value'})

    def test_update(self):
        mapping = {'key': 'value'}
        result = CLIArgs(mapping)
        result['key'] = 'new_value'
        self.assertEqual(result, {'key': 'new_value'})

    def test_clear(self):
        mapping = {'key': 'value'}
        result = CLIArgs(mapping)
        result.clear()
        self.assertEqual(result, {})

    def test_pop(self):
        mapping = {'key': 'value'}
        result = CLIArgs(mapping)
        self.assertEqual(result.pop('key'), 'value')

    def test_popitem(self):
        mapping = {'key': 'value'}
        result = CLIArgs(mapping)
        self.assertEqual(result.popitem(), ('value', 'key'))

    def test_setdefault(self):
        mapping = {'key': 'value'}
        result = CLIArgs(mapping)
        self.assertEqual(result.setdefault('key', 'new_value'), 'new_value')

    def test_repr(self):
        mapping = {'key': 'value'}
        result = CLIArgs(mapping)
        self.assertEqual(repr(result), "ImmutableDict({'key': 'value'})")

    def test_str(self):
        mapping = {'key': 'value'}
        result = CLIArgs(mapping)
        self.assertEqual(str(result), "ImmutableDict({'key': 'value'})")

    def test_eq(self):
        mapping = {'key': 'value'}
        result = CLIArgs(mapping)
        self.assertTrue(result == {'key': 'value', 'key2': 'value2'})

if __name__ == '__main__':
    unittest.main()