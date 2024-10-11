import unittest
from ansible.utils.collection_loader import _AnsibleCollectionPkgLoaderBase, _collection_finde


class TestAnsibleCollectionPkgLoader(unittest.TestCase):
    def test___init__(self):
        instance = _AnsibleCollectionPkgLoader()
        self.assertIsInstance(instance, _AnsibleCollectionPkgLoader)

    def test__validate_args(self):
        instance = _AnsibleCollectionPkgLoader()
        instance._split_name = ['a', 'b', 'c']
        instance._validate_args()
        instance._split_name = ['a', 'b']
        with self.assertRaises(ImportError):
            instance._validate_args()

    def test__validate_final(self):
        instance = _AnsibleCollectionPkgLoader()
        instance._split_name = ['a', 'ansible', 'builtin']
        instance._subpackage_search_paths = []
        instance._validate_final()
        self.assertEqual(instance._subpackage_search_paths, [])
        instance._split_name = ['a', 'b', 'c']
        instance._subpackage_search_paths = ['/path/to/search']
        instance._validate_final()
        self.assertEqual(instance._subpackage_search_paths, ['/path/to/search'])
        instance._subpackage_search_paths = []
        with self.assertRaises(ImportError):
            instance._validate_final()

    def test_load_module(self):
        instance = _AnsibleCollectionPkgLoader()
        instance._split_name = ['a', 'b', 'c']
        module = instance.load_module('a.b.c')
        self.assertIsInstance(module, ModuleType)
        self.assertIn('_collection_meta', dir(module))

    def test__canonicalize_meta(self):
        instance = _AnsibleCollectionPkgLoader()
        meta_dict = {'key': 'value'}
        result = instance._canonicalize_meta(meta_dict)
        self.assertEqual(result, meta_dict)

    def test___str__(self):
        instance = _AnsibleCollectionPkgLoader()
        result = instance.__str__()
        self.assertIsInstance(result, str)

    def test___repr__(self):
        instance = _AnsibleCollectionPkgLoader()
        result = instance.__repr__()
        self.assertIsInstance(result, str)

if __name__ == '__main__':
    unittest.main()