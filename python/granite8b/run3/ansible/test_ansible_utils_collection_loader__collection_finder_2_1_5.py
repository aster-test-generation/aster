import unittest
from ansible.utils.collection_loader._collection_finder import _AnsibleCollectionPkgLoaderBase


class TestAnsibleCollectionPkgLoader(_AnsibleCollectionPkgLoader):
    def test_validate_args(self):
        instance = _AnsibleCollectionPkgLoader()
        instance._split_name = ['ansible', 'builtin']
        instance._validate_args()
        self.assertEqual(instance._subpackage_search_paths, [])

    def test_validate_final(self):
        instance = _AnsibleCollectionPkgLoader()
        instance._split_name = ['ansible', 'builtin']
        instance._subpackage_search_paths = ['path']
        instance._validate_final()
        self.assertEqual(instance._subpackage_search_paths, ['path'])

    def test_load_module(self):
        instance = _AnsibleCollectionPkgLoader()
        instance._split_name = ['ansible', 'builtin']
        module = instance.load_module('ansible.builtin')
        self.assertEqual(module._collection_meta, {})

    def test_canonicalize_meta(self):
        instance = _AnsibleCollectionPkgLoader()
        meta_dict = {'key': 'value'}
        result = instance._canonicalize_meta(meta_dict)
        self.assertEqual(result, meta_dict)

if __name__ == '__main__':
    unittest.main()