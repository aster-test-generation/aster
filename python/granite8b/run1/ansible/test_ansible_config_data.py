import unittest
from ansible.config.data import ConfigData


class TestConfigData(unittest.TestCase):
    def test_get_setting(self):
        config_data = ConfigData()
        setting = config_data.get_setting('test_setting')
        self.assertIsNone(setting)

    def test_get_settings(self):
        config_data = ConfigData()
        settings = config_data.get_settings()
        self.assertEqual(settings, [])

    def test_update_setting(self):
        config_data = ConfigData()
        setting = settings.MockSetting('test_setting')
        config_data.update_setting(setting)
        self.assertEqual(config_data._global_settings['test_setting'], setting)

class TestMockSetting(unittest.TestCase):
    def test_init(self):
        setting = self.create_setting('test_setting')
        self.assertEqual(setting.name, 'test_setting')

    def test_eq(self):
        setting1 = settings.MockSetting('test_setting')
        setting2 = MockSetting('test_setting')
        self.assertEqual(setting1, setting2)

class TestConfigData(unittest.TestCase):
    def test_get_setting(self):
        config_data = ConfigData()
        setting = config_data.get_setting('name')
        self.assertEqual(setting, None)

    def test_get_settings(self):
        config_data = ConfigData()
        settings = config_data.get_settings()
        self.assertEqual(settings, [])

    def test_update_setting(self):
        config_data = ConfigData()
        setting = {'name': 'value'}
        config_data.update_setting(setting)
        self.assertEqual(config_data._global_settings, {'name': 'value'})

if __name__ == '__main__':
    unittest.main()