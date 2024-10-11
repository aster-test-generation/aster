import unittest
from ansible.utils.collection_loader._collection_finder import _AnsibleCollectionNSPkgLoader


class TestAnsibleCollectionNSPkgLoader(unittest.TestCase):
    def test_init(self):
        loader = _AnsibleCollectionNSPkgLoader()
        self.assertEqual(loader.__class__, _AnsibleCollectionNSPkgLoader)

    def test_validate_args(self):
        loader = _AnsibleCollectionNSPkgLoader()
        loader._split_name = ['ansible', 'collection']
        loader._validate_args()
        self.assertEqual(loader._split_name, ['ansible', 'collection'])

    def test_validate_final(self):
        loader = _AnsibleCollectionNSPkgLoader()
        loader._subpackage_search_paths = ['path1', 'path2']
        loader._package_to_load = 'ansible'
        loader._candidate_paths = ['path3', 'path4']
        loader._validate_final()
        self.assertEqual(loader._subpackage_search_paths, ['path1', 'path2'])
        self.assertEqual(loader._package_to_load, 'ansible')
        self.assertEqual(loader._candidate_paths, ['path3', 'path4'])

    def test_str_method(self):
        loader = _AnsibleCollectionNSPkgLoader()
        result = str(loader)
        self.assertEqual(result, '<_AnsibleCollectionNSPkgLoader object at 0x...>')

    def test_repr_method(self):
        loader = _AnsibleCollectionNSPkgLoader()
        result = repr(loader)
        self.assertEqual(result, '<_AnsibleCollectionNSPkgLoader object at 0x...>')

    def test_eq_method(self):
        loader1 = _AnsibleCollectionNSPkgLoader()
        loader2 = _AnsibleCollectionNSPkgLoader()
        self.assertEqual(loader1, loader2)

    def test_ne_method(self):
        loader1 = _AnsibleCollectionNSPkgLoader()
        loader2 = object()
        self.assertNotEqual(loader1, loader2)

if __name__ == '__main__':
    unittest.main()