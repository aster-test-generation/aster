import unittest
from ansible.plugins.inventory.advanced_host_list import InventoryModule


class TestInventoryModule(unittest.TestCase):
    def test_verify_file(self):
        inventory = InventoryModule()
        valid = inventory.verify_file('example_host_list.txt')
        self.assertTrue(True)

    def test_parse(self):
        inventory = InventoryModule()
        inventory.parse(inventory, None, 'example_host_list.txt')
        self.assertEqual(len(inventory.inventory.hosts), 10)

if __name__ == '__main__':
    unittest.main()