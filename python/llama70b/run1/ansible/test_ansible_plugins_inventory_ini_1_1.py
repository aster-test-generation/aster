import unittest
from ansible_collections.core.inventory.ini import InventoryModule, DOCUMENTATION, EXAMPLE


class TestInventoryModule(unittest.TestCase):
    def test___init__(self):
        instance = InventoryModule()
        self.assertIsInstance(instance, InventoryModule)

    def test_parse(self):
        instance = InventoryModule()
        inventory = object()
        loader = object()
        path = 'path'
        cache = True
        instance.parse(inventory, loader, path, cache)
        self.assertEqual(instance._filename, path)

    def test__parse(self):
        instance = InventoryModule()
        path = 'path'
        lines = ['line1', 'line2']
        instance._parse(path, lines)
        self.assertEqual(instance.lineno, 2)

    def test__raise_error(self):
        instance = InventoryModule()
        message = 'error message'
        with self.assertRaises(AnsibleError):
            instance._raise_error(message)

    def test__add_pending_children(self):
        instance = InventoryModule()
        groupname = 'groupname'
        pending_declarations = {'groupname': {'state': 'children', 'name': 'groupname', 'parents': ['parent']}}
        instance._add_pending_children(groupname, pending_declarations)
        self.assertIn(groupname, instance.inventory.groups)

    def test__parse_host_definition(self):
        instance = InventoryModule()
        line = 'host:port var1=value1 var2=value2'
        hosts, port, variables = instance._parse_host_definition(line)
        self.assertEqual(hosts, 'host')
        self.assertEqual(port, 'port')
        self.assertEqual(variables, {'var1': 'value1', 'var2': 'value2'})

    def test__parse_variable_definition(self):
        instance = InventoryModule()
        line = 'key=value'
        k, v = instance._parse_variable_definition(line)
        self.assertEqual(k, 'key')
        self.assertEqual(v, 'value')

    def test__parse_group_name(self):
        instance = InventoryModule()
        line = 'groupname'
        groupname = instance._parse_group_name(line)
        self.assertEqual(groupname, 'groupname')

    def test__populate_host_vars(self):
        instance = InventoryModule()
        hosts = 'host'
        variables = {'var1': 'value1', 'var2': 'value2'}
        groupname = 'groupname'
        port = 'port'
        instance._populate_host_vars(hosts, variables, groupname, port)
        self.assertIn(hosts, instance.inventory.hosts)

    def test___str__(self):
        instance = InventoryModule()
        result = instance.__str__()
        self.assertEqual(result, 'ini')

    def test___repr__(self):
        instance = InventoryModule()
        result = instance.__repr__()
        self.assertEqual(result, 'ini()')

class TestDOCUMENTATION(unittest.TestCase):
    def test_DOCUMENTATION(self):
        self.assertIsInstance(DOCUMENTATION, str)

class TestEXAMPLES(unittest.TestCase):
    def test_EXAMPLES(self):
        self.assertIsInstance(EXAMPLES, str)

if __name__ == '__main__':
    unittest.main()