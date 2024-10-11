import unittest
from ansible.utils.collection_loader._collection_finder import AnsibleCollectionRef


class TestAnsiblePathHookFinder(unittest.TestCase):
    def test_find_module(self):
        finder = _AnsiblePathHookFinder(None, '/path/to/collections')
        result = finder.find_module('ansible_collections.my_collection.plugins.module_utils.my_module')
        self.assertIsNotNone(result)

    def test_iter_modules(self):
        finder = _AnsiblePathHookFinder(None, '/path/to/collections')
        result = list(finder.iter_modules(['ansible_collections.my_collection.plugins.module_utils.my_module']))
        self.assertEqual(len(result), 1)
        self.assertEqual(result[0][0], 'ansible_collections.my_collection.plugins.module_utils.my_module.my_function')

if __name__ == '__main__':
    unittest.main()