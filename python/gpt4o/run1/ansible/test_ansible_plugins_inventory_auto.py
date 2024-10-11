import unittest
from unittest.mock import MagicMock, patch
from ansible.plugins.inventory.auto import InventoryModule
from ansible.errors import AnsibleParserError
from ansible.plugins.loader import inventory_loader


class TestInventoryModule(unittest.TestCase):
    def setUp(self):
        self.inventory_module = InventoryModule()

    def test_verify_file_valid_extension(self):
        path = 'test_inventory.yml'
        with patch.object(InventoryModule, 'verify_file', return_value=True) as mock_super_verify_file:
            result = self.inventory_module.verify_file(path)
            self.assertTrue(result)
            mock_super_verify_file.assert_called_once_with(path)

    def test_verify_file_invalid_extension(self):
        path = 'test_inventory.txt'
        result = self.inventory_module.verify_file(path)
        self.assertFalse(result)

    def test_parse_valid_plugin(self):
        inventory = MagicMock()
        loader = MagicMock()
        path = 'test_inventory.yml'
        config_data = {'plugin': 'valid_plugin'}
        plugin = MagicMock()
        loader.load_from_file.return_value = config_data
        inventory_loader.get = MagicMock(return_value=plugin)
        plugin.verify_file.return_value = True

        self.inventory_module.parse(inventory, loader, path)

        plugin.parse.assert_called_once_with(inventory, loader, path, cache=True)
        plugin.update_cache_if_changed.assert_called_once()

    def test_parse_no_plugin_key(self):
        inventory = MagicMock()
        loader = MagicMock()
        path = 'test_inventory.yml'
        config_data = {}
        loader.load_from_file.return_value = config_data

        with self.assertRaises(AnsibleParserError) as context:
            self.inventory_module.parse(inventory, loader, path)
        self.assertEqual(str(context.exception), "no root 'plugin' key found, 'test_inventory.yml' is not a valid YAML inventory plugin config file")

    def test_parse_unknown_plugin(self):
        inventory = MagicMock()
        loader = MagicMock()
        path = 'test_inventory.yml'
        config_data = {'plugin': 'unknown_plugin'}
        loader.load_from_file.return_value = config_data
        inventory_loader.get = MagicMock(return_value=None)

        with self.assertRaises(AnsibleParserError) as context:
            self.inventory_module.parse(inventory, loader, path)
        self.assertEqual(str(context.exception), "inventory config 'test_inventory.yml' specifies unknown plugin 'unknown_plugin'")

    def test_parse_plugin_verification_failed(self):
        inventory = MagicMock()
        loader = MagicMock()
        path = 'test_inventory.yml'
        config_data = {'plugin': 'valid_plugin'}
        plugin = MagicMock()
        loader.load_from_file.return_value = config_data
        inventory_loader.get = plugin
        plugin.verify_file.return_value = False

        with self.assertRaises(AnsibleParserError) as context:
            self.inventory_module.parse(inventory, loader, path)
        self.assertEqual(str(context.exception), "inventory config 'test_inventory.yml' could not be verified by plugin 'valid_plugin'")

    def test_parse_plugin_no_update_cache_if_changed(self):
        inventory = MagicMock()
        loader = MagicMock()
        path = 'test_inventory.yml'
        config_data = {'plugin': 'valid_plugin'}
        plugin = MagicMock()
        loader.load_from_file.return_value = config_data
        inventory_loader.get = MagicMock(return_value=plugin)
        plugin.verify_file.return_value = True
        del plugin.update_cache_if_changed

        self.inventory_module.parse(inventory, loader, path)

        plugin.parse.assert_called_once_with(inventory, loader, path, cache=True)

if __name__ == '__main__':
    unittest.main()