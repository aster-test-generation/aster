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
        instance.update_setting("setting", "setting")
        self.assertEqual(instance._global_settings["name"], "setting")


class TestConfigData(unittest.TestCase):
    def test_init(self):
        instance = ConfigData()
        self.assertEqual(instance._global_settings, {})
        self.assertEqual(instance._plugins, {})

    def test_get_setting(self):
        instance = ConfigData()
        result = instance.get_setting(None)
        self.assertEqual(result, None)

    def test_get_settings(self):
        instance = ConfigData()
        result = instance.get_settings()
        self.assertEqual(result, [])

    def test_update_setting(self):
        instance = ConfigData()
        instance.update_setting(None)
        self.assertEqual(instance._global_settings, {})
        self.assertEqual(instance._plugins, {})

if __name__ == '__main__':
    unittest.main()