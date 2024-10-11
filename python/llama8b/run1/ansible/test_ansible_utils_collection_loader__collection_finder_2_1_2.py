import unittest
from ansible.utils.collection_loader import CollectionLoaderBas


class TestAnsibleCollectionPkgLoaderBase(unittest.TestCase):
    def test_init(self):
        loader = _AnsibleCollectionPkgLoaderBase('ansible_collections.collection_name')
        self.assertEqual(loader._fullname, 'ansible_collections.collection_name')
        self.assertIsNone(loader._redirect_module)
        self.assertEqual(loader._split_name, ['ansible_collections', 'collection_name'])
        self.assertEqual(loader._rpart_name, ('ansible_collections', 'collection_name', ''))
        self.assertEqual(loader._parent_package_name, 'ansible_collections.collection_name')
        self.assertEqual(loader._package_to_load, '')
        self.assertIsNone(loader._source_code_path)
        self.assertIsNone(loader._decoded_source)
        self.assertIsNone(loader._compiled_code)
        self.assertEqual(loader._candidate_paths, [])
        self.assertEqual(loader._subpackage_search_paths, [])

    def test_validate_args(self):
        loader = _AnsibleCollectionPkgLoaderBase('ansible_collections.collection_name')
        loader._validate_args()
        self.assertEqual(loader._split_name[0], 'ansible_collections')

    def test_get_candidate_paths(self):
        loader = _AnsibleCollectionPkgLoaderBase('ansible_collections.collection_name')
        path_list = ['/path1', '/path2']
        candidate_paths = loader._get_candidate_paths(path_list)
        self.assertEqual(candidate_paths, ['/path1/ansible_collections/collection_name', '/path2/ansible_collections/collection_name'])

    def test_get_subpackage_search_paths(self):
        loader = _AnsibleCollectionPkgLoaderBase('ansible_collections.collection_name')
        candidate_paths = ['/path1/ansible_collections/collection_name', '/path2/ansible_collections/collection_name']
        subpackage_search_paths = loader._get_subpackage_search_paths(candidate_paths)
        self.assertEqual(subpackage_search_paths, ['/path1/ansible_collections/collection_name', '/path2/ansible_collections/collection_name'])

    def test_validate_final(self):
        loader = _AnsibleCollectionPkgLoaderBase('ansible_collections.collection_name')
        loader._validate_final()
        self.assertEqual(loader._subpackage_search_paths, [])

    def test_new_or_existing_module(self):
        name = 'ansible_collections.collection_name'
        with _AnsibleCollectionPkgLoaderBase._new_or_existing_module(name) as module:
            self.assertEqual(module.__name__, name)

    def test_module_file_from_path(self):
        leaf_name = 'collection_name'
        path = '/path'
        module_path, has_code, package_path = _AnsibleCollectionPkgLoaderBase._module_file_from_path(leaf_name, path)
        self.assertEqual(module_path, os.path.join(path, leaf_name + '.py'))
        self.assertTrue(has_code)

    def test_load_module(self):
        loader = _AnsibleCollectionPkgLoaderBase('ansible_collections.collection_name')
        module = loader.load_module('ansible_collections.collection_name')
        self.assertEqual(module.__name__, 'ansible_collections.collection_name')

    def test_is_package(self):
        loader = _AnsibleCollectionPkgLoaderBase('ansible_collections.collection_name')
        self.assertTrue(loader.is_package('ansible_collections.collection_name'))

    def test_get_source(self):
        loader = _AnsibleCollectionPkgLoaderBase('ansible_collections.collection_name')
        source = loader.get_source('ansible_collections.collection_name')
        self.assertIsNone(source)

    def test_get_data(self):
        path = '/path'
        data = _AnsibleCollectionPkgLoaderBase.get_data(path)
        self.assertIsNone(data)

    def test_synthetic_filename(self):
        loader = _AnsibleCollectionPkgLoaderBase('ansible_collections.collection_name')
        filename = loader._synthetic_filename('ansible_collections.collection_name')
        self.assertEqual(filename, '<ansible_synthetic_collection_package>')

    def test_get_filename(self):
        loader = _AnsibleCollectionPkgLoaderBase('ansible_collections.collection_name')
        filename = loader.get_filename('ansible_collections.collection_name')
        self.assertEqual(filename, '')

    def test_get_code(self):
        loader = _AnsibleCollectionPkgLoaderBase('ansible_collections.collection_name')
        code = loader.get_code('ansible_collections.collection_name')
        self.assertIsNone(code)

    def test_iter_modules(self):
        loader = _AnsibleCollectionPkgLoaderBase('ansible_collections.collection_name')
        modules = list(loader.iter_modules('prefix'))
        self.assertEqual(modules, [])

    def test_repr(self):
        loader = _AnsibleCollectionPkgLoaderBase('ansible_collections.collection_name')
        repr_loader = repr(loader)
        self.assertEqual(repr_loader, '_AnsibleCollectionPkgLoaderBase(path=/path)')

if __name__ == '__main__':
    unittest.main()