import unittest
from ansible.utils.collection_loader._collection_finder import _AnsibleInternalRedirectLoader


class TestAnsibleInternalRedirectLoader(unittest.TestCase):
    def test_init(self):
        loader = _AnsibleInternalRedirectLoader('ansible.module_utils', ['path', 'list'])
        self.assertEqual(loader._redirect, None)

    def test_load_module(self):
        loader = _AnsibleInternalRedirectLoader('ansible.module_utils', ['path', 'list'])
        with self.assertRaises(ValueError):
            loader.load_module('ansible.module_utils')

    def test_load_module_redirected(self):
        loader = _AnsibleInternalRedirectLoader('ansible.module_utils', ['path', 'list'])
        loader._redirect = 'redirected_module'
        mod = loader.load_module('ansible.module_utils')
        self.assertEqual(mod.__name__, 'redirected_module')

    def test_load_module_not_redirected(self):
        loader = _AnsibleInternalRedirectLoader('ansible.module_utils', ['path', 'list'])
        with self.assertRaises(ImportError):
            loader.load_module('ansible.module_utils')

    def test_str_method(self):
        loader = _AnsibleInternalRedirectLoader('ansible.module_utils', ['path', 'list'])
        result = str(loader)
        self.assertEqual(result, str(type(loader)))

    def test_repr_method(self):
        loader = _AnsibleInternalRedirectLoader('ansible.module_utils', ['path', 'list'])
        result = repr(loader)
        self.assertEqual(result, f"{type(loader)}('{loader.__class__.__name__}')")

if __name__ == '__main__':
    unittest.main()