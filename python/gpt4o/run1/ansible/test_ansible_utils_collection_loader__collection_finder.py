import unittest
from unittest.mock import patch, MagicMock
from ansible.utils.collection_loader import AnsibleCollectionRef


class TestCollectionFinder(unittest.TestCase):

    def test_get_collection_playbook_path(self):
        with patch('ansible.utils.collection_loader._collection_finder.AnsibleCollectionRef.try_parse_fqcr') as mock_try_parse_fqcr:
            mock_try_parse_fqcr.return_value = MagicMock()
            mock_try_parse_fqcr.return_value.n_python_collection_package_name = 'test_package'
            mock_try_parse_fqcr.return_value.subdirs = 'subdir'
            mock_try_parse_fqcr.return_value.resource = 'resource'
            mock_try_parse_fqcr.return_value.collection = 'collection'
            with patch('ansible.utils.collection_loader._collection_finder.import_module') as mock_import_module:
                mock_import_module.return_value = MagicMock()
                with patch('os.path.exists') as mock_exists:
                    mock_exists.return_value = True
                    result = _get_collection_playbook_path('playbook')
                    self.assertEqual(result, ('resource', 'test_package/subdir/resource', 'collection'))

    def test_get_collection_role_path(self):
        with patch('ansible.utils.collection_loader._collection_finder._get_collection_resource_path') as mock_get_collection_resource_path:
            mock_get_collection_resource_path.return_value = 'role_path'
            result = _get_collection_role_path('role_name')
            self.assertEqual(result, 'role_path')

    def test_get_collection_resource_path(self):
        with patch('ansible.utils.collection_loader._collection_finder.AnsibleCollectionRef.try_parse_fqcr') as mock_try_parse_fqcr:
            mock_try_parse_fqcr.return_value = MagicMock()
            mock_try_parse_fqcr.return_value.n_python_package_name = 'test_package'
            with patch('ansible.utils.collection_loader._collection_finder.import_module') as mock_import_module:
                mock_import_module.return_value = MagicMock()
                with patch('os.path.dirname') as mock_dirname:
                    mock_dirname.return_value = 'test_path'
                    result = _get_collection_resource_path('name', 'ref_type', ['collection'])
                    self.assertEqual(result, ('name', 'test_path', 'collection'))

    def test_get_collection_name_from_path(self):
        with patch('os.path.abspath') as mock_abspath:
            mock_abspath.return_value = '/abs/path'
            with patch('os.path.dirname') as mock_dirname:
                mock_dirname.return_value = '/dirname/path'
                with patch('ansible.utils.collection_loader._collection_finder.import_module') as mock_import_module:
                    mock_import_module.return_value = MagicMock()
                    result = _get_collection_name_from_path('/path/to/ansible_collections/namespace/collection')
                    self.assertEqual(result, 'namespace.collection')

    def test_get_import_redirect(self):
        collection_meta_dict = {'import_redirection': {'fullname': {'redirect': 'redirect_value'}}}
        result = _get_import_redirect(collection_meta_dict, 'fullname')
        self.assertEqual(result, 'redirect_value')

    def test_get_ancestor_redirect(self):
        redirected_package_map = {'pkg': 'redirected_pkg'}
        result = _get_ancestor_redirect(redirected_package_map, 'pkg.subpkg')
        self.assertEqual(result, 'redirected_pkg.subpkg')

    def test_nested_dict_get(self):
        root_dict = {'key1': {'key2': 'value'}}
        result = _nested_dict_get(root_dict, ['key1', 'key2'])
        self.assertEqual(result, 'value')

    def test_iter_modules_impl(self):
        with patch('os.path.isdir') as mock_isdir:
            mock_isdir.return_value = True
            with patch('os.listdir') as mock_listdir:
                mock_listdir.return_value = ['module.py', 'subdir']
                with patch('os.path.join') as mock_join:
                    mock_join.side_effect = lambda *args: '/'.join(args)
                    result = list(_iter_modules_impl(['/path'], 'prefix'))
                    self.assertEqual(result, [('prefixmodule', False), ('prefixsubdir', True)])

    def test_get_collection_metadata(self):
        with patch('ansible.utils.collection_loader._collection_finder.import_module') as mock_import_module:
            mock_import_module.return_value = MagicMock(_collection_meta='meta')
            result = _get_collection_metadata('namespace.collection')
            self.assertEqual(result, 'meta')

if __name__ == '__main__':
    unittest.main()