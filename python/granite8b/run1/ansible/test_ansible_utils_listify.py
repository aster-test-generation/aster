import unittest
from ansible.utils.listify import listify_lookup_plugin_terms


class TestListifyLookupPluginTerms(unittest.TestCase):
    def test_string_terms(self):
        terms = "foo, bar, baz"
        result = listify_lookup_plugin_terms(terms, None, None)
        self.assertEqual(result, ["foo", "bar", "baz"])

    def test_iterable_terms(self):
        terms = ["foo", "bar", "baz"]
        result = listify_lookup_plugin_terms(terms, None)
        self.assertEqual(result, terms)

    def test_string_terms_with_templating(self):
        terms = "{{ foo }}, {{ bar }}, {{ baz }}"
        result = listify_lookup_plugin_terms(terms, None, None)
        self.assertEqual(result, ["foo", "bar", "baz"])

    def test_iterable_terms_with_templating(self):
        terms = ["{{ foo }}", "{{ bar }}", "{{ baz }}"]
        result = listify_lookup_plugin_terms(terms, None, None)
        self.assertEqual(result, ["foo", "bar", "baz"])

    def test_string_terms_with_templating_and_fail_on_undefined(self):
        terms = "{{ foo }}, {{ bar }}, {{ baz }}"
        with self.assertRaises(Exception):
            listify_lookup_plugin_terms(terms, None, None, fail_on_undefined=True)

    def test_iterable_terms_with_templating_and_fail_on_undefined(self):
        terms = ["{{ foo }}", "{{ bar }}", "{{ baz }}"]
        with self.assertRaises(Exception):
            listify_lookup_plugin_terms(terms, None, None, fail_on_undefined=True)

    def test_string_terms_with_templating_and_convert_bare(self):
        terms = "foo, bar, baz"
        result = listify_lookup_plugin_terms(terms, None, None, convert_bare=True)
        self.assertEqual(result, ["foo", "bar", "baz"])

    def test_iterable_terms_with_templating_and_convert_bare(self):
        terms = ["foo", "bar", "baz"]
        result = listify_lookup_plugin_terms(terms, None, None, convert_bare=True)
        self.assertEqual(result, terms)

    def test_string_terms_with_templating_and_fail_on_undefined_and_convert_bare(self):
        terms = "foo, bar, baz"
        with self.assertRaises(Exception):
            listify_lookup_plugin_terms(terms, None, None, fail_on_undefined=True, convert_bare=True)

    def test_iterable_terms_with_templating_and_fail_on_undefined_and_convert_bare(self):
        terms = ["foo", "bar", "baz"]
        with self.assertRaises(Exception):
            listify_lookup_plugin_terms(terms, None, None, fail_on_undefined=True, convert_bare=True)

if __name__ == '__main__':
    unittest.main()