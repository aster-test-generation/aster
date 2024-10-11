import unittest
from ansible.playbook.collectionsearch import CollectionSearch
from ansible.utils.collection_loader import AnsibleCollectionConfig
from ansible.template import Environment
from ansible.utils.display import Display


class TestCollectionSearch(unittest.TestCase):
    def test_load_collections(self):
        collection_search = CollectionSearch()
        collection_list = ['test_collection1', 'test_collection2']
        result = collection_search._load_collections('collections', [collection_list])
        self.assertEqual(result, collection_list)

    def test_ensure_default_collection(self):
        collection_search = CollectionSearch()
        collection_list = ['test_collection1', 'test_collection2']
        result = collection_search.ensure_default_collection(collection_list=collection_list)
        self.assertEqual(result, collection_list)

    def test_set_collections(self):
        collection_search = CollectionSearch()
        collection_list = ['test_collection1', 'test_collection2']
        collection_search._collections = collection_list
        self.assertEqual(collection_search.collections, collection_list)

if __name__ == '__main__':
    unittest.main()