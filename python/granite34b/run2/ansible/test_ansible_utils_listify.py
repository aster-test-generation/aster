import unittest
from ansible.utils.listify import listify_lookup_plugin_terms


class TestListifyLookupPluginTerms(unittest.TestCase):
    def test_string_type(self):
        terms = "hello world"
        expected = ["hello world"]
        result = listify_lookup_plugin_terms(terms, [], None)
        self.assertEqual(result, expected)

    def test_list_type(self):
        terms = ["hello", "world"]
        expected = ["hello", "world"]
        result = listify_lookup_plugin_terms(terms, None, 'template')
        self.assertEqual(result, expected)

    def test_dict_type(self):
        terms = {"key": "value"}
        expected = [{"key": "value"}]
        result = listify_lookup_plugin_terms(terms, None, 'template')
        self.assertEqual(result, expected)

    def test_template_type(self):
        terms = "{{ variable }}"
        expected = ["value"]
        result = listify_lookup_plugin_terms(terms, None, 'template')
        self.assertEqual(result, expected)

    def test_undefined_variable(self):
        terms = "{{ undefined_variable }}"
        with self.assertRaises(TypeError):
            listify_lookup_plugin_terms(terms, [], None)

    def test_bare_variable(self):
        terms = "hello {{ variable }}"
        expected = ["hello value"]
        result = listify_lookup_plugin_terms(terms, None, 'template')
        self.assertEqual(result, expected)

if __name__ == '__main__':
    unittest.main()