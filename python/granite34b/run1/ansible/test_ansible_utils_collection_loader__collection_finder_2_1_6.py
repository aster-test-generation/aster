import unittest
from ansible.utils.collection_loader._collection_finder import _AnsibleCollectionPkgLoaderBase


class TestAnsibleCollectionLoader(unittest.TestCase):
    def test_validate_args(self):
        loader = _AnsibleCollectionLoader()
        loader._split_name = ['a', 'b', 'c']
        with self.assertRaises(ValueError) as context:
            loader._validate_args()
        self.assertEqual(str(context.exception), 'this loader is only for sub-collection modules/packages, not a.b.c')

    def test_get_candidate_paths(self):
        loader = _AnsibleCollectionLoader()
        loader._split_name = ['a', 'b', 'c']
        with self.assertRaises(ValueError) as context:
            loader._get_candidate_paths(['path1', 'path2'])
        self.assertEqual(str(context.exception), 'this loader requires exactly one path to search')

    def test_get_subpackage_search_paths(self):
        loader = _AnsibleCollectionLoader()
        loader._split_name = ['a', 'b', 'c']
        with self.assertRaises(ImportError) as context:
            loader._get_subpackage_search_paths(['path1', 'path2'])
        self.assertEqual(str(context.exception), 'package has no paths')

if __name__ == '__main__':
    unittest.main()