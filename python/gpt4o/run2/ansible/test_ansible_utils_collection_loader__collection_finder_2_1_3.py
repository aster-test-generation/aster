import unittest
from ansible.utils.collection_loader._collection_finder import _AnsibleCollectionPkgLoaderBase


class TestAnsibleCollectionRootPkgLoader(unittest.TestCase):
    def test_init(self):
        instance = _AnsibleCollectionRootPkgLoader()
        self.assertIsInstance(instance, _AnsibleCollectionRootPkgLoader)

    def test_validate_args(self):
        instance = _AnsibleCollectionRootPkgLoader()
        instance._split_name = ['ansible_collections']
        instance._fullname = 'ansible_collections'
        instance._validate_args()  # Should not raise an exception

    def test_validate_args_invalid(self):
        instance = _AnsibleCollectionRootPkgLoader()
        instance._split_name = ['ansible_collections', 'invalid']
        instance._fullname = 'ansible_collections.invalid'
        with self.assertRaises(ImportError):
            instance._validate_args()

if __name__ == '__main__':
    unittest.main()