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
        result = self.inventory_module.verify_file(path)
        self.assertTrue(result is not None)

    def test_verify_file_invalid_extension(self):
        path = 'test_inventory.txt'
        result = self.inventory_module.verify_file(path)
        self.assertFalse(result)

    @patch('ansible.plugins.loader.inventory_loader.get')
    @patch('ansible.plugins.inventory.auto.BaseInventoryPlugin.verify_file')
    def test_parse_valid_plugin(self, mock_verify_file, mock_get):
        mock_loader = MagicMock()
        mock_inventory = MagicMock()
        mock_plugin = MagicMock()
        mock_loader.load_from_file.return_value = {'plugin': 'valid_plugin'}
        mock_get.return_value = mock_plugin
        mock_plugin.verify_file.return_value = True

        self.inventory_module.parse(mock_inventory, mock_loader, 'test_inventory.yml')

        mock_plugin.parse.assert_called_once_with(mock_inventory, mock_loader, 'test_inventory.yml', cache=True)

    @patch('ansible.plugins.loader.inventory_loader.get')
    @patch('ansible.plugins.inventory.auto.BaseInventoryPlugin.verify_file')
    def test_parse_no_plugin_key(self, mock_verify_file, mock_get):
        mock_loader = MagicMock()
        mock_inventory = MagicMock()
        mock_loader.load_from_file.return_value = {}

        with self.assertRaises(AnsibleParserError) as context:
            self.inventory_module.parse(mock_inventory, mock_loader, 'test_inventory.yml')
        self.assertEqual(str(context.exception), "no root 'plugin' key found, 'test_inventory.yml' is not a valid YAML inventory plugin config file")

    @patch('ansible.plugins.loader.inventory_loader.get')
    @patch('ansible.plugins.inventory.auto.BaseInventoryPlugin.verify_file')
    def test_parse_unknown_plugin(self, mock_verify_file, mock_get):
        mock_loader = MagicMock()
        mock_inventory = MagicMock()
        mock_loader.load_from_file.return_value = {'plugin': 'unknown_plugin'}
        mock_get.return_value = None

        with self.assertRaises(AnsibleParserError) as context:
            self.inventory_module.parse(mock_inventory, mock_loader, 'test_inventory.yml')
        self.assertEqual(str(context.exception), "inventory config 'test_inventory.yml' specifies unknown plugin 'unknown_plugin'")

    @patch('ansible.plugins.loader.inventory_loader.get')
    @patch('ansible.plugins.inventory.auto.BaseInventoryPlugin.verify_file')
    def test_parse_plugin_verification_failed(self, mock_verify_file, mock_get):
        mock_loader = MagicMock()
        mock_inventory = MagicMock()
        mock_plugin = MagicMock()
        mock_loader.load_from_file.return_value = {'plugin': 'valid_plugin'}
        mock_get.return_value = mock_plugin
        mock_plugin.verify_file.return_value = False

        with self.assertRaises(AnsibleParserError) as context:
            self.inventory_module.parse(mock_inventory, mock_loader, 'test_inventory.yml')
        self.assertEqual(str(context.exception), "inventory config 'test_inventory.yml' could not be verified by plugin 'valid_plugin'")

    @patch('ansible.plugins.loader.inventory_loader.get')
    @patch('ansible.plugins.inventory.auto.BaseInventoryPlugin.verify_file')
    def test_parse_update_cache_if_changed(self, mock_verify_file, mock_get):
        mock_loader = MagicMock()
        mock_inventory = MagicMock()
        mock_plugin = MagicMock()
        mock_loader.load_from_file.return_value = {'plugin': 'valid_plugin'}
        mock_get.return_value = mock_plugin
        mock_plugin.verify_file.return_value = True

        self.inventory_module.parse(mock_inventory, mock_loader, 'test_inventory.yml')

        mock_plugin.update_cache_if_changed.assert_called_once()

    @patch('ansible.plugins.loader.inventory_loader.get')
    @patch('ansible.plugins.inventory.auto.BaseInventoryPlugin.verify_file')
    def test_parse_no_update_cache_if_changed(self, mock_verify_file, mock_get):
        mock_loader = MagicMock()
        mock_inventory = MagicMock()
        mock_plugin = MagicMock()
        mock_loader.load_from_file.return_value = {'plugin': 'valid_plugin'}
        mock_get.return_value = mock_plugin
        mock_plugin.verify_file.return_value = True
        del mock_plugin.update_cache_if_changed

        try:
            self.inventory_module.parse(mock_inventory, mock_loader, 'test_inventory.yml')
        except AttributeError:
            self.fail("parse() raised AttributeError unexpectedly!")

if __name__ == '__main__':
    unittest.main()