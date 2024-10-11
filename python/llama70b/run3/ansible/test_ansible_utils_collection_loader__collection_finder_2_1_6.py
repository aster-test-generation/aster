import unittest
from ansible.utils.collection_loader import _AnsibleCollectionPkgLoaderBase, _collection_finde


class Test_AnsibleCollectionLoader(unittest.TestCase):
    def test___init__(self):
        instance = _AnsibleCollectionLoader()
        self.assertIsInstance(instance, _AnsibleCollectionLoader)

    def test__validate_args(self):
        instance = _AnsibleCollectionLoader()
        with self.assertRaises(ValueError):
            instance._validate_args()

    def test__get_candidate_paths(self):
        instance = _AnsibleCollectionLoader()
        path_list = ['/path/to/search']
        result = instance._get_candidate_paths(path_list)
        self.assertEqual(result, path_list)

    def test__get_subpackage_search_paths(self):
        instance = _AnsibleCollectionLoader()
        candidate_paths = ['/path/to/search']
        collection_name = 'ansible.builtin'
        collection_meta = {'import_redirection': {'module': {'redirect': 'new_module'}}}
        result = instance._get_subpackage_search_paths(candidate_paths)
        self.assertIsNone(result)

    def test___str__(self):
        instance = _AnsibleCollectionLoader()
        result = instance.__str__()
        self.assertIsInstance(result, str)

    def test___repr__(self):
        instance = _AnsibleCollectionLoader()
        result = instance.__repr__()
        self.assertIsInstance(result, str)

    def test___eq__(self):
        instance1 = _AnsibleCollectionLoader()
        instance2 = _AnsibleCollectionLoader()
        self.assertNotEqual(instance1, instance2)

    def test__module_file_from_path(self):
        instance = _AnsibleCollectionLoader()
        package_to_load = 'module_to_load'
        candidate_path = '/path/to/search'
        found_path, has_code, package_path = instance._module_file_from_path(package_to_load, candidate_path)
        self.assertIsNone(found_path)
        self.assertFalse(has_code)
        self.assertIsNone(package_path)

    def test__get_collection_metadata(self):
        collection_name = 'ansible.builtin'
        result = _collection_finder._get_collection_metadata(collection_name)
        self.assertIsInstance(result, dict)

    def test__get_ancestor_redirect(self):
        redirected_package_map = {'module': 'new_module'}
        fullname = 'module_to_load'
        result = _collection_finder._get_ancestor_redirect(redirected_package_map, fullname)
        self.assertIsNone(result)

if __name__ == '__main__':
    unittest.main()