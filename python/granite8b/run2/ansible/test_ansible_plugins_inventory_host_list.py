import unittest
from ansible.plugins.inventory import HostListInventoryModule


class TestInventoryModule(unittest.TestCase):
    def test_verify_file(self):
        inventory = InventoryModule()
        self.assertFalse(inventory.verify_file(''))
        self.assertFalse(inventory.verify_file('not a file'))
        self.assertTrue(inventory.verify_file('host1,host2'))

    def test_parse(self):
        inventory = InventoryModule()
        inventory.parse(None, None, 'host1,host2')
        self.assertIn('host1', inventory.inventory.hosts)
        self.assertIn('host2', inventory.inventory.hosts)

if __name__ == '__main__':
    unittest.main()