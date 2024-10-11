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
        plugin = object()
        setting = object()
        instance.update_setting(setting, plugin)
        self.assertIn('test_setting', instance._plugins[plugin.__class__.__name__][plugin.__name__])

    def test_str_method(self):
        instance = ConfigData()
        result = str(instance)
        self.assertEqual(result, 'ansible.config.data.ConfigData')

    def test_repr_method(self):
        instance = ConfigData()
        result = repr(instance)
        self.assertEqual(result, 'ansible.config.data.ConfigData()')

    def test_eq_method(self):
        instance1 = ConfigData()
        instance2 = ConfigData()
        self.assertEqual(instance1, instance2)

    def test_private_method(self):
        instance = ConfigData()
        result = instance._ConfigData__private_method()
        self.assertIsNone(result)

if __name__ == '__main__':
    unittest.main()