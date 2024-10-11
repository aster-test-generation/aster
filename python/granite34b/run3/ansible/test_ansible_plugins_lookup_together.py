import unittest
from ansible.errors import AnsibleError
from ansible.module_utils.six.moves import zip_longest
from ansible.plugins.lookup import LookupBase
from ansible.utils.listify import listify_lookup_plugin_terms
from ansible.plugins.lookup.together import LookupModule


class TestLookupModule(unittest.TestCase):
    def setUp(self):
        self.lookup = LookupModule()

    def test_lookup_variables(self):
        terms = [1, 2, 3]
        result = self.lookup.template(terms)
        self.assertEqual(result, [[1], [2], [3]])

    def test_run(self):
        terms = [[1, 2, 3], [4, 5, 6]]
        result = self.lookup.run(terms)
        self.assertEqual(result, [[1, 4], [2, 5], [3, 6]])

    def test_run_with_fillvalue(self):
        terms = [[1, 2, 3], [4, 5]]
        result = self.lookup.run(terms)
        self.assertEqual(result, [[1, 4], [2, 5], [3, None]])

    def test_run_with_empty_list(self):
        terms = []
        with self.assertRaises(AnsibleError):
            self.lookup.run(terms)

if __name__ == '__main__':
    unittest.main()