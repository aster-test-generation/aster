import unittest
from unittest.mock import MagicMock, patch
from ansible.plugins.inventory.advanced_host_list import InventoryModule
from ansible.errors import AnsibleError, AnsibleParserError


class TestInventoryModule(unittest.TestCase):
    def setUp(self):
        self.inventory_module = InventoryModule()
        self.inventory_module.inventory = MagicMock()
        self.inventory_module.display = MagicMock()

    def test_verify_file_valid(self):
        with patch('os.path.exists', return_value=False):
            result = self.inventory_module.verify_file('host1,host2')
            self.assertTrue(result)

    def test_verify_file_invalid(self):
        with patch('os.path.exists', return_value=True):
            result = self.inventory_module.verify_file('host1,host2')
            self.assertFalse(result)

    def test_parse_valid(self):
        self.inventory_module._expand_hostpattern = MagicMock(return_value=(['host1'], None))
        self.inventory_module.inventory.hosts = {}
        self.inventory_module.inventory.add_host = MagicMock()

        self.inventory_module.parse('host1,host2', None, None)

        self.inventory_module.inventory.add_host.assert_called_with('host1', group='ungrouped', port=None)

    def test_parse_invalid(self):
        self.inventory_module._expand_hostpattern = MagicMock(side_effect=AnsibleError("Error"))
        self.inventory_module.inventory.hosts = {}
        self.inventory_module.inventory.add_host = MagicMock()

        self.inventory_module.parse(None, None, 'host1,host2')

        self.inventory_module.inventory.add_host.assert_called_with('host1', group='ungrouped', port=None)

    def test_parse_exception(self):
        with self.assertRaises(AnsibleParserError):
            self.inventory_module.parse(None, None, None)

    def test_expand_hostpattern(self):
        with patch.object(InventoryModule, '_expand_hostpattern', return_value=(['host1'], None)) as mock_method:
            result = self.inventory_module._expand_hostpattern('host1')
            self.assertEqual(result, (['host1'], None))
            mock_method.assert_called_with('host1')

if __name__ == '__main__':
    unittest.main()