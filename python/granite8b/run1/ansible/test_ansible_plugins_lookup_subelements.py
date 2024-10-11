from ansible.errors import AnsibleError
import unittest
from ansible.plugins.lookup.subelements import LookupModule


class TestLookupModule(unittest.TestCase):
    def test_run_with_dict(self):
        lookup = LookupModule()
        terms = [
            {
                'key1': 'value1',
                'key2': 'value2'
            },
            'key1',
        ]
        result = lookup.run(terms, {})
        self.assertEqual(result, [('key1', 'value1'), ('key1', 'value2')])

    def test_run_with_list(self):
        lookup = LookupModule()
        terms = [
            [
                {'key1': 'value1'},
                {'key1': 'value2'},
            ],
            'key1',
        ]
        result = lookup.run(terms, {})
        self.assertEqual(result, [('key1', 'value1'), ('key1', 'value2')])

    def test_run_with_dict_and_flags(self):
        lookup = LookupModule()
        terms = [
            {
                'key1': 'value1',
                'key2': 'value2'
            },
            'key1',
            {'skip_missing': True},
        ]
        result = lookup.run(terms, {})
        self.assertEqual(result, [('key1', 'value1'), ('key1', 'value2')])

    def test_run_with_list_and_flags(self):
        lookup = LookupModule()
        terms = [
            [
                {'key1': 'value1'},
                {'key1': 'value2'},
            ],
            'key1',
            {'skip_missing': True},
        ]
        result = lookup.run(terms, {})
        self.assertEqual(result, [('key1', 'value1'), ('key1', 'value2')])

    def test_run_with_dict_and_invalid_key(self):
        lookup = LookupModule()
        terms = [
            {
                'key1': 'value1',
                'key2': 'value2'
            },
            'key3',
        ]
        with self.assertRaises(AnsibleError):
            lookup.run(terms, {})

    def test_run_with_list_and_invalid_key(self):
        lookup = LookupModule()
        terms = [
            [
                {'key1': 'value1'},
                {'key1': 'value2'},
            ],
            'key3',
        ]
        with self.assertRaises(AnsibleError):
            lookup.run(terms, {})

    def test_run_with_dict_and_invalid_flags(self):
        lookup = LookupModule()
        terms = [
            {
                'key1': 'value1',
                'key2': 'value2'
            },
            'key1',
            {'invalid_flag': True},
        ]
        with self.assertRaises(AnsibleError):
            lookup.run(terms, {})

    def test_run_with_list_and_invalid_flags(self):
        lookup = LookupModule()
        terms = [
            [
                {'key1': 'value1'},
                {'key1': 'value2'},
            ],
            'key1',
            {'invalid_flag': True},
        ]
        with self.assertRaises(AnsibleError):
            lookup.run(terms, {})

if __name__ == '__main__':
    unittest.main()