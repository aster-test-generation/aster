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
        self.loader._redirect_module = None

        def mock_get_collection_metadata(name):
            return {'import_redirection': {'ansible.test.collection.module': {'redirect': 'redirected.module'}}}

        def mock_import_module(name):
            class MockModule:
                __path__ = ['/mock/path']
            return MockModule()

        global _get_collection_metadata, import_module
        _get_collection_metadata = mock_get_collection_metadata
        import_module = mock_import_module

        result = self.loader._get_subpackage_search_paths(['/valid/path'])
        self.assertIsNone(result)
        self.assertEqual(self.loader._redirect_module.__path__, ['/mock/path'])

    def test_get_subpackage_search_paths_no_redirect(self):
        self.loader._split_name = ['ansible', 'test', 'collection', 'module']
        self.loader._fullname = 'ansible.test.collection.module'
        self.loader._redirected_package_map = {}
        self.loader._package_to_load = 'test_package'
        self.loader._redirect_module = None

        def mock_get_collection_metadata(name):
            return {}

        def mock_get_ancestor_redirect(map, name):
            return None

        def mock_module_file_from_path(package, path):
            return ('/found/path', True, '/package/path')

        global _get_collection_metadata, _get_ancestor_redirect, _module_file_from_path
        _get_collection_metadata = mock_get_collection_metadata
        _get_ancestor_redirect = mock_get_ancestor_redirect
        _module_file_from_path = mock_module_file_from_path

        result = self.loader._get_subpackage_search_paths(['/valid/path'])
        self.assertEqual(result, ['/package/path'])
        self.assertEqual(self.loader._source_code_path, '/found/path')

    def test_get_subpackage_search_paths_no_paths(self):
        self.loader._split_name = ['ansible', 'test', 'collection', 'module']
        self.loader._fullname = 'ansible.test.collection.module'
        self.loader._redirected_package_map = {}
        self.loader._package_to_load = 'test_package'
        self.loader._redirect_module = None

        def mock_get_collection_metadata(name):
            return {}

        def mock_get_ancestor_redirect(map, name):
            return None

        def mock_module_file_from_path(package, path):
            return (None, False, None)

        global _get_collection_metadata, _get_ancestor_redirect, _module_file_from_path
        _get_collection_metadata = mock_get_collection_metadata
        _get_ancestor_redirect = mock_get_ancestor_redirect
        _module_file_from_path = mock_module_file_from_path

        with self.assertRaises(ImportError):
            self.loader._get_subpackage_search_paths([])

if __name__ == '__main__':
    unittest.main()