import unittest
from ansible.plugins.inventory.yaml import YamlInventoryModule as InventoryModule


class TestInventoryModule(unittest.TestCase):
    def test_verify_file(self):
        instance = InventoryModule()
        result = instance.verify_file("path")
        self.assertEqual(result, False)

    def test_parse(self):
        instance = InventoryModule()
        instance.parse("inventory", "loader", "path")

    def test_parse_group(self):
        instance = InventoryModule()
        instance._parse_group("group", "group_data")

    def test_parse_host(self):
        instance = InventoryModule()
        result = instance._parse_host("host_pattern")
        self.assertEqual(result, ("hostnames", "port"))

if __name__ == '__main__':
    unittest.main()