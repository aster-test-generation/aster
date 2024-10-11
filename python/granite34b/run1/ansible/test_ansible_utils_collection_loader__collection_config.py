import unittest
from ansible.utils.collection_loader._collection_config import _AnsibleCollectionConfig


class TestAnsibleCollectionConfig(unittest.TestCase):

    def test_init(self):
        config = _AnsibleCollectionConfig()
        self.assertIsNone(config._collection_finder)
        self.assertIsNone(config._default_collection)
        self.assertIsInstance(config._on_collection_load, _EventSource)

    def test_collection_finder(self):
        config = _AnsibleCollectionConfig(collection_dir=None, src=None)
        config.collection_finder = "example_finder"
        self.assertEqual(config.collection_finder, "example_finder")

    def test_collection_paths(self):
        config = _AnsibleCollectionConfig(collection_name="test")
        config.collection_finder = "example_finder"
        self.assertEqual(config.collection_paths, ["example_finder"])

    def test_default_collection(self):
        config = _AnsibleCollectionConfig()
        config.default_collection = "example_collection"
        self.assertEqual(config.default_collection, "example_collection")

    def test_on_collection_load(self):
        config = _AnsibleCollectionConfig(collection_name="test")
        config.on_collection_load += lambda: "example_handler"
        self.assertEqual(len(config.on_collection_load._handlers), 1)

    def test_playbook_paths(self):
        config = _AnsibleCollectionConfig(collection_dir=None)
        config.collection_finder = "example_finder"
        config.playbook_paths = ["example_path"]
        self.assertEqual(config.playbook_paths, ["example_path"])

if __name__ == '__main__':
    unittest.main()