import unittest
from ansible.playbook.collectionsearch import CollectionSearch


class TestCollectionSearch(unittest.TestCase):
    def test_ensure_default_collection(self):
        collection_list = ['ansible.builtin', 'ansible.legacy']
        result = CollectionSearch._ensure_default_collection(collection_list)
        self.assertEqual(result, ['ansible.builtin', 'ansible.legacy'])

    def test_load_collections(self):
        instance = CollectionSearch()
        result = instance._load_collections('collections', ['ansible.builtin', 'ansible.legacy'])
        self.assertEqual(result, ['ansible.builtin', 'ansible.legacy'])

if __name__ == '__main__':
    unittest.main()