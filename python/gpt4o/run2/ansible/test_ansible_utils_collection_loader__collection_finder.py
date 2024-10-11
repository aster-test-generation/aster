import unittest
from unittest.mock import patch, MagicMock
from ansible.utils.collection_loader import AnsibleCollectionRef
    def test_get_collection_name_from_path(self, mock_import_module, mock_abspath, mock_to_native):
        mock_abspath.return_value = '/ansible_collections/namespace/collection'
        mock_to_native.side_effect = lambda x: x
        mock_import_module.return_value = MagicMock()


class TestCollectionFinder(unittest.TestCase):

    @patch('ansible.utils.collection_loader._collection_finder.AnsibleCollectionRef.try_parse_fqcr')
    @patch('ansible.utils.collection_loader._collection_finder.import_module')
    @patch('ansible.utils.collection_loader._collection_finder.os.path.exists')
    def test_get_collection_playbook_path(self, mock_exists, mock_import_module, mock_try_parse_fqcr):
        mock_try_parse_fqcr.return_value = MagicMock()
        mock_import_module.return_value = MagicMock()
        mock_exists.return_value = True
        result = _get_collection_playbook_path('test_playbook')
        self.assertIsNotNone(result)

    @patch('ansible.utils.collection_loader._collection_finder._get_collection_resource_path')
    def test_get_collection_role_path(self, mock_get_collection_resource_path):
        mock_get_collection_resource_path.return_value = ('resource', 'path', 'collection')
        result = _get_collection_role_path('test_role')
        self.assertEqual(result, ('resource', 'path', 'collection'))

    @patch('ansible.utils.collection_loader._collection_finder.AnsibleCollectionRef.try_parse_fqcr')
    @patch('ansible.utils.collection_loader._collection_finder.import_module')
    def test_get_collection_resource_path(self, mock_import_module, mock_try_parse_fqcr):
        mock_try_parse_fqcr.return_value = MagicMock()
        mock_import_module.return_value = MagicMock()
        result = _get_collection_resource_path('test_name', 'role')
        self.assertIsNotNone(result)

    @patch('ansible.utils.collection_loader._collection_finder.to_native')
    @patch('ansible.utils.collection_loader._collection_finder.os.path.abspath')
    @patch('ansible.utils.collection_loader._collection_finder.import_module')
        result = _get_collection_name_from_path('/ansible_collections/namespace/collection')
        self.assertEqual(result, 'namespace.collection')

    def test_get_import_redirect(self):
        collection_meta_dict = {'import_redirection': {'fullname': {'redirect': 'redirected_name'}}}
        result = _get_import_redirect(collection_meta_dict, 'fullname')
        self.assertEqual(result, 'redirected_name')

    def test_get_ancestor_redirect(self):
        redirected_package_map = {'ancestor': 'redirected_ancestor'}
        result = _get_ancestor_redirect(redirected_package_map, 'ancestor.subpackage')
        self.assertEqual(result, 'redirected_ancestor.subpackage')

    def test_nested_dict_get(self):
        root_dict = {'level1': {'level2': {'level3': 'value'}}}
        result = _nested_dict_get(root_dict, ['level1', 'level2', 'level3'])
        self.assertEqual(result, 'value')

    @patch('ansible.utils.collection_loader._collection_finder.to_bytes')
    @patch('ansible.utils.collection_loader._collection_finder.os.path.isdir')
    @patch('ansible.utils.collection_loader._collection_finder.os.listdir')
    def test_iter_modules_impl(self, mock_listdir, mock_isdir, mock_to_bytes):
        mock_isdir.return_value = True
        mock_listdir.return_value = ['module.py', 'subpackage']
        mock_to_bytes.side_effect = lambda x: x.encode()
        result = list(_iter_modules_impl(['test_path'], 'prefix'))
        self.assertEqual(result, [('prefixmodule', False), ('prefixsubpackage', True)])

    @patch('ansible.utils.collection_loader._collection_finder.import_module')
    def test_get_collection_metadata(self, mock_import_module):
        mock_import_module.return_value = MagicMock(_collection_meta='metadata')
        result = _get_collection_metadata('namespace.collection')
        self.assertEqual(result, 'metadata')

    def test_get_collection_metadata_invalid_name(self):
        with self.assertRaises(ValueError):
            _get_collection_metadata('invalid_name')

    @patch('ansible.utils.collection_loader._collection_finder.import_module')
    def test_get_collection_metadata_import_error(self, mock_import_module):
        mock_import_module.side_effect = ImportError
        with self.assertRaises(ValueError):
            _get_collection_metadata('namespace.collection')

    @patch('ansible.utils.collection_loader._collection_finder.import_module')
    def test_get_collection_metadata_no_meta(self, mock_import_module):
        mock_import_module.return_value = MagicMock(_collection_meta=None)
        with self.assertRaises(ValueError):
            _get_collection_metadata('namespace.collection')

if __name__ == '__main__':
    unittest.main()