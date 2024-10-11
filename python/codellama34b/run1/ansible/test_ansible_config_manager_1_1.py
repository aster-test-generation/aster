import unittest
from ansible.config.manager import *


class TestConfigManager(unittest.TestCase):
    def test_init(self):
        instance = ConfigManager()
        self.assertIsInstance(instance, ConfigManager)

    def test_get_plugin_options(self):
        instance = ConfigManager()
        result = instance.get_plugin_options('plugin_type', 'name')
        self.assertIsInstance(result, dict)

    def test_get_plugin_vars(self):
        instance = ConfigManager()
        result = instance.get_plugin_vars('plugin_type', 'name')
        self.assertIsInstance(result, list)

    def test_get_configuration_definition(self):
        instance = ConfigManager()
        result = instance.get_configuration_definition('name')
        self.assertIsInstance(result, dict)

    def test_get_configuration_definitions(self):
        instance = ConfigManager()
        result = instance.get_configuration_definitions()
        self.assertIsInstance(result, dict)

    def test_loop_entries(self):
        instance = ConfigManager()
        result = instance._loop_entries({}, [])
        self.assertIsInstance(result, tuple)

    def test_get_config_value(self):
        instance = ConfigManager()
        result = instance.get_config_value('config')
        self.assertIsInstance(result, dict)

if __name__ == '__main__':
    unittest.main()