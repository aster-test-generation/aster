import unittest
from ansible.inventory import Inventory


class TestInventoryModule(unittest.TestCase):
    def test_init(self):
        instance = InventoryModule()
        self.assertEqual(instance.patterns, {})
        self.assertEqual(instance._filename, None)

    def test_add_pending_children(self):
        instance = InventoryModule()
        pending = {'group': {'parents': ['parent']}}
        instance._add_pending_children('group', pending)
        self.assertEqual(instance.inventory.children, {'group': ['parent']})

    def test_parse_group_name(self):
        instance = InventoryModule()
        line = 'group_name'
        self.assertEqual(instance._parse_group_name(line), 'group_name')

    def test_parse_variable_definition(self):
        instance = InventoryModule()
        line = 'key=value'
        self.assertEqual(instance._parse_variable_definition(line), ('key', 'value'))

    def test_parse_host_definition(self):
        instance = InventoryModule()
        line = 'host1=variable1 host2=variable2'
        hostnames, port, variables = instance._parse_host_definition(line)
        self.assertEqual(hostnames, ['host1', 'host2'])
        self.assertEqual(port, None)
        self.assertEqual(variables, {'variable1': 'variable1', 'variable2': 'variable2'})

    def test_expand_hostpattern(self):
        instance = InventoryModule()
        hostpattern = 'host1:port1 host2:port2'
        hostnames, port = instance._expand_hostpattern(hostpattern)
        self.assertEqual(hostnames, ['host1', 'host2'])
        self.assertEqual(port, 'port1')

    def test_parse_value(self):
        instance = InventoryModule()
        v = 'True'
        self.assertEqual(instance._parse_value(v), True)

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