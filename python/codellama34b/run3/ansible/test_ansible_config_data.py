import unittest
from ansible.config.data import ConfigData


class TestConfigData(unittest.TestCase):
    def test_init(self):
        instance = ConfigData()
        self.assertEqual(instance._global_settings, {})
        self.assertEqual(instance._plugins, {})

    def test_get_setting(self):
        instance = ConfigData()
        result = instance.get_setting("name")
        self.assertEqual(result, None)

    def test_get_settings(self):
        instance = ConfigData()
        result = instance.get_settings()
        self.assertEqual(result, [])

    def test_update_setting(self):
        instance = ConfigData()
        instance.update_setting("setting", "name")
        self.assertEqual(instance._global_settings["name"], "setting")


class TestConfigData(unittest.TestCase):
    def test_init(self):
        instance = ConfigData()
        self.assertEqual(instance._global_settings, {})
        self.assertEqual(instance._plugins, {})

    def test_get_setting(self):
        instance = ConfigData()
        setting = None
        plugin = None
        result = instance.get_setting(name, plugin)
        self.assertEqual(result, setting)

    def test_get_settings(self):
        instance = ConfigData()
        plugin = None
        result = instance.get_settings(plugin)
        self.assertEqual(result, [])

    def test_update_setting(self):
        instance = ConfigData()
        setting = None
        plugin = None
        result = instance.update_setting(setting, plugin)
        self.assertEqual(result, None)

if __name__ == '__main__':
    unittest.main()