import unittest
from ansible.utils.collection_loader._collection_finder import _AnsibleCollectionPkgLoaderBase


class TestAnsibleCollectionNSPkgLoader(unittest.TestCase):
    def setUp(self):
        self.loader = _AnsibleCollectionNSPkgLoader()

    def test_init(self):
        self.assertIsInstance(self.loader, _AnsibleCollectionNSPkgLoader)

    def test_validate_args(self):
        with self.assertRaises(ImportError) as context:
            self.loader._split_name = ['invalid', 'name', 'too', 'long']
            self.loader._fullname = 'invalid.name.too.long'
            self.loader._validate_args()
        self.assertEqual(str(context.exception), 'this loader can only load collections namespace packages, not invalid.name.too.long')

    def test_validate_final(self):
        with self.assertRaises(ImportError) as context:
            self.loader._subpackage_search_paths = []
            self.loader._package_to_load = 'not_ansible'
            self.loader._candidate_paths = ['some_path']
            self.loader._validate_final()
        self.assertEqual(str(context.exception), 'no not_ansible found in [\'some_path\']')

if __name__ == '__main__':
    unittest.main()