import unittest
from ansible.plugins.lookup.random_choice import *


class TestLookupModule(unittest.TestCase):
    def test_run(self):
        instance = LookupModule()
        result = instance.run([1, 2, 3])
        self.assertEqual(result, [1, 2, 3])

    def test_run_with_inject(self):
        instance = LookupModule()
        result = instance.run([1, 2, 3], inject=True)
        self.assertEqual(result, [1, 2, 3])

    def test_run_with_kwargs(self):
        instance = LookupModule()
        result = instance.run([1, 2, 3], kwarg1=True, kwarg2=False)
        self.assertEqual(result, [1, 2, 3])

    def test_run_with_exception(self):
        instance = LookupModule()
        with self.assertRaises(AnsibleError):
            instance.run([])

if __name__ == '__main__':
    unittest.main()