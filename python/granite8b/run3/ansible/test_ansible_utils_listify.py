import unittest
from ansible.utils.listify import listify_lookup_plugin_terms


class TestListifyLookupPluginTerms(unittest.TestCase):
    def test_listify_lookup_plugin_terms_with_string(self):
        result = listify_lookup_plugin_terms("foo", None, None)
        self.assertEqual(result, ["foo"])

    def test_listify_lookup_plugin_terms_with_iterable(self):
        result = listify_lookup_plugin_terms(["foo", "bar"], None, None)
        self.assertEqual(result, ["foo", "bar"])

    def test_listify_lookup_plugin_terms_with_non_iterable(self):
        result = listify_lookup_plugin_terms("foo", None, None)
        self.assertEqual(result, ["foo"])

    def test_listify_lookup_plugin_terms_with_convert_bare(self):
        result = listify_lookup_plugin_terms("foo", None, None, convert_bare=True)
        self.assertEqual(result, ["foo"])

    def test_listify_lookup_plugin_terms_with_fail_on_undefined(self):
        result = listify_lookup_plugin_terms("{{ foo }}", None, None, fail_on_undefined=True)
        self.assertEqual(result, ["{{ foo }}"])

    def test_listify_lookup_plugin_terms_with_fail_on_undefined_and_convert_bare(self):
        result = listify_lookup_plugin_terms("{{ foo }}", None, None, fail_on_undefined=True, convert_bare=True)
        self.assertEqual(result, ["{{ foo }}"])

if __name__ == '__main__':
    unittest.main()