import unittest
from ansible.playbook.collectionsearch import CollectionSearch


class TestCollectionSearch(unittest.TestCase):
    def test_load_collections(self):
        search = CollectionSearch()
        self.assertEqual(search._load_collections('collections', ['a', 'b']), ['a', 'b'])
        self.assertEqual(search._load_collections('collections', None), ['ansible.legacy'])
        self.assertEqual(search._load_collections('collections', []), ['ansible.legacy'])
        self.assertEqual(search._load_collections('collections', ['ansible.builtin']), ['ansible.builtin', 'ansible.legacy'])

if __name__ == '__main__':
    unittest.main()