import unittest
from ansible_collections.ansible.builtin.plugins.lookup.random_choice import LookupModul


class TestLookupModule(unittest.TestCase):
    def test_run(self):
        instance = LookupModule()
        result = instance.run(['a', 'b', 'c'])
        self.assertIsInstance(result, list)
        self.assertEqual(len(result), 1)

    def test_run_empty_terms(self):
        instance = LookupModule()
        result = instance.run([])
        self.assertEqual(result, [])

    def test_run_exception(self):
        instance = LookupModule()
        with self.assertRaises(AnsibleError):
            instance.run(['a', 'b', 'c'], inject={'raise_exception': True})

    def test___init__(self):
        instance = LookupModule()
        self.assertIsInstance(instance, LookupBase)

    def test___str__(self):
        instance = LookupModule()
        result = instance.__str__()
        self.assertIsInstance(result, str)

    def test___repr__(self):
        instance = LookupModule()
        result = instance.__repr__()
        self.assertIsInstance(result, str)

    def test___eq__(self):
        instance1 = LookupModule()
        instance2 = LookupModule()
        self.assertNotEqual(instance1, instance2)

if __name__ == '__main__':
    unittest.main()