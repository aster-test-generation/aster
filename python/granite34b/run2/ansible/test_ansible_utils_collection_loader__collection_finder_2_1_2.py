import unittest
from ansible.utils.collection_loader._collection_finder import AnsibleCollectionRef


class TestAnsibleCollectionPkgLoaderBase(unittest.TestCase):
    def setUp(self):
        self.loader = _AnsibleCollectionPkgLoaderBase('ansible_collections.test.collection')

    def test_validate_args(self):
        self.loader._validate_args()
        self.assertEqual(self.loader._split_name[0], 'ansible_collections')

    def test_get_candidate_paths(self):
        path_list = ['/path/to/collections']
        candidate_paths = self.loader._get_candidate_paths(path_list)
        self.assertEqual(candidate_paths, ['/path/to/collections/test/collection'])

    def test_get_subpackage_search_paths(self):
        candidate_paths = ['/path/to/collections/test/collection']
        subpackage_search_paths = self.loader._get_subpackage_search_paths(candidate_paths)
        self.assertEqual(subpackage_search_paths, ['/path/to/collections/test/collection'])

    def test_validate_final(self):
        self.loader._validate_final()

    def test_new_or_existing_module(self):
        with self.loader._new_or_existing_module('test_module') as module:
            self.assertEqual(module.__name__, 'test_module')

    def test_module_file_from_path(self):
        leaf_name = 'test_module'
        path = '/path/to/collections'
        module_path, has_code, package_path = self.loader._module_file_from_path(leaf_name, path)
        self.assertEqual(module_path, '/path/to/collections/test_module.py')
        self.assertTrue(has_code)
        self.assertEqual(package_path, None)

    def test_load_module(self):
        module = self.loader.load_module('ansible_collections.test.collection')
        self.assertEqual(module.__name__, 'ansible_collections.test.collection')
        self.assertEqual(module.__loader__, self.loader)
        self.assertEqual(module.__file__, '<ansible_synthetic_collection_package>')
        self.assertEqual(module.__package__, 'ansible_collections.test')

    def test_is_package(self):
        self.assertFalse(self.loader.is_package('ansible_collections.test.collection'))

    def test_get_source(self):
        source = self.loader.get_source('ansible_collections.test.collection')
        self.assertEqual(source, None)

    def test_get_data(self):
        data = self.loader.get_data('/path/to/collections/test/collection')
        self.assertEqual(data, None)

    def test_synthetic_filename(self):
        filename = self.loader._synthetic_filename('ansible_collections.test.collection')
        self.assertEqual(filename, '<ansible_synthetic_collection_package>')

    def test_get_filename(self):
        filename = self.loader.get_filename('ansible_collections.test.collection')
        self.assertEqual(filename, '<ansible_synthetic_collection_package>')

    def test_get_code(self):
        code = self.loader.get_code('ansible_collections.test.collection')
        self.assertEqual(code, None)

    def test_iter_modules(self):
        modules = list(self.loader.iter_modules('ansible_collections.test.collection'))
        self.assertEqual(modules, [])

    def test_repr(self):
        repr_str = self.loader.__repr__()
        self.assertEqual(repr_str, '_AnsibleCollectionPkgLoaderBase(path=None)')

if __name__ == '__main__':
    unittest.main()