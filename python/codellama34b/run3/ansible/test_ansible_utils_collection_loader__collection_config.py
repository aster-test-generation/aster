import unittest
from ansible.utils.collection_loader._collection_config import *



class Test_EventSource(unittest.TestCase):
    def test___iadd__(self):
        instance = EventSource()
        handler = lambda: None
        result = instance.__iadd__(handler)
        self.assertEqual(result, instance)

    def test___isub__(self):
        instance = EventSource()
        handler = lambda: None
        instance.__iadd__(handler)
        result = instance.__isub__(handler)
        self.assertEqual(result, instance)

    def test__on_exception(self):
        instance = EventSource()
        handler = lambda: None
        exc = Exception()
        result = instance._on_exception(handler, exc)
        self.assertEqual(result, True)

class Test_AnsibleCollectionConfig(unittest.TestCase):
    def test___init__(self):
        meta = None
        name = None
        bases = None
        instance = AnsibleCollectionConfig(meta, name, bases)
        self.assertEqual(instance._collection_finder, None)
        self.assertEqual(instance._default_collection, None)
        self.assertEqual(instance._on_collection_load, _EventSource())

    def test_collection_finder(self):
        instance = AnsibleCollectionConfig(None, None, None)
        value = None
        result = instance.collection_finder
        self.assertEqual(result, None)
        instance.collection_finder = value
        result = instance.collection_finder
        self.assertEqual(result, value)

    def test_collection_paths(self):
        instance = AnsibleCollectionConfig(None, None, None)
        result = instance.collection_paths
        self.assertEqual(result, None)

    def test_default_collection(self):
        instance = AnsibleCollectionConfig(None, None, None)
        value = None
        result = instance.default_collection
        self.assertEqual(result, None)
        instance.default_collection = value
        result = instance.default_collection
        self.assertEqual(result, value)

    def test_on_collection_load(self):
        instance = AnsibleCollectionConfig(None, None, None)
        value = None
        result = instance.on_collection_load
        self.assertEqual(result, _EventSource())
        instance.on_collection_load = value
        result = instance.on_collection_load
        self.assertEqual(result, _EventSource())

    def test_playbook_paths(self):
        instance = AnsibleCollectionConfig(None, None, None)
        result = instance.playbook_paths
        self.assertEqual(result, None)

    def test_playbook_paths_setter(self):
        instance = AnsibleCollectionConfig(None, None, None)
        value = None
        result = instance.playbook_paths
        self.assertEqual(result, None)
        instance.playbook_paths = value
        result = instance.playbook_paths
        self.assertEqual(result, None)

    def test__require_finder(self):
        instance = AnsibleCollectionConfig(None, None, None)
        result = instance._require_finder()
        self.assertEqual(result, None)

class TestAnsibleCollectionConfig(unittest.TestCase):
    def test___init__(self):
        instance = AnsibleCollectionConfig()
        self.assertEqual(instance._collection_finder, None)
        self.assertEqual(instance._default_collection, None)
        self.assertEqual(instance._on_collection_load, EventSource())

    def test_collection_finder(self):
        instance = AnsibleCollectionConfig()
        value = None
        result = instance.collection_finder
        self.assertEqual(result, None)
        instance.collection_finder = value
        result = instance.collection_finder
        self.assertEqual(result, value)

    def test_collection_paths(self):
        instance = AnsibleCollectionConfig()
        result = instance.collection_path
        self.assertEqual(result, None)

if __name__ == '__main__':
    unittest.main()