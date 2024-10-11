import unittest
from ansible.config.manager import ConfigManager


class TestConfigManager(unittest.TestCase):
    def setUp(self):
        self.config_manager = ConfigManager()

    def test_get_config_value_and_origin(self):
        config = 'some_config'
        value, origin = self.config_manager.get_config_value_and_origin(config)
        self.assertIsNotNone(value)
        self.assertIsNotNone(origin)

    def test_initialize_plugin_configuration_definitions(self):
        plugin_type = 'some_plugin_type'
        name = 'some_name'
        defs = {}
        self.config_manager.initialize_plugin_configuration_definitions(plugin_type, name, defs)
        self.assertIn(plugin_type, self.config_manager._plugins)
        self.assertIn(name, self.config_manager._plugins[plugin_type])

    def test_update_config_data(self):
        defs = {}
        self.config_manager.update_config_data(defs)
        self.assertIsNotNone(self.config_manager.data)

if __name__ == '__main__':
    unittest.main()