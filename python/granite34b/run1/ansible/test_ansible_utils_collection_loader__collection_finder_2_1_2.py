import unittest
from ansible.utils.collection_loader._collection_finder import AnsibleCollectionRef


class TestAnsibleCollectionPkgLoaderBase(unittest.TestCase):
    def test_validate_args(self):
        loader = _AnsibleCollectionPkgLoaderBase('ansible_collections.test')
        self.assertIsNone(loader._validate_args())

    def test_get_candidate_paths(self):
        loader = _AnsibleCollectionPkgLoaderBase('ansible_collections.test')
        path_list = ['/path/to/collections']
        candidate_paths = loader._get_candidate_paths(path_list)
        self.assertEqual(candidate_paths, ['/path/to/collections/test'])

    def test_get_subpackage_search_paths(self):
        loader = _AnsibleCollectionPkgLoaderBase('ansible_collections.test')
        candidate_paths = ['/path/to/collections/test']
        subpackage_search_paths = loader._get_subpackage_search_paths(candidate_paths)
        self.assertEqual(subpackage_search_paths, ['/path/to/collections/test'])

    def test_validate_final(self):
        loader = _AnsibleCollectionPkgLoaderBase('ansible_collections.test')
        self.assertIsNone(loader._validate_final())

    def test_new_or_existing_module(self):
        loader = _AnsibleCollectionPkgLoaderBase('ansible_collections.test')
        with loader._new_or_existing_module('test_module') as module:
            self.assertEqual(module.__name__, 'test_module')

    def test_module_file_from_path(self):
        loader = _AnsibleCollectionPkgLoaderBase('ansible_collections.test')
        leaf_name = 'test'
        path = '/path/to/collections'
        module_file = loader._module_file_from_path(leaf_name, path)
        self.assertEqual(module_file, ('/path/to/collections/test.py', True, None))

    def test_load_module(self):
        loader = _AnsibleCollectionPkgLoaderBase('ansible_collections.test')
        module = loader.load_module('ansible_collections.test')
        self.assertEqual(module.__name__, 'ansible_collections.test')

    def test_is_package(self):
        loader = _AnsibleCollectionPkgLoaderBase('ansible_collections.test')
        self.assertFalse(loader.is_package('ansible_collections.test'))

    def test_get_source(self):
        loader = _AnsibleCollectionPkgLoaderBase('ansible_collections.test')
        self.assertIsNone(loader.get_source('ansible_collections.test'))

    def test_get_data(self):
        loader = _AnsibleCollectionPkgLoaderBase('ansible_collections.test')
        path = '/path/to/collections/test.py'
        data = loader.get_data(path)
        self.assertIsNotNone(data)

    def test_synthetic_filename(self):
        loader = _AnsibleCollectionPkgLoaderBase('ansible_collections.test')
        filename = loader._synthetic_filename('ansible_collections.test')
        self.assertEqual(filename, '<ansible_synthetic_collection_package>')

    def test_get_filename(self):
        loader = _AnsibleCollectionPkgLoaderBase('ansible_collections.test')
        filename = loader.get_filename('ansible_collections.test')
        self.assertEqual(filename, '<ansible_synthetic_collection_package>')

    def test_get_code(self):
        loader = _AnsibleCollectionPkgLoaderBase('ansible_collections.test')
        code = loader.get_code('ansible_collections.test')
        self.assertIsNotNone(code)

    def test_iter_modules(self):
        loader = _AnsibleCollectionPkgLoaderBase('ansible_collections.test')
        prefix = 'test'
        modules = list(loader.iter_modules(prefix))
        self.assertGreater(len(modules), 0)

    def test_repr(self):
        loader = _AnsibleCollectionPkgLoaderBase('ansible_collections.test')
        self.assertEqual(repr(loader), '_AnsibleCollectionPkgLoaderBase(path=None)')

if __name__ == '__main__':
    unittest.main()