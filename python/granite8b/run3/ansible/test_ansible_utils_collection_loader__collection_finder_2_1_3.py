import unittest
from ansible.utils.collection_loader import AnsibleCollectionFinder


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
        plugin = collection.find_plugin_in_collection('module_utils', 'common', 'text', 'converters.py')
        self.assertIsNotNone(plugin)
        self.assertEqual(plugin.name, 'ansible.posix.module_utils.common.text.converters')

    def test_find_plugin_in_collection_with_subdirectory(self):
        finder = AnsibleCollectionFinder()
        collection = finder.find_collection('ansible.posix')
        plugin = collection.find_plugin_in_collection('module_utils', 'common', 'text', 'converters.py', subdirectory='subdirectory')
        self.assertIsNotNone(plugin)
        self.assertEqual(plugin.name, 'ansible.posix.module_utils.common.text.converters.subdirectory')

    def test_find_plugin_in_collection_with_subdirectory_and_file(self):
        finder = AnsibleCollectionFinder()
        collection = finder.find_collection('ansible.posix')
        plugin = collection.find_plugin_in_collection('module_utils', 'common', 'text', 'converters.py', subdirectory='subdirectory', file='file.py')
        self.assertIsNotNone(plugin)
        self.assertEqual(plugin.name, 'ansible.posix.module_utils.common.text.converters.subdirectory.file')

    def test_find_plugin_in_collection_with_subdirectory_and_file_and_class(self):
        finder = AnsibleCollectionFinder()
        collection = finder.find_collection('ansible.posix')
        plugin = collection.find_plugin_in_collection('module_utils', 'common', 'text', 'converters.py', subdirectory='subdirectory', file='file.py', class_name='MyClass')
        self.assertIsNotNone(plugin)
        self.assertEqual(plugin.name, 'ansible.posix.module_utils.common.text.converters.subdirectory.file.MyClass')

if __name__ == '__main__':
    unittest.main()