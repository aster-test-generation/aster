import unittest
from ansible.config.data import ConfigData


class MockSetting:
    def __init__(self, name, value):
        self.name = name
        self.value = value

class MockPlugin:
    def __init__(self, type, name):
        self.type = type
        self.name = name

class TestConfigData(unittest.TestCase):
    def setUp(self):
        self.config_data = ConfigData()

    def test_init(self):
        self.assertEqual(self.config_data._global_settings, {})
        self.assertEqual(self.config_data._plugins, {})

    def test_get_setting_global(self):
        setting = MockSetting('test_setting', 'value')
        self.config_data._global_settings['test_setting'] = setting
        result = self.config_data.get_setting('test_setting')
        self.assertEqual(result, setting)

    def test_get_setting_plugin(self):
        setting = MockSetting('test_setting', 'value')
        plugin = MockPlugin('test_type', 'test_plugin')
        self.config_data._plugins = {
            'test_type': {
                'test_plugin': {
                    'test_setting': setting
                }
            }
        }
        result = self.config_data.get_setting('test_setting', plugin)
        self.assertEqual(result, setting)

    def test_get_settings_global(self):
        setting1 = MockSetting('setting1', 'value1')
        setting2 = MockSetting('setting2', 'value2')
        self.config_data._global_settings = {
            'setting1': setting1,
            'setting2': setting2
        }
        result = self.config_data.get_settings()
        self.assertEqual(result, [setting1, setting2])

    def test_get_settings_plugin(self):
        setting1 = MockSetting('setting1', 'value1')
        setting2 = MockSetting('setting2', 'value2')
        plugin = MockPlugin('test_type', 'test_plugin')
        self.config_data._plugins = {
            'test_type': {
                'test_plugin': {
                    'setting1': setting1,
                    'setting2': setting2
                }
            }
        }
        result = self.config_data.get_settings(plugin)
        self.assertEqual(result, [setting1, setting2])

    def test_update_setting_global(self):
        setting = MockSetting('test_setting', 'value')
        self.config_data.update_setting(setting)
        self.assertEqual(self.config_data._global_settings['test_setting'], setting)

    def test_update_setting_plugin(self):
        setting = MockSetting('test_setting', 'value')
        plugin = MockPlugin('test_type', 'test_plugin')
        self.config_data.update_setting(setting, plugin)
        self.assertEqual(self.config_data._plugins['test_type']['test_plugin']['test_setting'], setting)

if __name__ == '__main__':
    unittest.main()