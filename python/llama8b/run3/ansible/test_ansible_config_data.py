import unittest
from ansible.config.data import ConfigData


class TestConfigData(unittest.TestCase):
    def test_init(self):
        instance = ConfigData()
        self.assertIsInstance(instance, ConfigData)
        self.assertEqual(instance._global_settings, {})
        self.assertEqual(instance._plugins, {})

    def test_get_setting(self):
        instance = ConfigData()
        setting = instance.get_setting('test_setting')
        self.assertIsNone(setting)

    def test_get_setting_plugin(self):
        instance = ConfigData()
        plugin = object()
        setting = instance.get_setting('test_setting', plugin)
        self.assertIsNone(setting)

    def test_get_settings(self):
        instance = ConfigData()
        settings = instance.get_settings()
        self.assertEqual(settings, [])

    def test_get_settings_plugin(self):
        instance = ConfigData()
        plugin = object()
        settings = instance.get_settings(plugin)
        self.assertEqual(settings, [])

    def test_update_setting(self):
        instance = ConfigData()
        setting = object()
        instance.update_setting(setting)
        self.assertIn('test_setting', instance._global_settings)

    def test_update_setting_plugin(self):
        instance = ConfigData()
        setting = object()
        plugin = object()
        instance.update_setting(setting, plugin)
        self.assertIn('test_setting', instance._plugins[plugin.__class__.__name__][plugin.__name__])

    def test_str(self):
        instance = ConfigData()
        result = str(instance)
        self.assertEqual(result, 'ansible.config.data.ConfigData')

    def test_repr(self):
        instance = ConfigData()
        result = repr(instance)
        self.assertEqual(result, 'ansible.config.data.ConfigData()')

    def test_eq(self):
        instance1 = ConfigData()
        instance2 = ConfigData()
        self.assertEqual(instance1, instance2)

    def test_ne(self):
        instance1 = ConfigData()
        instance2 = object()
        self.assertNotEqual(instance1, instance2)

    def test_private_method(self):
        instance = ConfigData()
        with self.assertRaises(AttributeError):
            instance.__private_method()

if __name__ == '__main__':
    unittest.main()