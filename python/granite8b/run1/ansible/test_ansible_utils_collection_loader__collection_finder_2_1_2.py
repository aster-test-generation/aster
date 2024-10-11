import unittest
from ansible.utils.collection_loader._collection_finder import AnsibleCollectionRef


class TestAnsibleCollectionPkgLoaderBase(unittest.TestCase):
    def test_init(self):
        loader = _AnsibleCollectionPkgLoaderBase('ansible_collections.test.test_module')
        self.assertEqual(loader._fullname, 'ansible_collections.test.test_module')
        self.assertEqual(loader._split_name, ['ansible_collections', 'test', 'test_module'])
        self.assertEqual(loader._rpart_name, ('ansible_collections', 'test', 'test_module'))
        self.assertEqual(loader._parent_package_name, 'ansible_collections.test')
        self.assertEqual(loader._package_to_load, 'test_module')
        self.assertIsNone(loader._source_code_path)
        self.assertIsNone(loader._decoded_source)
        self.assertIsNone(loader._compiled_code)
        self.assertIsNone(loader._candidate_paths)
        self.assertIsNone(loader._subpackage_search_paths)

    def test_validate_args(self):
        loader = _AnsibleCollectionPkgLoaderBase('ansible_collections.test.test_module')
        with self.assertRaises(ImportError):
            loader._validate_args()

    def test_get_candidate_paths(self):
        loader = _AnsibleCollectionPkgLoaderBase('ansible_collections.test.test_module', ['/path/to/collections'])
        candidate_paths = loader._get_candidate_paths(['/path/to/collections'])
        self.assertEqual(candidate_paths, ['/path/to/collections/ansible_collections/test/test_module'])

    def test_get_subpackage_search_paths(self):
        loader = _AnsibleCollectionPkgLoaderBase('ansible_collections.test.test_module', ['/path/to/collections'])
        candidate_paths = loader._get_candidate_paths(['/path/to/collections'])
        subpackage_search_paths = loader._get_subpackage_search_paths(candidate_paths)
        self.assertEqual(subpackage_search_paths, ['/path/to/collections/ansible_collections/test/test_module'])

    def test_validate_final(self):
        loader = _AnsibleCollectionPkgLoaderBase('ansible_collections.test.test_module')
        with self.assertRaises(ImportError):
            loader._validate_final()

    def test_load_module(self):
        loader = _AnsibleCollectionPkgLoaderBase('ansible_collections.test.test_module')
        with self.assertRaises(ImportError):
            loader.load_module('ansible_collections.test.test_module')

    def test_is_package(self):
        loader = _AnsibleCollectionPkgLoaderBase('ansible_collections.test.test_module')
        self.assertFalse(loader.is_package('ansible_collections.test.test_module'))

    def test_get_source(self):
        loader = _AnsibleCollectionPkgLoaderBase('ansible_collections.test.test_module')
        self.assertIsNone(loader.get_source('ansible_collections.test.test_module'))

    def test_get_data(self):
        loader = _AnsibleCollectionPkgLoaderBase('ansible_collections.test.test_module')
        self.assertIsNone(loader.get_data('/path/to/resource'))

    def test_synthetic_filename(self):
        loader = _AnsibleCollectionPkgLoaderBase('ansible_collections.test.test_module')
        self.assertEqual(loader._synthetic_filename('ansible_collections.test.test_module'), '<ansible_synthetic_collection_package>')

    def test_get_filename(self):
        loader = _AnsibleCollectionPkgLoaderBase('ansible_collections.test.test_module')
        self.assertEqual(loader.get_filename('ansible_collections.test.test_module'), '/path/to/resource')

    def test_get_code(self):
        loader = _AnsibleCollectionPkgLoaderBase('ansible_collections.test.test_module')
        self.assertIsNone(loader.get_code('ansible_collections.test.test_module'))

if __name__ == '__main__':
    unittest.main()