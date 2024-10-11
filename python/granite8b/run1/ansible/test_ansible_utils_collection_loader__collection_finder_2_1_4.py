import unittest
from ansible.utils.collection_loader import AnsibleCollectionFinder


class TestAnsibleCollectionFinder(unittest.TestCase):
    def test_find_all_collections(self):
        finder = AnsibleCollectionFinder()
        collections = finder.find_all_collections()
        self.assertIsInstance(collections, list)
        for collection in collections:
            self.assertIsInstance(collection, AnsibleCollection)

    def test_find_collection(self):
        finder = AnsibleCollectionFinder()
        collection = finder.find_collection('ansible.posix')
        self.assertIsInstance(collection, AnsibleCollection)
        self.assertEqual(collection.name, 'ansible.posix')

    def test_find_plugin_in_collection(self):
        finder = AnsibleCollectionFinder()
        collection = finder.find_collection('ansible.posix')
        plugin = collection.find_plugin_in_collection('module_utils', 'common/text/converters.py')
        self.assertIsInstance(plugin, AnsiblePlugin)
        self.assertEqual(plugin.name, 'ansible.posix.module_utils.common.text.converters')

    def test_find_plugin_in_collection_with_subdirectory(self):
        finder = AnsibleCollectionFinder()
        collection = finder.find_collection('ansible.posix')
        plugin = collection.find_plugin_in_collection('module_utils', 'common/text/converters.py', subdirectory='subdirectory')
        self.assertIsInstance(plugin, AnsiblePlugin)
        self.assertEqual(plugin.name, 'ansible.posix.module_utils.common.text.converters.subdirectory')

    def test_find_plugin_in_collection_with_subdirectory_and_plugin_name(self):
        finder = AnsibleCollectionFinder()
        collection = finder.find_collection('ansible.posix')
        plugin = collection.find_plugin_in_collection('module_utils', 'common/text/converters.py', subdirectory='subdirectory', plugin_name='converters')
        self.assertIsInstance(plugin, AnsiblePlugin)
        self.assertEqual(plugin.name, 'ansible.posix.module_utils.common.text.converters.subdirectory.converters')

if __name__ == '__main__':
    unittest.main()