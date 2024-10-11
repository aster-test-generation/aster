import unittest
from ansible.utils.collection_loader import CollectionFinder as _collection_finde


class TestAnsibleInternalRedirectLoader(unittest.TestCase):
    def test___init__(self):
        loader = _AnsibleInternalRedirectLoader('ansible.builtin.module', [])
        self.assertIsNotNone(loader)

    def test_load_module(self):
        loader = _AnsibleInternalRedirectLoader('ansible.builtin.module', [])
        with self.assertRaises(ValueError):
            loader.load_module('ansible.builtin.module')

    def test___repr__(self):
        loader = _AnsibleInternalRedirectLoader('ansible.builtin.module', [])
        self.assertIsInstance(loader.__repr__(), str)

    def test___str__(self):
        loader = _AnsibleInternalRedirectLoader('ansible.builtin.module', [])
        self.assertIsInstance(loader.__str__(), str)

    def test___eq__(self):
        loader1 = _AnsibleInternalRedirectLoader('ansible.builtin.module', [])
        loader2 = _AnsibleInternalRedirectLoader('ansible.builtin.module', [])
        self.assertNotEqual(loader1, loader2)

    def test__get_collection_metadata(self):
        with self.assertRaises(NotImplementedError):
            _get_collection_metadata('ansible.builtin')

    def test__nested_dict_get(self):
        meta = {'import_redirection': {'ansible.builtin.module': {'redirect': 'ansible.builtin.redirect'}}}
        result = _nested_dict_get(meta, ['import_redirection', 'ansible.builtin.module'])
        self.assertEqual(result, {'redirect': 'ansible.builtin.redirect'})

if __name__ == '__main__':
    unittest.main()