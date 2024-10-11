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
    @patch('os.path.exists', return_value=True)
    def test_read_config_yaml_file(self, mock_exists, mock_open, mock_yaml_load, mock_to_bytes):
        mock_to_bytes.return_value = b'file_path'
        mock_yaml_load.return_value = {}
        instance = ConfigManager()
        result = instance._read_config_yaml_file('file_path')
        self.assertEqual(result, {})

    @patch('ansible.config.manager.to_bytes')
    @patch('os.path.exists', return_value=False)
    def test_read_config_yaml_file_missing(self, mock_exists, mock_to_bytes):
        mock_to_bytes.return_value = b'file_path'
        instance = ConfigManager()
        with self.assertRaises(AnsibleError):
            instance._read_config_yaml_file('file_path')

    @patch('ansible.config.manager.to_bytes')
    @patch('ansible.config.manager.to_text')
    @patch('ansible.config.manager.configparser.ConfigParser.read_string')
    @patch('builtins.open', new_callable=mock_open, read_data="config_data")
    @patch('ansible.config.manager.get_config_type', return_value='ini')
    def test_parse_config_file(self, mock_get_config_type, mock_open, mock_read_string, mock_to_text, mock_to_bytes):
        mock_to_bytes.return_value = b'file_path'
        mock_to_text.return_value = 'config_data'
        instance = ConfigManager()
        instance._parse_config_file('file_path')
        self.assertIn('file_path', instance._parsers)

    @patch('ansible.config.manager.get_config_type', return_value='unsupported')
    def test_parse_config_file_unsupported(self, mock_get_config_type):
        instance = ConfigManager()
        with self.assertRaises(AnsibleOptionsError):
            instance._parse_config_file('file_path')

    def test_find_yaml_config_files(self):
        instance = ConfigManager()
        result = instance._find_yaml_config_files()
        self.assertIsNone(result)

    @patch.object(ConfigManager, 'get_configuration_definitions', return_value={'option': 'value'})
    @patch.object(ConfigManager, 'get_config_value', return_value='config_value')
    def test_get_plugin_options(self, mock_get_config_value, mock_get_configuration_definitions):
        instance = ConfigManager()
        result = instance.get_plugin_options('plugin_type', 'name')
        self.assertEqual(result, {'option': 'config_value'})

    @patch.object(ConfigManager, 'get_configuration_definitions', return_value={'option': {'vars': [{'name': 'var1'}, {'name': 'var2'}]}})
    def test_get_plugin_vars(self, mock_get_configuration_definitions):
        instance = ConfigManager()
        result = instance.get_plugin_vars('plugin_type', 'name')
        self.assertEqual(result, ['var1', 'var2'])

    @patch.object(ConfigManager, 'get_configuration_definitions', return_value={'option': 'value'})
    def test_get_configuration_definition(self, mock_get_configuration_definitions):
        instance = ConfigManager()
        result = instance.get_configuration_definition('name')
        self.assertEqual(result, 'value')

    @patch.object(ConfigManager, 'get_configuration_definitions', return_value={'option': 'value'})
    def test_get_configuration_definitions(self, mock_get_configuration_definitions):
        instance = ConfigManager()
        result = instance.get_configuration_definitions()
        self.assertEqual(result, {'option': 'value'})

    def test_loop_entries(self):
        instance = ConfigManager()
        container = {'name': 'value'}
        entry_list = [{'name': 'name'}]
        result = instance._loop_entries(container, entry_list)
        self.assertEqual(result, ('value', 'name'))

    @patch.object(ConfigManager, 'get_config_value_and_origin', return_value=('value', 'origin'))
    def test_get_config_value(self, mock_get_config_value_and_origin):
        instance = ConfigManager()
        result = instance.get_config_value('config')
        self.assertEqual(result, 'value')

if __name__ == '__main__':
    unittest.main()