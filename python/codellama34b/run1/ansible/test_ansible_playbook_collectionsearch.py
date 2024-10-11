import unittest
from ansible.utils.collection_loader import *


class TestCollectionSearch(unittest.TestCase):
    def test_load_collections(self):
        instance = CollectionSearch()
        result = instance._load_collections('collections', [])
        self.assertEqual(result, None)


if __name__ == '__main__':
    unittest.main()