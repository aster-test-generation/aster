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
        self.setting1 = MockSetting('setting1', 'value1')
        self.setting2 = MockSetting('setting2', 'value2')
        self.plugin = MockPlugin('type1', 'plugin1')

    def test_init(self):
        self.assertEqual(self.config_data._global_settings, {})
        self.assertEqual(self.config_data._plugins, {})

    def test_get_setting_global(self):
        self.config_data._global_settings['setting1'] = self.setting1
        result = self.config_data.get_setting('setting1')
        self.assertEqual(result, self.setting1)

    def test_get_setting_plugin(self):
        self.config_data._plugins = {
            'type1': {
                'plugin1': {
                    'setting1': self.setting1
                }
            }
        }
        result = self.config_data.get_setting('setting1', self.plugin)
        self.assertEqual(result, self.setting1)

    def test_get_setting_none(self):
        result = self.config_data.get_setting('nonexistent')
        self.assertIsNone(result)

    def test_get_settings_global(self):
        self.config_data._global_settings = {
            'setting1': self.setting1,
            'setting2': self.setting2
        }
        result = self.config_data.get_settings()
        self.assertEqual(result, [self.setting1, self.setting2])

    def test_get_settings_plugin(self):
        self.config_data._plugins = {
            'type1': {
                'plugin1': {
                    'setting1': self.setting1,
                    'setting2': self.setting2
                }
            }
        }
        result = self.config_data.get_settings(self.plugin)
        self.assertEqual(result, [self.setting1, self.setting2])

    def test_update_setting_global(self):
        self.config_data.update_setting(self.setting1)
        self.assertEqual(self.config_data._global_settings['setting1'], self.setting1)

    def test_update_setting_plugin(self):
        self.config_data.update_setting(self.setting1, self.plugin)
        self.assertEqual(self.config_data._plugins['type1']['plugin1']['setting1'], self.setting1)

if __name__ == '__main__':
    unittest.main()