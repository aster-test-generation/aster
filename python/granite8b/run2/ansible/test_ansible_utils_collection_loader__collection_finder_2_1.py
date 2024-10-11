import unittest
from ansible.utils.collection_loader import _AnsibleInternalRedirectLoader


class TestAnsibleInternalRedirectLoader(unittest.TestCase):
    def test_load_module(self):
        loader = _AnsibleInternalRedirectLoader('ansible.builtin.copy', [])
        with self.assertRaises(ImportError):
            loader.load_module('ansible.builtin.copy')

if __name__ == '__main__':
    unittest.main()