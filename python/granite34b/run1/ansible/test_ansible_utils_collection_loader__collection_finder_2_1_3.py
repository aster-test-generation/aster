import unittest
from ansible.utils.collection_loader._collection_finder import _AnsibleCollectionPkgLoaderBase


class TestAnsibleCollectionRootPkgLoader(unittest.TestCase):
    def test_validate_args(self):
        loader = _AnsibleCollectionRootPkgLoader()
        loader._validate_args()
        self.assertEqual(len(loader._split_name), 1)

if __name__ == '__main__':
    unittest.main()