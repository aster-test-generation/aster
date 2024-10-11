import os
import unittest
from unittest.mock import patch
from ansible.utils.collection_loader.collection_finder import AnsibleCollectionRe


class TestAnsibleCollectionPkgLoaderBase(unittest.TestCase):
    def test_init(self):
        loader = _AnsibleCollectionPkgLoaderBase('ansible_collections.collection_name', ['path1', 'path2'])
        self.assertEqual(loader._fullname, 'ansible_collections.collection_name')
        self.assertEqual(loader._candidate_paths, ['path1/ansible_collections/collection_name', 'path2/ansible_collections/collection_name'])
        self.assertEqual(loader._subpackage_search_paths, [os.path.join(p, 'ansible_collections/collection_name') for p in ['path1', 'path2']])

    def test_validate_args(self):
        loader = _AnsibleCollectionPkgLoaderBase('ansible_collections.collection_name', ['path1', 'path2'])
        loader._validate_args()
        self.assertRaises(ImportError, lambda: _AnsibleCollectionPkgLoaderBase('not_ansible_collections.collection_name', ['path1', 'path2']))

    def test_get_candidate_paths(self):
        loader = _AnsibleCollectionPkgLoaderBase('ansible_collections.collection_name', ['path1', 'path2'])
        self.assertEqual(loader._get_candidate_paths(['path1', 'path2']), ['path1/ansible_collections/collection_name', 'path2/ansible_collections/collection_name'])

    def test_get_subpackage_search_paths(self):
        loader = _AnsibleCollectionPkgLoaderBase('ansible_collections.collection_name', ['path1', 'path2'])
        self.assertEqual(loader._get_subpackage_search_paths(['path1/ansible_collections/collection_name', 'path2/ansible_collections/collection_name']), ['path1/ansible_collections/collection_name', 'path2/ansible_collections/collection_name'])

    def test_validate_final(self):
        loader = _AnsibleCollectionPkgLoaderBase('ansible_collections.collection_name', ['path1', 'path2'])
        loader._validate_final()

    def test_new_or_existing_module(self):
        with patch('sys.modules') as mock_sys_modules:
            with _AnsibleCollectionPkgLoaderBase._new_or_existing_module('module_name', foo='bar') as module:
                self.assertEqual(module.foo, 'bar')
                self.assertEqual(mock_sys_modules.get('module_name'), module)

    def test_module_file_from_path(self):
        loader = _AnsibleCollectionPkgLoaderBase('ansible_collections.collection_name', ['path1', 'path2'])
        self.assertEqual(loader._module_file_from_path('module_name', 'path1'), ('path1/ansible_collections/collection_name/module_name.py', True, 'path1/ansible_collections/collection_name'))
        self.assertEqual(loader._module_file_from_path('module_name', 'path1'), ('path1/ansible_collections/collection_name/__init__.py', True, 'path1/ansible_collections/collection_name'),)

    def test_load_module(self):
        loader = _AnsibleCollectionPkgLoaderBase('ansible_collections.collection_name', ['path1', 'path2'])
        module = loader.load_module('module_name')
        self.assertEqual(module.__loader__, loader)
        self.assertEqual(module.__file__, 'path1/ansible_collections/collection_name/module_name.py')
        self.assertEqual(module.__package__, 'ansible_collections.collection_name')

    def test_is_package(self):
        loader = _AnsibleCollectionPkgLoaderBase('ansible_collections.collection_name', ['path1', 'path2'])
        self.assertTrue(loader.is_package('ansible_collections.collection_name'))
        self.assertFalse(loader.is_package('module_name'))

    def test_get_source(self):
        loader = _AnsibleCollectionPkgLoaderBase('ansible_collections.collection_name', ['path1', 'path2'])
        self.assertEqual(loader.get_source('module_name'), None)

    def test_get_data(self):
        loader = _AnsibleCollectionPkgLoaderBase('ansible_collections.collection_name', ['path1', 'path2'])
        self.assertEqual(loader.get_data('path1/ansible_collections/collection_name/module_name.py'), None)

    def test_synthetic_filename(self):
        loader = _AnsibleCollectionPkgLoaderBase('ansible_collections.collection_name', ['path1', 'path2'])
        self.assertEqual(loader._synthetic_filename('module_name'), '<ansible_synthetic_collection_package>')

    def test_get_filename(self):
        loader = _AnsibleCollectionPkgLoaderBase('ansible_collections.collection_name', ['path1', 'path2'])
        self.assertEqual(loader.get_filename('module_name'), 'path1/ansible_collections/collection_name/module_name.py')

    def test_get_code(self):
        loader = _AnsibleCollectionPkgLoaderBase('ansible_collections.collection_name', ['path1', 'path2'])
        self.assertEqual(loader.get_code('module_name'), None)

if __name__ == '__main__':
    unittest.main()