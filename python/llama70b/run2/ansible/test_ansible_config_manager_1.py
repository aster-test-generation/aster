import unittest
from ansible.config import manager as ConfigManage


class TestConfigManager(unittest.TestCase):
    def test___init__(self):
        instance = ConfigManager()
        self.assertIsNotNone(instance._base_defs)
        self.assertIsNotNone(instance._plugins)
        self.assertIsNotNone(instance._parsers)
        self.assertIsNotNone(instance._config_file)
        self.assertIsNotNone(instance.data)

    def test_get_config_value_and_origin(self):
        instance = ConfigManager()
        config = 'some_config'
        cfile = 'some_file'
        plugin_type = 'some_plugin_type'
        plugin_name = 'some_plugin_name'
        keys = {'some_config': 'some_value'}
        variables = {'some_var': 'some_value'}
        direct = {'some_config': 'some_direct_value'}
        value, origin = instance.get_config_value_and_origin(config, cfile, plugin_type, plugin_name, keys, variables, direct)
        self.assertIsNotNone(value)
        self.assertIsNotNone(origin)

    def test__loop_entries(self):
        instance = ConfigManager()
        variables = {'some_var': 'some_value'}
        defs = {'vars': {'some_var': 'some_value'}}
        value, origin = instance._loop_entries(variables, defs['vars'])
        self.assertIsNotNone(value)
        self.assertIsNotNone(origin)

    def test_initialize_plugin_configuration_definitions(self):
        instance = ConfigManager()
        plugin_type = 'some_plugin_type'
        name = 'some_plugin_name'
        defs = {'some_config': {'type': 'string'}}
        instance.initialize_plugin_configuration_definitions(plugin_type, name, defs)
        self.assertIn(plugin_type, instance._plugins)
        self.assertIn(name, instance._plugins[plugin_type])

    def test_update_config_data(self):
        instance = ConfigManager()
        defs = {'some_config': {'type': 'string', 'default': 'some_default'}}
        configfile = 'some_file'
        instance.update_config_data(defs, configfile)
        self.assertIn('some_config', instance.data)

    def test___str__(self):
        instance = ConfigManager()
        self.assertEqual(str(instance), 'ConfigManager')

    def test___repr__(self):
        instance = ConfigManager()
        self.assertEqual(repr(instance), 'ConfigManager()')

    def test___eq__(self):
        instance1 = ConfigManager()
        instance2 = ConfigManager()
        self.assertEqual(instance1, instance2)

class TestPlugin(unittest.TestCase):
    def test_Plugin(self):
        plugin = Plugin('some_name', 'some_type')
        self.assertEqual(plugin.name, 'some_name')
        self.assertEqual(plugin.type, 'some_type')

class TestSetting(unittest.TestCase):
    def test_Setting(self):
        setting = Setting('some_name', 'some_value', 'some_origin', 'some_type')
        self.assertEqual(setting.name, 'some_name')
        self.assertEqual(setting.value, 'some_value')
        self.assertEqual(setting.origin, 'some_origin')
        self.assertEqual(setting.type, 'some_type')

if __name__ == '__main__':
    unittest.main()