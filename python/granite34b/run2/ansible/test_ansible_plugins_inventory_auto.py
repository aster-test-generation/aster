import unittest
from ansible.plugins.inventory.auto import InventoryModule


class TestInventoryModule(unittest.TestCase):
    def setUp(self):
        self.inventory = InventoryModule()

    def test_verify_file(self):
        self.assertFalse(self.inventory.verify_file('test.txt'))
        self.assertTrue(self.inventory.verify_file('test.yml'))
        self.assertTrue(self.inventory.verify_file('test.yaml'))

    def test_parse(self):
        inventory = self.inventory
        loader = None
        path = 'test.yml'
        config_data = {'plugin': 'test_plugin'}
        inventory.parse(inventory, loader, path, cache=True)
        self.assertEqual(inventory.plugin_name, 'test_plugin')
        self.assertEqual(inventory.path, path)
        self.assertEqual(inventory.cache, True)

if __name__ == '__main__':
    unittest.main()