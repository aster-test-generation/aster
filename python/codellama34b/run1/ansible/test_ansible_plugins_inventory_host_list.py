import unittest
from ansible.plugins.inventory.yaml import *


class TestInventoryModule(unittest.TestCase):
    def test_verify_file(self):
        instance = InventoryModule()
        result = instance.verify_file("host_list")
        self.assertEqual(result, False)

    def test_parse(self):
        instance = InventoryModule()
        result = instance.parse("inventory", "loader", "host_list")
        self.assertEqual(result, None)

if __name__ == '__main__':
    unittest.main()