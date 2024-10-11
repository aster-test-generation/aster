import unittest
from ansible.utils.collection_loader import AnsibleCollectionRef



class Test_AnsibleCollectionFinder(unittest.TestCase):
    def test_init(self):
        instance = _collection_finder._AnsibleCollectionFinder()
        self.assertIsInstance(instance, _collection_finder._AnsibleCollectionFinder)

    def test_remove(self):
        instance = _collection_finder._AnsibleCollectionFinder()
        result = instance._remove()
        self.assertIsNone(result)

    def test_install(self):
        instance = _collection_finder._AnsibleCollectionFinder()
        result = instance._install()
        self.assertIsNone(result)

    def test_n_collection_paths(self):
        instance = _collection_finder._AnsibleCollectionFinder()
        result = instance._n_collection_paths
        self.assertIsInstance(result, list)

    def test_set_playbook_paths(self):
        instance = _collection_finder._AnsibleCollectionFinder()
        result = instance.set_playbook_paths('test_path')
        self.assertIsNone(result)

    def test_reload_hack(self):
        instance = _collection_finder._AnsibleCollectionFinder()
        result = instance._reload_hack('test_name')
        self.assertIsNone(result)

    def test_find_module(self):
        instance = _collection_finder._AnsibleCollectionFinder()
        result = instance.find_module('test_name')
        self.assertIsNone(result)

class Test_AnsiblePathHookFinder(unittest.TestCase):
    def test_init(self):
        instance = _collection_finder._AnsiblePathHookFinder('test_path')
        self.assertIsInstance(instance, _collection_finder._AnsiblePathHookFinder)

    def test_find_module(self):
        instance = _collection_finder._AnsiblePathHookFinder('test_path')
        result = instance.find_module('test_name')
        self.assertIsNone(result)

class Test_AnsibleInternalRedirectLoader(unittest.TestCase):
    def test_init(self):
        instance = _collection_finder._AnsibleInternalRedirectLoader('test_name', 'test_path')
        self.assertIsInstance(instance, _collection_finder._AnsibleInternalRedirectLoader)

    def test_load_module(self):
        instance = _collection_finder._AnsibleInternalRedirectLoader('test_name', 'test_path')
        result = instance.load_module('test_name')
        self.assertIsNone(result)

    def test_get_data(self):
        instance = _collection_finder._AnsibleInternalRedirectLoader('test_name', 'test_path')
        result = instance.get_data('test_name')
        self.assertIsNone(result)

    def test_is_package(self):
        instance = _collection_finder._AnsibleInternalRedirectLoader('test_name', 'test_path')
        result = instance.is_package('test_name')
        self.assertIsNone(result)

    def test_get_code(self):
        instance = _collection_finder._AnsibleInternalRedirectLoader('test_name', 'test_path')
        result = instance.get_code('test_name')
        self.assertIsNone(result)

    def test_get_source(self):
        instance = _collection_finder._AnsibleInternalRedirectLoader('test_name', 'test_path')
        result = instance.get_source('test_name')
        self.assertIsNone(result)

    def test_get_filename(self):
        instance = _collection_finder._AnsibleInternalRedirectLoader('test_name', 'test_path')
        result = instance.get_filename('test_name')
        self.assertIsNone(result)


if __name__ == '__main__':
    unittest.main()