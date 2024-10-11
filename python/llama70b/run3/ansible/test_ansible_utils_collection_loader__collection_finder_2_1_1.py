import unittest
from ansible.utils.collection_loader import CollectionFinder as _collection_finde


class TestAnsiblePathHookFinder(unittest.TestCase):
    def test_init(self):
        collection_finder = object()
        pathctx = 'pathctx'
        finder = _collection_finder._AnsiblePathHookFinder(collection_finder, pathctx)
        self.assertEqual(finder._pathctx, pathctx)
        self.assertEqual(finder._collection_finder, collection_finder)

    def test_get_filefinder_path_hook(self):
        finder = _collection_finder._AnsiblePathHookFinder(object(), 'pathctx')
        result = finder._get_filefinder_path_hook()
        self.assertIsNotNone(result)

    def test_find_module(self):
        collection_finder = object()
        pathctx = 'pathctx'
        finder = _collection_finder._AnsiblePathHookFinder(collection_finder, pathctx)
        fullname = 'ansible_collections.test'
        result = finder.find_module(fullname)
        self.assertIsNotNone(result)

    def test_find_module_py2(self):
        collection_finder = object()
        pathctx = 'pathctx'
        finder = _collection_finder._AnsiblePathHookFinder(collection_finder, pathctx)
        fullname = 'ansible_collections.test'
        result = finder.find_module(fullname, path=['path'])
        self.assertIsNotNone(result)

    def test_iter_modules(self):
        collection_finder = object()
        pathctx = 'pathctx'
        finder = _collection_finder._AnsiblePathHookFinder(collection_finder, pathctx)
        prefix = 'ansible_collections.'
        result = finder.iter_modules(prefix)
        self.assertIsNotNone(result)

    def test_repr(self):
        collection_finder = object()
        pathctx = 'pathctx'
        finder = _collection_finder._AnsiblePathHookFinder(collection_finder, pathctx)
        result = finder.__repr__()
        self.assertEqual(result, "_AnsiblePathHookFinder(path='pathctx')")

    def test_private_method(self):
        collection_finder = object()
        pathctx = 'pathctx'
        finder = _collection_finder._AnsiblePathHookFinder(collection_finder, pathctx)
        result = finder._AnsiblePathHookFinder__get_filefinder_path_hook()
        self.assertIsNotNone(result)

if __name__ == '__main__':
    unittest.main()