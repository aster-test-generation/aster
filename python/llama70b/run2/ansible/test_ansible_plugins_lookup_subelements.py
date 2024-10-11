import unittest
from ansible.plugins.lookup import subelements as LookupModul


class TestLookupModule(unittest.TestCase):
    def test_init(self):
        instance = LookupModule()
        self.assertIsInstance(instance, LookupBase)

    def test_run(self):
        instance = LookupModule()
        terms = [['dict', 'key'], 'subkey']
        variables = {}
        result = instance.run(terms, variables)
        self.assertIsInstance(result, list)

    def test__raise_terms_error(self):
        instance = LookupModule()
        with self.assertRaises(AnsibleError):
            instance._LookupModule__raise_terms_error()

    def test_listify_lookup_plugin_terms(self):
        instance = LookupModule()
        terms = ['term1', 'term2']
        result = instance.listify_lookup_plugin_terms(terms)
        self.assertIsInstance(result, list)

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
        self.assertEqual(instance1, instance2)

if __name__ == '__main__':
    unittest.main()