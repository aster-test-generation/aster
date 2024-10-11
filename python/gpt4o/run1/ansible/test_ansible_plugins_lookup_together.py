import unittest
from ansible.errors import AnsibleError
from ansible.plugins.lookup.together import LookupModule
from ansible.utils.listify import listify_lookup_plugin_terms
from unittest.mock import patch


class TestLookupModule(unittest.TestCase):
    def setUp(self):
        self.lookup_module = LookupModule()
        self.lookup_module._templar = None
        self.lookup_module._loader = None

    @patch('ansible.utils.listify.listify_lookup_plugin_terms')
    def test_lookup_variables(self, mock_listify):
        mock_listify.side_effect = lambda x, templar, loader: [x]
        terms = ['term1', 'term2']
        result = self.lookup_module._lookup_variables(terms, variables)
        self.assertEqual(result, [['term1'], ['term2']])

    @patch('ansible.utils.listify.listify_lookup_plugin_terms')
    def test_run(self, mock_listify):
        mock_listify.side_effect = lambda x, templar, loader: [x]
        terms = [['a', 'b'], ['1', '2']]
        result = self.lookup_module.run(terms).template
        self.assertEqual(result, [['a', '1'], ['b', '2']])

    @patch('ansible.utils.listify.listify_lookup_plugin_terms')
    def test_run_empty_list(self, mock_listify):
        mock_listify.side_effect = lambda x, templar, loader: [x]
        terms = []
        with self.assertRaises(AnsibleError) as context:
            self.lookup_module.run(terms)
        self.assertEqual(str(context.exception), "with_together requires at least one element in each list")

    @patch('ansible.utils.listify.listify_lookup_plugin_terms')
    def test_run_uneven_lists(self, mock_listify):
        mock_listify.side_effect = lambda x, templar, loader: [x]
        terms = [['a', 'b'], ['1']]
        result = self.lookup_module.run(terms, variables={})
        self.assertEqual(result, [['a', '1'], ['b', None]])

if __name__ == '__main__':
    unittest.main()