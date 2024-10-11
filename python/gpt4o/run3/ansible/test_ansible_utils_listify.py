import unittest
from unittest.mock import MagicMock
from ansible.utils.listify import listify_lookup_plugin_terms
from ansible.module_utils.six import string_types
from ansible.module_utils.common._collections_compat import Iterable


class TestListifyLookupPluginTerms(unittest.TestCase):
    def setUp(self):
        self.templar = MagicMock()
        self.loader = MagicMock()

    def test_listify_lookup_plugin_terms_with_string(self):
        self.templar.template.return_value = 'templated_string'
        result = listify_lookup_plugin_terms('test_string', self.templar, self.loader)
        self.assertEqual(result, ['templated_string'])

    def test_listify_lookup_plugin_terms_with_list(self):
        self.templar.template.return_value = ['templated_string1', 'templated_string2']
        result = listify_lookup_plugin_terms(['test_string1', 'test_string2'], self.templar, self.loader)
        self.assertEqual(result, ['templated_string1', 'templated_string2'])

    def test_listify_lookup_plugin_terms_with_non_iterable(self):
        self.templar.template.return_value = 123
        result = listify_lookup_plugin_terms(123, self.templar, self.loader)
        self.assertEqual(result, [123])

    def test_listify_lookup_plugin_terms_with_iterable(self):
        self.templar.template.return_value = (1, 2, 3)
        result = listify_lookup_plugin_terms((1, 2, 3), self.templar, self.loader)
        self.assertEqual(result, [1, 2, 3])

    def test_listify_lookup_plugin_terms_fail_on_undefined(self):
        self.templar.template.return_value = 'templated_string'
        result = listify_lookup_plugin_terms('test_string', self.templar, self.loader, fail_on_undefined=False)
        self.assertEqual(result, ['templated_string'])

    def test_listify_lookup_plugin_terms_convert_bare(self):
        self.templar.template.return_value = 'templated_string'
        result = listify_lookup_plugin_terms('test_string', self.templar, self.loader, convert_bare=True)
        self.assertEqual(result, ['templated_string'])

if __name__ == '__main__':
    unittest.main()