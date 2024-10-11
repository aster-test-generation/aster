import unittest
from unittest.mock import MagicMock, patch
from ansible.plugins.inventory.host_list import InventoryModule
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

    def test_parse_valid_hosts(self):
        self.inventory_module.inventory.hosts = {}
        self.inventory_module.inventory.add_host = MagicMock()
        self.inventory_module.parse('host1,host2', None, None)
        self.inventory_module.inventory.add_host.assert_any_call('host1', group='ungrouped', port=None)
        self.inventory_module.inventory.add_host.assert_any_call('host2', group='ungrouped', port=None)

    def test_parse_invalid_host(self):
        self.inventory_module.inventory.hosts = {}
        self.inventory_module.inventory.add_host = MagicMock()
        with patch('ansible.parsing.utils.addresses.parse_address', side_effect=AnsibleError('error')):
            self.inventory_module.parse(None, None, 'host1,host2')
            self.inventory_module.inventory.add_host.assert_any_call('host1', group='ungrouped', port=None)
            self.inventory_module.inventory.add_host.assert_any_call('host2', group='ungrouped', port=None)

    def test_parse_raises_exception(self):
        with self.assertRaises(AnsibleParserError):
            self.inventory_module.parse(None, None, None)

if __name__ == '__main__':
    unittest.main()