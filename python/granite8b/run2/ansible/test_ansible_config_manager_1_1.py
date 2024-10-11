import unittest
from ansible.config.manager import ConfigManager


class TestConfigManager(unittest.TestCase):
    def test_get_plugin_options(self):
        config_manager = ConfigManager()
        plugin_type = 'connection'
        name = 'local'
        keys = None
        variables = None
        direct = None
        options = config_manager.get_plugin_options(plugin_type, name, keys, variables, direct)
        self.assertIsInstance(options, dict)
        self.assertIn('remote_user', options)
        self.assertEqual(options['remote_user'], 'root')

    def test_get_plugin_vars(self):
        config_manager = ConfigManager()
        plugin_type = 'connection'
        name = 'local'
        vars = config_manager.get_plugin_vars(plugin_type, name)
        self.assertIsInstance(vars, list)
        self.assertIn('remote_user', vars)

    def test_get_configuration_definition(self):
        config_manager = ConfigManager()
        name = 'local'
        plugin_type = 'connection'
        definition = config_manager.get_configuration_definition(name, plugin_type)
        self.assertIsInstance(definition, dict)
        self.assertIn('remote_user', definition)

    def test_get_configuration_definitions(self):
        config_manager = ConfigManager()
        plugin_type = 'connection'
        name = 'local'
        definitions = config_manager.get_configuration_definitions(plugin_type, name)
        self.assertIsInstance(definitions, dict)
        self.assertIn('remote_user', definitions)

    def test_get_config_value(self):
        config_manager = ConfigManager()
        config = 'remote_user'
        value = config_manager.get_config_value(config)
        self.assertEqual(value, 'root')

if __name__ == '__main__':
    unittest.main()