from ansible.utils.collection_loader import CollectionFinde
import unittest
from ansible.utils.collection_loader._collection_finder import _AnsiblePathHookFinder


class TestAnsiblePathHookFinder(unittest.TestCase):
    def test_init(self):
        collection_finder = object()
        pathctx = object()
        finder = _AnsiblePathHookFinder(collection_finder, pathctx)
        self.assertEqual(finder._pathctx, to_native(pathctx))
        self.assertEqual(finder._collection_finder, collection_finder)

    def test_get_filefinder_path_hook(self):
        finder = _AnsiblePathHookFinder(object(), object())
        self.assertIsNone(finder._get_filefinder_path_hook())

    def test_find_module(self):
        collection_finder = object()
        pathctx = object()
        finder = _AnsiblePathHookFinder(collection_finder, pathctx)
        self.assertIsNone(finder.find_module('ansible_collections', path=None))

    def test_iter_modules(self):
        collection_finder = object()
        pathctx = object()
        finder = _AnsiblePathHookFinder(collection_finder, pathctx)
        self.assertEqual(finder.iter_modules(''), [])

    def test_repr(self):
        collection_finder = object()
        pathctx = object()
        finder = _AnsiblePathHookFinder(collection_finder, pathctx)
        self.assertEqual(repr(finder), "_AnsiblePathHookFinder(path='{}')".format(to_native(pathctx)))

if __name__ == '__main__':
    unittest.main()