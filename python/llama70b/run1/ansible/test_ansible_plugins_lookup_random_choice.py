import unittest
from ansible.plugins.lookup import random_choic


class TestLookupModule(unittest.TestCase):
    def test_run(self):
        instance = LookupModule()
        terms = [1, 2, 3]
        result = instance.run(terms)
        self.assertIn(result[0], terms)

    def test_run_empty_terms(self):
        instance = LookupModule()
        terms = []
        result = instance.run(terms)
        self.assertEqual(result, [])

    def test_run_exception(self):
        instance = LookupModule()
        terms = [1, 2, 3]
        with self.assertRaises(AnsibleError):
            instance.run(terms, inject=None, **{'raise_exception': True})

    def test___init__(self):
        instance = LookupModule()
        self.assertIsInstance(instance, LookupBase)

    def test___str__(self):
        instance = LookupModule()
        result = instance.__str__()
        self.assertEqual(result, "random_choice")

    def test___repr__(self):
        instance = LookupModule()
        result = instance.__repr__()
        self.assertEqual(result, "random_choice()")

    def test___eq__(self):
        instance1 = LookupModule()
        instance2 = LookupModule()
        self.assertNotEqual(instance1, instance2)

    def test_run_private_method(self):
        instance = LookupModule()
        terms = [1, 2, 3]
        result = instance._LookupModule__run(terms)
        self.assertIn(result[0], terms)

if __name__ == '__main__':
    unittest.main()