import unittest
from ansible.plugins.inventory.yaml import InventoryModule


class TestInventoryModule(unittest.TestCase):
    def test_verify_file(self):
        inventory = InventoryModule()
        path = "path/to/inventory/file.yaml"
        self.assertTrue(inventory.verify_file(path))

    def test_parse(self):
        inventory = InventoryModule()
        inventory.loader = "loader"
        inventory.display = "display"
        path = "path/to/inventory/file.yaml"
        inventory.parse(inventory, "loader", path.get_basedir())

    def test__parse_group(self):
        inventory = InventoryModule()
        group = "group"
        group_data = {}
        inventory.add_group(group)

    def test__parse_host(self):
        inventory = InventoryModule()
        host_pattern = "host_pattern"
        hostnames, port = inventory._parse_host(host_pattern)
        self.assertEqual(hostnames, ['host_pattern'])
        self.assertEqual(port, None)

if __name__ == '__main__':
    unittest.main()