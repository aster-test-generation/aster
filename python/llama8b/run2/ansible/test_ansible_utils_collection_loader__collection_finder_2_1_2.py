import unittest
from ansible.utils.collection_loader.collection_finder import AnsibleCollectionRe


class TestAnsibleCollectionPkgLoaderBase(unittest.TestCase):
    def test_init(self):
        loader = _AnsibleCollectionPkgLoaderBase('ansible_collections.collection_name.module_name', ['path1', 'path2'])
        self.assertEqual(loader._fullname, 'ansible_collections.collection_name.module_name')
        self.assertEqual(loader._redirect_module, None)
        self.assertEqual(loader._split_name, ['ansible_collections', 'collection_name', 'module_name'])
        self.assertEqual(loader._rpart_name, ('ansible_collections', 'collection_name', 'module_name'))
        self.assertEqual(loader._parent_package_name, 'ansible_collections.collection_name')
        self.assertEqual(loader._package_to_load, 'module_name')
        self.assertEqual(loader._source_code_path, None)
        self.assertEqual(loader._decoded_source, None)
        self.assertEqual(loader._compiled_code, None)
        self.assertEqual(loader._candidate_paths, ['path1/module_name', 'path2/module_name'])
        self.assertEqual(loader._subpackage_search_paths, ['path1/module_name', 'path2/module_name'])

    def test_validate_args(self):
        loader = _AnsibleCollectionPkgLoaderBase('ansible_collections.collection_name.module_name', ['path1', 'path2'])
        with self.assertRaises(ImportError):
            loader._validate_args()

    def test_get_candidate_paths(self):
        loader = _AnsibleCollectionPkgLoaderBase('ansible_collections.collection_name.module_name', ['path1', 'path2'])
        self.assertEqual(loader._get_candidate_paths(['path1', 'path2']), ['path1/module_name', 'path2/module_name'])

    def test_get_subpackage_search_paths(self):
        loader = _AnsibleCollectionPkgLoaderBase('ansible_collections.collection_name.module_name', ['path1', 'path2'])
        self.assertEqual(loader._get_subpackage_search_paths(['path1/module_name', 'path2/module_name']), ['path1/module_name', 'path2/module_name'])

    def test_validate_final(self):
        loader = _AnsibleCollectionPkgLoaderBase('ansible_collections.collection_name.module_name', ['path1', 'path2'])
        loader._validate_final()

    def test_new_or_existing_module(self):
        with self._new_or_existing_module('module_name', x=1) as module:
            self.assertEqual(module.x, 1)

    def test_module_file_from_path(self):
        loader = _AnsibleCollectionPkgLoaderBase('ansible_collections.collection_name.module_name', ['path1', 'path2'])
        leaf_name = 'module_name'
        path = 'path1'
        module_path, has_code, package_path = loader._module_file_from_path(leaf_name, path)
        self.assertEqual(module_path, os.path.join(path, leaf_name + '.py'))
        self.assertTrue(has_code)

    def test_load_module(self):
        loader = _AnsibleCollectionPkgLoaderBase('ansible_collections.collection_name.module_name', ['path1', 'path2'])
        module = loader.load_module('ansible_collections.collection_name.module_name')
        self.assertEqual(module.__loader__, loader)
        self.assertEqual(module.__file__, loader.get_filename('ansible_collections.collection_name.module_name'))
        self.assertEqual(module.__package__, 'ansible_collections.collection_name')

    def test_is_package(self):
        loader = _AnsibleCollectionPkgLoaderBase('ansible_collections.collection_name.module_name', ['path1', 'path2'])
        self.assertTrue(loader.is_package('ansible_collections.collection_name.module_name'))

    def test_get_source(self):
        loader = _AnsibleCollectionPkgLoaderBase('ansible_collections.collection_name.module_name', ['path1', 'path2'])
        source = loader.get_source('ansible_collections.collection_name.module_name')
        self.assertEqual(source, loader.get_data(loader._source_code_path))

    def test_get_data(self):
        loader = _AnsibleCollectionPkgLoaderBase('ansible_collections.collection_name.module_name', ['path1', 'path2'])
        path = 'path1/module_name.py'
        data = loader.get_data(path)
        self.assertEqual(data, open(path, 'rb').read())

    def test_synthetic_filename(self):
        loader = _AnsibleCollectionPkgLoaderBase('ansible_collections.collection_name.module_name', ['path1', 'path2'])
        self.assertEqual(loader._synthetic_filename('ansible_collections.collection_name.module_name'), '<ansible_synthetic_collection_package>')

    def test_get_filename(self):
        loader = _AnsibleCollectionPkgLoaderBase('ansible_collections.collection_name.module_name', ['path1', 'path2'])
        filename = loader.get_filename('ansible_collections.collection_name.module_name')
        self.assertEqual(filename, loader._source_code_path)

if __name__ == '__main__':
    unittest.main()