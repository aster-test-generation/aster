import unittest
from ansible.plugins.inventory.yaml import *


class TestInventoryModule(unittest.TestCase):
    def test_init(self):
        instance = InventoryModule()
        self.assertEqual(instance.patterns, {})
        self.assertEqual(instance._filename, None)

    def test_parse(self):
        instance = InventoryModule()
        instance.parse(None, None, None)
        self.assertEqual(instance.patterns, {})
        self.assertEqual(instance._filename, None)

    def test_raise_error(self):
        instance = InventoryModule()
        self.assertRaises(AnsibleError, instance._raise_error, None)

    def test_parse_host_definition(self):
        instance = InventoryModule()
        self.assertRaises(AnsibleParserError, instance._parse_host_definition, None)

    def test_populate_host_vars(self):
        instance = InventoryModule()
        self.assertRaises(AnsibleParserError, instance._populate_host_vars, None, None, None, None)

    def test_parse_variable_definition(self):
        instance = InventoryModule()
        self.assertRaises(AnsibleParserError, instance._parse_variable_definition, None)

    def test_parse_group_name(self):
        instance = InventoryModule()
        self.assertRaises(AnsibleParserError, instance._parse_group_name, None)

    def test_add_pending_children(self):
        instance = InventoryModule()
        self.assertRaises(AnsibleParserError, instance._add_pending_children, None, None)

if __name__ == '__main__':
    unittest.main()