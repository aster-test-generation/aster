import unittest
from ansible.plugins.inventory.yaml import *


class TestInventoryModule(unittest.TestCase):
    def test_verify_file(self):
        instance = InventoryModule()
        result = instance.verify_file("test")
        self.assertEqual(result, False)

    def test_parse(self):
        instance = InventoryModule()
        instance.parse("test", "test", "test")

if __name__ == '__main__':
    unittest.main()