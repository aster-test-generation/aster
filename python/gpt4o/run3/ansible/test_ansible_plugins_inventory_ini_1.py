import re
import unittest
from ansible.plugins.inventory.ini import InventoryModule
from ansible.errors import AnsibleParserError


class TestInventoryModule(unittest.TestCase):
    def setUp(self):
        self.inventory_module = InventoryModule()

    def test_init(self):
        self.assertIsInstance(self.inventory_module, InventoryModule)
        self.assertEqual(self.inventory_module.patterns, {})
        self.assertIsNone(self.inventory_module._filename)

    def test_add_pending_children(self):
        self.inventory_module.inventory = unittest.mock.MagicMock()
        pending = {
            'group1': {'parents': ['parent1'], 'state': 'children'},
            'parent1': {'parents': [], 'state': 'children'}
        }
        self.inventory_module._add_pending_children('group1', pending)
        self.inventory_module.inventory.add_child.assert_called_with('parent1', 'group1')
        self.assertNotIn('group1', pending)

    def test_parse_group_name(self):
        self.inventory_module.patterns['groupname'] = re.compile(r'^\[(.*)\]$')
        result = self.inventory_module._parse_group_name('[group1]')
        self.assertEqual(result, 'group1')

    def test_parse_group_name_error(self):
        self.inventory_module.patterns['groupname'] = re.compile(r'^\[(.*)\]$')
        with self.assertRaises(AnsibleParserError):
            self.inventory_module._parse_group_name('group1')

    def test_parse_variable_definition(self):
        result = self.inventory_module._parse_variable_definition('key=value')
        self.assertEqual(result, ('key', 'value'))

    def test_parse_variable_definition_error(self):
        with self.assertRaises(AnsibleParserError):
            self.inventory_module._parse_variable_definition('keyvalue')

    def test_parse_host_definition(self):
        self.inventory_module._expand_hostpattern = unittest.mock.Mock(return_value=(['host1'], None))
        result = self.inventory_module._parse_host_definition('host1 key=value')
        self.assertEqual(result, (['host1'], None, {'key': 'value'}))

    def test_parse_host_definition_error(self):
        with self.assertRaises(AnsibleParserError):
            self.inventory_module._parse_host_definition('host1 keyvalue')

    def test_expand_hostpattern(self):
        self.inventory_module._expand_hostpattern = unittest.mock.MagicMock(return_value=(['host1'], None))
        result = self.inventory_module._expand_hostpattern('host1')
        self.assertEqual(result, (['host1'], None))

    def test_expand_hostpattern_error_colon(self):
        with self.assertRaises(AnsibleParserError):
            self.inventory_module._expand_hostpattern('host1:')

    def test_expand_hostpattern_error_yaml(self):
        with self.assertRaises(AnsibleParserError):
            self.inventory_module._expand_hostpattern('---')

    def test_parse_value(self):
        result = self.inventory_module._parse_value('1')
        self.assertEqual(result, 1)

    def test_parse_value_string(self):
        result = self.inventory_module._parse_value('"string"')
        self.assertEqual(result, 'string')

    def test_parse_value_invalid(self):
        result = self.inventory_module._parse_value('invalid')
        self.assertEqual(result, 'invalid')

if __name__ == '__main__':
    unittest.main()