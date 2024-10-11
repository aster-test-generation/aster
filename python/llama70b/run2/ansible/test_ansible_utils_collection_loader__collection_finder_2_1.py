import unittest
from ansible.utils.collection_loader import AnsibleCollectionRe


class TestAnsibleInternalRedirectLoader(unittest.TestCase):
    def test___init__(self):
        instance = _AnsibleInternalRedirectLoader('ansible.builtin.module', [])
        self.assertIsNotNone(instance._redirect)

    def test_load_module(self):
        instance = _AnsibleInternalRedirectLoader('ansible.builtin.module', [])
        mod = instance.load_module('ansible.builtin.module')
        self.assertIsInstance(mod, ModuleType)

    def test___init__raises_import_error(self):
        with self.assertRaises(ImportError):
            _AnsibleInternalRedirectLoader('not.ansible.module', [])

    def test_load_module_raises_value_error(self):
        instance = _AnsibleInternalRedirectLoader('ansible.builtin.module', [])
        instance._redirect = None
        with self.assertRaises(ValueError):
            instance.load_module('ansible.builtin.module')

    def test___str__(self):
        instance = _AnsibleInternalRedirectLoader('ansible.builtin.module', [])
        self.assertIsInstance(instance.__str__(), str)

    def test___repr__(self):
        instance = _AnsibleInternalRedirectLoader('ansible.builtin.module', [])
        self.assertIsInstance(instance.__repr__(), str)

class TestGetCollectionMetadata(unittest.TestCase):
    def test_get_collection_metadata(self):
        result = _collection_finder._get_collection_metadata('ansible.builtin')
        self.assertIsInstance(result, dict)

class TestNestedDictGet(unittest.TestCase):
    def test_nested_dict_get(self):
        data = {'a': {'b': {'c': 'value'}}}
        result = _collection_finder._nested_dict_get(data, ['a', 'b', 'c'])
        self.assertEqual(result, 'value')

if __name__ == '__main__':
    unittest.main()