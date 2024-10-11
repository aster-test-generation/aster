import unittest
from ansible.utils.collection_loader._collection_finder import _AnsibleCollectionRootPkgLoader


class TestAnsibleCollectionRootPkgLoader(unittest.TestCase):
    def test_init(self):
        loader = _AnsibleCollectionRootPkgLoader()
        self.assertEqual(loader, _AnsibleCollectionRootPkgLoader())

    def test_validate_args(self):
        loader = _AnsibleCollectionRootPkgLoader()
        with self.assertRaises(ImportError):
            loader._validate_args()

    def test_validate_args_valid(self):
        loader = _AnsibleCollectionRootPkgLoader()
        loader._split_name = ['ansible_collections']
        loader._validate_args()

    def test_str_method(self):
        loader = _AnsibleCollectionRootPkgLoader()
        result = str(loader)
        self.assertEqual(result, '<_AnsibleCollectionRootPkgLoader object at 0x...>')

    def test_repr_method(self):
        loader = _AnsibleCollectionRootPkgLoader()
        result = repr(loader)
        self.assertEqual(result, '_AnsibleCollectionRootPkgLoader()')

    def test_eq_method(self):
        loader1 = _AnsibleCollectionRootPkgLoader()
        loader2 = _AnsibleCollectionRootPkgLoader()
        self.assertEqual(loader1, loader2)

    def test_ne_method(self):
        loader1 = _AnsibleCollectionRootPkgLoader()
        loader2 = object()
        self.assertNotEqual(loader1, loader2)

if __name__ == '__main__':
    unittest.main()