import unittest
from ansible.utils.collection_loader import _AnsibleCollectionPkgLoaderBase



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

    def test_get_source_code_path(self):
        instance = _AnsibleCollectionLoader()
        result = instance._get_source_code_path()
        self.assertEqual(result, None)

    def test_get_redirect_module(self):
        instance = _AnsibleCollectionLoader()
        result = instance._get_redirect_module()
        self.assertEqual(result, None)

    def test_get_redirected_package_map(self):
        instance = _AnsibleCollectionLoader()
        result = instance._get_redirected_package_map()
        self.assertEqual(result, None)

    def test_get_package_to_load(self):
        instance = _AnsibleCollectionLoader()
        result = instance._get_package_to_load()
        self.assertEqual(result, None)

    def test_get_fullname(self):
        instance = _AnsibleCollectionLoader()
        result = instance._get_fullname()
        self.assertEqual(result, None)

    def test_get_split_name(self):
        instance = _AnsibleCollectionLoader()
        result = instance._get_split_name()
        self.assertEqual(result, None)

    def test_get_redirected_package_map(self):
        instance = _AnsibleCollectionLoader()
        result = instance._get_redirected_package_map()
        self.assertEqual(result, None)

    def test_get_redirected_package_map(self):
        instance = _AnsibleCollectionLoader()
        result = instance._get_redirected_package_map()
        self.assertEqual(result, None)

    def test_get_redirected_package_map(self):
        instance = _AnsibleCollectionLoader()
        result = instance._get_redirected_package_map()
        self.assertEqual(result, None)

    def test_get_redirected_package_map(self):
        instance = _AnsibleCollectionLoader()
        result = instance._get_redirected_package_map()
        self.assertEqual(result, None)

    def test_get_redirected_package_map(self):
        instance = _AnsibleCollectionLoader()
        result = instance._get_redirected_package_map()
        self.assertEqual(result, None)

    def test_get_redirected_package_map(self):
        instance = _AnsibleCollectionLoader()
        result = instance._get_redirected_package_map()
        self.assertEqual(result, None)

    def test_get_redirected_package_map(self):
        instance = _AnsibleCollectionLoader()
        result = instance._get_redirected_package_map()
        self.assertEqual(result, None)

    def test_get_redirected_package_map(self):
        instance = _AnsibleCollectionLoader()
        result = instance._get_redirected_package_map()
        self.assertEqual(result, None)

    def test_get_redirected_package_map(self):
        instance = _AnsibleCollectionLoader()
        result = instance._get_redirected_package_map()
        self.assertEqual(result, None)

if __name__ == '__main__':
    unittest.main()