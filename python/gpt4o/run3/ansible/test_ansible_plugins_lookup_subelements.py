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
        terms = [[{'key1': {'subkey1': [1, 2, 3]}}, {'key2': {'subkey1': [4, 5, 6]}}], 'key1.subkey1']
        variables = {}
        result = self.lookup.run(terms, variables, template)
        self.assertEqual(result, [({'key1': {'subkey1': [1, 2, 3]}}, 1), 
                                  ({'key1': {'subkey1': [1, 2, 3]}}, 2), 
                                  ({'key1': {'subkey1': [1, 2, 3]}}, 3)])

    def test_run_invalid_terms_length(self):
        terms = [[{'key1': {'subkey1': [1, 2, 3]}}]]
        variables = {}
        with self.assertRaises(AnsibleError) as context:
            self.lookup.run(terms, variables, template)
        self.assertIn("subelements lookup expects a list of two or three items", str(context.exception))

    def test_run_invalid_terms_type(self):
        terms = "invalid_terms"
        variables = {}
        with self.assertRaises(AnsibleError) as context:
            self.lookup.run(terms, variables, template)
        self.assertIn("subelements lookup expects a list of two or three items", str(context.exception))

    def test_run_invalid_first_term(self):
        terms = ["invalid_first_term", 'key1.subkey1']
        variables = {}
        with self.assertRaises(AnsibleError) as context:
            self.lookup.run(terms, variables, template)
        self.assertIn("first a dict or a list, second a string pointing to the subkey", str(context.exception))

    def test_run_invalid_second_term(self):
        terms = [[{'key1': {'subkey1': [1, 2, 3]}}], 123]
        variables = {}
        with self.assertRaises(AnsibleError) as context:
            self.lookup.run(terms, variables, template)
        self.assertIn("first a dict or a list, second a string pointing to the subkey", str(context.exception))

    def test_run_invalid_flags(self):
        terms = [[{'key1': {'subkey1': [1, 2, 3]}}], 'key1.subkey1', "invalid_flags"]
        variables = {}
        with self.assertRaises(AnsibleError) as context:
            self.lookup.run(terms, variables, template)
        self.assertIn("the optional third item must be a dict with flags", str(context.exception))

    def test_run_skip_missing_flag(self):
        terms = [[{'key1': {'subkey1': [1, 2, 3]}}, {'key2': {'subkey1': [4, 5, 6]}}], 'key1.subkey1', {'skip_missing': True}]
        variables = {}
        result = self.lookup.run(terms, variables, template)
        self.assertEqual(result, [({'key1': {'subkey1': [1, 2, 3]}}, 1), 
                                  ({'key1': {'subkey1': [1, 2, 3]}}, 2), 
                                  ({'key1': {'subkey1': [1, 2, 3]}}, 3)])

    def test_run_missing_subkey(self):
        terms = [[{'key1': {'subkey1': [1, 2, 3]}}, {'key2': {'subkey2': [4, 5, 6]}}], 'key1.subkey2']
        variables = {}
        with self.assertRaises(AnsibleError) as context:
            self.lookup.run(terms, variables, template)
        self.assertIn("could not find 'subkey2' key in iterated item", str(context.exception))

    def test_run_non_dict_subkey(self):
        terms = [[{'key1': {'subkey1': [1, 2, 3]}}, {'key2': {'subkey1': "not_a_dict"}}], 'key2.subkey1']
        variables = {}
        with self.assertRaises(AnsibleError) as context:
            self.lookup.run(terms, variables, template)
        self.assertIn("the key subkey1 should point to a dictionary", str(context.exception))

    def test_run_non_list_subkey(self):
        terms = [[{'key1': {'subkey1': "not_a_list"}}], 'key1.subkey1']
        variables = {}
        with self.assertRaises(AnsibleError) as context:
            self.lookup.run(terms, variables, template)
        self.assertIn("the key subkey1 should point to a list", str(context.exception))

if __name__ == '__main__':
    unittest.main()