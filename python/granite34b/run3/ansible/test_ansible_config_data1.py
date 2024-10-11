import unittest
from ansible.config.data import ConfigData

class TestConfigData(unittest.TestCase):
    def setUp(self):
        self.config_data = ConfigData()

    def test_get_setting_global(self):
        self.config_data._global_settings['test_setting'] = 'test_value'
        result = self.config_data.get_setting('test_setting')
        self.assertEqual(result, 'test_value')

    def test_get_setting_plugin(self):
        plugin = MockPlugin('test_plugin', 'test_type')
        self.config_data._plugins[plugin.type][plugin.name] = {'test_setting': 'test_value'}
        result = self.config_data.get_setting('test_setting', plugin)
        self.assertEqual(result, 'test_value')

    def test_get_settings_global(self):
        self.config_data._global_settings['test_setting_1'] = 'test_value_1'
        self.config_data._global_settings['test_setting_2'] = 'test_value_2'
        result = self.config_data.get_settings()
        self.assertEqual(result, ['test_value_1', 'test_value_2'])

    def test_get_settings_plugin(self):
        plugin = MockPlugin('test_plugin', 'test_type')
        self.config_data._plugins[plugin.type][plugin.name] = {
            'test_setting_1': 'test_value_1',
            'test_setting_2': 'test_value_2'
        }
        result = self.config_data.get_settings(plugin)
        self.assertEqual(result, ['test_value_1', 'test_value_2'])

    def test_update_setting_global(self):
        setting = MockSetting('test_setting', 'test_value')
        self.config_data.update_setting(setting)
        self.assertEqual(self.config_data._global_settings['test_setting'], setting)

    def test_update_setting_plugin(self):
        plugin = MockPlugin('test_plugin', 'test_type')
        setting = MockSetting('test_setting', 'test_value')
        self.config_data.update_setting(setting, plugin)
        self.assertEqual(self.config_data._plugins[plugin.type][plugin.name]['test_setting'], setting)

class MockPlugin:
    def __init__(self, name, type):
        self.name = name
        self.type = type

class MockSetting:
    def __init__(self, name, value):
        self.name = name
        self.value = value

if __name__ == '__main__':
    unittest.main()