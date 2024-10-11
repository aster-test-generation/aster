import unittest
from ansible.utils.collection_loader._collection_finder import AnsibleCollectionRef
from ansible.utils.collection_loader._collection_finder import _get_collection_metadata, _nested_dict_get
from importlib import import_module


class TestAnsibleInternalRedirectLoader(unittest.TestCase):
    def test_init_with_valid_fullname(self):
        instance = _AnsibleInternalRedirectLoader('ansible.builtin.some_module', [])
        self.assertIsInstance(instance, _AnsibleInternalRedirectLoader)

    def test_init_with_invalid_fullname(self):
        with self.assertRaises(ImportError):
            _AnsibleInternalRedirectLoader('not_ansible.some_module', [])

    def test_load_module_with_redirect(self):
        instance = _AnsibleInternalRedirectLoader('ansible.builtin.some_module', [])
        instance._redirect = 'ansible.builtin.some_other_module'
        mod = instance.load_module('ansible.builtin.some_module')
        self.assertEqual(sys.modules['ansible.builtin.some_module'], mod)

    def test_load_module_without_redirect(self):
        instance = _AnsibleInternalRedirectLoader('ansible.builtin.some_module', [])
        instance._redirect = None
        with self.assertRaises(ValueError):
            instance.load_module('ansible.builtin.some_module')

    def test_private_method_get_collection_metadata(self):
        result = _get_collection_metadata('ansible.builtin')
        self.assertIsInstance(result, dict)

    def test_private_method_nested_dict_get(self):
        nested_dict = {'import_redirection': {'ansible.builtin.some_module': {'redirect': 'ansible.builtin.some_other_module'}}}
        result = _nested_dict_get(nested_dict, ['import_redirection', 'ansible.builtin.some_module'])
        self.assertEqual(result, {'redirect': 'ansible.builtin.some_other_module'})

if __name__ == '__main__':
    unittest.main()