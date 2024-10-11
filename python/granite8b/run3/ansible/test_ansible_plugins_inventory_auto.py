import unittest
from ansible.plugins.inventory import InventoryModule


class TestInventoryModule(unittest.TestCase):
    def test_verify_file(self):
        module = InventoryModule()
        self.assertTrue(module.verify_file('test.yml'))
        self.assertTrue(module.verify_file('test.yaml'))
        self.assertFalse(module.verify_file('test.txt'))

    def test_parse(self):
        module = InventoryModule()
        inventory = {}
        loader = {}
        path = 'test.yml'
        module.parse(inventory, loader, path)
        self.assertEqual(inventory, {})
        self.assertEqual(loader, {})
        self.assertEqual(path, 'test.yml')

if __name__ == '__main__':
    unittest.main()