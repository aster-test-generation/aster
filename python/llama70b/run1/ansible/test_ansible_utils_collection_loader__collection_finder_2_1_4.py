import unittest
from ansible.utils.collection_loader import _AnsibleCollectionPkgLoaderBase, _collection_finde


class Test_AnsibleCollectionNSPkgLoader(unittest.TestCase):
    def test___init__(self):
        instance = _collection_finder._AnsibleCollectionNSPkgLoader()
        self.assertIsInstance(instance, _collection_finder._AnsibleCollectionNSPkgLoader)

    def test__validate_args(self):
        instance = _collection_finder._AnsibleCollectionNSPkgLoader()
        instance._split_name = ['a', 'b', 'c']
        with self.assertRaises(ImportError):
            instance._validate_args()

    def test__validate_args_valid(self):
        instance = _collection_finder._AnsibleCollectionNSPkgLoader()
        instance._split_name = ['a', 'b']
        instance._validate_args()

    def test__validate_final(self):
        instance = _collection_finder._AnsibleCollectionNSPkgLoader()
        instance._subpackage_search_paths = []
        instance._package_to_load = 'not_ansible'
        instance._candidate_paths = ['path1', 'path2']
        with self.assertRaises(ImportError):
            instance._validate_final()

    def test__validate_final_valid(self):
        instance = _collection_finder._AnsibleCollectionNSPkgLoader()
        instance._subpackage_search_paths = ['path1', 'path2']
        instance._package_to_load = 'ansible'
        instance._candidate_paths = ['path1', 'path2']
        instance._validate_final()

    def test___str__(self):
        instance = _collection_finder._AnsibleCollectionNSPkgLoader()
        result = instance.__str__()
        self.assertIsInstance(result, str)

    def test___repr__(self):
        instance = _collection_finder._AnsibleCollectionNSPkgLoader()
        result = instance.__repr__()
        self.assertIsInstance(result, str)

    def test___eq__(self):
        instance1 = _collection_finder._AnsibleCollectionNSPkgLoader()
        instance2 = _collection_finder._AnsibleCollectionNSPkgLoader()
        result = instance1 == instance2
        self.assertIsInstance(result, bool)

if __name__ == '__main__':
    unittest.main()