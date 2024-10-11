import unittest
from ansible.utils.collection_loader import _AnsibleCollectionPkgLoaderBase
from ansible.utils.collection_loader._collection_finder import _AnsibleCollectionPkgLoader


class Test_AnsibleCollectionPkgLoader(unittest.TestCase):
    def test_init(self):
        instance = _AnsibleCollectionPkgLoader()
        self.assertIsInstance(instance, _AnsibleCollectionPkgLoader)

    def test_validate_args(self):
        instance = _AnsibleCollectionPkgLoader()
        instance._validate_args()

    def test_validate_final(self):
        instance = _AnsibleCollectionPkgLoader()
        instance._validate_final()

    def test_load_module(self):
        instance = _AnsibleCollectionPkgLoader()
        instance.load_module()

    def test_canonicalize_meta(self):
        instance = _AnsibleCollectionPkgLoader()
        instance._canonicalize_meta()


if __name__ == '__main__':
    unittest.main()