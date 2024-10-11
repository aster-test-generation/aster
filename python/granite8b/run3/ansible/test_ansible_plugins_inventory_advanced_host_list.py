import os
import unittest
from ansible.plugins.inventory import InventoryModule


class TestAdvancedHostList(unittest.TestCase):
    def test_verify_file(self):
        inventory = advanced_host_list.InventoryModule()
        self.assertFalse(inventory.verify_file(''))
        self.assertFalse(inventory.verify_file('/path/to/file'))
        self.assertTrue(inventory.verify_file('host1,host2'))

    def test_parse(self):
        inventory = advanced_host_list.InventoryModule()
        inventory.parse(None, None, 'host1,host2')
        self.assertIn('host1', inventory.inventory.hosts)
        self.assertIn('host2', inventory.inventory.hosts)

if __name__ == '__main__':
    unittest.main()