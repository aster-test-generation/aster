import unittest
from ansible.utils.collection_loader._collection_pkg_loader_base import AnsibleCollectionPkgLoaderBase


class TestAnsibleCollectionFinder(unittest.TestCase):
    def test_find_all_collections(self):
        finder = AnsibleCollectionFinder()
        collections = finder.find_all_collections()
        self.assertIsNotNone(collections)
        self.assertGreater(len(collections), 0)

    def test_find_collection(self):
        finder = AnsibleCollectionFinder()
        collection = finder.find_collection('ansible.posix')
        self.assertIsNotNone(collection)
        self.assertEqual(collection.name, 'ansible.posix')

    def test_find_plugin_in_collection(self):
        finder = AnsibleCollectionFinder()
        collection = finder.find_collection('ansible.posix')
        plugin = collection.find_plugin_in_collection('file', 'copy')
        self.assertIsNotNone(plugin)
        self.assertEqual(plugin.name, 'copy')

    def test_find_plugin_in_collection_not_found(self):
        finder = AnsibleCollectionFinder()
        collection = finder.find_collection('ansible.posix')
        plugin = collection.find_plugin_in_collection('file', 'not_found')
        self.assertIsNone(plugin)

if __name__ == '__main__':
    unittest.main()