import os
import unittest
from ansible.utils.collection_loader import CollectionFinder as _collection_finde
from ansible.utils.collection_loader._collection_finder import _AnsibleCollectionPkgLoaderBase


class TestAnsibleCollectionPkgLoaderBase(unittest.TestCase):
    def test_init(self):
        loader = _AnsibleCollectionPkgLoaderBase('ansible_collections.test', ['path/to/packages'])
        self.assertEqual(loader._fullname, 'ansible_collections.test')
        self.assertEqual(loader._split_name, ['ansible_collections', 'test'])
        self.assertEqual(loader._rpart_name, ('ansible_collections', '.', 'test'))
        self.assertEqual(loader._parent_package_name, 'ansible_collections')
        self.assertEqual(loader._package_to_load, 'test')
        self.assertEqual(loader._source_code_path, None)
        self.assertEqual(loader._decoded_source, None)
        self.assertEqual(loader._compiled_code, None)

    def test_validate_args(self):
        loader = _AnsibleCollectionPkgLoaderBase('ansible_collections.test', ['path/to/packages'])
        loader._validate_args()  # should not raise an exception
        with self.assertRaises(ImportError):
            loader = _AnsibleCollectionPkgLoaderBase('not_ansible_collections.test', ['path/to/packages'])
            loader._validate_args()

    def test_get_candidate_paths(self):
        loader = _AnsibleCollectionPkgLoaderBase('ansible_collections.test', ['path/to/packages'])
        candidate_paths = loader._get_candidate_paths(['path/to/packages'])
        self.assertEqual(candidate_paths, [os.path.join('path/to/packages', 'test')])

    def test_get_subpackage_search_paths(self):
        loader = _AnsibleCollectionPkgLoaderBase('ansible_collections.test', ['path/to/packages'])
        subpackage_search_paths = loader._get_subpackage_search_paths([os.path.join('path/to/packages', 'test')])
        self.assertEqual(subpackage_search_paths, [os.path.join('path/to/packages', 'test')])

    def test_validate_final(self):
        loader = _AnsibleCollectionPkgLoaderBase('ansible_collections.test', ['path/to/packages'])
        loader._validate_final()  # should not raise an exception

    def test_new_or_existing_module(self):
        loader = _AnsibleCollectionPkgLoaderBase('ansible_collections.test', ['path/to/packages'])
        with loader._new_or_existing_module('test_module', foo='bar') as module:
            self.assertEqual(module.__name__, 'test_module')
            self.assertEqual(module.foo, 'bar')

    def test_module_file_from_path(self):
        loader = _AnsibleCollectionPkgLoaderBase('ansible_collections.test', ['path/to/packages'])
        module_path, has_code, package_path = loader._module_file_from_path('test_module', 'path/to/packages')
        self.assertEqual(module_path, os.path.join('path/to/packages', 'test_module.py'))
        self.assertTrue(has_code)
        self.assertEqual(package_path, None)

    def test_load_module(self):
        loader = _AnsibleCollectionPkgLoaderBase('ansible_collections.test', ['path/to/packages'])
        module = loader.load_module('ansible_collections.test')
        self.assertEqual(module.__loader__, loader)
        self.assertEqual(module.__file__, loader.get_filename('ansible_collections.test'))
        self.assertEqual(module.__package__, 'ansible_collections')

    def test_is_package(self):
        loader = _AnsibleCollectionPkgLoaderBase('ansible_collections.test', ['path/to/packages'])
        self.assertTrue(loader.is_package('ansible_collections.test'))
        with self.assertRaises(ValueError):
            loader.is_package('not_ansible_collections.test')

    def test_get_source(self):
        loader = _AnsibleCollectionPkgLoaderBase('ansible_collections.test', ['path/to/packages'])
        source_code = loader.get_source('ansible_collections.test')
        self.assertIsNone(source_code)  # since we didn't set _source_code_path

    def test_get_data(self):
        loader = _AnsibleCollectionPkgLoaderBase('ansible_collections.test', ['path/to/packages'])
        data = loader.get_data('/path/to/file')
        self.assertIsNone(data)  # since we didn't set up a file

    def test_synthetic_filename(self):
        loader = _AnsibleCollectionPkgLoaderBase('ansible_collections.test', ['path/to/packages'])
        filename = loader._synthetic_filename('ansible_collections.test')
        self.assertEqual(filename, '<ansible_synthetic_collection_package>')

    def test_get_filename(self):
        loader = _AnsibleCollectionPkgLoaderBase('ansible_collections.test', ['path/to/packages'])
        filename = loader.get_filename('ansible_collections.test')
        self.assertIsNone(filename)  # since we didn't set _source_code_path

    def test_get_code(self):
        loader = _AnsibleCollectionPkgLoaderBase('ansible_collections.test', ['path/to/packages'])
        code = loader.get_code('ansible_collections.test')
        self.assertIsNone(code)  # since we didn't set _source_code_path

if __name__ == '__main__':
    unittest.main()