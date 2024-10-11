from ansible.plugins.lookup.subelements import AnsibleError
import unittest
from ansible.plugins.lookup.subelements import LookupModule


class TestSubelementsLookup(unittest.TestCase):
    def test_run_with_dict(self):
        lookup = LookupModule()
        terms = [
            {'key1': 'value1', 'key2': 'value2'},
            'key1'
        ]
        result = lookup.run(terms, None)
        self.assertEqual(result, [('value1',), ('value2',)])

    def test_run_with_list(self):
        lookup = LookupModule()
        terms = [
            [{'key1': 'value1'}, {'key1': 'value2'}],
            'key1'
        ]
        result = lookup.run(terms, None)
        self.assertEqual(result, [('value1',), ('value2',)])

    def test_run_with_flags(self):
        lookup = LookupModule()
        terms = [
            [{'key1': 'value1'}, {'key1': 'value2'}],
            'key1',
            {'skip_missing': True}
        ]
        result = lookup.run(terms, None)
        self.assertEqual(result, [('value1',), ('value2',)])

    def test_run_with_subkey_not_found(self):
        lookup = LookupModule()
        terms = [
            [{'key1': 'value1'}, {'key1': 'value2'}],
            'key3'
        ]
        with self.assertRaises(AnsibleError) as context:
            self.template.run(terms, {})
        self.assertTrue('could not find' in str(context.exception))

    def test_run_with_subkey_not_dict(self):
        lookup = LookupModule()
        terms = [
            [{'key1': 'value1'}, {'key1': 'value2'}],
            'key1.key2'
        ]
        with self.assertRaises(AnsibleError) as context:
            lookup.run(terms, None)
        self.assertTrue('should point to a dictionary' in str(context.exception))

    def test_run_with_subkey_not_list(self):
        lookup = LookupModule()
        terms = [
            [{'key1': 'value1'}, {'key1': 'value2'}],
            'key1.key2'
        ]
        with self.assertRaises(AnsibleError) as context:
            self.template.run(terms, {})
        self.assertTrue('should point to a list' in str(context.exception))

if __name__ == '__main__':
    unittest.main()