import unittest
from ansible.inventory.ini import InventoryModule, BaseFileInventoryPlugi


class TestInventoryModule(unittest.TestCase):
    def test___init__(self):
        instance = InventoryModule()
        self.assertIsInstance(instance, BaseFileInventoryPlugin)

    def test_parse(self):
        instance = InventoryModule()
        inventory = object()
        loader = object()
        path = 'path/to/file'
        instance.parse(inventory, loader, path)
        self.assertEqual(instance._filename, path)

    def test__raise_error(self):
        instance = InventoryModule()
        message = 'Test error message'
        with self.assertRaises(AnsibleError):
            instance._raise_error(message)

    def test__parse(self):
        instance = InventoryModule()
        path = 'path/to/file'
        lines = ['[group]', 'host1', '[group:children]', 'child1']
        instance._parse(path, lines)
        self.assertIn('group', instance.inventory.groups)

    def test__add_pending_children(self):
        instance = InventoryModule()
        groupname = 'group'
        pending_declarations = {'group': {'state': 'children', 'name': 'group', 'parents': ['parent']}}
        instance._add_pending_children(groupname, pending_declarations)
        self.assertIn('parent', instance.inventory.groups)

    def test__parse_host_definition(self):
        instance = InventoryModule()
        line = 'host1:1234 var1=value1'
        hosts, port, variables = instance._parse_host_definition(line)
        self.assertEqual(hosts, 'host1')
        self.assertEqual(port, '1234')
        self.assertEqual(variables, {'var1': 'value1'})

    def test__parse_variable_definition(self):
        instance = InventoryModule()
        line = 'var1=value1'
        k, v = instance._parse_variable_definition(line)
        self.assertEqual(k, 'var1')
        self.assertEqual(v, 'value1')

    def test__parse_group_name(self):
        instance = InventoryModule()
        line = 'child1'
        child = instance._parse_group_name(line)
        self.assertEqual(child, 'child1')

    def test__str__(self):
        instance = InventoryModule()
        result = instance.__str__()
        self.assertEqual(result, 'ini')

    def test__repr__(self):
        instance = InventoryModule()
        result = instance.__repr__()
        self.assertEqual(result, 'ini()')

if __name__ == '__main__':
    unittest.main()