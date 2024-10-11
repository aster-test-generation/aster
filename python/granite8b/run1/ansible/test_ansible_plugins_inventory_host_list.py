import unittest
from ansible.plugins.inventory import HostListInventoryModule


class TestInventoryModule(unittest.TestCase):
    def test_verify_file(self):
        inventory = InventoryModule()
        self.assertFalse(inventory.verify_file(''))
        self.assertFalse(inventory.verify_file('foo'))
        self.assertFalse(inventory.verify_file('foo,bar'))
        self.assertTrue(inventory.verify_file('foo,bar,'))

    def test_parse(self):
        inventory = InventoryModule()
        inventory.parse(None, None, 'foo,bar')
        self.assertEqual(len(inventory.inventory.hosts), 2)
        self.assertIn('foo', inventory.inventory.hosts)
        self.assertIn('bar', inventory.inventory.hosts)

if __name__ == '__main__':
    unittest.main()