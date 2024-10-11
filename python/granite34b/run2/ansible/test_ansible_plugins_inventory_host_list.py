import unittest
from ansible.plugins.inventory.host_list import InventoryModule


class TestInventoryModule(unittest.TestCase):
    def test_verify_file(self):
        inventory = InventoryModule()
        valid = inventory.verify_file("host1,host2")
        self.assertTrue(valid)

    def test_parse(self):
        inventory = InventoryModule()
        inventory.parse(None, None, ["host1", "host2"])
        hosts = inventory.inventory.hosts
        self.assertEqual(len(hosts), 2)
        self.assertIn("host1", hosts)
        self.assertIn("host2", hosts)

if __name__ == '__main__':
    unittest.main()