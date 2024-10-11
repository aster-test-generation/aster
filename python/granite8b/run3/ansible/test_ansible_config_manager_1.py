import unittest
from ansible.config.manager import ConfigManager


class TestConfigManager(unittest.TestCase):
    def test_get_config_value_and_origin(self):
        config_manager = ConfigManager()
        config_manager._base_defs = {
            'test_config': {
                'type': 'string',
                'default': 'default_value'
            }
        }
        config_manager._config_file = 'test_config_file'
        value, origin = config_manager.get_config_value_and_origin('test_config')
        self.assertEqual(value, 'default_value')
        self.assertEqual(origin, 'default')

    def test_initialize_plugin_configuration_definitions(self):
        config_manager = ConfigManager()
        config_manager._plugins = {}
        config_manager.initialize_plugin_configuration_definitions('test_type', 'test_name', {'test_config': {'type': 'string', 'default': 'default_value'}})
        self.assertEqual(config_manager._plugins['test_type']['test_name']['test_config']['type'], 'string')
        self.assertEqual(config_manager._plugins['test_type']['test_name']['test_config']['default'], 'default_value')

    def test_update_config_data(self):
        config_manager = ConfigManager()
        config_manager._base_defs = {
            'test_config': {
                'type': 'string',
                'default': 'default_value'
            }
        }
        config_manager._config_file = 'test_config_file'
        config_manager.update_config_data()
        self.assertEqual(config_manager.data.get_setting('test_config').value, 'default_value')
        self.assertEqual(config_manager.data.get_setting('test_config').origin, 'default')

if __name__ == '__main__':
    unittest.main()