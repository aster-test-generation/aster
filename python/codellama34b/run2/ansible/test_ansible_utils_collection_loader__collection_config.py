import unittest
from ansible.utils.collection_loader import AnsibleCollectionConfig


class TestAnsibleCollectionConfig(unittest.TestCase):
    def test_collection_finder(self):
        instance = AnsibleCollectionConfig()
        result = instance.collection_finder
        self.assertEqual(result, None)

    def test_collection_paths(self):
        instance = AnsibleCollectionConfig()
        result = instance.collection_path
        self.assertEqual(result, None)

    def test_default_collection(self):
        instance = AnsibleCollectionConfig()
        result = instance.default_collection
        self.assertEqual(result, None)

    def test_on_collection_load(self):
        instance = AnsibleCollectionConfig()
        result = instance.on_collection_load
        self.assertEqual(result, None)

    def test_playbook_paths(self):
        instance = AnsibleCollectionConfig()
        result = instance.playbook_dirs
        self.assertEqual(result, None)

if __name__ == '__main__':
    unittest.main()