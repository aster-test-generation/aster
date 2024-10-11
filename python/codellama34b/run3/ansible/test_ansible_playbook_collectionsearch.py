import unittest
from ansible.utils.collection_loader import AnsibleCollectionLoader


class TestCollectionSearch(unittest.TestCase):
    def test_load_collections(self):
        instance = CollectionSearch()
        result = instance._load_collections(None, None)
        self.assertEqual(result, None)

    def test_collections(self):
        instance = CollectionSearch()
        result = instance._collections
        self.assertEqual(result, None)

if __name__ == '__main__':
    unittest.main()