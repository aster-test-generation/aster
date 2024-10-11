import unittest
from ansible.utils.collection_loader._collection_finder import _AnsibleCollectionPkgLoaderBase


class TestAnsibleCollectionLoader(_AnsibleCollectionLoader):
    def test_validate_args(self):
        self._validate_args()

    def test_get_candidate_paths(self):
        candidate_paths = self._get_candidate_paths(['/path/to/collections'])
        self.assertEqual(len(candidate_paths), 1)
        self.assertEqual(candidate_paths[0], '/path/to/collections')

    def test_get_subpackage_search_paths(self):
        candidate_paths = self._get_candidate_paths(['/path/to/collections'])
        subpackage_search_paths = self._get_subpackage_search_paths(candidate_paths)
        self.assertEqual(len(subpackage_search_paths), 1)
        self.assertEqual(subpackage_search_paths[0], '/path/to/collections/ansible/builtin')

if __name__ == '__main__':
    unittest.main()