import unittest
from httpie.plugins.manager import PluginManager


class TestPluginManager(unittest.TestCase):
    def test_register(self):
        instance = PluginManager()
        instance.register()
        self.assertEqual(instance, [])

    def test_unregister(self):
        instance = PluginManager()
        instance.unregister(plugin)
        self.assertEqual(instance, [])

    def test_filter(self):
        instance = PluginManager()
        result = instance.filter()
        self.assertEqual(result, [])

    def test_load_installed_plugins(self):
        instance = PluginManager()
        instance.load_installed_plugins()
        self.assertEqual(instance, [])

    def test_get_auth_plugins(self):
        instance = PluginManager()
        result = instance.get_auth_plugins()
        self.assertEqual(result, [])

    def test_get_auth_plugin_mapping(self):
        instance = PluginManager()
        result = instance.get_auth_plugin_mapping()
        self.assertEqual(result, {})

    def test_get_auth_plugin(self):
        instance = PluginManager()
        result = instance.get_auth_plugin('test')
        self.assertEqual(result, [])

    def test_get_formatters(self):
        instance = PluginManager()
        result = instance.get_formatters()
        self.assertEqual(result, [])

    def test_get_formatters_grouped(self):
        instance = PluginManager()
        result = instance.get_formatters_grouped()
        self.assertEqual(result, {})

    def test_get_converters(self):
        instance = PluginManager()
        result = instance.get_converters()
        self.assertEqual(result, [])

    def test_get_transport_plugins(self):
        instance = PluginManager()
        result = instance.get_transport_plugins()
        self.assertEqual(result, [])

    def test_repr(self):
        instance = PluginManager()
        result = instance.__repr__()
        self.assertEqual(result, '<PluginManager: []>')

if __name__ == '__main__':
    unittest.main()