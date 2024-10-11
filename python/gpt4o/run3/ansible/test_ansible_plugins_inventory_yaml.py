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

    @patch('os.path.splitext')
    def test_verify_file(self, mock_splitext):
        mock_splitext.return_value = ('file', '.yaml')
        self.module.get_option = MagicMock(return_value=['.yaml', '.yml'])
        self.module.verify_file = MagicMock(return_value=True)
        result = self.module.verify_file(self.path)
        self.assertTrue(result)

    @patch('os.path.splitext')
    def test_verify_file_invalid_extension(self, mock_splitext):
        mock_splitext.return_value = ('file', '.txt')
        self.module.get_option = MagicMock(return_value=['.yaml', '.yml'])
        self.module.verify_file = MagicMock(return_value=True)
        result = self.module.verify_file(self.path)
        self.assertTrue(result)

    def test_parse_empty_file(self):
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

    @patch.object(InventoryModule, '_parse_group')
    def test_parse_valid_data(self, mock_parse_group):
        data = {'all': {'hosts': {'test1': None}}}
        self.loader.load_from_file = MagicMock(return_value=data)
        self.module._load_name(self.inventory, self.loader, self.path)
        mock_parse_group.assert_called_with('all', data['all'])

    def test_parse_group_invalid_entry(self):
        with self.assertRaises(AnsibleParserError):
            self.module._parse_group('group', 'invalid_entry')
        self.assertIn('Invalid "group" entry', str(context.exception))

    def test_parse_group_valid(self):
        group_data = {'vars': {'var1': 'value1'}, 'children': {}, 'hosts': {}}
        self.module.inventory = MagicMock()
        self.module.inventory.set_variable = MagicMock()
        self.module._parse_group('group', group_data)
        self.module.inventory.add_group.assert_called_with('group')
        self.module.inventory.set_variable.assert_called_with('group', 'var1', 'value1')

    def test_parse_host(self):
        self.module._expand_hostpattern = MagicMock(return_value=(['host1'], 22))
        hostnames, port = self.module._parse_host('host1')
        self.assertEqual(hostnames, ['host1'])
        self.assertEqual(port, 22)

if __name__ == '__main__':
    unittest.main()