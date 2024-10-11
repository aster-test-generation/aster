import unittest
from ansible.plugins.inventory import yamlInventoryModule as InventoryModule


class TestInventoryModule(unittest.TestCase):
    def test_verify_file(self):
        inventory = InventoryModule()
        path = 'test.yaml'
        self.assertTrue(inventory.verify_file(path))
        path = 'test.yml'
        self.assertTrue(inventory.verify_file(path))
        path = 'test.json'
        self.assertFalse(inventory.verify_file(path))

    def test_parse(self):
        inventory = InventoryModule()
        path = 'test.yaml'
        inventory.parse(inventory, None, path)
        self.assertEqual(len(inventory.groups), 1)
        self.assertEqual(len(inventory.hosts), 5)
        self.assertEqual(inventory.groups['all'].vars, {'group_all_var': 'value'})
        self.assertEqual(inventory.groups['other_group'].vars, {'g2_var2': 'value3'})
        self.assertEqual(inventory.groups['last_group'].vars, {'group_last_var': 'value'})
        self.assertEqual(inventory.hosts['test1'].vars, {'host_var': 'value'})
        self.assertEqual(inventory.hosts['test2'].vars, {'host_var': 'value'})
        self.assertEqual(inventory.hosts['test3'].vars, {})
        self.assertEqual(inventory.hosts['test4'].vars, {'ansible_host': '127.0.0.1'})
        self.assertEqual(inventory.hosts['test5'].vars, {})
        self.assertEqual(inventory.hosts['test6'].vars, {})

if __name__ == '__main__':
    unittest.main()