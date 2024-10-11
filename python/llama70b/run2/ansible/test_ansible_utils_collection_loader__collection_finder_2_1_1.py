import unittest
from ansible.utils.collection_loader import AnsibleCollectionRe


class TestAnsiblePathHookFinder(unittest.TestCase):
    def test_init(self):
        collection_finder = object()
        pathctx = 'pathctx'
        instance = _collection_finder._AnsiblePathHookFinder(collection_finder, pathctx)
        self.assertEqual(instance._pathctx, pathctx)
        self.assertEqual(instance._collection_finder, collection_finder)
        self.assertIsNone(instance._file_finder)

    def test_get_filefinder_path_hook(self):
        result = _collection_finder._AnsiblePathHookFinder._get_filefinder_path_hook()
        self.assertIsNotNone(result)

    def test_find_module(self):
        collection_finder = object()
        pathctx = 'pathctx'
        instance = _collection_finder._AnsiblePathHookFinder(collection_finder, pathctx)
        fullname = 'ansible_collections.test'
        result = instance.find_module(fullname)
        self.assertIsNotNone(result)

    def test_find_module_py3(self):
        collection_finder = object()
        pathctx = 'pathctx'
        instance = _collection_finder._AnsiblePathHookFinder(collection_finder, pathctx)
        fullname = 'ansible_collections.test'
        instance._file_finder = object()
        result = instance.find_module(fullname)
        self.assertIsNotNone(result)

    def test_iter_modules(self):
        collection_finder = object()
        pathctx = 'pathctx'
        instance = _collection_finder._AnsiblePathHookFinder(collection_finder, pathctx)
        prefix = 'ansible_collections.'
        result = instance.iter_modules(prefix)
        self.assertIsNotNone(result)

    def test_repr(self):
        collection_finder = object()
        pathctx = 'pathctx'
        instance = _collection_finder._AnsiblePathHookFinder(collection_finder, pathctx)
        result = instance.__repr__()
        self.assertEqual(result, "_AnsiblePathHookFinder(path='pathctx')")

if __name__ == '__main__':
    unittest.main()