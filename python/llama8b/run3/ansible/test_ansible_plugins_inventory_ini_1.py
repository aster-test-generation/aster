import unittest
from ansible.inventory import Inventory


class TestInventoryModule(unittest.TestCase):
    def test_init(self):
        instance = InventoryModule()
        self.assertEqual(instance.patterns, {})
        self.assertEqual(instance._filename, None)

    def test_add_pending_children(self):
        instance = InventoryModule()
        pending = {'group': {'parents': ['parent'], 'state': 'children'}}
        instance._add_pending_children('group', pending)
        self.assertEqual(instance.inventory.add_child.call_count, 1)
        self.assertEqual(instance.inventory.add_child.call_args[0][0], 'parent')
        self.assertEqual(instance.inventory.add_child.call_args[0][1], 'group')

    def test_parse_group_name(self):
        instance = InventoryModule()
        line = 'group_name'
        m = instance.patterns['groupname'].match(line)
        self.assertEqual(m.group(1), 'group_name')

    def test_parse_variable_definition(self):
        instance = InventoryModule()
        line = 'key=value'
        k, v = instance._parse_variable_definition(line)
        self.assertEqual(k, 'key')
        self.assertEqual(v, 'value')

    def test_parse_host_definition(self):
        instance = InventoryModule()
        line = 'host1=port1 key1=value1 key2=value2'
        hostnames, port, variables = instance._parse_host_definition(line)
        self.assertEqual(hostnames, ['host1'])
        self.assertEqual(port, 'port1')
        self.assertEqual(variables, {'key1': 'value1', 'key2': 'value2'})

    def test_expand_hostpattern(self):
        instance = InventoryModule()
        hostpattern = 'host1:port1'
        hostnames, port = instance._expand_hostpattern(hostpattern)
        self.assertEqual(hostnames, ['host1'])
        self.assertEqual(port, 'port1')

    def test_parse_value(self):
        instance = InventoryModule()
        v = '1'
        result = instance._parse_value(v)
        self.assertEqual(result, 1)

    def test_str_method(self):
        instance = InventoryModule()
        result = str(instance)
        self.assertEqual(result, '<ansible.plugins.inventory.ini.InventoryModule object at 0x...>')

    def test_repr_method(self):
        instance = InventoryModule()
        result = repr(instance)
        self.assertEqual(result, '<ansible.plugins.inventory.ini.InventoryModule object at 0x...>')

    def test_eq_method(self):
        instance1 = InventoryModule()
        instance2 = InventoryModule()
        self.assertEqual(instance1, instance2)

if __name__ == '__main__':
    unittest.main()