import unittest
from ansible.utils.collection_loader._collection_finder import AnsibleCollectionNSPkgLoader


class TestAnsibleCollectionNSPkgLoader(unittest.TestCase):
    def test_init(self):
        loader = AnsibleCollectionNSPkgLoader()
        self.assertIsInstance(loader, AnsibleCollectionNSPkgLoader)

    def test_validate_args(self):
        loader = AnsibleCollectionNSPkgLoader()
        with self.assertRaises(ImportError):
            loader._validate_args()

    def test_validate_final(self):
        loader = AnsibleCollectionNSPkgLoader()
        with self.assertRaises(ImportError):
            loader._validate_final()

if __name__ == '__main__':
    unittest.main()