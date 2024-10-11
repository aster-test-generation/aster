import unittest
from ansible.utils.collection_loader._collection_finder import AnsibleCollectionRef


class TestAnsiblePathHookFinder(unittest.TestCase):
    def test_find_module(self):
        finder = _AnsiblePathHookFinder(collection_finder=None, pathctx='/path/to/context')
        result = finder.find_module('toplevel_pkg')
        self.assertEqual(result, None)

    def test_iter_modules(self):
        finder = _AnsiblePathHookFinder(collection_finder=None, pathctx='/path/to/context')
        result = list(finder.iter_modules('prefix'))
        self.assertEqual(result, [])

    def test_repr(self):
        finder = _AnsiblePathHookFinder(collection_finder=None, pathctx='/path/to/context')
        result = finder.__repr__()
        self.assertEqual(result, "AnsiblePathHookFinder(path='/path/to/context')")

if __name__ == '__main__':
    unittest.main()