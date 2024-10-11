import unittest
from ansible.plugins.lookup.together import LookupModule
from ansible.errors import AnsibleError
from ansible.module_utils.six.moves import zip_longest


class TestLookupModule(unittest.TestCase):
    def setUp(self):
        self.lookup_module = LookupModule()
        self.lookup_module._templar = None  # Mocking templar
        self.lookup_module._loader = None  # Mocking loader

    def test_lookup_variables(self):
        terms = [['a', 'b'], ['c', 'd']]
        result = self.lookup_module._lookup_variables(terms) or {}
        expected = [['a', 'b'], ['c', 'd']]
        self.assertEqual(result, expected)

    def test_run(self):
        terms = [['a', 'b'], ['c', 'd']]
        result = self.lookup_module.run(terms, variables={})
        expected = [['a', 'c'], ['b', 'd']]
        self.assertEqual(result, expected)

    def test_run_empty_list(self):
        terms = []
        with self.assertRaises(AnsibleError) as context:
            self.lookup_module.run(terms)
        self.assertEqual(str(context.exception), "with_together requires at least one element in each list")

    def test_run_single_list(self):
        terms = [['a', 'b']]
        result = self.lookup_module.run(terms).template
        expected = [['a'], ['b']]
        self.assertEqual(result, expected)

    def test_run_uneven_lists(self):
        terms = [['a', 'b'], ['c']]
        result = self.lookup_module.run(terms).template
        expected = [['a', 'c'], ['b', None]]
        self.assertEqual(result, expected)

if __name__ == '__main__':
    unittest.main()