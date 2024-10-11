import unittest
from ansible.plugins.inventory.yaml import *


class TestInventoryModule(unittest.TestCase):
    def test_verify_file(self):
        path = "path/to/file"
        result = InventoryModule().verify_file(path)
        self.assertEqual(result, False)

    def test_template(self):
        pattern = "pattern"
        variables = "variables"
        result = InventoryModule().template(pattern, variables)
        self.assertEqual(result, "pattern")

    def test_add_parents(self):
        inventory = "inventory"
        child = "child"
        parents = "parents"
        template_vars = "template_vars"
        result = InventoryModule().add_parents(inventory, child, parents, template_vars)
        self.assertEqual(result, None)

    def test_parse(self):
        inventory = "inventory"
        loader = "loader"
        path = "path"
        cache = "cache"
        result = InventoryModule().parse(inventory, loader, path, cache)
        self.assertEqual(result, None)

if __name__ == '__main__':
    unittest.main()