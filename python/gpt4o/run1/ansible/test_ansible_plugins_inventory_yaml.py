import unittest
from unittest.mock import MagicMock, patch
from ansible.plugins.inventory.yaml import InventoryModule
from ansible.errors import AnsibleParserError
from ansible.module_utils.common._collections_compat import MutableMapping


class TestInventoryModule(unittest.TestCase):

    def setUp(self):
        self.inventory = MagicMock()
        self.loader = MagicMock()
        self.path = "test_path.yaml"
        self.module = InventoryModule()

    def test_init(self):
        self.assertIsInstance(self.module, InventoryModule)

    def test_verify_file_valid(self):
        with patch('os.path.splitext', return_value=('file', '.yaml')):
            self.module.get_option = MagicMock(return_value=['.yaml', '.yml'])
            self.module.verify_file = MagicMock(return_value=True)
            result = self.module.verify_file(self.path)
            self.assertTrue(result)

    def test_verify_file_invalid(self):
        with patch('os.path.splitext', return_value=('file', '.txt')):
            self.module.get_option = MagicMock(return_value=['.yaml', '.yml'])
            self.module.verify_file = MagicMock(return_value=True)
            result = self.module.verify_file(self.path)
            self.assertTrue(result)

    def test_parse_empty_data(self):
        self.loader.load_from_file = MagicMock(return_value=None)
        with self.assertRaises(AnsibleParserError) as context:
            self.module._load_name(self.inventory, self.loader, self.path)
        self.assertEqual(str(context.exception), 'Parsed empty YAML file')

    def test_parse_invalid_structure(self):
        self.loader.load_from_file = MagicMock(return_value=[])
        with self.assertRaises(AnsibleParserError) as context:
            self.module._load_name(self.inventory, self.loader, self.path)
        self.assertIn('YAML inventory has invalid structure', str(context.exception))

    def test_parse_plugin_configuration(self):
        self.loader.load_from_file = MagicMock(return_value={'plugin': 'some_plugin'})
        with self.assertRaises(AnsibleParserError) as context:
            self.module._load_name(self.inventory, self.loader, self.path)
        self.assertIn('Plugin configuration YAML file, not YAML inventory', str(context.exception))

    def test_parse_valid_data(self):
        data = {
            'all': {
                'hosts': {'test1': None},
                'vars': {'group_all_var': 'value'},
                'children': {'other_group': {'hosts': {'test4': {'ansible_host': '127.0.0.1'}}}}
            }
        }
        self.loader.load_from_file = MagicMock(return_value=data)
        self.module._parse_group = MagicMock()
        self.module._load_name(self.inventory, self.loader, self.path)
        self.module._parse_group.assert_called_with('all', data['all'])

    def test_parse_group_valid(self):
        group_data = {
            'vars': {'var1': 'value1'},
            'children': {'child_group': {}},
            'hosts': {'host1': None}
        }
        self.module.inventory.add_group = MagicMock(return_value=Group())
        self.module.inventory.set_variable = MagicMock()
        self.module.inventory.add_child = MagicMock()
        self.module._parse_host = MagicMock(return_value=(['host1'], None))
        self.module._populate_host_vars = MagicMock()
        self.module._parse_group('group', group_data)
        self.module.inventory.add_group.assert_called_with('group')
        self.module.inventory.set_variable.assert_called_with('group', 'var1', 'value1')
        self.module.inventory.add_child.assert_called_with('group', 'child_group')
        self.module._populate_host_vars.assert_called_with(['host1'], {}, 'group', None)

    def test_parse_group_invalid(self):
        group_data = 'invalid_data'
        self.module.display = MagicMock()
        self.module._parse_group('group', group_data)
        self.module.display.warning.assert_called_with("Skipping 'group' as this is not a valid group definition")

    def test_parse_host(self):
        self.module._expand_hostpattern = MagicMock(return_value=(['host1'], 22))
        hostnames, port = self.module._parse_host('host1:22')
        self.assertEqual(hostnames, ['host1'])
        self.assertEqual(port, 22)

if __name__ == '__main__':
    unittest.main()