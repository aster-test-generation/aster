from ansible.utils.collection_loader import _AnsibleCollectionNSPkgLoader
import unittest
from ansible.utils.collection_loader._collection_finder import *



class Test_AnsibleCollectionNSPkgLoader(unittest.TestCase):
    def test___init__(self):
        instance = _AnsibleCollectionNSPkgLoader()
        self.assertIsInstance(instance, _AnsibleCollectionNSPkgLoader)

    def test__validate_args(self):
        instance = _AnsibleCollectionNSPkgLoader()
        instance._validate_args()

    def test__validate_final(self):
        instance = _AnsibleCollectionNSPkgLoader()
        instance._validate_final()

    def test_find_module(self):
        instance = _AnsibleCollectionNSPkgLoader()
        result = instance.find_module('test')
        self.assertEqual(result, None)

    def test_load_module(self):
        instance = _AnsibleCollectionNSPkgLoader()
        result = instance.load_module('test')
        self.assertEqual(result, None)

    def test_get_filename(self):
        instance = _AnsibleCollectionNSPkgLoader()
        result = instance.get_filename('test')
        self.assertEqual(result, None)

    def test_is_package(self):
        instance = _AnsibleCollectionNSPkgLoader()
        result = instance.is_package('test')
        self.assertEqual(result, None)

    def test_get_data(self):
        instance = _AnsibleCollectionNSPkgLoader()
        result = instance.get_data('test')
        self.assertEqual(result, None)

    def test_get_code(self):
        instance = _AnsibleCollectionNSPkgLoader()
        result = instance.get_code('test')
        self.assertEqual(result, None)

    def test_get_source(self):
        instance = _AnsibleCollectionNSPkgLoader()
        result = instance.get_source('test')
        self.assertEqual(result, None)

    def test_exec_module(self):
        instance = _AnsibleCollectionNSPkgLoader()
        result = instance.exec_module('test')
        self.assertEqual(result, None)

    def test_load_module_from_path(self):
        instance = _AnsibleCollectionNSPkgLoader()
        result = instance.load_module_from_path('test')
        self.assertEqual(result, None)

    def test_load_module_from_path_in_sys_modules(self):
        instance = _AnsibleCollectionNSPkgLoader()
        result = instance.load_module_from_path_in_sys_modules('test')
        self.assertEqual(result, None)

    def test_load_module_from_path_in_sys_modules_if_modified_since(self):
        instance = _AnsibleCollectionNSPkgLoader()
        result = instance.load_module_from_path_in_sys_modules_if_modified_since('test')
        self.assertEqual(result, None)

    def test_load_module_from_path_in_sys_modules_optimized(self):
        instance = _AnsibleCollectionNSPkgLoader()
        result = instance.load_module_from_path_in_sys_modules_optimized('test')
        self.assertEqual(result, None)

    def test_load_module_from_path_in_sys_modules_optimized_if_modified_since(self):
        instance = _AnsibleCollectionNSPkgLoader()
        result = instance.load_module_from_path_in_sys_modules_optimized_if_modified_since('test')
        self.assertEqual(result, None)

    def test_load_module_from_path_in_sys_modules_optimized_in_parent(self):
        instance = _AnsibleCollectionNSPkgLoader()
        result = instance.load_module_from_path_in_sys_modules_optimized_in_parent('test')
        self.assertEqual(result, None)

if __name__ == '__main__':
    unittest.main()