import unittest
from ansible.plugins.inventory.yaml import *


class TestInventoryModule(unittest.TestCase):
    def test_init(self):
        instance = InventoryModule()
        self.assertEqual(instance.patterns, {})
        self.assertEqual(instance._filename, None)

    def test_parse(self):
        instance = InventoryModule()
        instance._parse('path', [''])

    def test_raise_error(self):
        instance = InventoryModule()
        self.assertRaises(AnsibleError, instance._raise_error, 'message')

    def test_compile_patterns(self):
        instance = InventoryModule()
        instance._compile_patterns()

    def test_add_pending_children(self):
        instance = InventoryModule()
        instance._add_pending_children('groupname', {})

    def test_parse_host_definition(self):
        instance = InventoryModule()
        self.assertEqual(instance._parse_host_definition('line'), ([''], None, {}))

    def test_populate_host_vars(self):
        instance = InventoryModule()
        instance._populate_host_vars(['hosts'], {}, 'groupname', None)

    def test_parse_variable_definition(self):
        instance = InventoryModule()
        self.assertEqual(instance._parse_variable_definition('line'), ('k', 'v'))

    def test_parse_group_name(self):
        instance = InventoryModule()
        self.assertEqual(instance._parse_group_name('line'), 'child')

if __name__ == '__main__':
    unittest.main()