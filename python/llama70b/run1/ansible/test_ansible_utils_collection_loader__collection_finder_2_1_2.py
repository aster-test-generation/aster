import unittest
from ansible.utils.collection_loader import collection_loade
from ansible.utils.collection_loader._collection_finder import _AnsibleCollectionPkgLoaderBase


class TestAnsibleCollectionPkgLoaderBase(unittest.TestCase):
    def test_init(self):
        instance = _AnsibleCollectionPkgLoaderBase('ansible_collections.test', ['path/to/test'])
        self.assertEqual(instance._fullname, 'ansible_collections.test')
        self.assertEqual(instance._split_name, ['ansible_collections', 'test'])
        self.assertEqual(instance._rpart_name, ('ansible_collections', '.', 'test'))
        self.assertEqual(instance._parent_package_name, 'ansible_collections')
        self.assertEqual(instance._package_to_load, 'test')
        self.assertIsNone(instance._source_code_path)
        self.assertIsNone(instance._decoded_source)
        self.assertIsNone(instance._compiled_code)

    def test_validate_args(self):
        instance = _AnsibleCollectionPkgLoaderBase('ansible_collections.test', ['path/to/test'])
        instance._validate_args()  # should not raise an exception
        with self.assertRaises(ImportError):
            instance = _AnsibleCollectionPkgLoaderBase('not_ansible_collections.test', ['path/to/test'])
            instance._validate_args()

    def test_get_candidate_paths(self):
        instance = _AnsibleCollectionPkgLoaderBase('ansible_collections.test', ['path/to/test'])
        result = instance._get_candidate_paths(['path/to/test'])
        self.assertEqual(result, [os.path.join('path/to/test', 'test')])

    def test_get_subpackage_search_paths(self):
        instance = _AnsibleCollectionPkgLoaderBase('ansible_collections.test', ['path/to/test'])
        result = instance._get_subpackage_search_paths([os.path.join('path/to/test', 'test')])
        self.assertEqual(result, [os.path.join('path/to/test', 'test')])

    def test_validate_final(self):
        instance = _AnsibleCollectionPkgLoaderBase('ansible_collections.test', ['path/to/test'])
        result = instance._validate_final()
        self.assertIsNone(result)

    def test_new_or_existing_module(self):
        instance = _AnsibleCollectionPkgLoaderBase('ansible_collections.test', ['path/to/test'])
        with instance._new_or_existing_module('test_module', foo='bar') as module:
            self.assertIsInstance(module, ModuleType)
            self.assertEqual(module.__name__, 'test_module')
            self.assertEqual(module.foo, 'bar')

    def test_module_file_from_path(self):
        instance = _AnsibleCollectionPkgLoaderBase('ansible_collections.test', ['path/to/test'])
        result = instance._module_file_from_path('test_module', 'path/to/test')
        self.assertEqual(result, (os.path.join('path/to/test', 'test_module.py'), True, None))

    def test_load_module(self):
        instance = _AnsibleCollectionPkgLoaderBase('ansible_collections.test', ['path/to/test'])
        module = instance.load_module('ansible_collections.test')
        self.assertIsInstance(module, ModuleType)
        self.assertEqual(module.__loader__, instance)
        self.assertEqual(module.__file__, instance.get_filename('ansible_collections.test'))
        self.assertEqual(module.__package__, 'ansible_collections')

    def test_is_package(self):
        instance = _AnsibleCollectionPkgLoaderBase('ansible_collections.test', ['path/to/test'])
        self.assertTrue(instance.is_package('ansible_collections.test'))
        with self.assertRaises(ValueError):
            instance.is_package('not_ansible_collections.test')

    def test_get_source(self):
        instance = _AnsibleCollectionPkgLoaderBase('ansible_collections.test', ['path/to/test'])
        result = instance.get_source('ansible_collections.test')
        self.assertIsNone(result)
        instance._source_code_path = 'path/to/test.py'
        result = instance.get_source('ansible_collections.test')
        self.assertIsNotNone(result)

    def test_get_data(self):
        instance = _AnsibleCollectionPkgLoaderBase('ansible_collections.test', ['path/to/test'])
        result = instance.get_data('/path/to/test.py')
        self.assertIsNotNone(result)
        with self.assertRaises(ValueError):
            instance.get_data('')

    def test_synthetic_filename(self):
        instance = _AnsibleCollectionPkgLoaderBase('ansible_collections.test', ['path/to/test'])
        result = instance._synthetic_filename('ansible_collections.test')
        self.assertEqual(result, '<ansible_synthetic_collection_package>')

    def test_get_filename(self):
        instance = _AnsibleCollectionPkgLoaderBase('ansible_collections.test', ['path/to/test'])
        result = instance.get_filename('ansible_collections.test')
        self.assertIsNone(result)
        instance._source_code_path = 'path/to/test.py'
        result = instance.get_filename('ansible_collections.test')
        self.assertEqual(result, 'path/to/test.py')

if __name__ == '__main__':
    unittest.main()