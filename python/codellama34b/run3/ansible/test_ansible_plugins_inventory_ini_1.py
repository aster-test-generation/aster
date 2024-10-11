import unittest
from ansible.plugins.inventory.yaml import *


class TestInventoryModule(unittest.TestCase):
    def test_init(self):
        instance = InventoryModule()
        self.assertEqual(instance.patterns, {})
        self.assertEqual(instance._filename, None)

    def test_add_pending_children(self):
        instance = InventoryModule()
        group = 'group'
        pending = {'group': {'parents': ['parent']}}
        instance._add_pending_children(group, pending)
        self.assertEqual(pending, {})

    def test_parse_group_name(self):
        instance = InventoryModule()
        line = 'group'
        result = instance._parse_group_name(line)
        self.assertEqual(result, 'group')

    def test_parse_variable_definition(self):
        instance = InventoryModule()
        line = 'key=value'
        result = instance._parse_variable_definition(line)
        self.assertEqual(result, ('key', 'value'))

    def test_parse_host_definition(self):
        instance = InventoryModule()
        line = 'host'
        result = instance._parse_host_definition(line)
        self.assertEqual(result, (['host'], None, {}))

    def test_expand_hostpattern(self):
        instance = InventoryModule()
        hostpattern = 'host'
        result = instance._expand_hostpattern(hostpattern)
        self.assertEqual(result, (['host'], None))

    def test_parse_value(self):
        instance = InventoryModule()
        v = 'value'
        result = instance._parse_value(v)
        self.assertEqual(result, 'value')

if __name__ == '__main__':
    unittest.main()