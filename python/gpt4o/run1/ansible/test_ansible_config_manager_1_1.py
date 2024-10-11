import unittest
from ansible.config.manager import ConfigManager
from ansible.errors import AnsibleError, AnsibleOptionsError
from ansible.config.data import ConfigData
from unittest.mock import patch, mock_open, MagicMock


class TestConfigManager(unittest.TestCase):
    @patch('ansible.config.manager.ConfigData')
    @patch('ansible.config.manager.ConfigManager._read_config_yaml_file')
    @patch('ansible.config.manager.find_ini_config_file')
    @patch('ansible.config.manager._add_base_defs_deprecations')
    def test_init(self, mock_add_base_defs_deprecations, mock_find_ini_config_file, mock_read_config_yaml_file, mock_config_data):
        mock_read_config_yaml_file.return_value = {}
        mock_find_ini_config_file.return_value = None
        instance = ConfigManager()
        self.assertIsInstance(instance.data, ConfigData)

    @patch('ansible.config.manager.to_bytes')
    @patch('ansible.config.manager.yaml_load')
    @patch('builtins.open', new_callable=mock_open, read_data="{}")
    def test_read_config_yaml_file(self, mock_open, mock_yaml_load, mock_to_bytes):
        mock_to_bytes.side_effect = lambda x: x
        mock_yaml_load.return_value = {}
        instance = ConfigManager()
        result = instance._read_config_yaml_file('test.yml')
        self.assertEqual(result, {})

    @patch('ansible.config.manager.to_bytes')
    @patch('os.path.exists')
    def test_read_config_yaml_file_missing(self, mock_exists, mock_to_bytes):
        mock_to_bytes.side_effect = lambda x: x
        mock_exists.return_value = False
        instance = ConfigManager()
        with self.assertRaises(AnsibleError):
            instance._read_config_yaml_file('missing.yml')

    @patch('ansible.config.manager.to_bytes')
    @patch('ansible.config.manager.to_text')
    @patch('ansible.config.manager.configparser.ConfigParser.read_string')
    @patch('builtins.open', new_callable=mock_open, read_data="[default]\nkey=value")
    def test_parse_config_file_ini(self, mock_open, mock_read_string, mock_to_text, mock_to_bytes):
        mock_to_bytes.side_effect = lambda x: x
        mock_to_text.side_effect = lambda x, errors: x
        instance = ConfigManager()
        instance._config_file = 'test.ini'
        instance._parse_config_file()
        self.assertIn('test.ini', instance._parsers)

    def test_parse_config_file_unsupported(self):
        instance = ConfigManager()
        instance._config_file = 'test.unsupported'
        with self.assertRaises(AnsibleOptionsError):
            instance._parse_config_file()

    def test_find_yaml_config_files(self):
        instance = ConfigManager()
        result = instance._find_yaml_config_files()
        self.assertIsNone(result)

    @patch.object(ConfigManager, 'get_configuration_definitions')
    @patch.object(ConfigManager, 'get_config_value')
    def test_get_plugin_options(self, mock_get_config_value, mock_get_configuration_definitions):
        mock_get_configuration_definitions.return_value = {'option1': 'value1'}
        mock_get_config_value.return_value = 'value1'
        instance = ConfigManager()
        result = instance.get_plugin_options('plugin_type', 'name')
        self.assertEqual(result, {'option1': 'value1'})

    @patch.object(ConfigManager, 'get_configuration_definitions')
    def test_get_plugin_vars(self, mock_get_configuration_definitions):
        mock_get_configuration_definitions.return_value = {'option1': {'vars': [{'name': 'var1'}]}}
        instance = ConfigManager()
        result = instance.get_plugin_vars('plugin_type', 'name')
        self.assertEqual(result, ['var1'])

    def test_get_configuration_definition(self):
        instance = ConfigManager()
        instance._base_defs = {'name': 'value'}
        result = instance.get_configuration_definition('name')
        self.assertEqual(result, 'value')

    def test_get_configuration_definitions(self):
        instance = ConfigManager()
        instance._base_defs = {'name': 'value'}
        result = instance.get_configuration_definitions()
        self.assertEqual(result, {'name': 'value'})

    def test_get_configuration_definitions_ignore_private(self):
        instance = ConfigManager()
        instance._base_defs = {'_private': 'value', 'public': 'value'}
        result = instance.get_configuration_definitions(ignore_private=True)
        self.assertEqual(result, {'public': 'value'})

    def test_loop_entries(self):
        instance = ConfigManager()
        container = {'name': 'value'}
        entry_list = [{'name': 'name'}]
        result = instance._loop_entries(container, entry_list)
        self.assertEqual(result, ('value', 'name'))

    @patch.object(ConfigManager, 'get_config_value_and_origin')
    def test_get_config_value(self, mock_get_config_value_and_origin):
        mock_get_config_value_and_origin.return_value = ('value', 'origin')
        instance = ConfigManager()
        result = instance.get_config_value('config')
        self.assertEqual(result, 'value')

if __name__ == '__main__':
    unittest.main()