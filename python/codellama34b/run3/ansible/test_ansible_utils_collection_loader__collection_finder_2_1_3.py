from ansible.utils.collection_loader import _AnsibleCollectionRootPkgLoader
import unittest
from ansible.utils.collection_loader._collection_finder import *



class Test_AnsibleCollectionRootPkgLoader(unittest.TestCase):
    def test_init(self):
        instance = _AnsibleCollectionRootPkgLoader()
        self.assertIsInstance(instance, _AnsibleCollectionRootPkgLoader)

    def test_validate_args(self):
        instance = _AnsibleCollectionRootPkgLoader()
        instance._validate_args()

    def test_get_filename(self):
        instance = _AnsibleCollectionRootPkgLoader()
        result = instance.get_filename('')
        self.assertEqual(result, '')

    def test_get_data(self):
        instance = _AnsibleCollectionRootPkgLoader()
        result = instance.get_data('')
        self.assertEqual(result, '')

    def test_is_package(self):
        instance = _AnsibleCollectionRootPkgLoader()
        result = instance.is_package('')
        self.assertEqual(result, '')

    def test_get_code(self):
        instance = _AnsibleCollectionRootPkgLoader()
        result = instance.get_code('')
        self.assertEqual(result, '')

    def test_get_source(self):
        instance = _AnsibleCollectionRootPkgLoader()
        result = instance.get_source('')
        self.assertEqual(result, '')

    def test_load_module(self):
        instance = _AnsibleCollectionRootPkgLoader()
        result = instance.load_module('')
        self.assertEqual(result, '')

    def test_exec_module(self):
        instance = _AnsibleCollectionRootPkgLoader()
        result = instance.exec_module('')
        self.assertEqual(result, '')

    def test_find_module(self):
        instance = _AnsibleCollectionRootPkgLoader()
        result = instance.find_module('')
        self.assertEqual(result, '')

    def test_find_loader(self):
        instance = _AnsibleCollectionRootPkgLoader()
        result = instance.find_loader('')
        self.assertEqual(result, '')

    def test_find_spec(self):
        instance = _AnsibleCollectionRootPkgLoader()
        result = instance.find_spec('')
        self.assertEqual(result, '')

    def test_create_module(self):
        instance = _AnsibleCollectionRootPkgLoader()
        result = instance.create_module('')
        self.assertEqual(result, '')

    def test_get_filename_full(self):
        instance = _AnsibleCollectionRootPkgLoader()
        result = instance.get_filename('')
        self.assertEqual(result, '')

    def test_get_data_full(self):
        instance = _AnsibleCollectionRootPkgLoader()
        result = instance.get_data('')
        self.assertEqual(result, '')

    def test_is_package_full(self):
        instance = _AnsibleCollectionRootPkgLoader()
        result = instance.is_package('')
        self.assertEqual(result, '')

    def test_get_code_full(self):
        instance = _AnsibleCollectionRootPkgLoader()
        result = instance.get_code('')
        self.assertEqual(result, '')

    def test_get_source_full(self):
        instance = _AnsibleCollectionRootPkgLoader()
        result = instance.get_source('')
        self.assertEqual(result, '')

    def test_load_module_full(self):
        instance = _AnsibleCollectionRootPkgLoader()
        result = instance.load_module('')
        self.assertEqual(result, '')

    def test_exec_module_full(self):
        instance = _AnsibleCollectionRootPkgLoader()
        result = instance.exec_module('')
        self.assertEqual(result, '')

    def test_find_module_full(self):
        instance = _AnsibleCollectionRootPkgLoader()
        result = instance.find_module('')
        self.assertEqual(result, '')

if __name__ == '__main__':
    unittest.main()