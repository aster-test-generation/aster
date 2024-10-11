import unittest
from ansible.plugins.inventory import *


class TestInventoryModule(unittest.TestCase):
    def test_verify_file(self):
        instance = InventoryModule()
        result = instance.verify_file("test.yml")
        self.assertEqual(result, True)

    def test_parse(self):
        instance = InventoryModule()
        result = instance.parse("test.yml")
        self.assertEqual(result, None)

    def test_update_cache_if_changed(self):
        instance = InventoryModule()
        result = instance.update_cache_if_changed()
        self.assertEqual(result, None)

if __name__ == '__main__':
    unittest.main()