import unittest
from ansible.utils.collection_loader import _AnsibleCollectionPkgLoaderBase
from ansible.utils.collection_loader._collection_finder import _AnsibleCollectionPkgLoader
from ansible.utils.collection_loader._collection_finder import _VALID_IDENTIFIER_STRING_REGEX
from ansible.utils.collection_loader._collection_finder import PB_EXTENSIONS



class Test_AnsibleCollectionPkgLoader(unittest.TestCase):
    def test_init(self):
        instance = _AnsibleCollectionPkgLoader()
        self.assertIsInstance(instance, _AnsibleCollectionPkgLoader)

    def test_validate_args(self):
        instance = _AnsibleCollectionPkgLoader()
        instance._validate_args()

    def test_validate_final(self):
        instance = _AnsibleCollectionPkgLoader()
        instance._validate_final()

    def test_load_module(self):
        instance = _AnsibleCollectionPkgLoader()
        instance.load_module()

    def test_canonicalize_meta(self):
        instance = _AnsibleCollectionPkgLoader()
        instance._canonicalize_meta()

class Test_collection_finder(unittest.TestCase):
    def test_init(self):
        instance = _collection_finder()
        self.assertIsInstance(instance, _collection_finder)

    def test_find_module(self):
        instance = _collection_finder()
        instance.find_module()

    def test_invalidate_caches(self):
        instance = _collection_finder()
        instance.invalidate_caches()

    def test_get_data(self):
        instance = _collection_finder()
        instance.get_data()

    def test_get_code(self):
        instance = _collection_finder()
        instance.get_code()

    def test_get_filename(self):
        instance = _collection_finder()
        instance.get_filename()

    def test_get_filename_last_modified(self):
        instance = _collection_finder()
        instance.get_filename_last_modified()

    def test_get_filename_list(self):
        instance = _collection_finder()
        instance.get_filename_list()

    def test_get_source(self):
        instance = _collection_finder()
        instance.get_source()

    def test_is_package(self):
        instance = _collection_finder()
        instance.is_package()

    def test_iter_modules(self):
        instance = _collection_finder()
        instance.iter_modules()

    def test_load_module(self):
        instance = _collection_finder()
        instance.load_module()

    def test_get_loader(self):
        instance = _collection_finder()
        instance.get_loader()

    def test_get_loader_details(self):
        instance = _collection_finder()
        instance.get_loader_details()

    def test_get_package_details(self):
        instance = _collection_finder()
        instance.get_package_details()

    def test_get_data_filename(self):
        instance = _collection_finder()
        instance.get_data_filename()

    def test_get_data_filename_last_modified(self):
        instance = _collection_finder()
        instance.get_data_filename_last_modified()

    def test_get_data_filename_list(self):
        instance = _collection_finder()
        instance.get_data_filename_list()

    def test_get_data_source(self):
        instance = _collection_finder()
        instance.get_data_source()

    def test_get_data_source_last_modified(self):
        instance = _collection_finder()
        instance.get_data_source_last_modified()

    def test_get_data_source_size(self):
        instance = _collection_finder()
        instance.get_data_source_size()

if __name__ == '__main__':
    unittest.main()