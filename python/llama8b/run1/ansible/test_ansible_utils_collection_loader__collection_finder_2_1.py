import unittest
from ansible.utils.collection_loader._collection_finder import _AnsibleInternalRedirectLoader


class TestAnsibleInternalRedirectLoader(unittest.TestCase):
    def test_init(self):
        loader = _AnsibleInternalRedirectLoader('ansible.module_utils.collection_loader', ['path1', 'path2'])
        self.assertEqual(loader._redirect, None)

    def test_load_module(self):
        loader = _AnsibleInternalRedirectLoader('ansible.module_utils.collection_loader', ['path1', 'path2'])
        loader._redirect = 'ansible.module_utils.collection_loader'
        mod = loader.load_module('ansible.module_utils.collection_loader')
        self.assertEqual(mod.__name__, 'ansible.module_utils.collection_loader')

    def test_load_module_no_redirect(self):
        loader = _AnsibleInternalRedirectLoader('ansible.module_utils.collection_loader', ['path1', 'path2'])
        with self.assertRaises(ValueError):
            loader.load_module('ansible.module_utils.collection_loader')

    def test_load_module_invalid_redirect(self):
        loader = _AnsibleInternalRedirectLoader('ansible.module_utils.collection_loader', ['path1', 'path2'])
        loader._redirect = 'invalid_module'
        with self.assertRaises(ImportError):
            loader.load_module('ansible.module_utils.collection_loader')

    def test_str_method(self):
        loader = _AnsibleInternalRedirectLoader('ansible.module_utils.collection_loader', ['path1', 'path2'])
        result = str(loader)
        self.assertEqual(result, '<_AnsibleInternalRedirectLoader object at 0x...>')

    def test_repr_method(self):
        loader = _AnsibleInternalRedirectLoader('ansible.module_utils.collection_loader', ['path1', 'path2'])
        result = repr(loader)
        self.assertEqual(result, '_AnsibleInternalRedirectLoader(\'ansible.module_utils.collection_loader\', [\'path1\', \'path2\'])')

if __name__ == '__main__':
    unittest.main()