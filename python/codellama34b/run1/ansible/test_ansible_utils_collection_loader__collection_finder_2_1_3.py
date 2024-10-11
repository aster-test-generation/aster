import unittest
from ansible.utils.collection_loader import _AnsibleCollectionPkgLoaderBase



class Test_AnsibleCollectionRootPkgLoader(unittest.TestCase):
    def test_init(self):
        instance = _collection_finder._AnsibleCollectionRootPkgLoader()
        self.assertIsInstance(instance, _collection_finder._AnsibleCollectionRootPkgLoader)

    def test_validate_args(self):
        instance = _collection_finder._AnsibleCollectionRootPkgLoader()
        self.assertRaises(ImportError, instance._validate_args)

    def test_get_filename(self):
        instance = _collection_finder._AnsibleCollectionRootPkgLoader()
        self.assertRaises(ImportError, instance.get_filename, 'test')

    def test_get_data(self):
        instance = _collection_finder._AnsibleCollectionRootPkgLoader()
        self.assertRaises(ImportError, instance.get_data, 'test')

    def test_get_code(self):
        instance = _collection_finder._AnsibleCollectionRootPkgLoader()
        self.assertRaises(ImportError, instance.get_code, 'test')

    def test_is_package(self):
        instance = _collection_finder._AnsibleCollectionRootPkgLoader()
        self.assertRaises(ImportError, instance.is_package, 'test')

    def test_get_source(self):
        instance = _collection_finder._AnsibleCollectionRootPkgLoader()
        self.assertRaises(ImportError, instance.get_source, 'test')

    def test_get_filename_2(self):
        instance = _collection_finder._AnsibleCollectionRootPkgLoader()
        self.assertRaises(ImportError, instance.get_filename, 'test')

    def test_get_data_2(self):
        instance = _collection_finder._AnsibleCollectionRootPkgLoader()
        self.assertRaises(ImportError, instance.get_data, 'test')

    def test_get_code_2(self):
        instance = _collection_finder._AnsibleCollectionRootPkgLoader()
        self.assertRaises(ImportError, instance.get_code, 'test')

    def test_is_package_2(self):
        instance = _collection_finder._AnsibleCollectionRootPkgLoader()
        self.assertRaises(ImportError, instance.is_package, 'test')

    def test_get_source_2(self):
        instance = _collection_finder._AnsibleCollectionRootPkgLoader()
        self.assertRaises(ImportError, instance.get_source, 'test')

    def test_get_filename_3(self):
        instance = _collection_finder._AnsibleCollectionRootPkgLoader()
        self.assertRaises(ImportError, instance.get_filename, 'test')

    def test_get_data_3(self):
        instance = _collection_finder._AnsibleCollectionRootPkgLoader()
        self.assertRaises(ImportError, instance.get_data, 'test')

    def test_get_code_3(self):
        instance = _collection_finder._AnsibleCollectionRootPkgLoader()
        self.assertRaises(ImportError, instance.get_code, 'test')

    def test_is_package_3(self):
        instance = _collection_finder._AnsibleCollectionRootPkgLoader()
        self.assertRaises(ImportError, instance.is_package, 'test')

    def test_get_source_3(self):
        instance = _collection_finder._AnsibleCollectionRootPkgLoader()
        self.assertRaises(ImportError, instance.get_source, 'test')

    def test_get_filename_4(self):
        instance = _collection_finder._AnsibleCollectionRootPkgLoader()
        self.assertRaises(ImportError, instance.get_filename, 'test')

if __name__ == '__main__':
    unittest.main()