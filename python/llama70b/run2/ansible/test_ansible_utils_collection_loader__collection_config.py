import unittest
from ansible.utils.collection_loader import _collection_config


class Test_EventSource(unittest.TestCase):
    def test___init__(self):
        instance = _collection_config._EventSource()
        self.assertIsInstance(instance, _collection_config._EventSource)

    def test___iadd__(self):
        instance = _collection_config._EventSource()
        def handler(): pass
        instance += handler
        self.assertIn(handler, instance._handlers)

    def test___isub__(self):
        instance = _collection_config._EventSource()
        def handler(): pass
        instance += handler
        instance -= handler
        self.assertNotIn(handler, instance._handlers)

    def test__on_exception(self):
        instance = _collection_config._EventSource()
        def handler(): pass
        exc = Exception()
        result = instance._on_exception(handler, exc)
        self.assertTrue(result)

    def test_fire(self):
        instance = _collection_config._EventSource()
        def handler(arg): return arg
        instance += handler
        result = instance.fire('arg')
        self.assertEqual(result, None)

class Test_AnsibleCollectionConfig(unittest.TestCase):
    def test___init__(self):
        meta = type('Meta', (), {})
        name = 'TestCollection'
        bases = ()
        instance = _collection_config._AnsibleCollectionConfig(meta, name, bases)
        self.assertIsInstance(instance, _collection_config._AnsibleCollectionConfig)

    def test_collection_finder(self):
        instance = _collection_config.AnsibleCollectionConfig
        finder = object()
        instance.collection_finder = finder
        self.assertEqual(instance.collection_finder, finder)

    def test_collection_paths(self):
        instance = _collection_config.AnsibleCollectionConfig
        finder = object()
        finder._n_collection_paths = ['path1', 'path2']
        instance.collection_finder = finder
        result = instance.collection_paths
        self.assertEqual(result, ['path1', 'path2'])

    def test_default_collection(self):
        instance = _collection_config.AnsibleCollectionConfig
        default_collection = object()
        instance.default_collection = default_collection
        self.assertEqual(instance.default_collection, default_collection)

    def test_on_collection_load(self):
        instance = _collection_config.AnsibleCollectionConfig
        event_source = _collection_config._EventSource()
        instance.on_collection_load += event_source
        self.assertIn(event_source, instance.on_collection_load._handlers)

    def test_playbook_paths(self):
        instance = _collection_config.AnsibleCollectionConfig
        finder = object()
        finder._n_playbook_paths = ['path1', 'path2']
        instance.collection_finder = finder
        result = instance.playbook_paths
        self.assertEqual(result, ['path1', 'path2'])

    def test__require_finder(self):
        instance = _collection_config.AnsibleCollectionConfig
        with self.assertRaises(NotImplementedError):
            instance._require_finder()

if __name__ == '__main__':
    unittest.main()