import os
import unittest
from ansible.plugins.inventory import InventoryModule


class TestAdvancedHostList(unittest.TestCase):
    def test_verify_file(self):
        inventory = advanced_host_list.InventoryModule()
        self.assertFalse(inventory.verify_file('/path/to/nonexistent/file.txt'))
        self.assertFalse(inventory.verify_file('/path/to/file.txt'))
        self.assertTrue(inventory.verify_file('host1,host2,host3'))

    def test_parse(self):
        inventory = advanced_host_list.InventoryModule()
        inventory.parse(None, None, 'host1,host2,host3')
        self.assertEqual(len(inventory.inventory.hosts), 3)
        self.assertEqual(inventory.inventory.hosts.keys(), ['host1', 'host2', 'host3'])

if __name__ == '__main__':
    unittest.main()