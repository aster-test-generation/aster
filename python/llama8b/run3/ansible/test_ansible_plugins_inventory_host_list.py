import unittest
from unittest.mock import patch
from ansible.inventory.host_list import InventoryModul


class TestInventoryModule(unittest.TestCase):
    def setUp(self):
        self.inventory = InventoryModule()

    def test_verify_file(self):
        self.assertTrue(self.inventory.verify_file('host1,host2'))
        self.assertFalse(self.inventory.verify_file('host1'))
        self.assertFalse(self.inventory.verify_file('host1,host2,host3'))

    def test_parse(self):
        host_list = 'host1,host2,host3'
        with patch.object(self.inventory, 'inventory') as mock_inventory:
            self.inventory.parse(None, None, host_list)
            mock_inventory.add_host.assert_called_with('host1', group='ungrouped')
            mock_inventory.add_host.assert_called_with('host2', group='ungrouped')
            mock_inventory.add_host.assert_called_with('host3', group='ungrouped')

    def test_parse_invalid_data(self):
        host_list = 'host1,host2,host3'
        with patch.object(self.inventory, 'inventory') as mock_inventory:
            with self.assertRaises(AnsibleParserError):
                self.inventory.parse(None, None, host_list + ',invalid_data')
            mock_inventory.add_host.assert_called_with('host1', group='ungrouped')
            mock_inventory.add_host.assert_called_with('host2', group='ungrouped')
            mock_inventory.add_host.assert_called_with('host3', group='ungrouped')

    def test_verify_file_invalid_path(self):
        self.assertFalse(self.inventory.verify_file('path/to/file'))

    def test_verify_file_invalid_data(self):
        self.assertFalse(self.inventory.verify_file('host1'))

    def test_verify_file_valid_data(self):
        self.assertTrue(self.inventory.verify_file('host1,host2'))

    def test_parse_str(self):
        host_list = 'host1,host2,host3'
        result = self.inventory.parse(None, None, host_list)
        self.assertIsNone(result)

    def test_parse_str_invalid_data(self):
        host_list = 'host1,host2,host3,invalid_data'
        with self.assertRaises(AnsibleParserError):
            self.inventory.parse(None, None, host_list)

if __name__ == '__main__':
    unittest.main()