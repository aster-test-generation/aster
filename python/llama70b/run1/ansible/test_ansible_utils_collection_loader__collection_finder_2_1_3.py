import re
import unittest
from ansible.utils.collection_loader._collection_finder import AnsibleCollectionPkgLoaderBase, _AnsibleCollectionRootPkgLoader, _VALID_IDENTIFIER_STRING_REGEX, PB_EXTENSION


class TestAnsibleCollectionRootPkgLoader(unittest.TestCase):
    def test___init__(self):
        instance = _AnsibleCollectionRootPkgLoader()
        self.assertIsInstance(instance, _AnsibleCollectionRootPkgLoader)

    def test__validate_args(self):
        instance = _AnsibleCollectionRootPkgLoader()
        with self.assertRaises(ImportError):
            instance._validate_args()

    def test___str__(self):
        instance = _AnsibleCollectionRootPkgLoader()
        result = instance.__str__()
        self.assertIsInstance(result, str)

    def test___repr__(self):
        instance = _AnsibleCollectionRootPkgLoader()
        result = instance.__repr__()
        self.assertIsInstance(result, str)

    def test___eq__(self):
        instance1 = _AnsibleCollectionRootPkgLoader()
        instance2 = _AnsibleCollectionRootPkgLoader()
        result = instance1 == instance2
        self.assertIsInstance(result, bool)

class TestConstants(unittest.TestCase):
    def test_VALID_IDENTIFIER_STRING_REGEX(self):
        self.assertIsInstance(_VALID_IDENTIFIER_STRING_REGEX, re.Pattern)

    def test_PB_EXTENSIONS(self):
        self.assertEqual(PB_EXTENSIONS, ('.yml', '.yaml'))

if __name__ == '__main__':
    unittest.main()