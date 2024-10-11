import unittest
from ansible.utils.collection_loader._collection_finder import AnsibleCollectionRef


class TestAnsiblePathHookFinder(unittest.TestCase):
    def test_find_module(self):
        path_hook_finder = _AnsiblePathHookFinder(None, '/path/to/collections')
        module = path_hook_finder.find_module('ansible_collections.my_collection.plugins.module_utils.my_module')
        self.assertIsNotNone(module)

    def test_iter_modules(self):
        path_hook_finder = _AnsiblePathHookFinder(None, '/path/to/collections')
        modules = list(path_hook_finder.iter_modules(['ansible_collections.my_collection.plugins.module_utils']))
        self.assertEqual(len(modules), 1)
        self.assertEqual(modules[0][1], 'ansible_collections.my_collection.plugins.module_utils.my_module')

if __name__ == '__main__':
    unittest.main()