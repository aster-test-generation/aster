import unittest
from ansible.plugins.inventory.yaml import *


class TestInventoryModule(unittest.TestCase):
    def test_verify_file(self):
        instance = InventoryModule()
        result = instance.verify_file("test_host_list")
        self.assertEqual(result, False)

    def test_parse(self):
        instance = InventoryModule()
        instance.parse("test_inventory", "test_loader", "test_host_list")
        self.assertEqual(instance.inventory.hosts, "test_host_list")

if __name__ == '__main__':
    unittest.main()