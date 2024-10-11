import unittest
from ansible.utils.collection_loader import AnsibleCollectionRef


class Test_AnsiblePathHookFinder(unittest.TestCase):
    def test_find_module(self):
        instance = _collection_finder._AnsiblePathHookFinder()
        result = instance.find_module()
        self.assertEqual(result, None)

    def test_iter_modules(self):
        instance = _collection_finder._AnsiblePathHookFinder()
        result = instance.iter_modules()
        self.assertEqual(result, None)

    def test_repr(self):
        instance = _collection_finder._AnsiblePathHookFinder()
        result = instance.__repr__()
        self.assertEqual(result, None)

if __name__ == '__main__':
    unittest.main()