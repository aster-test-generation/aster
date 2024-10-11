import unittest
from ansible.config.manager import *


class TestConfigManager(unittest.TestCase):
    def test_init(self):
        instance = ConfigManager()
        self.assertEqual(instance._base_defs, {})
        self.assertEqual(instance._plugins, {})
        self.assertEqual(instance._parsers, {})
        self.assertEqual(instance._config_file, None)
        self.assertEqual(instance.data, ConfigData())

    def test_get_config_value_and_origin(self):
        instance = ConfigManager()
        cfile = None
        plugin_type = None
        plugin_name = None
        keys = None
        variables = None
        direct = None
        result = instance.get_config_value_and_origin(cfile, plugin_type, plugin_name, keys, variables, direct)
        self.assertEqual(result, None)

    def test_initialize_plugin_configuration_definitions(self):
        instance = ConfigManager()
        plugin_type = None
        name = None
        defs = None
        result = instance.initialize_plugin_configuration_definitions(plugin_type, name, defs)
        self.assertEqual(result, None)

    def test_update_config_data(self):
        instance = ConfigManager()
        defs = None
        configfile = None
        result = instance.update_config_data(defs, configfile)
        self.assertEqual(result, None)

if __name__ == '__main__':
    unittest.main()