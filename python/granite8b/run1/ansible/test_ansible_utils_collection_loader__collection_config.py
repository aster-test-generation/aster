import unittest
from ansible.utils.collection_loader._collection_config import AnsibleCollectionConfig


class TestAnsibleCollectionConfig(unittest.TestCase):
    def test_collection_finder(self):
        instance = AnsibleCollectionConfig()
        instance.collection_finder = "test_value"
        self.assertEqual(instance.collection_finder, "test_value")

    def test_collection_paths(self):
        instance = AnsibleCollectionConfig()
        result = instance.collection_dirs
        self.assertIsInstance(result, list)

    def test_default_collection(self):
        instance = AnsibleCollectionConfig()
        instance.default_collection = "test_value"
        self.assertEqual(instance.default_collection, "test_value")

    def test_on_collection_load(self):
        instance = AnsibleCollectionConfig()
        instance.on_collection_load = lambda x: x
        self.assertEqual(instance.on_collection_load, instance.on_collection_load)

    def test_playbook_paths(self):
        instance = AnsibleCollectionConfig()
        instance.playbook_paths = ["test_value"]
        self.assertEqual(instance.playbook_paths, ["test_value"])

if __name__ == '__main__':
    unittest.main()