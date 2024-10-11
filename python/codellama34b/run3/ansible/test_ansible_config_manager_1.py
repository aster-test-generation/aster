import unittest
from ansible.config.manager import *


class TestConfigManager(unittest.TestCase):
    def test_init(self):
        instance = ConfigManager()
        self.assertIsInstance(instance, ConfigManager)

    def test_get_config_value_and_origin(self):
        instance = ConfigManager()
        result = instance.get_config_value_and_origin('config', 'cfile', 'plugin_type', 'plugin_name', 'keys', 'variables', 'direct')
        self.assertIsNotNone(result)

    def test_initialize_plugin_configuration_definitions(self):
        instance = ConfigManager()
        instance.initialize_plugin_configuration_definitions('plugin_type', 'name', 'defs')
        self.assertIsNotNone(instance._plugins)

    def test_update_config_data(self):
        instance = ConfigManager()
        instance.update_config_data('defs', 'configfile')
        self.assertIsNotNone(instance.data)

if __name__ == '__main__':
    unittest.main()