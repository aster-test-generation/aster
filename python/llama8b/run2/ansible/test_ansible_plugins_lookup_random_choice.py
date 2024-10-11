import unittest
from ansible.module_utils.basic import AnsibleModule, missing_required_li


class TestLookupModule(unittest.TestCase):
    def test_run(self):
        lookup = LookupModule()
        terms = ['a', 'b', 'c']
        result = lookup.run(terms)
        self.assertEqual(result, ['a'])

    def test_run_empty_terms(self):
        lookup = LookupModule()
        terms = []
        result = lookup.run(terms)
        self.assertEqual(result, [])

    def test_run_invalid_terms(self):
        lookup = LookupModule()
        terms = ['a', 'b', 'c', 1, 2, 3]
        with self.assertRaises(AnsibleError):
            lookup.run(terms)

    def test_run_invalid_terms_with_exception(self):
        lookup = LookupModule()
        terms = ['a', 'b', 'c']
        with self.assertRaises(AnsibleError):
            lookup.run(terms, inject={'fail': True})

    def test_str_method(self):
        lookup = LookupModule()
        result = str(lookup)
        self.assertEqual(result, '<ansible.plugins.lookup.random_choice.RandomChoiceLookupModule object at 0x...>')

    def test_repr_method(self):
        lookup = LookupModule()
        result = repr(lookup)
        self.assertEqual(result, '<ansible.plugins.lookup.random_choice.RandomChoiceLookupModule object at 0x...>')

    def test_eq_method(self):
        lookup1 = LookupModule()
        lookup2 = LookupModule()
        self.assertEqual(lookup1, lookup2)

if __name__ == '__main__':
    unittest.main()