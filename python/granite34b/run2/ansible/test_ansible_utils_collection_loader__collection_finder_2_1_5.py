from ansible.utils.collection_loader._collection_finder import _AnsibleCollectionPkgLoaderBase
import unittest
from ansible.utils.collection_loader._collection_finder import _AnsibleCollectionPkgLoader


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
        module = loader.load_module('test')
        self.assertIsInstance(module, ModuleType)

    def test_canonicalize_meta(self):
        loader = _AnsibleCollectionPkgLoader()
        meta_dict = {'a': 1, 'b': 2}
        canonical_meta = loader._canonicalize_meta(meta_dict)
        self.assertEqual(canonical_meta, {'a': 1, 'b': 2})

if __name__ == '__main__':
    unittest.main()