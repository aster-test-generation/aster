import unittest
from ansible.utils.collection_loader import AnsibleCollectionFinder


class TestAnsibleCollectionFinder(unittest.TestCase):
    def test_find_collections(self):
        finder = AnsibleCollectionFinder()
        collections = finder.find_collections()
        self.assertIsInstance(collections, list)
        for collection in collections:
            self.assertIsInstance(collection, AnsibleCollection)

    def test_find_collection(self):
        finder = AnsibleCollectionFinder()
        collection = finder.find_collection('ansible.builtin')
        self.assertIsInstance(collection, AnsibleCollection)
        self.assertEqual(collection.name, 'ansible.builtin')

    def test_find_plugin_loader(self):
        finder = AnsibleCollectionFinder()
        plugin_loader = finder.find_plugin_loader('ansible.builtin')
        self.assertIsInstance(plugin_loader, AnsiblePluginLoader)
        self.assertEqual(plugin_loader.collection_name, 'ansible.builtin')

    def test_find_all_plugin_loaders(self):
        finder = AnsibleCollectionFinder()
        plugin_loaders = finder.find_all_plugin_loaders()
        self.assertIsInstance(plugin_loaders, dict)
        for collection_name, plugin_loader in plugin_loaders.items():
            self.assertIsInstance(plugin_loader, AnsiblePluginLoader)
            self.assertEqual(plugin_loader.collection_name, collection_name)

if __name__ == '__main__':
    unittest.main()