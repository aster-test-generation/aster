import unittest
from ansible.utils.collection_loader import _collection_config


class Test_EventSource(unittest.TestCase):
    def test_init(self):
        instance = _collection_config._EventSource()
        self.assertIsInstance(instance, _collection_config._EventSource)

    def test_iadd(self):
        instance = _collection_config._EventSource()
        def handler(): pass
        instance += handler
        self.assertIn(handler, instance._handlers)

    def test_isub(self):
        instance = _collection_config._EventSource()
        def handler(): pass
        instance += handler
        instance -= handler
        self.assertNotIn(handler, instance._handlers)

    def test_on_exception(self):
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
    def test_init(self):
        instance = _collection_config.AnsibleCollectionConfig('meta', 'name', ())
        self.assertIsInstance(instance, _collection_config.AnsibleCollectionConfig)

    def test_collection_finder_getter(self):
        instance = _collection_config.AnsibleCollectionConfig('meta', 'name', ())
        self.assertIsNone(instance.collection_finder)

    def test_collection_finder_setter(self):
        instance = _collection_config.AnsibleCollectionConfig('meta', 'name', ())
        finder = object()
        instance.collection_finder = finder
        self.assertEqual(instance.collection_finder, finder)

    def test_collection_paths(self):
        instance = _collection_config.AnsibleCollectionConfig('meta', 'name', ())
        finder = object()
        finder._n_collection_paths = ['path']
        instance.collection_finder = finder
        result = instance.collection_paths
        self.assertEqual(result, ['path'])

    def test_default_collection_getter(self):
        instance = _collection_config.AnsibleCollectionConfig('meta', 'name', ())
        self.assertIsNone(instance.default_collection)

    def test_default_collection_setter(self):
        instance = _collection_config.AnsibleCollectionConfig('meta', 'name', ())
        instance.default_collection = 'default'
        self.assertEqual(instance.default_collection, 'default')

    def test_on_collection_load_getter(self):
        instance = _collection_config.AnsibleCollectionConfig('meta', 'name', ())
        self.assertIsInstance(instance.on_collection_load, _collection_config._EventSource)

    def test_on_collection_load_setter(self):
        instance = _collection_config.AnsibleCollectionConfig('meta', 'name', ())
        with self.assertRaises(ValueError):
            instance.on_collection_load = object()

    def test_playbook_paths_getter(self):
        instance = _collection_config.AnsibleCollectionConfig('meta', 'name', ())
        finder = object()
        finder._n_playbook_paths = ['path']
        instance.collection_finder = finder
        result = instance.playbook_paths
        self.assertEqual(result, ['path'])

    def test_playbook_paths_setter(self):
        instance = _collection_config.AnsibleCollectionConfig('meta', 'name', ())
        finder = object()
        instance.collection_finder = finder
        instance.playbook_paths = ['path']
        self.assertEqual(finder._n_playbook_paths, ['path'])

    def test_require_finder(self):
        instance = _collection_config.AnsibleCollectionConfig('meta', 'name', ())
        with self.assertRaises(NotImplementedError):
            instance._require_finder()

if __name__ == '__main__':
    unittest.main()