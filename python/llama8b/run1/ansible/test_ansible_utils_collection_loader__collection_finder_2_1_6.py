import unittest
from ansible.utils.collection_loader._collection_finder import _AnsibleCollectionLoader


class TestAnsibleCollectionLoader(unittest.TestCase):
    def test_init(self):
        loader = _AnsibleCollectionLoader()
        self.assertIsInstance(loader, _AnsibleCollectionLoader)

    def test_validate_args(self):
        loader = _AnsibleCollectionLoader()
        with self.assertRaises(ValueError):
            loader._validate_args()

    def test_get_candidate_paths(self):
        loader = _AnsibleCollectionLoader()
        with self.assertRaises(ValueError):
            loader._get_candidate_paths([])

    def test_get_subpackage_search_paths(self):
        loader = _AnsibleCollectionLoader()
        with self.assertRaises(ValueError):
            loader._get_subpackage_search_paths([])

    def test_module_file_from_path(self):
        loader = _AnsibleCollectionLoader()
        with self.assertRaises(ImportError):
            loader._module_file_from_path('package', [])

    def test_str_method(self):
        loader = _AnsibleCollectionLoader()
        result = str(loader)
        self.assertEqual(result, str(type(loader)))

    def test_repr_method(self):
        loader = _AnsibleCollectionLoader()
        result = repr(loader)
        self.assertEqual(result, f"{type(loader)}()")

    def test_eq_method(self):
        loader1 = _AnsibleCollectionLoader()
        loader2 = _AnsibleCollectionLoader()
        self.assertEqual(loader1, loader2)

    def test_private_method(self):
        loader = _AnsibleCollectionLoader()
        with self.assertRaises(NotImplementedError):
            loader.__private_method()

    def test_protected_method(self):
        loader = _AnsibleCollectionLoader()
        with self.assertRaises(NotImplementedError):
            loader._protected_method()

if __name__ == '__main__':
    unittest.main()