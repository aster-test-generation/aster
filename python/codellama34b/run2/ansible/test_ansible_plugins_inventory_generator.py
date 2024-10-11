import unittest
from ansible.plugins.inventory.yaml import *


class TestInventoryModule(unittest.TestCase):
    def test_verify_file(self):
        instance = InventoryModule()
        result = instance.verify_file("path")
        self.assertEqual(result, False)

    def test_template(self):
        instance = InventoryModule()
        result = instance.template("pattern", "variables")
        self.assertEqual(result, "pattern")

    def test_add_parents(self):
        instance = InventoryModule()
        result = instance.add_parents("inventory", "child", "parents", "template_vars")
        self.assertEqual(result, None)

    def test_parse(self):
        instance = InventoryModule()
        result = instance.parse("inventory", "loader", "path", "cache")
        self.assertEqual(result, None)

if __name__ == '__main__':
    unittest.main()