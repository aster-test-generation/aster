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
            instance._raise_terms_error()

    def test_listify_lookup_plugin_terms(self):
        instance = LookupModule()
        terms = ['term1', 'term2']
        result = instance.listify_lookup_plugin_terms(terms)
        self.assertIsInstance(result, list)

    def test__templar(self):
        instance = LookupModule()
        self.assertIsNone(instance._templar)

    def test__loader(self):
        instance = LookupModule()
        self.assertIsNone(instance._loader)

    def test_str(self):
        instance = LookupModule()
        result = str(instance)
        self.assertEqual(result, "LookupModule")

    def test_repr(self):
        instance = LookupModule()
        result = repr(instance)
        self.assertEqual(result, "LookupModule()")

    def test_eq(self):
        instance1 = LookupModule()
        instance2 = LookupModule()
        self.assertEqual(instance1, instance2)

class TestFLAGS(unittest.TestCase):
    def test_FLAGS(self):
        self.assertIsInstance(FLAGS, tuple)
        self.assertEqual(FLAGS, ('skip_missing',))

if __name__ == '__main__':
    unittest.main()