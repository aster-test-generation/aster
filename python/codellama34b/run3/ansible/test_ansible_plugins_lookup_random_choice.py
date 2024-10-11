import unittest
from ansible.plugins.lookup import random_choice


class TestLookupModule(unittest.TestCase):
    def test_run(self):
        instance = LookupModule()
        result = instance.run([1, 2, 3])
        self.assertEqual(result, [1, 2, 3])

    def test_run_with_inject(self):
        instance = LookupModule()
        result = instance.run([1, 2, 3], inject=4)
        self.assertEqual(result, [1, 2, 3])

    def test_run_with_kwargs(self):
        instance = LookupModule()
        result = instance.run([1, 2, 3], kwarg1=4, kwarg2=5)
        self.assertEqual(result, [1, 2, 3])

    def test_run_with_empty_terms(self):
        instance = LookupModule()
        result = instance.run([])
        self.assertEqual(result, [])

    def test_run_with_exception(self):
        instance = LookupModule()
        with self.assertRaises(AnsibleError):
            instance.run([1, 2, 3], inject=4, kwarg1=4, kwarg2=5)

if __name__ == '__main__':
    unittest.main()