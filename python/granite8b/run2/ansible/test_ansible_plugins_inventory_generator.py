import unittest
from ansible.plugins.inventory import InventoryModule


class TestInventoryModule(unittest.TestCase):
    def test_verify_file(self):
        inventory = InventoryModule()
        self.assertTrue(inventory.verify_file("test.yml"))
        self.assertTrue(inventory.verify_file("test.yaml"))
        self.assertTrue(inventory.verify_file("test.config"))
        self.assertFalse(inventory.verify_file("test.txt"))

if __name__ == '__main__':
    unittest.main()