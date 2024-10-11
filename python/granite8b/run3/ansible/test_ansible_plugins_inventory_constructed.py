import unittest
from ansible.plugins.inventory import InventoryModule


class TestInventoryModule(unittest.TestCase):
    def test_verify_file(self):
        inventory = InventoryModule()
        self.assertTrue(inventory.verify_file('file.yml'))
        self.assertTrue(inventory.verify_file('file.yaml'))
        self.assertTrue(inventory.verify_file('file.config'))
        self.assertFalse(inventory.verify_file('file.txt'))

    def test_get_all_host_vars(self):
        inventory = InventoryModule()
        host = Mock()
        host.get_groups.return_value = ['group1', 'group2']
        loader = Mock()
        sources = ['source1', 'source2']
        gvars = {'group_var1': 'value1', 'group_var2': 'value2'}
        hvars = {'host_var1': 'value1', 'host_var2': 'value2'}
        loader.get_vars.side_effect = [gvars, hvars]
        result = inventory.get_all_host_vars(host, loader, sources)
        self.assertEqual(result, {'group_var1': 'value1', 'group_var2': 'value2', 'host_var1': 'value1', 'host_var2': 'value2'})

    def test_host_groupvars(self):
        inventory = InventoryModule()
        host = Mock()
        host.get_groups.return_value = ['group1', 'group2']
        loader = Mock()
        sources = ['source1', 'source2']
        gvars = {'group_var1': 'value1', 'group_var2': 'value2'}
        loader.get_vars.side_effect = [gvars, {}]
        result = inventory.host_groupvars(host, loader, sources)
        self.assertEqual(result, {'group_var1': 'value1', 'group_var2': 'value2'})

    def test_host_vars(self):
        inventory = InventoryModule()
        host = Mock()
        host.get_groups.return_value = ['group1', 'group2']
        loader = Mock()
        sources = ['source1', 'source2']
        hvars = {'host_var1': 'value1', 'host_var2': 'value2'}
        loader.get_vars.side_effect = [{}, hvars]
        result = inventory.host_vars(host, loader, sources)
        self.assertEqual(result, {'host_var1': 'value1', 'host_var2': 'value2'})

    def test_parse(self):
        inventory = InventoryModule()
        loader = Mock()
        path = 'file.yml'
        inventory.parse(inventory, loader, path)
        self.assertEqual(inventory.groups, {'group1': ['host1', 'host2'], 'group2': ['host3', 'host4']})
        self.assertEqual(inventory.hosts, {'host1': {'group1'}, 'host2': {'group1'}, 'host3': {'group2'}, 'host4': {'group2'}})
        self.assertEqual(inventory.vars, {'var1': 'value1', 'var2': 'value2'})

if __name__ == '__main__':
    unittest.main()