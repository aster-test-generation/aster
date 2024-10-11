import unittest
from ansible.config.data import ConfigData


class TestConfigData(unittest.TestCase):
    def test___init__(self):
        instance = ConfigData()
        self.assertIsInstance(instance, ConfigData)
        self.assertEqual(instance._global_settings, {})
        self.assertEqual(instance._plugins, {})

    def test_get_setting_global(self):
        instance = ConfigData()
        instance._global_settings['foo'] = 'bar'
        result = instance.get_setting('foo')
        self.assertEqual(result, 'bar')

    def test_get_setting_plugin(self):
        instance = ConfigData()
        plugin = MockPlugin('type', 'name')
        instance._plugins[plugin.type] = {plugin.name: {'foo': 'bar'}}
        result = instance.get_setting('foo', plugin)
        self.assertEqual(result, 'bar')

    def test_get_settings_global(self):
        instance = ConfigData()
        instance._global_settings['foo'] = 'bar'
        instance._global_settings['baz'] = 'qux'
        result = instance.get_settings()
        self.assertEqual(result, ['bar', 'qux'])

    def test_get_settings_plugin(self):
        instance = ConfigData()
        plugin = MockPlugin('type', 'name')
        instance._plugins[plugin.type] = {plugin.name: {'foo': 'bar', 'baz': 'qux'}}
        result = instance.get_settings(plugin)
        self.assertEqual(result, ['bar', 'qux'])

    def test_update_setting_global(self):
        instance = ConfigData()
        setting = MockSetting('foo', 'bar')
        instance.update_setting(setting)
        self.assertEqual(instance._global_settings, {'foo': setting})

    def test_update_setting_plugin(self):
        instance = ConfigData()
        plugin = MockPlugin('type', 'name')
        setting = MockSetting('foo', 'bar')
        instance.update_setting(setting, plugin)
        self.assertEqual(instance._plugins[plugin.type][plugin.name], {'foo': setting})

    def test___str__(self):
        instance = ConfigData()
        result = instance.__str__()
        self.assertEqual(result, "ConfigData")

    def test___repr__(self):
        instance = ConfigData()
        result = instance.__repr__()
        self.assertEqual(result, "ConfigData()")

    def test___eq__(self):
        instance1 = ConfigData()
        instance2 = ConfigData()
        self.assertEqual(instance1, instance2)

class MockPlugin:
    def __init__(self, type, name):
        self.type = type
        self.name = name

class MockSetting:
    def __init__(self, name, value):
        self.name = name
        self.value = value

if __name__ == '__main__':
    unittest.main()