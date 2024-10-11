import unittest
from ansible.inventory import Inventory


class TestInventoryModule(unittest.TestCase):
    def test_verify_file(self):
        instance = InventoryModule()
        self.assertTrue(instance.verify_file('test.yaml'))
        self.assertFalse(instance.verify_file('test.txt'))

    def test_parse(self):
        instance = InventoryModule()
        data = {'all': {'hosts': {'test1': None, 'test2': {'host_var': 'value'}}, 'vars': {'group_all_var': 'value'}, 'children': {'other_group': {'children': {'group_x': {'hosts': {'test5': None}}, 'group_y': {'hosts': {'test6': None}}}, 'vars': {'g2_var2': 'value3'}, 'hosts': {'test4': {'ansible_host': '127.0.0.1'}}}, 'last_group': {'hosts': {'test1': None}, 'vars': {'group_last_var': 'value'}}}}}
        inventory = instance.parse(data, None, 'test.yaml', cache=True)
        self.assertEqual(inventory.get_group('all').get_host('test1').get_variable('host_var'), 'value')
        self.assertEqual(inventory.get_group('all').get_host('test2').get_variable('host_var'), 'value')
        self.assertEqual(inventory.get_group('other_group').get_host('test5').get_variable('g2_var2'), 'value3')
        self.assertEqual(inventory.get_group('last_group').get_host('test1').get_variable('group_last_var'), 'value')

    def test__parse_group(self):
        instance = InventoryModule()
        group = instance._parse_group('group', {'hosts': {'test1': None}, 'vars': {'var1': 'value'}})
        self.assertEqual(group.get_host('test1').get_variable('var1'), 'value')

    def test__parse_host(self):
        instance = InventoryModule()
        hostnames, port = instance._parse_host('test1')
        self.assertEqual(hostnames, ['test1'])
        self.assertIsNone(port)

    def test__expand_hostpattern(self):
        instance = InventoryModule()
        hostnames, port = instance._expand_hostpattern('test1')
        self.assertEqual(hostnames, ['test1'])
        self.assertIsNone(port)

    def test__populate_host_vars(self):
        instance = InventoryModule()
        hosts = ['test1']
        vars = {'var1': 'value'}
        group = 'group'
        port = None
        instance._populate_host_vars(hosts, vars, group, port)
        self.assertEqual(instance.inventory.get_group(group).get_host('test1').get_variable('var1'), 'value')

    def test__init__(self):
        instance = InventoryModule()
        self.assertEqual(instance.NAME, 'yaml')

    def test__str__(self):
        instance = InventoryModule()
        self.assertEqual(str(instance), 'InventoryModule')

    def test__repr__(self):
        instance = InventoryModule()
        self.assertEqual(repr(instance), 'InventoryModule()')

    def test__eq__(self):
        instance1 = InventoryModule()
        instance2 = InventoryModule()
        self.assertEqual(instance1, instance2)

if __name__ == '__main__':
    unittest.main()