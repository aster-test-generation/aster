import unittest
from ansible.plugins.inventory.host_list import InventoryModule


class TestInventoryModule(unittest.TestCase):
    def setUp(self):
        self.inventory = InventoryModule()

    def test_verify_file(self):
        valid = self.inventory.verify_file("example_host_list,example_host_list_2")
        self.assertTrue(valid)

    def test_parse(self):
        self.inventory.parse(None, None, "example_host_list,example_host_list_2".split(","))
        hosts = self.inventory.inventory.hosts
        self.assertEqual(len(hosts), 2)
        self.assertIn("example_host_list", hosts)
        self.assertIn("example_host_list_2", hosts)

if __name__ == '__main__':
    unittest.main()