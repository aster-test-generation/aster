import unittest
from ansible.utils.collection_loader._collection_finder import AnsibleCollectionRef


class TestAnsibleCollectionPkgLoaderBase(unittest.TestCase):
    def test_validate_args(self):
        loader = _AnsibleCollectionPkgLoaderBase('ansible_collections.test.collection')
        self.assertIsNone(loader._validate_args())

    def test_get_candidate_paths(self):
        loader = _AnsibleCollectionPkgLoaderBase('ansible_collections.test.collection')
        paths = loader._get_candidate_paths(['/path/to/collections'])
        self.assertEqual(paths, ['/path/to/collections/test'])

    def test_get_subpackage_search_paths(self):
        loader = _AnsibleCollectionPkgLoaderBase('ansible_collections.test.collection')
        paths = loader._get_subpackage_search_paths(['/path/to/collections/test'])
        self.assertEqual(paths, ['/path/to/collections/test'])

    def test_validate_final(self):
        loader = _AnsibleCollectionPkgLoaderBase('ansible_collections.test.collection')
        self.assertIsNone(loader._validate_final())

    def test_new_or_existing_module(self):
        with _AnsibleCollectionPkgLoaderBase._new_or_existing_module('test_module') as module:
            self.assertEqual(module.__name__, 'test_module')

    def test_module_file_from_path(self):
        path, has_code, package_path = _AnsibleCollectionPkgLoaderBase._module_file_from_path('test_module', '/path/to/collections')
        self.assertEqual(path, '/path/to/collections/test_module.py')
        self.assertTrue(has_code)
        self.assertIsNone(package_path)

    def test_load_module(self):
        loader = _AnsibleCollectionPkgLoaderBase('ansible_collections.test.collection')
        module = loader.load_module('ansible_collections.test.collection')
        self.assertEqual(module.__name__, 'ansible_collections.test.collection')

    def test_is_package(self):
        loader = _AnsibleCollectionPkgLoaderBase('ansible_collections.test.collection')
        self.assertFalse(loader.is_package('ansible_collections.test.collection'))

    def test_get_source(self):
        loader = _AnsibleCollectionPkgLoaderBase('ansible_collections.test.collection')
        source = loader.get_source('ansible_collections.test.collection')
        self.assertIsNone(source)

    def test_get_data(self):
        loader = _AnsibleCollectionPkgLoaderBase('ansible_collections.test.collection')
        data = loader.get_data('/path/to/collections/test_module.py')
        self.assertEqual(data, b'example data')

    def test_synthetic_filename(self):
        loader = _AnsibleCollectionPkgLoaderBase('ansible_collections.test.collection')
        filename = loader._synthetic_filename('ansible_collections.test.collection')
        self.assertEqual(filename, '<ansible_synthetic_collection_package>')

    def test_get_filename(self):
        loader = _AnsibleCollectionPkgLoaderBase('ansible_collections.test.collection')
        filename = loader.get_filename('ansible_collections.test.collection')
        self.assertEqual(filename, '<ansible_synthetic_collection_package>')

    def test_get_code(self):
        loader = _AnsibleCollectionPkgLoaderBase('ansible_collections.test.collection')
        code = loader.get_code('ansible_collections.test.collection')
        self.assertEqual(code.co_code, b'example code')

    def test_iter_modules(self):
        loader = _AnsibleCollectionPkgLoaderBase('ansible_collections.test.collection')
        modules = list(loader.iter_modules('ansible_collections.test.collection'))
        self.assertEqual(modules, [])

    def test_repr(self):
        loader = _AnsibleCollectionPkgLoaderBase('ansible_collections.test.collection')
        repr_str = loader.__repr__()
        self.assertEqual(repr_str, '_AnsibleCollectionPkgLoaderBase(path=None)')

if __name__ == '__main__':
    unittest.main()