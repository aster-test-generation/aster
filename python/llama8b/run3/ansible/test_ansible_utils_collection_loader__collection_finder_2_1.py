import unittest
from ansible.utils.collection_loader import CollectionFinde
from ansible.utils.collection_loader._collection_finder import _get_collection_metadata


class TestAnsibleInternalRedirectLoader(unittest.TestCase):
    def test_init(self):
        loader = _AnsibleInternalRedirectLoader('ansible.module_utils', ['path1', 'path2'])
        self.assertEqual(loader._redirect, None)

    def test_load_module(self):
        loader = _AnsibleInternalRedirectLoader('ansible.module_utils', ['path1', 'path2'])
        loader._redirect = 'ansible.module_utils.redirect'
        mod = loader.load_module('ansible.module_utils')
        self.assertEqual(mod, import_module('ansible.module_utils.redirect'))

    def test_load_module_no_redirect(self):
        loader = _AnsibleInternalRedirectLoader('ansible.module_utils', ['path1', 'path2'])
        with self.assertRaises(ValueError):
            loader.load_module('ansible.module_utils')

    def test_get_collection_metadata(self):
        metadata = _get_collection_metadata('ansible.builtin')
        self.assertIsNotNone(metadata)

    def test_get_collection_metadata_non_existent(self):
        with self.assertRaises(KeyError):
            _get_collection_metadata('non_existent_collection')

if __name__ == '__main__':
    unittest.main()