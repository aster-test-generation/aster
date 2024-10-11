import unittest
from ansible.utils.collection_loader import AnsibleCollectionLoader


class TestAnsibleCollectionLoader(unittest.TestCase):
    def test_init(self):
        instance = _AnsibleCollectionLoader()
        self.assertIsInstance(instance, _AnsibleCollectionLoader)

    def test_validate_args(self):
        instance = _AnsibleCollectionLoader()
        instance._validate_args()

    def test_get_candidate_paths(self):
        instance = _AnsibleCollectionLoader()
        result = instance._get_candidate_paths(None)
        self.assertEqual(result, None)

    def test_get_subpackage_search_paths(self):
        instance = _AnsibleCollectionLoader()
        result = instance._get_subpackage_search_paths(None)
        self.assertEqual(result, None)

if __name__ == '__main__':
    unittest.main()