import unittest
from ansible.plugins.inventory import ConstructedInventory


class TestInventoryModule(unittest.TestCase):
    def test_verify_file(self):
        inventory = InventoryModule()
        self.assertTrue(inventory.verify_file('example.yml'))
        self.assertTrue(inventory.verify_file('example.yaml'))
        self.assertTrue(inventory.verify_file('example.config'))
        self.assertFalse(inventory.verify_file('example.txt'))

    def test_get_all_host_vars(self):
        inventory = InventoryModule()
        host = {'vars': {'var1': 1, 'var2': 2}}
        loader = None
        sources = []
        host_vars = inventory.get_all_host_vars(host, loader, sources)
        self.assertEqual(host_vars, {'var_sum': 3, 'server_type': 'ansible_hostname | regex_replace \'(.{6})(.{2}).*\' \'\\2\''})

    def test_host_groupvars(self):
        inventory = InventoryModule()
        host = {'groups': ['group1', 'group2']}
        loader = None
        sources = []
        group_vars = inventory.host_groupvars(host, loader, sources)
        self.assertEqual(group_vars, {'group_names': ['group1', 'group2']})

    def test_host_vars(self):
        inventory = InventoryModule()
        host = {'vars': {'var1': 1, 'var2': 2}}
        loader = None
        sources = []
        host_vars = inventory.host_vars(host, loader, sources)
        self.assertEqual(host_vars, {'var1': 1, 'var2': 2})

    def test_parse(self):
        inventory = InventoryModule()
        loader = None
        path = 'example.yml'
        inventory.parse(inventory, loader, path)
        self.assertEqual(inventory.groups, {'webservers': ['host1'], 'development': ['host2'], 'private_only': ['host3'], 'multi_group': ['host4']})
        self.assertEqual(inventory.groups['webservers'][0].vars, {'var_sum': 3, 'server_type': 'ansible_hostname | regex_replace \'(.{6})(.{2}).*\' \'\\2\''})
        self.assertEqual(inventory.groups['development'][0].vars, {'var_sum': 3, 'server_type': 'ansible_hostname | regex_replace \'(.{6})(.{2}).*\' \'\\2\''})
        self.assertEqual(inventory.groups['private_only'][0].vars, {'var_sum': 3, 'server_type': 'ansible_hostname | regex_replace \'(.{6})(.{2}).*\' \'\\2\''})
        self.assertEqual(inventory.groups['multi_group'][0].vars, {'var_sum': 3, 'server_type': 'ansible_hostname | regex_replace \'(.{6})(.{2}).*\' \'\\2\''})

if __name__ == '__main__':
    unittest.main()