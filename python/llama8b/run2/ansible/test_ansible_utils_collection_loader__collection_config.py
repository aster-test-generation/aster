import unittest
from ansible.utils.collection_loader import _AnsibleCollectionConfig, AnsibleCollectionConfig


class TestAnsibleCollectionConfig(unittest.TestCase):
    def test_collection_finder(self):
        config = AnsibleCollectionConfig()
        config.collection_finder = 'test_finder'
        self.assertEqual(config.collection_finder, 'test_finder')

    def test_collection_paths(self):
        config = AnsibleCollectionConfig()
        config.collection_finder = 'test_finder'
        config._collection_finder._n_collection_paths = ['path1', 'path2']
        self.assertEqual(config.collection_paths, ['path1', 'path2'])

    def test_default_collection(self):
        config = AnsibleCollectionConfig()
        config.default_collection = 'test_collection'
        self.assertEqual(config.default_collection, 'test_collection')

    def test_on_collection_load(self):
        config = AnsibleCollectionConfig()
        on_collection_load = _EventSource()
        config.on_collection_load = on_collection_load
        self.assertEqual(config.on_collection_load, on_collection_load)

    def test_playbook_paths(self):
        config = AnsibleCollectionConfig()
        config.playbook_paths = ['path1', 'path2']
        self.assertEqual(config.playbook_paths, ['path1', 'path2'])

    def test_require_finder(self):
        config = AnsibleCollectionConfig()
        with self.assertRaises(NotImplementedError):
            config._require_finder()

    def test_str_method(self):
        config = AnsibleCollectionConfig()
        result = str(config)
        self.assertEqual(result, 'AnsibleCollectionConfig')

    def test_repr_method(self):
        config = AnsibleCollectionConfig()
        result = repr(config)
        self.assertEqual(result, 'AnsibleCollectionConfig()')

    def test_eq_method(self):
        config1 = AnsibleCollectionConfig()
        config2 = AnsibleCollectionConfig()
        self.assertTrue(config1 == config2)

    def test_init_method(self):
        config = AnsibleCollectionConfig()
        self.assertIsInstance(config, AnsibleCollectionConfig)

if __name__ == '__main__':
    unittest.main()