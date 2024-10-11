import unittest
from ansible.utils.collection_loader._collection_finder import _AnsibleCollectionPkgLoaderBase


class TestAnsibleCollectionPkgLoader(_AnsibleCollectionPkgLoader):
    def test_validate_args(self):
        self._split_name = ['ansible', 'builtin', 'module']
        self._validate_args()
        self.assertEqual(self._package_to_load, 'ansible.builtin.module')

    def test_validate_final(self):
        self._subpackage_search_paths = ['/path/to/collections']
        self._validate_final()
        self.assertEqual(self._subpackage_search_paths, ['/path/to/collections/ansible/builtin'])

    def test_load_module(self):
        self._split_name = ['ansible', 'builtin', 'module']
        module = self.load_module('ansible.builtin.module')
        self.assertEqual(module._collection_meta, {})

if __name__ == '__main__':
    unittest.main()