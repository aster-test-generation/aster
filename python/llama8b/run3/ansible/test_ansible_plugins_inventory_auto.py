import unittest
from unittest.mock import patch
from ansible.inventory import Inventory, InventoryErro
from ansible.plugins.loader import inventory_loader
from ansible.errors import AnsibleParserError
from ansible.plugins.inventory.auto import InventoryModule


class TestInventoryModule(unittest.TestCase):
    def test_verify_file(self):
        instance = InventoryModule()
        result = instance.verify_file('path/to/file.yml')
        self.assertTrue(result)

    def test_verify_file_invalid_extension(self):
        instance = InventoryModule()
        result = instance.verify_file('path/to/file.txt')
        self.assertFalse(result)

    def test_parse(self):
        instance = InventoryModule()
        with patch('ansible.plugins.inventory.auto.inventory_loader.get') as mock_get:
            mock_get.return_value = BaseInventoryPlugin()
            instance.parse({}, {}, 'path/to/file.yml', cache=True)
            mock_get.assert_called_once_with('plugin')

    def test_parse_no_plugin_key(self):
        instance = InventoryModule()
        with self.assertRaises(AnsibleParserError):
            instance.parse({}, {}, 'path/to/file.yml', cache=True)

    def test_parse_unknown_plugin(self):
        instance = InventoryModule()
        with patch('ansible.plugins.inventory.auto.inventory_loader.get') as mock_get:
            mock_get.return_value = None
            with self.assertRaises(AnsibleParserError):
                instance.parse({}, {}, 'path/to/file.yml', cache=True)
            mock_get.assert_called_once_with('plugin')

    def test_update_cache_if_changed(self):
        instance = InventoryModule()
        with patch('ansible.plugins.inventory.auto.InventoryModule.update_cache') as mock_update_cache:
            instance.update_cache_if_changed()
            mock_update_cache.assert_called_once()

    def test_update_cache_if_changed_attribute_error(self):
        instance = InventoryModule()
        with patch('ansible.plugins.inventory.auto.InventoryModule.update_cache') as mock_update_cache:
            instance.update_cache_if_changed()
            mock_update_cache.assert_called_once()

if __name__ == '__main__':
    unittest.main()