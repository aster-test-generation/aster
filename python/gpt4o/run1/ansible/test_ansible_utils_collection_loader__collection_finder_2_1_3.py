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
        instance._validate_args()
        self.assertTrue(True)  # If no exception is raised, the test passes

    def test_validate_args_invalid(self):
        instance = _AnsibleCollectionRootPkgLoader()
        instance._split_name = ['ansible_collections', 'invalid']
        instance._fullname = 'ansible_collections.invalid'
        with self.assertRaises(ImportError) as context:
            instance._validate_args()
        self.assertEqual(str(context.exception), 'this loader can only load the ansible_collections toplevel package, not ansible_collections.invalid')

if __name__ == '__main__':
    unittest.main()