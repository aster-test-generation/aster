from ansible.plugins.inventory.auto import AnsibleParserError
import unittest
from ansible.plugins.inventory.auto import InventoryModule


class TestInventoryModule(unittest.TestCase):
    def test_verify_file(self):
        inventory_module = InventoryModule()
        self.assertFalse(inventory_module.verify_file('test.txt'))
        self.assertTrue(inventory_module.verify_file('test.yml'))
        self.assertTrue(inventory_module.verify_file('test.yaml'))

    def test_parse(self):
        inventory_module = InventoryModule()
        inventory = {}
        loader = None
        path = 'test.yml'
        with self.assertRaises(AnsibleParserError):
            inventory_module.parse(inventory, loader, path_dwim(''))

if __name__ == '__main__':
    unittest.main()