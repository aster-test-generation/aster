import unittest
from unittest.mock import patch
from ansible.inventory import Inventory, InventoryErro
from ansible.module_utils._text import to_bytes, to_native, to_text
from ansible.errors import AnsibleError, AnsibleParserError
from ansible.plugins.inventory.advanced_host_list import InventoryModule


class TestInventoryModule(unittest.TestCase):
    def setUp(self):
        self.inventory_module = InventoryModule()

    def test_verify_file(self):
        host_list = 'host1,host2'
        self.assertTrue(self.inventory_module.verify_file(host_list))

    def test_verify_file_invalid(self):
        host_list = 'host1'
        self.assertFalse(self.inventory_module.verify_file(host_list))

    def test_parse(self):
        host_list = 'host1,host2'
        with patch.object(self.inventory_module, 'inventory') as mock_inventory:
            self.inventory_module.parse(None, None, host_list)
            mock_inventory.add_host.assert_called_once_with('host1', group='ungrouped')
            mock_inventory.add_host.assert_called_once_with('host2', group='ungrouped')

    def test_parse_invalid_host(self):
        host_list = 'host1,host2,host3'
        with patch.object(self.inventory_module, 'inventory') as mock_inventory:
            with patch.object(self.inventory_module, '_expand_hostpattern') as mock_expand_hostpattern:
                mock_expand_hostpattern.side_effect = AnsibleError('Invalid host')
                self.inventory_module.parse(None, None, host_list)
                mock_inventory.add_host.assert_called_once_with('host1', group='ungrouped')

    def test_expand_hostpattern(self):
        host = 'host1:22'
        with patch.object(self.inventory_module, 'inventory') as mock_inventory:
            hostnames, port = self.inventory_module._expand_hostpattern(host)
            self.assertEqual(hostnames, ['host1'])
            self.assertEqual(port, 22)

    def test_expand_hostpattern_invalid(self):
        host = 'host1'
        with patch.object(self.inventory_module, 'inventory') as mock_inventory:
            hostnames, port = self.inventory_module._expand_hostpattern(host)
            self.assertEqual(hostnames, [host])
            self.assertIsNone(port)

    def test_str(self):
        self.assertEqual(str(self.inventory_module), 'advanced_host_list')

    def test_repr(self):
        self.assertEqual(repr(self.inventory_module), 'advanced_host_list()')

    def test_eq(self):
        other_inventory_module = InventoryModule()
        self.assertEqual(self.inventory_module, other_inventory_module)

    def test_ne(self):
        other_inventory_module = object()
        self.assertNotEqual(self.inventory_module, other_inventory_module)

if __name__ == '__main__':
    unittest.main()