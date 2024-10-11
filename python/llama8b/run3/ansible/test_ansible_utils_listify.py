import unittest
from ansible.module_utils.common import to_lis


class TestListify(unittest.TestCase):
    def test_listify_lookup_plugin_terms_string(self):
        templar = object()
        loader = object()
        terms = 'hello'
        result = listify.listify_lookup_plugin_terms(terms, templar, loader)
        self.assertEqual(result, ['hello'])

    def test_listify_lookup_plugin_terms_list(self):
        templar = object()
        loader = object()
        terms = ['hello', 'world']
        result = listify.listify_lookup_plugin_terms(terms, templar, loader)
        self.assertEqual(result, ['hello', 'world'])

    def test_listify_lookup_plugin_terms_dict(self):
        templar = object()
        loader = object()
        terms = {'hello': 'world'}
        result = listify.listify_lookup_plugin_terms(terms, templar, loader)
        self.assertEqual(result, ['hello', 'world'])

    def test_listify_lookup_plugin_terms_iterable(self):
        templar = object()
        loader = object()
        terms = [1, 2, 3]
        result = listify.listify_lookup_plugin_terms(terms, templar, loader)
        self.assertEqual(result, [1, 2, 3])

    def test_listify_lookup_plugin_terms_non_iterable(self):
        templar = object()
        loader = object()
        terms = 123
        result = listify.listify_lookup_plugin_terms(terms, templar, loader)
        self.assertEqual(result, [123])

    def test_listify_lookup_plugin_terms_template_string(self):
        templar = object()
        loader = object()
        terms = 'hello {{ variable }}'
        result = listify.listify_lookup_plugin_terms(terms, templar, loader)
        self.assertEqual(result, ['hello {{ variable }}'])

    def test_listify_lookup_plugin_terms_template_dict(self):
        templar = object()
        loader = object()
        terms = {'hello': 'world', 'variable': 'value'}
        result = listify.listify_lookup_plugin_terms(terms, templar, loader)
        self.assertEqual(result, ['hello world'])

    def test_listify_lookup_plugin_terms_template_dict_fail_on_undefined(self):
        templar = object()
        loader = object()
        terms = {'hello': 'world', 'variable': 'undefined'}
        result = listify.listify_lookup_plugin_terms(terms, templar, loader, fail_on_undefined=True)
        self.assertEqual(result, [])

    def test_listify_lookup_plugin_terms_template_dict_convert_bare(self):
        templar = object()
        loader = object()
        terms = {'hello': 'world', 'variable': 'value', 'convert_bare': True}
        result = listify.listify_lookup_plugin_terms(terms, templar, loader, convert_bare=True)
        self.assertEqual(result, ['hello world'])

if __name__ == '__main__':
    unittest.main()