import unittest
from ansible.utils.listify import listify_lookup_plugin_terms


class TestListifyLookupPluginTerms(unittest.TestCase):
    def test_listify_lookup_plugin_terms_string(self):
        terms = "hello"
        templar = None  # mock templar object
        loader = None  # mock loader object
        result = listify_lookup_plugin_terms(terms, templar, loader)
        self.assertEqual(result, ["hello"])

    def test_listify_lookup_plugin_terms_list(self):
        terms = ["hello", "world"]
        templar = None  # mock templar object
        loader = None  # mock loader object
        result = listify_lookup_plugin_terms(terms, templar, loader)
        self.assertEqual(result, ["hello", "world"])

    def test_listify_lookup_plugin_terms_non_iterable(self):
        terms = 123
        templar = None  # mock templar object
        loader = None  # mock loader object
        result = listify_lookup_plugin_terms(terms, templar, loader)
        self.assertEqual(result, [123])

    def test_listify_lookup_plugin_terms_fail_on_undefined(self):
        terms = "hello"
        templar = None  # mock templar object
        loader = None  # mock loader object
        with self.assertRaises(Exception):
            listify_lookup_plugin_terms(terms, templar, loader, fail_on_undefined=True)

    def test_listify_lookup_plugin_terms_convert_bare(self):
        terms = "hello"
        templar = None  # mock templar object
        loader = None  # mock loader object
        result = listify_lookup_plugin_terms(terms, templar, loader, convert_bare=True)
        self.assertEqual(result, ["hello"])

if __name__ == '__main__':
    unittest.main()