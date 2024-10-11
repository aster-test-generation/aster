from ansible.errors import AnsibleError
import unittest
from ansible.plugins.lookup.subelements import LookupModule


class TestLookupModule(unittest.TestCase):
    def test_run_with_dict(self):
        lookup = LookupModule()
        result = lookup.run([{"a": 1, "b": 2}, "b"], {})
        self.assertEqual(result, [(1, 2)])

    def test_run_with_list(self):
        lookup = LookupModule()
        result = lookup.run([[1, 2], "b"], {})
        self.assertEqual(result, [(1, 2)])

    def test_run_with_dict_and_flags(self):
        lookup = LookupModule()
        result = lookup.run([{"a": 1, "b": 2}, "b", {"skip_missing": True}], {})
        self.assertEqual(result, [])

    def test_run_with_list_and_flags(self):
        lookup = LookupModule()
        result = lookup.run([[1, 2], "b", {"skip_missing": True}], {})
        self.assertEqual(result, [])

    def test_run_with_dict_and_invalid_flags(self):
        lookup = LookupModule()
        with self.assertRaises(AnsibleError):
            lookup.run([{"a": 1, "b": 2}, "b", {"invalid_flag": True}], {})

    def test_run_with_list_and_invalid_flags(self):
        lookup = LookupModule()
        with self.assertRaises(AnsibleError):
            lookup.run([[1, 2], "b", {"invalid_flag": True}], {})

if __name__ == '__main__':
    unittest.main()