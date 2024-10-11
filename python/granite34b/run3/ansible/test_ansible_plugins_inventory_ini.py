import unittest
from ansible.plugins.inventory.ini import *


class TestInventoryModule(unittest.TestCase):
    def test_compile_patterns(self):
        inventory = InventoryModule()
        inventory._compile_patterns()
        self.assertIsNotNone(inventory.patterns['section'])
        self.assertIsNotNone(inventory.patterns['groupname'])

    def test_parse(self):
        inventory = InventoryModule()
        inventory._filename = 'test_inventory.ini'
        inventory.parse(inventory._filename, inventory._loader)
        self.assertIsNotNone(inventory.inventory)
        self.assertIsNotNone(inventory.inventory.hosts)
        self.assertIsNotNone(inventory.inventory.groups)

    def test_parse_with_errors(self):
        inventory = InventoryModule()
        inventory._filename = 'test_inventory_with_errors.ini'
        with self.assertRaises(AnsibleError):
            inventory.parse(loader, inventory._filename)

if __name__ == '__main__':
    unittest.main()