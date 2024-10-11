import unittest
from ansible.utils.collection_loader._collection_config import _EventSource, _AnsibleCollectionConfig, AnsibleCollectionConfig


class TestEventSource(unittest.TestCase):
    def test_init(self):
        instance = _EventSource()
        self.assertEqual(instance._handlers, set())

    def test_iadd(self):
        instance = _EventSource()
        handler = lambda x: x
        instance += handler
        self.assertIn(handler, instance._handlers)

    def test_iadd_non_callable(self):
        instance = _EventSource()
        with self.assertRaises(ValueError):
            instance += "not a callable"

    def test_isub(self):
        instance = _EventSource()
        handler = lambda x: x
        instance += handler
        instance -= handler
        self.assertNotIn(handler, instance._handlers)

    def test_isub_non_existent_handler(self):
        instance = _EventSource()
        handler = lambda x: x
        instance -= handler  # Should not raise an exception
        self.assertNotIn(handler, instance._handlers)

    def test_on_exception(self):
        instance = _EventSource()
        handler = lambda x: x
        result = instance._on_exception(handler, Exception("test"))
        self.assertTrue(result)

    def test_fire(self):
        instance = _EventSource()
        self._fired = False
        def handler(*args, **kwargs):
            self._fired = True
        instance += handler
        instance.fire()
        self.assertTrue(self._fired)

    def test_fire_with_exception(self):
        instance = _EventSource()
        def handler(*args, **kwargs):
            raise Exception("test")
        instance += handler
        with self.assertRaises(Exception):
            instance.fire()

class TestAnsibleCollectionConfig(unittest.TestCase):
    def test_init(self):
        class TestClass(metaclass=_AnsibleCollectionConfig):
            pass
        self.assertIsNone(TestClass._collection_finder)
        self.assertIsNone(TestClass._default_collection)
        self.assertIsInstance(TestClass._on_collection_load, _EventSource)

    def test_collection_finder_property(self):
        class TestClass(metaclass=_AnsibleCollectionConfig):
            pass
        TestClass.collection_finder = "finder"
        self.assertEqual(TestClass.collection_finder, "finder")

    def test_collection_finder_property_already_set(self):
        class TestClass(metaclass=_AnsibleCollectionConfig):
            pass
        TestClass.collection_finder = "finder"
        with self.assertRaises(ValueError):
            TestClass.collection_finder = "another_finder"

    def test_collection_paths_property(self):
        class MockFinder:
            _n_collection_paths = ["path1", "path2"]
        class TestClass(metaclass=_AnsibleCollectionConfig):
            pass
        TestClass.collection_finder = MockFinder()
        self.assertEqual(TestClass.collection_paths, ["path1", "path2"])

    def test_default_collection_property(self):
        class TestClass(metaclass=_AnsibleCollectionConfig):
            pass
        TestClass.default_collection = "default"
        self.assertEqual(TestClass.default_collection, "default")

    def test_on_collection_load_property(self):
        class TestClass(metaclass=_AnsibleCollectionConfig):
            pass
        self.assertIsInstance(TestClass.on_collection_load, _EventSource)

    def test_on_collection_load_property_setter(self):
        class TestClass(metaclass=_AnsibleCollectionConfig):
            pass
        with self.assertRaises(ValueError):
            TestClass.on_collection_load = "new_value"

    def test_playbook_paths_property(self):
        class MockFinder:
            _n_playbook_paths = ["playbook1", "playbook2"]
        class TestClass(metaclass=_AnsibleCollectionConfig):
            pass
        TestClass.collection_finder = MockFinder()
        self.assertEqual(TestClass.playbook_paths, ["playbook1", "playbook2"])

    def test_playbook_paths_property_setter(self):
        class MockFinder:
            def set_playbook_paths(self, value):
                self._n_playbook_paths = value
        class TestClass(metaclass=_AnsibleCollectionConfig):
            pass
        TestClass.collection_finder = MockFinder()
        TestClass.playbook_paths = ["new_playbook1", "new_playbook2"]
        self.assertEqual(TestClass.collection_finder._n_playbook_paths, ["new_playbook1", "new_playbook2"])

    def test_require_finder(self):
        class TestClass(metaclass=_AnsibleCollectionConfig):
            pass
        with self.assertRaises(NotImplementedError):
            TestClass._require_finder()

if __name__ == '__main__':
    unittest.main()