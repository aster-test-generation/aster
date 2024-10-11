import unittest
from ansible.utils.listify import *


class TestListifyLookupPluginTerms(unittest.TestCase):
    def test_listify_lookup_plugin_terms(self):
        terms = "foo"
        templar = None
        loader = None
        fail_on_undefined = True
        convert_bare = False
        result = listify_lookup_plugin_terms(terms, templar, loader, fail_on_undefined, convert_bare)
        self.assertEqual(result, ["foo"])

    def test_listify_lookup_plugin_terms_with_iterable(self):
        terms = ["foo", "bar"]
        templar = None
        loader = None
        fail_on_undefined = True
        convert_bare = False
        result = listify_lookup_plugin_terms(terms, templar, loader, fail_on_undefined, convert_bare)
        self.assertEqual(result, ["foo", "bar"])

    def test_listify_lookup_plugin_terms_with_string_types(self):
        terms = "foo"
        templar = None
        loader = None
        fail_on_undefined = True
        convert_bare = True
        result = listify_lookup_plugin_terms(terms, templar, loader, fail_on_undefined, convert_bare)
        self.assertEqual(result, ["foo"])

    def test_listify_lookup_plugin_terms_with_fail_on_undefined(self):
        terms = "{{ foo }}"
        templar = None
        loader = None
        fail_on_undefined = True
        convert_bare = False
        result = listify_lookup_plugin_terms(terms, templar, loader, fail_on_undefined, convert_bare)
        self.assertEqual(result, ["{{ foo }}"])

    def test_listify_lookup_plugin_terms_with_convert_bare(self):
        terms = "foo"
        templar = None
        loader = None
        fail_on_undefined = True
        convert_bare = True
        result = listify_lookup_plugin_terms(terms, templar, loader, fail_on_undefined, convert_bare)
        self.assertEqual(result, ["foo"])

if __name__ == '__main__':
    unittest.main()