import unittest
from ansible.utils.collection_loader._collection_finder import _AnsibleCollectionPkgLoaderBase


class TestAnsibleCollectionRootPkgLoader(unittest.TestCase):
    def test_init(self):
        loader = _AnsibleCollectionRootPkgLoader()
        self.assertIsInstance(loader, _AnsibleCollectionRootPkgLoader)

    def test_validate_args(self):
        loader = _AnsibleCollectionRootPkgLoader()
        loader._validate_args()
        self.assertTrue(True)  # No exception raised, test passes

    def test_validate_args_error(self):
        loader = _AnsibleCollectionRootPkgLoader()
        loader._split_name = ['foo', 'bar']
        with self.assertRaises(ImportError) as cm:
            loader._validate_args()
        self.assertEqual(str(cm.exception), 'this loader can only load the ansible_collections toplevel package, not ansible_collections.foo.bar')

if __name__ == '__main__':
    unittest.main()