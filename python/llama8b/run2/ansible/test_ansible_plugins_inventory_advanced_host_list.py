from ansible.inventory.advanced_host_list import AnsibleErro
import unittest
from unittest.mock import patch
from ansible.plugins.inventory.advanced_host_list import InventoryModule


class TestInventoryModule(unittest.TestCase):
    def test_verify_file(self):
        inventory_module = InventoryModule()
        result = inventory_module.verify_file('host_list,host2')
        self.assertTrue(result)

    def test_verify_file_invalid(self):
        inventory_module = InventoryModule()
        result = inventory_module.verify_file('host_list')
        self.assertFalse(result)

    @patch('ansible.plugins.inventory.advanced_host_list.InventoryModule.parse')
    def test_parse(self, mock_parse):
        inventory_module = InventoryModule()
        host_list = 'host1,host2'
        inventory_module.parse(None, None, host_list)
        mock_parse.assert_called_once_with(None, None, host_list)

    def test_expand_hostpattern(self):
        inventory_module = InventoryModule()
        host = 'host1-10'
        result = inventory_module._expand_hostpattern(host)
        self.assertEqual(result, (['host1', 'host2', 'host3', 'host4', 'host5', 'host6', 'host7', 'host8', 'host9', 'host10'], None))

    def test_expand_hostpattern_port(self):
        inventory_module = InventoryModule()
        host = 'host1-10:22'
        result = inventory_module._expand_hostpattern(host)
        self.assertEqual(result, (['host1', 'host2', 'host3', 'host4', 'host5', 'host6', 'host7', 'host8', 'host9', 'host10'], 22))

    def test_expand_hostpattern_invalid(self):
        inventory_module = InventoryModule()
        host = 'host1-'
        with self.assertRaises(AnsibleError):
            inventory_module._expand_hostpattern(host)

    def test_expand_hostpattern_invalid_port(self):
        inventory_module = InventoryModule()
        host = 'host1-10:abc'
        with self.assertRaises(AnsibleError):
            inventory_module._expand_hostpattern(host)

    def test_str_method(self):
        inventory_module = InventoryModule()
        result = str(inventory_module)
        self.assertEqual(result, '<ansible.plugins.inventory.advanced_host_list.InventoryModule object at 0x...>')

    def test_repr_method(self):
        inventory_module = InventoryModule()
        result = repr(inventory_module)
        self.assertEqual(result, '<ansible.plugins.inventory.advanced_host_list.InventoryModule object at 0x...>')

if __name__ == '__main__':
    unittest.main()