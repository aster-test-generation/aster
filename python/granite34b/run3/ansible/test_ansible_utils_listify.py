import unittest
from ansible.utils.listify import listify_lookup_plugin_terms


class TestListifyLookupPluginTerms(unittest.TestCase):
    def test_string_types(self):
        terms = "hello world"
        result = listify_lookup_plugin_terms(terms, None, 'template')
        self.assertEqual(result, ["hello world"])

    def test_list_types(self):
        terms = ["hello", "world"]
        result = listify_lookup_plugin_terms(terms, [], None)
        self.assertEqual(result, ["hello", "world"])

    def test_dict_types(self):
        terms = {"hello": "world"}
        result = listify_lookup_plugin_terms(terms, [], None)
        self.assertEqual(result, [{"hello": "world"}])

    def test_integer_types(self):
        terms = 123
        result = listify_lookup_plugin_terms(terms, None, template)
        self.assertEqual(result, [123])

    def test_float_types(self):
        terms = 123.456
        result = listify_lookup_plugin_terms(terms, None, 'template')
        self.assertEqual(result, [123.456])

    def test_boolean_types(self):
        terms = True
        result = listify_lookup_plugin_terms(terms, [], None)
        self.assertEqual(result, [True])

    def test_none_types(self):
        terms = None
        result = listify_lookup_plugin_terms(terms, None, 'template')
        self.assertEqual(result, [None])

    def test_template_types(self):
        terms = "{{ variable }}"
        result = listify_lookup_plugin_terms(terms, [], None)
        self.assertEqual(result, ["{{ variable }}"])

if __name__ == '__main__':
    unittest.main()