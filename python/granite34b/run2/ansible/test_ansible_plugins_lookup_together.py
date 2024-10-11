import unittest
from ansible.errors import AnsibleError
from ansible.module_utils.six.moves import zip_longest
from ansible.plugins.lookup import LookupBase
from ansible.utils.listify import listify_lookup_plugin_terms
from ansible.plugins.lookup.together import LookupModule


class TestLookupModule(unittest.TestCase):
    def test_lookup_variables(self):
        lookup = LookupModule()
        terms = [1, 2, 3]
        result = lookup.template(terms)
        expected = [[1], [2], [3]]
        self.assertEqual(result, expected)

    def test_run(self):
        lookup = LookupModule()
        terms = [[1, 2, 3], [4, 5, 6]]
        result = lookup.template(terms)
        expected = [[1, 4], [2, 5], [3, 6]]
        self.assertEqual(result, expected)

    def test_run_with_fillvalue(self):
        lookup = LookupModule()
        terms = [[1, 2, 3], [4, 5]]
        result = lookup.run(terms)
        expected = [[1, 4], [2, 5], [3, None]]
        self.assertEqual(result, expected)

    def test_run_with_empty_list(self):
        lookup = LookupModule()
        terms = []
        with self.assertRaises(AnsibleError) as context:
            lookup.run(terms)
        self.assertEqual(str(context.exception), "with_together requires at least one element in each list")

if __name__ == '__main__':
    unittest.main()