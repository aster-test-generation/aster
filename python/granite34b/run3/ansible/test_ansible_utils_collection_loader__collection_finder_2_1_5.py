import unittest
from ansible.utils.collection_loader._collection_finder import _AnsibleCollectionPkgLoaderBase


class TestAnsibleCollectionPkgLoader(unittest.TestCase):
    def test_validate_args(self):
        loader = _AnsibleCollectionPkgLoader()
        loader._validate_args()
        self.assertEqual(len(loader._split_name), 3)

    def test_validate_final(self):
        loader = _AnsibleCollectionPkgLoader()
        loader._validate_final()
        self.assertEqual(loader._split_name[1:3], ['ansible', 'builtin'])

    def test_load_module(self):
        loader = _AnsibleCollectionPkgLoader()
        module = loader.load_module('test_module')
        self.assertEqual(module._collection_meta, {})

    def test_canonicalize_meta(self):
        loader = _AnsibleCollectionPkgLoader()
        meta_dict = {'key': 'value'}
        canonical_meta = loader._canonicalize_meta(meta_dict)
        self.assertEqual(canonical_meta, meta_dict)

if __name__ == '__main__':
    unittest.main()