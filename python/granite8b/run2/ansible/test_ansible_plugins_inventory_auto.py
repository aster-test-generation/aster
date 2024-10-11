from ansible.errors import AnsibleParserError
import unittest
from ansible.plugins.inventory.auto import InventoryModule


class TestInventoryModule(unittest.TestCase):
    def test_verify_file(self):
        inventory_module = InventoryModule()
        self.assertFalse(inventory_module.verify_file('test.txt'))
        self.assertTrue(inventory_module.verify_file('test.yaml'))
        self.assertTrue(inventory_module.verify_file('test.yml'))

    def test_parse(self):
        inventory_module = InventoryModule()
        self.assertRaises(AnsibleParserError, inventory_module.parse, None, None, 'test.txt')
        self.assertRaises(AnsibleParserError, inventory_module.parse, None, None, 'test.json')
        self.assertRaises(AnsibleParserError, inventory_module.parse, None, None, 'test.yaml', cache=False)
        self.assertRaises(AnsibleParserError, inventory_module.parse, None, None, 'test.yml', cache=False)

if __name__ == '__main__':
    unittest.main()