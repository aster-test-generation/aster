import unittest
from ansible.plugins.inventory import InventoryModule


class TestInventoryModule(unittest.TestCase):
    def test_verify_file(self):
        inventory = InventoryModule()
        self.assertFalse(inventory.verify_file(''))
        self.assertFalse(inventory.verify_file('foo'))
        self.assertTrue(inventory.verify_file('foo,bar'))

    def test_parse(self):
        inventory = InventoryModule()
        inventory.parse(None, None, 'foo,bar')
        self.assertIn('foo', inventory.inventory.hosts)
        self.assertIn('bar', inventory.inventory.hosts)

if __name__ == '__main__':
    unittest.main()