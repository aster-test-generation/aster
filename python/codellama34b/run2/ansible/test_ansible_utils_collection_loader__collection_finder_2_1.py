import unittest
from ansible.utils.collection_loader import AnsibleCollectionRef



class Test_AnsibleInternalRedirectLoader(unittest.TestCase):
    def test_init(self):
        instance = _AnsibleInternalRedirectLoader('ansible.builtin', ['path_list'])
        self.assertEqual(instance._redirect, None)

    def test_load_module(self):
        instance = _AnsibleInternalRedirectLoader('ansible.builtin', ['path_list'])
        result = instance.load_module('ansible.builtin')
        self.assertEqual(result, None)

class Test_collection_finder(unittest.TestCase):
    def test_init(self):
        instance = _collection_finder()
        self.assertEqual(instance.path, None)

    def test_find_module(self):
        instance = _collection_finder()
        result = instance.find_module('ansible.builtin', ['path_list'])
        self.assertEqual(result, None)

    def test_load_module(self):
        instance = _collection_finder()
        result = instance.load_module('ansible.builtin')
        self.assertEqual(result, None)

    def test_get_data(self):
        instance = _collection_finder()
        result = instance.get_data('ansible.builtin')
        self.assertEqual(result, None)

    def test_is_package(self):
        instance = _collection_finder()
        result = instance.is_package('ansible.builtin')
        self.assertEqual(result, None)

    def test_get_code(self):
        instance = _collection_finder()
        result = instance.get_code('ansible.builtin')
        self.assertEqual(result, None)

    def test_get_source(self):
        instance = _collection_finder()
        result = instance.get_source('ansible.builtin')
        self.assertEqual(result, None)

    def test_get_filename(self):
        instance = _collection_finder()
        result = instance.get_filename('ansible.builtin')
        self.assertEqual(result, None)

    def test_get_magic(self):
        instance = _collection_finder()
        result = instance.get_magic('ansible.builtin')
        self.assertEqual(result, None)

    def test_get_suffixes(self):
        instance = _collection_finder()
        result = instance.get_suffixes('ansible.builtin')
        self.assertEqual(result, None)

    def test_invalidate_caches(self):
        instance = _collection_finder()
        result = instance.invalidate_caches('ansible.builtin')
        self.assertEqual(result, None)

    def test_create_module(self):
        instance = _collection_finder()
        result = instance.create_module('ansible.builtin')
        self.assertEqual(result, None)

    def test_exec_module(self):
        instance = _collection_finder()
        result = instance.exec_module('ansible.builtin')
        self.assertEqual(result, None)

    def test_load_module_shim(self):
        instance = _collection_finder()
        result = instance.load_module_shim('ansible.builtin')
        self.assertEqual(result, None)

    def test_load_module_shim_with_path(self):
        instance = _collection_finder()
        result = instance.load_module_shim_with_path('ansible.builtin')
        self.assertEqual(result, None)

    def test_load_module_shim_with_path_and_name(self):
        instance = _collection_finder()
        result = instance.load_module_shim_with_path_and_name('ansible.builtin')
        self.assertEqual(result, None)

if __name__ == '__main__':
    unittest.main()