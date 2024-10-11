import unittest
from ansible.utils.collection_loader._collection_finder import _AnsibleCollectionPkgLoaderBase


class TestAnsibleCollectionRootPkgLoader(unittest.TestCase):
    def test_validate_args(self):
        loader = _AnsibleCollectionRootPkgLoader()
        loader._split_name = ['ansible_collections']
        loader._validate_args()
        self.assertEqual(loader._split_name, ['ansible_collections'])

    def test_get_code(self):
        loader = _AnsibleCollectionRootPkgLoader()
        self.assertEqual(loader.get_code('test'), None)

    def test_get_source(self):
        loader = _AnsibleCollectionRootPkgLoader()
        self.assertEqual(loader.get_source('test'), None)

if __name__ == '__main__':
    unittest.main()