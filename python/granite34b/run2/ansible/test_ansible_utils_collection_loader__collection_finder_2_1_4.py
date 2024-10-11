import unittest
from ansible.utils.collection_loader._collection_finder import _AnsibleCollectionPkgLoader


class TestAnsibleCollectionNSPkgLoader(unittest.TestCase):
    def test_validate_args(self):
        loader = _AnsibleCollectionNSPkgLoader()
        loader._split_name = ['namespace', 'package']
        loader._validate_args()
        self.assertEqual(len(loader._split_name), 2)

    def test_validate_final(self):
        loader = _AnsibleCollectionNSPkgLoader()
        loader._subpackage_search_paths = ['path/to/subpackage']
        loader._package_to_load = 'ansible'
        loader._validate_final()
        self.assertEqual(len(loader._subpackage_search_paths), 1)

if __name__ == '__main__':
    unittest.main()