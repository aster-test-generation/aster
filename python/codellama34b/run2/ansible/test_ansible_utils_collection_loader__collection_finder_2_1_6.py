from ansible.utils.collection_loader import _AnsibleCollectionLoader
import unittest
from ansible.utils.collection_loader import *


class Test_AnsibleCollectionLoader(unittest.TestCase):
    def test__validate_args(self):
        instance = _AnsibleCollectionLoader()
        instance._validate_args()
    def test__get_candidate_paths(self):
        instance = _AnsibleCollectionLoader()
        result = instance._get_candidate_paths(None)
        self.assertEqual(result, None)
    def test__get_subpackage_search_paths(self):
        instance = _AnsibleCollectionLoader()
        result = instance._get_subpackage_search_paths(None)
        self.assertEqual(result, None)

if __name__ == '__main__':
    unittest.main()