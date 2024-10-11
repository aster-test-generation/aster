import unittest
from ansible.utils.collection_loader._collection_finder import AnsibleCollectionRef
from unittest.mock import patch, MagicMock


class TestAnsibleInternalRedirectLoader(unittest.TestCase):
    def test_init_with_valid_fullname(self):
        with patch('ansible.utils.collection_loader._collection_finder._get_collection_metadata') as mock_get_metadata, \
             patch('ansible.utils.collection_loader._collection_finder._nested_dict_get') as mock_nested_dict_get:
            mock_get_metadata.return_value = {'import_redirection': {'ansible.builtin': {'redirect': 'some.module'}}}
            mock_nested_dict_get.return_value = {'redirect': 'some.module'}
            instance = _AnsibleInternalRedirectLoader('ansible.builtin', [])
            self.assertEqual(instance._redirect, 'some.module')

    def test_init_with_invalid_fullname(self):
        with self.assertRaises(ImportError):
            _AnsibleInternalRedirectLoader('invalid.builtin', [])

    def test_init_with_no_redirect(self):
        with patch('ansible.utils.collection_loader._collection_finder._get_collection_metadata') as mock_get_metadata, \
             patch('ansible.utils.collection_loader._collection_finder._nested_dict_get') as mock_nested_dict_get:
            mock_get_metadata.return_value = {'import_redirection': {'ansible.builtin': {}}}
            mock_nested_dict_get.return_value = None
            with self.assertRaises(ImportError):
                _AnsibleInternalRedirectLoader('ansible.builtin', [])

    def test_load_module_with_redirect(self):
        with patch('ansible.utils.collection_loader._collection_finder.import_module') as mock_import_module:
            instance = _AnsibleInternalRedirectLoader.__new__(_AnsibleInternalRedirectLoader)
            instance._redirect = 'some.module'
            mock_import_module.return_value = MagicMock()
            result = instance.load_module('ansible.builtin')
            self.assertEqual(result, mock_import_module.return_value)

    def test_load_module_without_redirect(self):
        instance = _AnsibleInternalRedirectLoader.__new__(_AnsibleInternalRedirectLoader)
        instance._redirect = None
        with self.assertRaises(ValueError):
            instance.load_module('ansible.builtin')

if __name__ == '__main__':
    unittest.main()