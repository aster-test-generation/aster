import unittest
from ansible.plugins.inventory.yaml import *


class TestInventoryModule(unittest.TestCase):
    def test_verify_file(self):
        instance = InventoryModule()
        result = instance.verify_file("test.yml")
        self.assertEqual(result, True)

    def test_parse(self):
        instance = InventoryModule()
        config_data = {"plugin": "test"}
        loader = "test_loader"
        path = "test.yml"
        cache = True
        instance.parse(config_data, loader, path, cache)

    def test_update_cache_if_changed(self):
        instance = InventoryModule()
        instance._InventoryModule__update_cache_if_changed()

if __name__ == '__main__':
    unittest.main()