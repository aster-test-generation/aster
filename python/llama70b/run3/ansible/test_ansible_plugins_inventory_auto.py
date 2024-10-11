import unittest
from ansible_collections.core.plugins.inventory.auto import InventoryModule, DOCUMENTATION, EXAMPLE


class TestInventoryModule(unittest.TestCase):
    def test_verify_file(self):
        instance = InventoryModule()
        result = instance.verify_file('example.yml')
        self.assertTrue(result)

    def test_verify_file_invalid_extension(self):
        instance = InventoryModule()
        result = instance.verify_file('example.txt')
        self.assertFalse(result)

    def test_parse(self):
        instance = InventoryModule()
        inventory = object()
        loader = object()
        path = 'example.yml'
        cache = True
        instance.parse(inventory, loader, path, cache)

    def test_parse_no_plugin_key(self):
        instance = InventoryModule()
        inventory = object()
        loader = object()
        path = 'example.yml'
        cache = True
        with self.assertRaises(AnsibleParserError):
            instance.parse(inventory, loader, path, cache)

    def test_parse_unknown_plugin(self):
        instance = InventoryModule()
        inventory = object()
        loader = object()
        path = 'example.yml'
        cache = True
        config_data = {'plugin': 'unknown_plugin'}
        loader.load_from_file = lambda x, y: config_data
        with self.assertRaises(AnsibleParserError):
            instance.parse(inventory, loader, path, cache)

    def test_parse_plugin_verification_failure(self):
        instance = InventoryModule()
        inventory = object()
        loader = object()
        path = 'example.yml'
        cache = True
        config_data = {'plugin': 'example_plugin'}
        loader.load_from_file = lambda x, y: config_data
        plugin = object()
        plugin.verify_file = lambda x: False
        inventory_loader.get = lambda x: plugin
        with self.assertRaises(AnsibleParserError):
            instance.parse(inventory, loader, path, cache)

    def test_update_cache_if_changed(self):
        instance = InventoryModule()
        plugin = object()
        plugin.update_cache_if_changed = lambda: None
        instance.parse(object(), object(), 'example.yml', cache=True)

    def test___init___(self):
        instance = InventoryModule()
        self.assertEqual(instance.NAME, 'auto')

    def test___str___(self):
        instance = InventoryModule()
        result = instance.__str__()
        self.assertEqual(result, 'auto')

    def test___repr___(self):
        instance = InventoryModule()
        result = instance.__repr__()
        self.assertEqual(result, 'auto')

class TestDOCUMENTATION(unittest.TestCase):
    def test_DOCUMENTATION(self):
        self.assertIsInstance(DOCUMENTATION, str)

class TestEXAMPLES(unittest.TestCase):
    def test_EXAMPLES(self):
        self.assertIsInstance(EXAMPLES, str)

if __name__ == '__main__':
    unittest.main()