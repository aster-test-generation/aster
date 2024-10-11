import unittest
from ansible.config.data import ConfigData


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
        setting = object()
        config_data.update_setting(setting)
        self.assertEqual(config_data._global_settings, {'name': setting})

if __name__ == '__main__':
    unittest.main()