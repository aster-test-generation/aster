import unittest
from ansible.utils.collection_loader._collection_finder import AnsibleCollectionRef


class Test_AnsiblePathHookFinder(unittest.TestCase):
    def test_find_module(self):
        instance = _collection_finder._AnsiblePathHookFinder()
        result = instance.find_module("ansible_collections")
        self.assertEqual(result, None)

    def test_iter_modules(self):
        instance = _collection_finder._AnsiblePathHookFinder()
        result = instance.iter_modules("ansible_collections")
        self.assertEqual(result, None)

    def test_repr(self):
        instance = _collection_finder._AnsiblePathHookFinder()
        result = instance.__repr__()
        self.assertEqual(result, None)

class Test_collection_finder(unittest.TestCase):
    def test_find_module(self):
        result = _collection_finder.find_module("ansible_collections")
        self.assertEqual(result, None)

    def test_iter_modules(self):
        result = _collection_finder.iter_modules("ansible_collections")
        self.assertEqual(result, None)

    def test_repr(self):
        result = _collection_finder.__repr__()
        self.assertEqual(result, None)

if __name__ == '__main__':
    unittest.main()