import unittest
from ansible.plugins.lookup.yaml import *


class TestLookupModule(unittest.TestCase):
    def test_run(self):
        instance = LookupModule()
        result = instance.run([1, 2, 3])
        self.assertEqual(result, [1])

    def test_run_empty(self):
        instance = LookupModule()
        result = instance.run([])
        self.assertEqual(result, [])

    def test_run_exception(self):
        instance = LookupModule()
        with self.assertRaises(AnsibleError):
            instance.run(None)

if __name__ == '__main__':
    unittest.main()