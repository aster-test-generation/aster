import unittest
from ansible.utils.collection_loader import _AnsibleCollectionPkgLoaderBase


class TestAnsibleCollectionPkgLoaderBase(unittest.TestCase):
    def test_init(self):
        loader = _AnsibleCollectionPkgLoaderBase('ansible_collections.test.test_module')
        self.assertEqual(loader._fullname, 'ansible_collections.test.test_module')
        self.assertEqual(loader._split_name, ['ansible_collections', 'test', 'test_module'])
        self.assertEqual(loader._rpart_name, ('ansible_collections', 'test', 'test_module'))
        self.assertEqual(loader._parent_package_name, 'ansible_collections.test')
        self.assertEqual(loader._package_to_load, 'test_module')
        self.assertEqual(loader._source_code_path, None)
        self.assertEqual(loader._decoded_source, None)
        self.assertEqual(loader._compiled_code, None)

    def test_validate_args(self):
        with self.assertRaises(ImportError):
            loader = _AnsibleCollectionPkgLoaderBase('ansible_collections.test')

    def test_get_candidate_paths(self):
        loader = _AnsibleCollectionPkgLoaderBase('ansible_collections.test.test_module', ['/path/to/collections'])
        self.assertEqual(loader._candidate_paths, ['/path/to/collections/test/test_module'])

    def test_get_subpackage_search_paths(self):
        loader = _AnsibleCollectionPkgLoaderBase('ansible_collections.test.test_module', ['/path/to/collections'])
        self.assertEqual(loader._get_subpackage_search_paths(['/path/to/collections/test/test_module']), ['/path/to/collections/test/test_module'])

    def test_validate_final(self):
        loader = _AnsibleCollectionPkgLoaderBase('ansible_collections.test.test_module')
        loader._validate_final()

    def test_new_or_existing_module(self):
        with self.assertRaises(ImportError):
            with _AnsibleCollectionPkgLoaderBase._new_or_existing_module('ansible_collections.test.test_module') as module:
                pass

    def test_module_file_from_path(self):
        module_path, has_code, package_path = _AnsibleCollectionPkgLoaderBase._module_file_from_path('test_module', '/path/to/collections/test')
        self.assertEqual(module_path, '/path/to/collections/test/test_module.py')
        self.assertEqual(has_code, True)
        self.assertEqual(package_path, '/path/to/collections/test/test_module')

    def test_load_module(self):
        loader = _AnsibleCollectionPkgLoaderBase('ansible_collections.test.test_module')
        with self.assertRaises(ImportError):
            loader.load_module('ansible_collections.test.test_module')

    def test_is_package(self):
        loader = _AnsibleCollectionPkgLoaderBase('ansible_collections.test.test_module')
        self.assertEqual(loader.is_package('ansible_collections.test.test_module'), False)

    def test_get_source(self):
        loader = _AnsibleCollectionPkgLoaderBase('ansible_collections.test.test_module')
        self.assertEqual(loader.get_source('ansible_collections.test.test_module'), None)

    def test_get_data(self):
        loader = _AnsibleCollectionPkgLoaderBase('ansible_collections.test.test_module')
        self.assertEqual(loader.get_data('/path/to/collections/test/test_module.py'), None)

    def test_synthetic_filename(self):
        loader = _AnsibleCollectionPkgLoaderBase('ansible_collections.test.test_module')
        self.assertEqual(loader._synthetic_filename('ansible_collections.test.test_module'), '<ansible_synthetic_collection_package>')

    def test_get_filename(self):
        loader = _AnsibleCollectionPkgLoaderBase('ansible_collections.test.test_module')
        self.assertEqual(loader.get_filename('ansible_collections.test.test_module'), '/path/to/collections/test/test_module.py')

if __name__ == '__main__':
    unittest.main()