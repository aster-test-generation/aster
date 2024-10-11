import unittest
from ansible.plugins.inventory.yaml import *


class TestInventoryModule(unittest.TestCase):
    def test_verify_file(self):
        instance = InventoryModule()
        result = instance.verify_file("test.yml")
        self.assertEqual(result, True)

    def test_parse(self):
        instance = InventoryModule()
        instance.parse("test", "test", "test.yml")

    def test_update_cache_if_changed(self):
        instance = InventoryModule()
        instance.update_cache_if_changed()

if __name__ == '__main__':
    unittest.main()