import unittest
from ansible.config import manager as ConfigManage


class TestConfigManager(unittest.TestCase):
    def test___init__(self):
        instance = ConfigManager()
        self.assertIsNotNone(instance)

    def test_get_config_value_and_origin(self):
        instance = ConfigManager()
        config = 'some_config'
        cfile = 'some_file.ini'
        plugin_type = 'some_plugin_type'
        plugin_name = 'some_plugin_name'
        keys = {config: 'some_value'}
        variables = {'some_var': 'some_value'}
        direct = {config: 'some_direct_value'}
        result = instance.get_config_value_and_origin(config, cfile, plugin_type, plugin_name, keys, variables, direct)
        self.assertIsNotNone(result)

    def test__loop_entries(self):
        instance = ConfigManager()
        variables = {'some_var': 'some_value'}
        defs = {'vars': {'some_var': 'some_value'}}
        result = instance._ConfigManager__loop_entries(variables, defs['vars'])
        self.assertIsNotNone(result)

    def test_initialize_plugin_configuration_definitions(self):
        instance = ConfigManager()
        plugin_type = 'some_plugin_type'
        name = 'some_plugin_name'
        defs = {'some_config': {'type': 'string'}}
        instance.initialize_plugin_configuration_definitions(plugin_type, name, defs)
        self.assertIn(plugin_type, instance._plugins)

    def test_update_config_data(self):
        instance = ConfigManager()
        defs = {'some_config': {'type': 'string'}}
        configfile = 'some_file.ini'
        instance.update_config_data(defs, configfile)
        self.assertIn('CONFIG_FILE', instance.data)

    def test__parse_config_file(self):
        instance = ConfigManager()
        cfile = 'some_file.ini'
        instance._parse_config_file(cfile)
        self.assertIsNotNone(instance._parsers.get(cfile, None))

    def test__read_config_yaml_file(self):
        instance = ConfigManager()
        defs_file = 'some_defs_file.yml'
        result = instance._ConfigManager__read_config_yaml_file(defs_file)
        self.assertIsNotNone(result)

    def test___str__(self):
        instance = ConfigManager()
        result = instance.__str__()
        self.assertEqual(result, 'ConfigManager')

    def test___repr__(self):
        instance = ConfigManager()
        result = instance.__repr__()
        self.assertEqual(result, 'ConfigManager()')

class TestPlugin(unittest.TestCase):
    def test_Plugin(self):
        plugin = Plugin('some_name', 'some_type')
        self.assertIsNotNone(plugin)

class TestSetting(unittest.TestCase):
    def test_Setting(self):
        setting = Setting('some_name', 'some_value', 'some_origin', 'some_type')
        self.assertIsNotNone(setting)

if __name__ == '__main__':
    unittest.main()