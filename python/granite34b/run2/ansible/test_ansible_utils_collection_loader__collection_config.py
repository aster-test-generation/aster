import unittest
from ansible.utils.collection_loader._collection_config import _AnsibleCollectionConfig


class TestAnsibleCollectionConfig(unittest.TestCase):
    def test_init(self):
        config = _AnsibleCollectionConfig()
        self.assertEqual(config._collection_finder, None)
        self.assertEqual(config._default_collection, None)
        self.assertEqual(config._on_collection_load._handlers, set())

    def test_collection_finder(self):
        config = _AnsibleCollectionConfig(collection_name='test')
        config.collection_finder = "example_finder"
        self.assertEqual(config.collection_finder, "example_finder")

    def test_collection_paths(self):
        config = _AnsibleCollectionConfig(collection_name='test')
        config.collection_finder = "example_finder"
        self.assertEqual(config.collection_paths, [])

    def test_default_collection(self):
        config = _AnsibleCollectionConfig(collection_name='test')
        config.default_collection = "example_collection"
        self.assertEqual(config.default_collection, "example_collection")

    def test_on_collection_load(self):
        config = _AnsibleCollectionConfig(collection_name="test")
        handler = lambda x: x
        config.on_collection_load += handler
        self.assertEqual(config.on_collection_load._handlers, {handler})

    def test_playbook_paths(self):
        config = _AnsibleCollectionConfig(collection_name="test")
        config.collection_finder = "example_finder"
        config.playbook_paths = ["path1", "path2"]
        self.assertEqual(config.playbook_paths, ["path1", "path2"])

if __name__ == '__main__':
    unittest.main()