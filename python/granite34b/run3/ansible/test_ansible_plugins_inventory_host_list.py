import unittest
from ansible.plugins.inventory.host_list import InventoryModule


class TestInventoryModule(unittest.TestCase):
    def test_verify_file(self):
        inventory_module = InventoryModule()
        valid = inventory_module.verify_file("host1,host2")
        self.assertTrue(valid)

    def test_parse(self):
        inventory_module = InventoryModule()
        inventory_module.parse(None, None, ["host1", "host2"])
        self.assertEqual(len(inventory_module.inventory.hosts), 2)
        self.assertIn("host1", inventory_module.inventory.hosts)
        self.assertIn("host2", inventory_module.inventory.hosts)

if __name__ == '__main__':
    unittest.main()