import unittest
from ansible_collections.community.general.plugins.lookup.together import LookupModul


class TestLookupModule(unittest.TestCase):
    def test_init(self):
        instance = LookupModule()
        self.assertIsInstance(instance, LookupModule)

    def test_lookup_variables(self):
        instance = LookupModule()
        terms = ["term1", "term2"]
        result = instance._lookup_variables(terms)
        self.assertEqual(result, [["term1"], ["term2"]])

    def test_run(self):
        instance = LookupModule()
        terms = [["a", "b"], ["c", "d"]]
        result = instance.run(terms)
        self.assertEqual(result, [["a", "c"], ["b", "d"]])

    def test_run_empty_list(self):
        instance = LookupModule()
        terms = []
        with self.assertRaises(AnsibleError):
            instance.run(terms)

    def test_flatten(self):
        instance = LookupModule()
        input_list = [["a", "b"], ["c", "d"]]
        result = instance._flatten(list(zip_longest(*input_list, fillvalue=None)))
        self.assertEqual(result, [["a", "c"], ["b", "d"]])

    def test_str_method(self):
        instance = LookupModule()
        result = instance.__str__()
        self.assertIsInstance(result, str)

    def test_repr_method(self):
        instance = LookupModule()
        result = instance.__repr__()
        self.assertIsInstance(result, str)

    def test_eq_method(self):
        instance1 = LookupModule()
        instance2 = LookupModule()
        self.assertNotEqual(instance1, instance2)

if __name__ == '__main__':
    unittest.main()