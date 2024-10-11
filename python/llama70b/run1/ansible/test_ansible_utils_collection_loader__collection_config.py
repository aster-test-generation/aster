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
        self.assertTrue(instance._on_exception(handler, exc, None, None))

    def test_fire(self):
        instance = _collection_config._EventSource()
        def handler(arg): self.assertEqual(arg, 'test')
        instance += handler
        instance.fire('test')

class Test_AnsibleCollectionConfig(unittest.TestCase):
    def test___init__(self):
        cls = _collection_config._AnsibleCollectionConfig('meta', 'name', ())
        self.assertIsInstance(cls, _collection_config._AnsibleCollectionConfig)

    def test_collection_finder(self):
        cls = _collection_config._AnsibleCollectionConfig('meta', 'name', ())
        cls.collection_finder = 'finder'
        self.assertEqual(cls.collection_finder, 'finder')

    def test_collection_paths(self):
        cls = _collection_config._AnsibleCollectionConfig('meta', 'name', ())
        cls.collection_finder = 'finder'
        cls.collection_finder._n_collection_paths = ['path1', 'path2']
        self.assertEqual(cls.collection_paths, ['path1', 'path2'])

    def test_default_collection(self):
        cls = _collection_config._AnsibleCollectionConfig('meta', 'name', ())
        cls.default_collection = 'default'
        self.assertEqual(cls.default_collection, 'default')

    def test_on_collection_load(self):
        cls = _collection_config._AnsibleCollectionConfig('meta', 'name', ())
        def handler(): pass
        cls.on_collection_load += handler
        self.assertIn(handler, cls.on_collection_load._handlers)

    def test_playbook_paths(self):
        cls = _collection_config._AnsibleCollectionConfig('meta', 'name', ())
        cls.collection_finder = 'finder'
        cls.collection_finder._n_playbook_paths = ['path1', 'path2']
        self.assertEqual(cls.playbook_paths, ['path1', 'path2'])

    def test__require_finder(self):
        cls = _collection_config._AnsibleCollectionConfig('meta', 'name', ())
        with self.assertRaises(NotImplementedError):
            cls._require_finder()

class Test_AnsibleCollectionConfig_instance(unittest.TestCase):
    def test___init__(self):
        instance = _collection_config.AnsibleCollectionConfig()
        self.assertIsInstance(instance, _collection_config.AnsibleCollectionConfig)

if __name__ == '__main__':
    unittest.main()