import unittest
from ansible.utils.listify import listify_lookup_plugin_terms


class TestListifyLookupPluginTerms(unittest.TestCase):
    def test_string_types(self):
        terms = "hello world"
        result = listify_lookup_plugin_terms(terms, None, 'template')
        self.assertEqual(result, ["hello world"])

    def test_non_string_types(self):
        terms = [1, 2, 3]
        result = listify_lookup_plugin_terms(terms, [], None)
        self.assertEqual(result, [1, 2, 3])

    def test_protected_method(self):
        terms = [1, 2, 3]
        result = listify_lookup_plugin_terms(terms, None, 'template')
        self.assertEqual(result, [1, 2, 3])

    def test_private_method(self):
        terms = [1, 2, 3]
        result = listify_lookup_plugin_terms(terms, [], None)
        self.assertEqual(result, [1, 2, 3])

    def test_magic_method(self):
        terms = [1, 2, 3]
        result = listify_lookup_plugin_terms(terms, None, 1)
        self.assertEqual(result, [1, 2, 3])

    def test_function(self):
        terms = [1, 2, 3]
        result = listify_lookup_plugin_terms(terms, None, 'template')
        self.assertEqual(result, [1, 2, 3])

if __name__ == '__main__':
    unittest.main()