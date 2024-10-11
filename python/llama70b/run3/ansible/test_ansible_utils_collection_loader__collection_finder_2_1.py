import unittest
from ansible.utils.collection_loader import AnsibleCollectionRe


class TestAnsibleInternalRedirectLoader(unittest.TestCase):
    def test___init__(self):
        loader = _collection_finder._AnsibleInternalRedirectLoader('ansible.builtin.module', [])
        self.assertIsNotNone(loader)

    def test_load_module(self):
        loader = _collection_finder._AnsibleInternalRedirectLoader('ansible.builtin.module', [])
        with self.assertRaises(ValueError):
            loader.load_module('ansible.builtin.module')

    def test___str__(self):
        loader = _collection_finder._AnsibleInternalRedirectLoader('ansible.builtin.module', [])
        self.assertEqual(str(loader), '_AnsibleInternalRedirectLoader object')

    def test___repr__(self):
        loader = _collection_finder._AnsibleInternalRedirectLoader('ansible.builtin.module', [])
        self.assertEqual(repr(loader), '_AnsibleInternalRedirectLoader object')

    def test__redirect(self):
        loader = _collection_finder._AnsibleInternalRedirectLoader('ansible.builtin.module', [])
        self.assertIsNone(loader._redirect)

    def test_get_collection_metadata(self):
        with self.assertRaises(NotImplementedError):
            _collection_finder._get_collection_metadata('ansible.builtin')

    def test_nested_dict_get(self):
        data = {'a': {'b': {'c': 'value'}}}
        self.assertEqual(_collection_finder._nested_dict_get(data, ['a', 'b', 'c']), 'value')

if __name__ == '__main__':
    unittest.main()