from ansible.utils.collection_loader import _AnsibleCollectionNSPkgLoader
import unittest
from ansible.utils.collection_loader._collection_finder import *



class Test_AnsibleCollectionNSPkgLoader(unittest.TestCase):
    def test_init(self):
        instance = _AnsibleCollectionNSPkgLoader()
        self.assertIsInstance(instance, _AnsibleCollectionNSPkgLoader)

    def test_validate_args(self):
        instance = _AnsibleCollectionNSPkgLoader()
        instance._validate_args()

    def test_validate_final(self):
        instance = _AnsibleCollectionNSPkgLoader()
        instance._validate_final()

    def test_get_filename(self):
        instance = _AnsibleCollectionNSPkgLoader()
        result = instance.get_filename('test')
        self.assertEqual(result, 'test')

    def test_get_data(self):
        instance = _AnsibleCollectionNSPkgLoader()
        result = instance.get_data('test')
        self.assertEqual(result, 'test')

    def test_is_package(self):
        instance = _AnsibleCollectionNSPkgLoader()
        result = instance.is_package('test')
        self.assertEqual(result, 'test')

    def test_get_code(self):
        instance = _AnsibleCollectionNSPkgLoader()
        result = instance.get_code('test')
        self.assertEqual(result, 'test')

    def test_get_source(self):
        instance = _AnsibleCollectionNSPkgLoader()
        result = instance.get_source('test')
        self.assertEqual(result, 'test')

    def test_exec_module(self):
        instance = _AnsibleCollectionNSPkgLoader()
        result = instance.exec_module('test')
        self.assertEqual(result, 'test')

    def test_load_module(self):
        instance = _AnsibleCollectionNSPkgLoader()
        result = instance.load_module('test')
        self.assertEqual(result, 'test')

    def test_module_repr(self):
        instance = _AnsibleCollectionNSPkgLoader()
        result = instance.module_repr('test')
        self.assertEqual(result, 'test')

    def test_get_package_path(self):
        instance = _AnsibleCollectionNSPkgLoader()
        result = instance.get_package_path('test')
        self.assertEqual(result, 'test')

    def test_get_package_paths(self):
        instance = _AnsibleCollectionNSPkgLoader()
        result = instance.get_package_paths('test')
        self.assertEqual(result, 'test')

    def test_get_submodule_search_locations(self):
        instance = _AnsibleCollectionNSPkgLoader()
        result = instance.get_submodule_search_locations('test')
        self.assertEqual(result, 'test')

    def test_find_module(self):
        instance = _AnsibleCollectionNSPkgLoader()
        result = instance.find_module('test')
        self.assertEqual(result, 'test')

    def test_find_loader(self):
        instance = _AnsibleCollectionNSPkgLoader()
        result = instance.find_loader('test')
        self.assertEqual(result, 'test')

    def test_find_spec(self):
        instance = _AnsibleCollectionNSPkgLoader()
        result = instance.find_spec('test')
        self.assertEqual(result, 'test')

    def test_invalidate_caches(self):
        instance = _AnsibleCollectionNSPkgLoader()
        result = instance.invalidate_caches('test')
        self.assertEqual(result, 'test')

    def test_create_module(self):
        instance = _AnsibleCollectionNSPkgLoader()
        result = instance.create_module('test')
        self.assertEqual(result, 'test')

    def test_get_filename_2(self):
        instance = _AnsibleCollectionNSPkgLoader()
        result = instance.get_filename('test')
        self.assertEqual(result, 'test')

if __name__ == '__main__':
    unittest.main()