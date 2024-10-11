import unittest
from ansible.config.manager import ConfigManager


class TestConfigManager(unittest.TestCase):
    def test_get_config_value_and_origin(self):
        config_manager = ConfigManager()
        config_manager._base_defs = {
            'config_option_1': {'type': 'string', 'default': 'default_value'},
            'config_option_2': {'type': 'int', 'default': 100}
        }
        config_manager._config_file = 'config_file.yml'
        value, origin = config_manager.get_config_value_and_origin('config_option_1')
        self.assertEqual(value, 'default_value')
        self.assertEqual(origin, 'default')
        value, origin = config_manager.get_config_value_and_origin('config_option_2')
        self.assertEqual(value, 100)
        self.assertEqual(origin, 'default')
        config_manager._parsers = {'config_file.yml': {'config_option_1': 'value_from_config_file'}}
        value, origin = config_manager.get_config_value_and_origin('config_option_1')
        self.assertEqual(value, 'value_from_config_file')
        self.assertEqual(origin, 'config_file.yml')

    def test_initialize_plugin_configuration_definitions(self):
        config_manager = ConfigManager()
        config_manager._plugins = {}
        config_manager.initialize_plugin_configuration_definitions('plugin_type', 'plugin_name', {'config_option_1': {'type': 'string', 'default': 'default_value'}})
        self.assertEqual(config_manager._plugins['plugin_type']['plugin_name']['config_option_1']['type'], 'string')
        self.assertEqual(config_manager._plugins['plugin_type']['plugin_name']['config_option_1']['default'], 'default_value')

    def test_update_config_data(self):
        config_manager = ConfigManager()
        config_manager._base_defs = {
            'config_option_1': {'type': 'string', 'default': 'default_value'},
            'config_option_2': {'type': 'int', 'default': 100}
        }
        config_manager._config_file = 'config_file.yml'
        config_manager._parsers = {'config_file.yml': {'config_option_1': 'value_from_config_file'}}
        config_manager.update_config_data()
        self.assertEqual(config_manager.data.get_setting('config_option_1').value, 'value_from_config_file')
        self.assertEqual(config_manager.data.get_setting('config_option_1').origin, 'config_file.yml')
        self.assertEqual(config_manager.data.get_setting('config_option_2').value, 100)
        self.assertEqual(config_manager.data.get_setting('config_option_2').origin, 'default')

if __name__ == '__main__':
    unittest.main()