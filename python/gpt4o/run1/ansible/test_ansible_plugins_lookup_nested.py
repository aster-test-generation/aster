import unittest
from unittest.mock import patch, MagicMock
from ansible.plugins.lookup.nested import LookupModule
from ansible.errors import AnsibleError, AnsibleUndefinedVariable
from jinja2.exceptions import UndefinedError


class TestLookupModule(unittest.TestCase):
    def setUp(self):
        self.lookup_module = LookupModule()
        self.lookup_module._templar = MagicMock()
        self.lookup_module._loader = MagicMock()

    def test_lookup_variables_success(self):
        terms = ['term1', 'term2']
        variables = {'var1': 'value1'}
        with patch('ansible.utils.listify.listify_lookup_plugin_terms', side_effect=[['term1'], ['term2']]):
            result = self.lookup_module._lookup_variables(terms, variables)
            self.assertEqual(result, [mock.template(), mock.template()])

    def test_lookup_variables_undefined_error(self):
        terms = ['term1']
        variables = {'var1': 'value1'}
        with patch('ansible.utils.listify.listify_lookup_plugin_terms', side_effect=UndefinedError("undefined variable")):
            with self.assertRaises(AnsibleUndefinedVariable):
                self.lookup_module._lookup_variables(terms, variables)
            self.assertIn("One of the nested variables was undefined", str(context.exception))

    def test_run_success(self):
        terms = [['a', 'b'], ['c', 'd']]
        variables = {'var1': 'value1'}
        with patch.object(LookupModule, '_lookup_variables', return_value=terms):
            with patch.object(LookupModule, '_combine', side_effect=lambda x, y: [(i, j) for i in x for j in y]):
                with patch.object(LookupModule, '_flatten', side_effect=lambda x: x):
                    result = self.lookup_module.run(terms, variables)
                    self.assertEqual(result, [('a', 'c'), ('a', 'd'), ('b', 'c'), ('b', 'd')])

    def test_run_empty_terms(self):
        terms = []
        variables = {'var1': 'value1'}
        with patch.object(LookupModule, '_lookup_variables', return_value=terms):
            with self.assertRaises(AnsibleError) as context:
                self.lookup_module.run(terms, variables)
            self.assertIn("with_nested requires at least one element in the nested list", str(context.exception))

    def test_run_single_term(self):
        terms = [['a', 'b']]
        variables = {'var1': 'value1'}
        with patch.object(LookupModule, '_lookup_variables', return_value=terms):
            with patch.object(LookupModule, '_flatten', side_effect=lambda x: x):
                result = self.lookup_module.run(terms, variables)
                self.assertEqual(result, ['a', 'b'])

    def test_run_multiple_terms(self):
        terms = [['a', 'b'], ['c', 'd'], ['e', 'f']]
        variables = {'var1': 'value1'}
        with patch.object(LookupModule, '_lookup_variables', return_value=terms):
            with patch.object(LookupModule, '_combine', side_effect=lambda x, y: [(i, j) for i in x for j in y]):
                with patch.object(LookupModule, '_flatten', side_effect=lambda x: x):
                    result = self.lookup_module.run(terms, variables)
                    self.assertEqual(result, [(('a', 'c'), 'e'), (('a', 'c'), 'f'), (('a', 'd'), 'e'), (('a', 'd'), 'f'),
                                              ('b', 'c', 'e'), ('b', 'c', 'f'), ('b', 'd', 'e'), ('b', 'd', 'f')])

if __name__ == '__main__':
    unittest.main()