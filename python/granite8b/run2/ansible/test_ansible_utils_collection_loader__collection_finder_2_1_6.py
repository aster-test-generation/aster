import unittest
from ansible.utils.collection_loader._collection_finder import _AnsibleCollectionPkgLoaderBase


class TestAnsibleCollectionLoader(_AnsibleCollectionLoader):
    def test_validate_args(self):
        instance = _AnsibleCollectionLoader()
        with self.assertRaises(ValueError):
            instance._validate_args()

    def test_get_candidate_paths(self):
        instance = _AnsibleCollectionLoader()
        with self.assertRaises(ValueError):
            instance._get_candidate_paths([])

    def test_get_subpackage_search_paths(self):
        instance = _AnsibleCollectionLoader()
        with self.assertRaises(ValueError):
            instance._get_subpackage_search_paths([])

if __name__ == '__main__':
    unittest.main()