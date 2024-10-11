import unittest
from ansible.utils.collection_loader import *



class Test_EventSource(unittest.TestCase):
    def test___iadd__(self):
        instance = EventSource()
        result = instance.__iadd__(1)
        self.assertEqual(result, instance)

    def test___isub__(self):
        instance = EventSource()
        result = instance.__isub__(1)
        self.assertEqual(result, instance)

    def test__on_exception(self):
        instance = EventSource()
        result = instance._on_exception(1, 1)
        self.assertEqual(result, True)

    def test_fire(self):
        instance = EventSource()
        result = instance.fire()
        self.assertEqual(result, None)

class Test_AnsibleCollectionConfig(unittest.TestCase):
    def test___init__(self):
        instance = AnsibleCollectionConfig()
        self.assertEqual(instance._collection_finder, None)
        self.assertEqual(instance._default_collection, None)
        self.assertEqual(instance._on_collection_load, _EventSource())

    def test___init___meta(self):
        instance = AnsibleCollectionConfig(1, 1, 1)
        self.assertEqual(instance._collection_finder, None)
        self.assertEqual(instance._default_collection, None)
        self.assertEqual(instance._on_collection_load, _EventSource())

    def test___init___name(self):
        instance = AnsibleCollectionConfig(1, 1, 1)
        self.assertEqual(instance._collection_finder, None)
        self.assertEqual(instance._default_collection, None)
        self.assertEqual(instance._on_collection_load, _EventSource())

    def test___init___bases(self):
        instance = AnsibleCollectionConfig(1, 1, 1)
        self.assertEqual(instance._collection_finder, None)
        self.assertEqual(instance._default_collection, None)
        self.assertEqual(instance._on_collection_load, _EventSource())

    def test_collection_finder(self):
        instance = AnsibleCollectionConfig()
        result = instance.collection_finder
        self.assertEqual(result, None)

    def test_collection_finder_setter(self):
        instance = AnsibleCollectionConfig()
        instance.collection_finder = 1
        self.assertEqual(instance._collection_finder, 1)

    def test_collection_paths(self):
        instance = AnsibleCollectionConfig()
        result = instance.collection_paths
        self.assertEqual(result, None)

    def test_default_collection(self):
        instance = AnsibleCollectionConfig()
        result = instance.default_collection
        self.assertEqual(result, None)

    def test_default_collection_setter(self):
        instance = AnsibleCollectionConfig()
        instance.default_collection = 1
        self.assertEqual(instance._default_collection, 1)

    def test_on_collection_load(self):
        instance = AnsibleCollectionConfig()
        result = instance.on_collection_load
        self.assertEqual(result, _EventSource())

    def test_on_collection_load_setter(self):
        instance = AnsibleCollectionConfig()
        instance.on_collection_load = 1
        self.assertEqual(instance._on_collection_load, 1)

    def test_playbook_paths(self):
        instance = AnsibleCollectionConfig()
        result = instance.playbook_paths
        self.assertEqual(result, None)

    def test_playbook_paths_setter(self):
        instance = AnsibleCollectionConfig()
        instance.playbook_paths = 1
        self.assertEqual(instance._collection_finder, 1)


if __name__ == '__main__':
    unittest.main()