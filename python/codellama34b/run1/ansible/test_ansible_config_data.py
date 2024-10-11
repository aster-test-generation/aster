import unittest
from ansible.config.data import ConfigData


class TestConfigData(unittest.TestCase):
    def test_init(self):
        instance = ConfigData()
        self.assertEqual(instance._global_settings, {})
        self.assertEqual(instance._plugins, {})

    def test_get_setting(self):
        instance = ConfigData()
        setting = instance.get_setting("name")
        self.assertEqual(setting, None)

    def test_get_settings(self):
        instance = ConfigData()
        settings = instance.get_settings()
        self.assertEqual(settings, [])

    def test_update_setting(self):
        instance = ConfigData()
        instance.update_setting("setting")
        self.assertEqual(instance._global_settings, {"name": "setting"})


if __name__ == '__main__':
    unittest.main()