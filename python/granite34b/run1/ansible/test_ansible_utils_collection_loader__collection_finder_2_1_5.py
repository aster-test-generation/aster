import unittest
from ansible.utils.collection_loader._collection_finder import _AnsibleCollectionPkgLoaderBase


class TestAnsibleCollectionPkgLoader(unittest.TestCase):
    def test_validate_args(self):
        loader = _AnsibleCollectionPkgLoader()
        loader._split_name = ['a', 'b', 'c']
        loader._validate_args()
        self.assertEqual(loader._split_name, ['a', 'b', 'c'])

    def test_validate_final(self):
        loader = _AnsibleCollectionPkgLoader()
        loader._split_name = ['a', 'b', 'c']
        loader._subpackage_search_paths = []
        loader._validate_final()
        self.assertEqual(loader._subpackage_search_paths, [])

    def test_load_module(self):
        loader = _AnsibleCollectionPkgLoader()
        loader._meta_yml_to_dict = lambda x: {'a': 1}
        module = loader.load_module('test')
        self.assertEqual(module._collection_meta, {'a': 1})

    def test_canonicalize_meta(self):
        loader = _AnsibleCollectionPkgLoader()
        meta_dict = {'a': 1}
        canonicalized_meta = loader._canonicalize_meta(meta_dict)
        self.assertEqual(canonicalized_meta, meta_dict)

if __name__ == '__main__':
    unittest.main()