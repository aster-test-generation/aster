import unittest
from ansible.utils.collection_loader._collection_finder import _AnsibleCollectionPkgLoaderBase


class TestAnsibleCollectionLoader(unittest.TestCase):
    def setUp(self):
        self.loader = _AnsibleCollectionLoader()
        self.loader._split_name = ['ansible', 'test', 'collection', 'module']
        self.loader._fullname = 'ansible.test.collection.module'
        self.loader._redirected_package_map = {}
        self.loader._package_to_load = 'test_package'

    def test_init(self):
        loader = _AnsibleCollectionLoader()
        self.assertIsInstance(loader, _AnsibleCollectionLoader)

    def test_validate_args_valid(self):
        self.loader._split_name = ['ansible', 'test', 'collection', 'module']
        try:
            self.loader._validate_args()
        except ValueError:
            self.fail("_validate_args() raised ValueError unexpectedly!")

    def test_validate_args_invalid(self):
        self.loader._split_name = ['ansible', 'test']
        with self.assertRaises(ValueError):
            self.loader._validate_args()

    def test_get_candidate_paths_valid(self):
        self.loader._split_name = ['ansible', 'test', 'collection', 'module']
        path_list = ['/valid/path']
        result = self.loader._get_candidate_paths(path_list)
        self.assertEqual(result, path_list)

    def test_get_candidate_paths_invalid(self):
        self.loader._split_name = ['ansible', 'test', 'collection', 'module']
        path_list = ['/valid/path', '/another/path']
        with self.assertRaises(ValueError):
            self.loader._get_candidate_paths(path_list)

    def test_get_subpackage_search_paths_redirect(self):
        self.loader._split_name = ['ansible', 'test', 'collection', 'module']
        self.loader._fullname = 'ansible.test.collection.module'
        self.loader._redirected_package_map = {}
        self.loader._package_to_load = 'test_package'
        candidate_paths = ['/valid/path']
        with unittest.mock.patch('ansible.utils.collection_loader._collection_finder._get_collection_metadata', return_value={'import_redirection': {'ansible.test.collection.module': {'redirect': 'redirected.module'}}}):
            with unittest.mock.patch('ansible.utils.collection_loader._collection_finder.import_module', return_value=unittest.mock.Mock(__path__=['/redirected/path'])):
                result = self.loader._get_subpackage_search_paths(candidate_paths)
                self.assertIsNone(result)

    def test_get_subpackage_search_paths_no_paths(self):
        candidate_paths = []
        with self.assertRaises(ImportError):
            self.loader._get_subpackage_search_paths(candidate_paths)

    def test_get_subpackage_search_paths_found_path(self):
        candidate_paths = ['/valid/path']
        with unittest.mock.patch('ansible.utils.collection_loader._collection_finder._get_collection_metadata', return_value={}):
            with unittest.mock.patch('ansible.utils.collection_loader._collection_finder._get_ancestor_redirect', return_value=None):
                with unittest.mock.patch('ansible.utils.collection_loader._collection_finder._AnsibleCollectionLoader._module_file_from_path', return_value=('/found/path', True, '/package/path')):
                    result = self.loader._get_subpackage_search_paths(candidate_paths)
                    self.assertEqual(result, ['/package/path'])

if __name__ == '__main__':
    unittest.main()