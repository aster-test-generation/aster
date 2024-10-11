import unittest
from ansible.utils.collection_loader._collection_finder import AnsibleCollectionRef


class TestAnsiblePathHookFinder(unittest.TestCase):
    def setUp(self):
        self.pathctx = '/path/to/collections'
        self.collection_finder = _AnsiblePathHookFinder(self.pathctx)

    def test_find_module(self):
        fullname = 'ansible_collections.test.collection'
        result = self.collection_finder.find_module(fullname)
        self.assertIsNotNone(result)

    def test_iter_modules(self):
        prefix = 'ansible_collections.test'
        result = self.collection_finder.iter_modules(prefix)
        self.assertIsNotNone(result)

    def test_repr(self):
        result = self.collection_finder.__repr__()
        self.assertEqual(result, "_AnsiblePathHookFinder(path='/path/to/collections')")

if __name__ == '__main__':
    unittest.main()