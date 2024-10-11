import unittest
from ansible.utils.collection_loader._collection_finder import AnsibleCollectionRef


class TestAnsibleInternalRedirectLoader(unittest.TestCase):
    def test_init(self):
        redirect_loader = _AnsibleInternalRedirectLoader('ansible.module_utils', [])
        self.assertIsNone(redirect_loader._redirect)
        with self.assertRaises(ImportError):
            _AnsibleInternalRedirectLoader('not.interested', [])

    def test_load_module(self):
        redirect_loader = _AnsibleInternalRedirectLoader('ansible.module_utils', [])
        with self.assertRaises(ImportError):
            redirect_loader.load_module('not.redirected')

if __name__ == '__main__':
    unittest.main()