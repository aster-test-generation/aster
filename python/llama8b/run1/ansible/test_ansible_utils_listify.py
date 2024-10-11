import unittest
from ansible.module_utils.basic import listif


class TestListify(unittest.TestCase):
    def test_listify_string(self):
        result = listify.listify_lookup_plugin_terms('hello', None, None)
        self.assertEqual(result, ['hello'])

    def test_listify_iterable(self):
        result = listify.listify_lookup_plugin_terms(['hello', 'world'], None, None)
        self.assertEqual(result, ['hello', 'world'])

    def test_listify_non_iterable(self):
        result = listify.listify_lookup_plugin_terms(123, None, None)
        self.assertEqual(result, [123])

    def test_listify_template_string(self):
        result = listify.listify_lookup_plugin_terms('hello {{ foo }}', None, None)
        self.assertEqual(result, ['hello {{ foo }}'])

    def test_listify_template_iterable(self):
        result = listify.listify_lookup_plugin_terms(['hello {{ foo }}', 'world {{ bar }}'], None, None)
        self.assertEqual(result, ['hello {{ foo }}', 'world {{ bar }}'])

    def test_listify_template_non_iterable(self):
        result = listify.listify_lookup_plugin_terms(123, None, None)
        self.assertEqual(result, [123])

    def test_listify_template_fail_on_undefined(self):
        result = listify.listify_lookup_plugin_terms('hello {{ foo }}', None, None, fail_on_undefined=False)
        self.assertEqual(result, ['hello {{ foo }}'])

    def test_listify_template_convert_bare(self):
        result = listify.listify_lookup_plugin_terms('hello {{ foo }}', None, None, convert_bare=True)
        self.assertEqual(result, ['hello {{ foo }}'])

    def test_listify_template_fail_on_undefined_convert_bare(self):
        result = listify.listify_lookup_plugin_terms('hello {{ foo }}', None, None, fail_on_undefined=False, convert_bare=True)
        self.assertEqual(result, ['hello {{ foo }}'])

if __name__ == '__main__':
    unittest.main()