import unittest
from ansible.utils.collection_loader._collection_finder import _AnsibleCollectionPkgLoaderBase


class TestAnsibleCollectionPkgLoader(unittest.TestCase):
    def test_validate_args(self):
        loader = _AnsibleCollectionPkgLoader()
        loader._split_name = ['ansible', 'builtin']
        with self.assertRaises(ImportError):
            loader._validate_args()

    def test_validate_final(self):
        loader = _AnsibleCollectionPkgLoader()
        loader._split_name = ['ansible', 'builtin']
        with self.assertRaises(ImportError):
            loader._validate_final()

    def test_load_module(self):
        loader = _AnsibleCollectionPkgLoader()
        loader._split_name = ['ansible', 'builtin']
        module = loader.load_module('ansible.builtin')
        self.assertEqual(module._collection_meta, {})

    def test_canonicalize_meta(self):
        loader = _AnsibleCollectionPkgLoader()
        meta_dict = {'key': 'value'}
        canonicalized_dict = loader._canonicalize_meta(meta_dict)
        self.assertEqual(canonicalized_dict, meta_dict)

if __name__ == '__main__':
    unittest.main()