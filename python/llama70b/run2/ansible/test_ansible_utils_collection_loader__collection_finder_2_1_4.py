import unittest
from ansible.utils.collection_loader import _collection_finder 


class TestAnsibleCollectionNSPkgLoader(unittest.TestCase):
    def test___init__(self):
        instance = _AnsibleCollectionNSPkgLoader()
        self.assertIsInstance(instance, _AnsibleCollectionNSPkgLoader)

    def test__validate_args(self):
        instance = _AnsibleCollectionNSPkgLoader()
        with self.assertRaises(ImportError):
            instance._validate_args()

    def test__validate_final(self):
        instance = _AnsibleCollectionNSPkgLoader()
        with self.assertRaises(ImportError):
            instance._validate_final()

    def test___str__(self):
        instance = _AnsibleCollectionNSPkgLoader()
        result = instance.__str__()
        self.assertIsInstance(result, str)

    def test___repr__(self):
        instance = _AnsibleCollectionNSPkgLoader()
        result = instance.__repr__()
        self.assertIsInstance(result, str)

    def test___eq__(self):
        instance1 = _AnsibleCollectionNSPkgLoader()
        instance2 = _AnsibleCollectionNSPkgLoader()
        result = instance1 == instance2
        self.assertIsInstance(result, bool)

class TestAnsibleCollectionPkgLoaderBase(unittest.TestCase):
    def test___init__(self):
        instance = _AnsibleCollectionPkgLoaderBase()
        self.assertIsInstance(instance, _AnsibleCollectionPkgLoaderBase)

if __name__ == '__main__':
    unittest.main()