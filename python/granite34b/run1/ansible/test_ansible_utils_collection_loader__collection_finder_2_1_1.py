import unittest
from ansible.utils.collection_loader._collection_finder import AnsibleCollectionRef


class TestAnsiblePathHookFinder(unittest.TestCase):
    def test_find_module(self):
        finder = _AnsiblePathHookFinder(None, '/path/to/context')
        result = finder.find_module('ansible_collections.my_collection')
        self.assertIsNotNone(result)

    def test_iter_modules(self):
        finder = _AnsiblePathHookFinder(None, '/path/to/context')
        result = list(finder.iter_modules('ansible_collections.my_collection'))
        self.assertGreater(len(result), 0)

    def test_repr(self):
        finder = _AnsiblePathHookFinder(None, '/path/to/context')
        result = repr(finder)
        self.assertEqual(result, "_AnsiblePathHookFinder(path='/path/to/context')")

if __name__ == '__main__':
    unittest.main()