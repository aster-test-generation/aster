import unittest
from ansible.plugins.inventory.advanced_host_list import InventoryModule


class TestInventoryModule(unittest.TestCase):
    def test_verify_file(self):
        inventory = InventoryModule()
        valid_host_list = "host1,host2,host3"
        invalid_host_list = "/path/to/inventory"
        self.assertTrue(inventory.verify_file(valid_host_list))
        self.assertFalse(inventory.verify_file(invalid_host_list))

    def test_parse(self):
        inventory = InventoryModule()
        inventory.parse(None, None, ["host1", "host2", "host3"])
        self.assertEqual(len(inventory.inventory.hosts), 3)
        self.assertIn("host1", inventory.inventory.hosts)
        self.assertIn("host2", inventory.inventory.hosts)
        self.assertIn("host3", inventory.inventory.hosts)

if __name__ == '__main__':
    unittest.main()