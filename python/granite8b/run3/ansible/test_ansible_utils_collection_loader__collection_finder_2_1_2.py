import unittest
from ansible.utils.collection_loader import AnsibleCollectionRef



class TestAnsibleCollectionPkgLoaderBase(unittest.TestCase):
    def test_init(self):
        instance = _AnsibleCollectionPkgLoaderBase('ansible_collections.test.test')
        self.assertEqual(instance._fullname, 'ansible_collections.test.test')
        self.assertEqual(instance._split_name, ['ansible_collections', 'test', 'test'])
        self.assertEqual(instance._rpart_name, ('ansible_collections', 'test', 'test'))
        self.assertEqual(instance._parent_package_name, 'ansible_collections.test')
        self.assertEqual(instance._package_to_load, 'test')
        self.assertIsNone(instance._source_code_path)
        self.assertIsNone(instance._decoded_source)
        self.assertIsNone(instance._compiled_code)
        self.assertIsNone(instance._candidate_paths)
        self.assertIsNone(instance._subpackage_search_paths)

    def test__validate_args(self):
        instance = _AnsibleCollectionPkgLoaderBase('ansible_collections.test.test')
        with self.assertRaises(ImportError):
            instance._validate_args()

    def test__get_candidate_paths(self):
        instance = _AnsibleCollectionPkgLoaderBase('ansible_collections.test.test', ['/path/to/collections'])
        candidate_paths = instance._get_candidate_paths(['/path/to/collections'])
        self.assertEqual(candidate_paths, ['/path/to/collections/test'])

    def test__get_subpackage_search_paths(self):
        instance = _AnsibleCollectionPkgLoaderBase('ansible_collections.test.test', ['/path/to/collections'])
        subpackage_search_paths = instance._get_subpackage_search_paths(['/path/to/collections/test'])
        self.assertEqual(subpackage_search_paths, ['/path/to/collections/test'])

    def test__validate_final(self):
        instance = _AnsibleCollectionPkgLoaderBase('ansible_collections.test.test')
        instance._validate_final()

    def test__module_file_from_path(self):
        instance = _AnsibleCollectionPkgLoaderBase('ansible_collections.test.test')
        module_path, has_code, package_path = instance._module_file_from_path('test', '/path/to/collections/test')
        self.assertEqual(module_path, '/path/to/collections/test/__init__.py')
        self.assertTrue(has_code)
        self.assertEqual(package_path, '/path/to/collections/test')

    def test_load_module(self):
        instance = _AnsibleCollectionPkgLoaderBase('ansible_collections.test.test')
        with self.assertRaises(ImportError):
            instance.load_module('ansible_collections.test.test')

    def test_is_package(self):
        instance = _AnsibleCollectionPkgLoaderBase('ansible_collections.test.test')
        self.assertFalse(instance.is_package('ansible_collections.test.test'))

    def test_get_source(self):
        instance = _AnsibleCollectionPkgLoaderBase('ansible_collections.test.test')
        self.assertIsNone(instance.get_source('ansible_collections.test.test'))

    def test_get_data(self):
        instance = _AnsibleCollectionPkgLoaderBase('ansible_collections.test.test')
        self.assertIsNone(instance.get_data('/path/to/collections/test'))

    def test__synthetic_filename(self):
        instance = _AnsibleCollectionPkgLoaderBase('ansible_collections.test.test')
        filename = instance._synthetic_filename('ansible_collections.test.test')
        self.assertEqual(filename, '<ansible_synthetic_collection_package>')

    def test_get_filename(self):
        instance = _AnsibleCollectionPkgLoaderBase('ansible_collections.test.test')
        filename = instance.get_filename('ansible_collections.test.test')
        self.assertEqual(filename, '/path/to/collections/test/__synthetic__')

    def test_get_code(self):
        instance = _AnsibleCollectionPkgLoaderBase('ansible_collections.test.test')
        self.assertIsNone(instance.get_code('ansible_collections.test.test'))

if __name__ == '__main__':
    unittest.main()