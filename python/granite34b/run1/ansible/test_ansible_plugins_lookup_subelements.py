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

    def test_run_with_subelements(self):
        lookup = LookupModule()
        terms = [
            [{'key1': {'subkey1': 'value1'}}, {'key1': {'subkey1': 'value2'}}],
            'key1.subkey1'
        ]
        result = lookup.run(terms, None)
        self.assertEqual(result, [('value1',), ('value2',)])

    def test_run_with_subelements_and_flags(self):
        lookup = LookupModule()
        terms = [
            [{'key1': {'subkey1': 'value1'}}, {'key1': {'subkey1': 'value2'}}],
            'key1.subkey1',
            {'skip_missing': True}
        ]
        result = lookup.run(terms, None)
        self.assertEqual(result, [('value1',), ('value2',)])

if __name__ == '__main__':
    unittest.main()