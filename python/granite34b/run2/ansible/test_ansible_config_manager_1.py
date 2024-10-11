import unittest
from ansible.config.manager import ConfigManager


class TestConfigManager(unittest.TestCase):
    def setUp(self):
        self.config_manager = ConfigManager()

    def test_get_config_value_and_origin(self):
        config = 'some_config'
        keys = {'some_key': 'some_value'}
        variables = {'some_var': 'some_value'}
        direct = {'some_direct': 'some_value'}
        plugin_type = 'some_plugin_type'
        plugin_name = 'some_plugin_name'
        cfile = 'some_config_file'
        value, origin = self.config_manager.get_config_value_and_origin(config, cfile, plugin_type, plugin_name, keys, variables, direct)
        self.assertEqual(value, 'some_value')
        self.assertEqual(origin, 'some_origin')

    def test_initialize_plugin_configuration_definitions(self):
        plugin_type = 'some_plugin_type'
        name = 'some_name'
        defs = {'some_def': 'some_value'}
        self.config_manager.initialize_plugin_configuration_definitions(plugin_type, name, defs)
        self.assertEqual(self.config_manager._plugins[plugin_type][name], defs)

    def test_update_config_data(self):
        defs = {'some_def': 'some_value'}
        configfile = 'some_config_file'
        self.config_manager.update_config_data(defs, configfile)
        self.assertEqual(self.config_manager.data.get_value('some_def'), 'some_value')

if __name__ == '__main__':
    unittest.main()