from ansible.plugins.inventory.yaml import BaseFileInventoryPlugin
import unittest
from unittest.mock import MagicMock, patch
from ansible.plugins.inventory.yaml import InventoryModule
from ansible.errors import AnsibleError, AnsibleParserError
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
            self.assertTrue(self.module.verify_file(self.path) is True)

    def test_verify_file_invalid_extension(self):
        with patch('os.path.splitext', return_value=('file', '.txt')):
            self.module.get_option = MagicMock(return_value=['.yaml', '.yml'])
            self.assertFalse(self.module.verify_file(self.path))

    def test_verify_file_invalid_super(self):
        with patch('os.path.splitext', return_value=('file', '.yaml')):
            self.module.get_option = MagicMock(return_value=['.yaml', '.yml'])
            with patch.object(BaseFileInventoryPlugin, 'verify_file', return_value=False):
                self.assertFalse(self.module.verify_file(self.path))

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
        self.assertIn('Plugin configuration YAML file', str(context.exception))

    def test_parse_valid_data(self):
        data = {
            'all': {
                'hosts': {
                    'test1': None,
                    'test2': {'host_var': 'value'}
                },
                'vars': {'group_all_var': 'value'},
                'children': {
                    'other_group': {
                        'children': {
                            'group_x': {'hosts': {'test5': None}},
                            'group_y': {'hosts': {'test6': None}}
                        },
                        'vars': {'g2_var2': 'value3'},
                        'hosts': {'test4': {'ansible_host': '127.0.0.1'}}
                    },
                    'last_group': {
                        'hosts': {'test1': None},
                        'vars': {'group_last_var': 'value'}
                    }
                }
            }
        }
        self.loader.load_from_file = MagicMock(return_value=data)
        self.module._parse_group = MagicMock()
        self.module._load_name(self.inventory, self.loader, self.path)
        self.module._parse_group.assert_called()

    def test_parse_group_invalid_entry(self):
        with self.assertRaises(AnsibleParserError):
            self.module._parse_group('group', 'invalid_entry')
        self.assertIn('Invalid "invalid_entry" entry for "group" group', str(context.exception))

    def test_parse_group_valid(self):
        group_data = {
            'vars': {'var1': 'value1'},
            'children': {'child_group': None},
            'hosts': {'host1': None}
        }
        self.module.inventory = MagicMock()
        self.module.inventory.set_variable = MagicMock()
        self.module.inventory.add_child = MagicMock()
        self.module._parse_group('group', group_data)
        self.module.inventory.add_group.assert_called_with('group')
        self.module.inventory.set_variable.assert_called_with('group', 'var1', 'value1')
        self.module.inventory.add_child.assert_called()

    def test_parse_host(self):
        self.module._expand_hostpattern = MagicMock(return_value=(['host1'], 22))
        hosts, port = self.module._parse_host('host1')
        self.assertEqual(hosts, ['host1'])
        self.assertEqual(port, 22)

if __name__ == '__main__':
    unittest.main()