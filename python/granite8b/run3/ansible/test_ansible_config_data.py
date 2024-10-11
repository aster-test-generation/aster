import unittest
from ansible.config.data import ConfigData


class TestConfigData(unittest.TestCase):
    def test_get_setting(self):
        config_data = ConfigData()
        setting = config_data.get_setting('test_setting')
        self.assertEqual(setting, None)

    def test_get_settings(self):
        config_data = ConfigData()
        settings = config_data.get_settings()
        self.assertEqual(settings, [])

    def test_update_setting(self):
        config_data = ConfigData()
        setting = {'name': 'test_setting', 'value': 'test_value'}
        config_data.update_setting(setting)
        self.assertEqual(config_data._global_settings['test_setting'], setting)

if __name__ == '__main__':
    unittest.main()