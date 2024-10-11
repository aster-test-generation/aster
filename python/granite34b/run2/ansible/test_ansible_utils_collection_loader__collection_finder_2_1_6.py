import unittest
from ansible.utils.collection_loader._collection_finder import _AnsibleCollectionPkgLoaderBase


class TestAnsibleCollectionLoader(unittest.TestCase):
    def test_validate_args(self):
        loader = _AnsibleCollectionLoader()
        loader._split_name = ['a', 'b', 'c']
        with self.assertRaises(ValueError):
            loader._validate_args()

    def test_get_candidate_paths(self):
        loader = _AnsibleCollectionLoader()
        loader._split_name = ['a', 'b', 'c']
        with self.assertRaises(ValueError):
            loader._get_candidate_paths(['path1', 'path2'])

    def test_get_subpackage_search_paths(self):
        loader = _AnsibleCollectionLoader()
        loader._split_name = ['a', 'b', 'c']
        with self.assertRaises(ImportError):
            loader._get_subpackage_search_paths(['path1', 'path2'])

if __name__ == '__main__':
    unittest.main()