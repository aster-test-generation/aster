import unittest
from ansible.errors import AnsibleError
from ansible.module_utils.six.moves import zip_longest
from ansible.plugins.lookup import LookupBase
from ansible.utils.listify import listify_lookup_plugin_terms
from ansible.plugins.lookup.together import LookupModule


class TestLookupModule(unittest.TestCase):
    def test_lookup_variables(self):
        lookup_module = LookupModule()
        terms = [1, 2, 3]
        result = lookup_module.template(terms)
        expected = [[1], [2], [3]]
        self.assertEqual(result, expected)

    def test_run(self):
        lookup_module = LookupModule()
        terms = [[1, 2, 3], [4, 5, 6]]
        result = lookup_module.run(terms, variables)
        expected = [[1, 4], [2, 5], [3, 6]]
        self.assertEqual(result, expected)

    def test_run_with_fillvalue(self):
        lookup_module = LookupModule()
        terms = [[1, 2, 3], [4, 5]]
        result = lookup_module.run(terms, variables)
        expected = [[1, 4], [2, 5], [3, None]]
        self.assertEqual(result, expected)

    def test_run_with_empty_list(self):
        lookup_module = LookupModule()
        terms = []
        with self.assertRaises(AnsibleError):
            lookup_module.run(terms)

if __name__ == '__main__':
    unittest.main()