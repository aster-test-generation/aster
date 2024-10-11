import unittest
from ansible.utils.collection_loader._collection_finder import AnsibleCollectionRef


class TestAnsibleInternalRedirectLoader(unittest.TestCase):
    def test_init(self):
        redirect_loader = _AnsibleInternalRedirectLoader('ansible.module_utils', [])
        self.assertIsNone(redirect_loader._redirect)
        with self.assertRaises(ImportError):
            _AnsibleInternalRedirectLoader('not.interested', [])
        builtin_meta = {'import_redirection': {'ansible.module_utils': {'redirect': 'ansible.module_utils'}}}
        with self.assertRaises(ImportError):
            _AnsibleInternalRedirectLoader('ansible.module_utils', [], builtin_meta)
        builtin_meta = {'import_redirection': {'ansible.module_utils': {'redirect': 'ansible.module_utils'}}}
        redirect_loader = _AnsibleInternalRedirectLoader('ansible.module_utils', [], builtin_meta)
        self.assertEqual(redirect_loader._redirect, 'ansible.module_utils')

    def test_load_module(self):
        redirect_loader = _AnsibleInternalRedirectLoader('ansible.module_utils', [])
        with self.assertRaises(ValueError):
            redirect_loader.load_module('ansible.module_utils')
        redirect_loader = _AnsibleInternalRedirectLoader('ansible.module_utils', [], {'import_redirection': {'ansible.module_utils': {'redirect': 'ansible.module_utils'}}})
        mod = redirect_loader.load_module('ansible.module_utils')
        self.assertEqual(mod.__name__, 'ansible.module_utils')

if __name__ == '__main__':
    unittest.main()