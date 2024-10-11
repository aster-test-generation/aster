import unittest
from ansible.module_utils.common.collections import CollectionSearch


class TestCollectionSearch(unittest.TestCase):
    def test_ensure_default_collection(self):
        result = CollectionSearch._ensure_default_collection()
        self.assertEqual(result, ['ansible.builtin', 'ansible.legacy'])

    def test_load_collections(self):
        instance = CollectionSearch()
        result = instance._load_collections()
        self.assertEqual(result, ['ansible.builtin', 'ansible.legacy'])

if __name__ == '__main__':
    unittest.main()