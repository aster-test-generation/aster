from ansible.plugins.inventory.auto import AnsibleParserError
import unittest
from ansible.plugins.inventory.auto import InventoryModule


class TestInventoryModule(unittest.TestCase):
    def test_verify_file(self):
        inventory = InventoryModule()
        self.assertFalse(inventory.verify_file('not_a_valid_file.txt'))
        self.assertTrue(inventory.verify_file('valid_file.yml'))
        self.assertTrue(inventory.verify_file('valid_file.yaml'))

    def test_parse(self):
        inventory = InventoryModule()
        loader = None  # Replace with actual loader object
        path = 'path/to/inventory_config.yml'
        with self.assertRaises(AnsibleParserError):
            inventory.parse(inventory, loader, path)

if __name__ == '__main__':
    unittest.main()