import unittest
from unittest.mock import MagicMock, patch
from ansible.plugins.inventory.ini import InventoryModule
from ansible.errors import AnsibleError, AnsibleParserError


class TestInventoryModule(unittest.TestCase):
    def setUp(self):
        self.inventory_module = InventoryModule()
        self.inventory_module.inventory = MagicMock()
        self.inventory_module.loader = MagicMock()

    def test_init(self):
        self.assertIsInstance(self.inventory_module, InventoryModule)
        self.assertEqual(self.inventory_module.patterns, {})
        self.assertIsNone(self.inventory_module._filename)

    def test_parse(self):
        inventory = MagicMock()
        loader = MagicMock()
        path = 'test_path'
        self.inventory_module.loader._get_file_contents = MagicMock(return_value=(b'test_data', False))
        self.inventory_module._parse = MagicMock()

        self.inventory_module.parse(inventory, loader, path, cache=False)

        self.assertEqual(self.inventory_module._filename, path)
        self.inventory_module._parse.assert_called_once()

    def test_parse_with_exception(self):
        inventory = MagicMock()
        loader = MagicMock()
        path = 'test_path'
        self.inventory_module.loader._get_file_contents = MagicMock(side_effect=Exception('test_exception'))

        with self.assertRaises(AnsibleParserError):
            self.inventory_module.parse(inventory, loader, path)

    def test_raise_error(self):
        self.inventory_module._filename = 'test_file'
        self.inventory_module.lineno = 10

        with self.assertRaises(AnsibleError) as context:
            self.inventory_module._raise_error('test_message')

        self.assertEqual(str(context.exception), 'test_file:10: test_message')

    def test_parse_method(self):
        path = 'test_path'
        lines = ['[group1]', 'host1', '[group2:children]', 'group1']
        self.inventory_module._compile_patterns = MagicMock()
        self.inventory_module._parse_host_definition = MagicMock(return_value=(['host1'], None, {}))
        self.inventory_module._populate_host_vars = MagicMock()
        self.inventory_module._parse_variable_definition = MagicMock(return_value=('key', 'value'))
        self.inventory_module._parse_group_name = MagicMock(return_value='group1')
        self.inventory_module._raise_error = MagicMock()

        self.inventory_module.parse(path, lines)

        self.inventory_module._compile_patterns.assert_called_once()
        self.inventory_module._populate_host_vars.assert_called_once_with(['host1'], {}, 'group1', None)
        self.inventory_module._parse_variable_definition.assert_called_once_with('host1')
        self.inventory_module._parse_group_name.assert_called_once_with('group1')

    def test_parse_invalid_section(self):
        path = 'test_path'
        lines = ['[invalid section]']
        self.inventory_module._compile_patterns = MagicMock()
        self.inventory_module._raise_error = MagicMock()

        self.inventory_module.parse(path, lines)

        self.inventory_module._raise_error.assert_called_once_with("Invalid section entry: '[invalid section]'. Please make sure that there are no spaces in the section entry, and that there are no other invalid characters")

    def test_parse_unhandled_state(self):
        path = 'test_path'
        lines = ['[group1:unknown]']
        self.inventory_module._compile_patterns = MagicMock()
        self.inventory_module._raise_error = MagicMock()

        self.inventory_module.parse(path, lines)

        self.inventory_module._raise_error.assert_called_once_with('Section [group1:unknown] has unknown type: unknown')

    def test_parse_pending_declarations(self):
        path = 'test_path'
        lines = ['[group1:vars]', 'key=value']
        self.inventory_module._compile_patterns = MagicMock()
        self.inventory_module._parse_variable_definition = MagicMock(return_value=('key', 'value'))
        self.inventory_module.inventory.set_variable = MagicMock()

        self.inventory_module.parse(path, lines)

        self.inventory_module.inventory.set_variable.assert_called_once_with('group1', 'key', 'value')

    def test_parse_pending_declarations_error(self):
        path = 'test_path'
        lines = ['[group1:vars]']
        self.inventory_module._compile_patterns = MagicMock()

        with self.assertRaises(AnsibleError):
            self.inventory_module.parse(path, lines)

if __name__ == '__main__':
    unittest.main()