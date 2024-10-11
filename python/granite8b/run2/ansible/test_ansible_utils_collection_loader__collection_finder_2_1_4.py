import unittest
from ansible.utils.collection_loader._collection_finder import AnsibleCollectionNSPkgLoader


class TestAnsibleCollectionNSPkgLoader(unittest.TestCase):
    def test_init(self):
        instance = AnsibleCollectionNSPkgLoader()
        self.assertIsInstance(instance, AnsibleCollectionNSPkgLoader)

    def test_validate_args(self):
        instance = AnsibleCollectionNSPkgLoader()
        with self.assertRaises(ImportError):
            instance._validate_args()

    def test_validate_final(self):
        instance = AnsibleCollectionNSPkgLoader()
        with self.assertRaises(ImportError):
            instance._validate_final()

if __name__ == '__main__':
    unittest.main()