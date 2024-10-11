import unittest
from ansible.plugins.inventory import InventoryModule


class TestInventoryModule(unittest.TestCase):
    def test_verify_file(self):
        instance = InventoryModule()
        self.assertFalse(instance.verify_file('test.txt'))
        self.assertTrue(instance.verify_file('test.yaml'))
        self.assertTrue(instance.verify_file('test.yml'))

    def test_parse(self):
        instance = InventoryModule()
        inventory = {}
        loader = {}
        path = 'test.yaml'
        instance.parse(inventory, loader, path)
        self.assertEqual(inventory, {})
        self.assertEqual(loader, {})
        self.assertEqual(path, 'test.yaml')

if __name__ == '__main__':
    unittest.main()