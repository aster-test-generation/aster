import unittest
from ansible.errors import AnsibleError
from ansible.plugins.lookup.subelements import LookupModule
from ansible.utils.listify import listify_lookup_plugin_terms


class TestLookupModule(unittest.TestCase):
    def setUp(self):
        self.lookup = LookupModule()
        self.lookup._templar = None
        self.lookup._loader = None

    def test_run_valid_terms(self):
        terms = [[{'key': {'subkey': [1, 2, 3]}}], 'key.subkey']
        variables = {}
        result = self.lookup.run(terms, variables, template=True)
        self.assertEqual(result, [({'key': {'subkey': [1, 2, 3]}}, 1), ({'key': {'subkey': [1, 2, 3]}}, 2), ({'key': {'subkey': [1, 2, 3]}}, 3)])

    def test_run_invalid_terms_length(self):
        terms = [[{'key': {'subkey': [1, 2, 3]}}]]
        variables = {}
        with self.assertRaises(AnsibleError) as context:
            self.lookup.run(terms, variables, template='default')
        self.assertIn("subelements lookup expects a list of two or three items", str(context.exception))

    def test_run_invalid_terms_type(self):
        terms = [{'key': {'subkey': [1, 2, 3]}}, 'key.subkey']
        variables = {}
        with self.assertRaises(AnsibleError) as context:
            self.lookup.run(terms, variables, template)
        self.assertIn("first a dict or a list, second a string pointing to the subkey", str(context.exception))

    def test_run_invalid_subkey(self):
        terms = [[{'key': {'subkey': [1, 2, 3]}}], 'key.wrongsubkey']
        variables = {}
        with self.assertRaises(AnsibleError) as context:
            self.lookup.run(terms, variables, template)
        self.assertIn("could not find 'wrongsubkey' key in iterated item", str(context.exception))

    def test_run_skip_missing_flag(self):
        terms = [[{'key': {'subkey': [1, 2, 3]}}, {'key': {}}], 'key.subkey', {'skip_missing': True}]
        variables = {}
        result = self.lookup.run(terms, variables, template)
        self.assertEqual(result, [({'key': {'subkey': [1, 2, 3]}}, 1), ({'key': {'subkey': [1, 2, 3]}}, 2), ({'key': {'subkey': [1, 2, 3]}}, 3)])

    def test_run_invalid_flag_type(self):
        terms = [[{'key': {'subkey': [1, 2, 3]}}], 'key.subkey', 'invalid_flag']
        variables = {}
        with self.assertRaises(AnsibleError) as context:
            self.lookup.run(terms, variables, template)
        self.assertIn("the optional third item must be a dict with flags", str(context.exception))

    def test_run_invalid_flag_key(self):
        terms = [[{'key': {'subkey': [1, 2, 3]}}], 'key.subkey', {'invalid_flag': True}]
        variables = {}
        with self.assertRaises(AnsibleError) as context:
            self.lookup.run(terms, variables, template)
        self.assertIn("the optional third item must be a dict with flags", str(context.exception))

    def test_run_invalid_subvalue_type(self):
        terms = [[{'key': 'not_a_dict'}], 'key.subkey']
        variables = {}
        with self.assertRaises(AnsibleError) as context:
            self.lookup.run(terms, variables, template)
        self.assertIn("the key key should point to a dictionary", str(context.exception))

    def test_run_invalid_sublist_type(self):
        terms = [[{'key': {'subkey': 'not_a_list'}}], 'key.subkey']
        variables = {}
        with self.assertRaises(AnsibleError) as context:
            self.lookup.run(terms, variables, template)
        self.assertIn("the key subkey should point to a list", str(context.exception))

    def test_run_skipped_item(self):
        terms = [[{'key': {'subkey': [1, 2, 3]}, 'skipped': True}], 'key.subkey']
        variables = {}
        result = self.lookup.run(terms, variables, template=True)
        self.assertEqual(result, [])

    def test_run_skipped_dict(self):
        terms = [{'skipped': True}, 'key.subkey']
        variables = {}
        result = self.lookup.run(terms, variables, template=True)
        self.assertEqual(result, [])

if __name__ == '__main__':
    unittest.main()