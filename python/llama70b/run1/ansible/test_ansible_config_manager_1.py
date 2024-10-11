import unittest
from ansible.config import manager as ConfigManage


class TestConfigManager(unittest.TestCase):
    def test___init__(self):
        instance = ConfigManager()
        self.assertIsInstance(instance, ConfigManager)

    def test_get_config_value_and_origin(self):
        instance = ConfigManager()
        config = 'some_config'
        cfile = 'some_file'
        plugin_type = 'some_plugin_type'
        plugin_name = 'some_plugin_name'
        keys = {'some_config': 'some_value'}
        variables = {'some_var': 'some_value'}
        direct = {'some_config': 'some_direct_value'}
        result = instance.get_config_value_and_origin(config, cfile, plugin_type, plugin_name, keys, variables, direct)
        self.assertIsInstance(result, tuple)

    def test__loop_entries(self):
        instance = ConfigManager()
        variables = {'some_var': 'some_value'}
        defs = {'vars': {'some_var': 'some_value'}}
        result = instance._ConfigManager__loop_entries(variables, defs['vars'])
        self.assertIsInstance(result, tuple)

    def test_update_config_data(self):
        instance = ConfigManager()
        defs = {'some_config': {'type': 'string', 'default': 'some_default'}}
        configfile = 'some_file'
        instance.update_config_data(defs, configfile)
        self.assertIsInstance(instance.data, ConfigData)

    def test_initialize_plugin_configuration_definitions(self):
        instance = ConfigManager()
        plugin_type = 'some_plugin_type'
        name = 'some_plugin_name'
        defs = {'some_config': {'type': 'string', 'default': 'some_default'}}
        instance.initialize_plugin_configuration_definitions(plugin_type, name, defs)
        self.assertIn(plugin_type, instance._plugins)

    def test__parse_config_file(self):
        instance = ConfigManager()
        cfile = 'some_file'
        instance._parse_config_file(cfile)
        self.assertIn(cfile, instance._parsers)

    def test__read_config_yaml_file(self):
        instance = ConfigManager()
        defs_file = 'some_file'
        result = instance._ConfigManager__read_config_yaml_file(defs_file)
        self.assertIsInstance(result, dict)

    def test___str__(self):
        instance = ConfigManager()
        result = instance.__str__()
        self.assertIsInstance(result, str)

    def test___repr__(self):
        instance = ConfigManager()
        result = instance.__repr__()
        self.assertIsInstance(result, str)

class TestPlugin(unittest.TestCase):
    def test_Plugin(self):
        plugin = Plugin('some_name', 'some_type')
        self.assertIsInstance(plugin, tuple)

class TestSetting(unittest.TestCase):
    def test_Setting(self):
        setting = Setting('some_name', 'some_value', 'some_origin', 'some_type')
        self.assertIsInstance(setting, tuple)

if __name__ == '__main__':
    unittest.main()