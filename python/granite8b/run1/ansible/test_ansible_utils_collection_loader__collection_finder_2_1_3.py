import unittest
from ansible.utils.collection_loader._collection_finder import _AnsibleCollectionRootPkgLoader


class TestAnsibleCollectionRootPkgLoader(_AnsibleCollectionRootPkgLoader):
    def test_init(self):
        instance = _AnsibleCollectionRootPkgLoader()
        self.assertEqual(instance._split_name, [])

    def test_validate_args(self):
        instance = _AnsibleCollectionRootPkgLoader()
        with self.assertRaises(ImportError):
            instance._validate_args()

if __name__ == '__main__':
    unittest.main()