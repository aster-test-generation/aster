import unittest
from ansible.plugins.inventory.advanced_host_list import InventoryModule


class TestInventoryModule(unittest.TestCase):
    def test_verify_file(self):
        inventory = InventoryModule()
        valid = inventory.verify_file("host1,host2,host3")
        self.assertTrue(valid)

    def test_parse(self):
        inventory = InventoryModule()
        inventory.parse(None, None, ["host1", "host2", "host3"])
        self.assertEqual(len(inventory.inventory.hosts), 3)

if __name__ == '__main__':
    unittest.main()