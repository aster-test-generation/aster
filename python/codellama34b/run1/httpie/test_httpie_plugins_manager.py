import unittest
from httpie.plugins.manager import *


class TestPluginManager(unittest.TestCase):
    def test_register(self):
        plugin_manager = PluginManager()
        plugin_manager.register()
        self.assertEqual(plugin_manager, [])

    def test_unregister(self):
        plugin_manager = PluginManager()
        plugin_manager.unregister(plugin)
        self.assertEqual(plugin_manager, [])

    def test_filter(self):
        plugin_manager = PluginManager()
        plugin_manager.filter()
        self.assertEqual(plugin_manager, [])

    def test_load_installed_plugins(self):
        plugin_manager = PluginManager()
        plugin_manager.load_installed_plugins()
        self.assertEqual(plugin_manager, [])

    def test_get_auth_plugins(self):
        plugin_manager = PluginManager()
        plugin_manager.get_auth_plugins()
        self.assertEqual(plugin_manager, [])

    def test_get_auth_plugin_mapping(self):
        plugin_manager = PluginManager()
        plugin_manager.get_auth_plugin_mapping()
        self.assertEqual(plugin_manager, [])

    def test_get_auth_plugin(self):
        plugin_manager = PluginManager()
        plugin_manager.get_auth_plugin('test')
        self.assertEqual(plugin_manager, [])

    def test_get_formatters(self):
        plugin_manager = PluginManager()
        plugin_manager.get_formatters()
        self.assertEqual(plugin_manager, [])

    def test_get_formatters_grouped(self):
        plugin_manager = PluginManager()
        plugin_manager.get_formatters_grouped()
        self.assertEqual(plugin_manager, [])

    def test_get_converters(self):
        plugin_manager = PluginManager()
        plugin_manager.get_converters()
        self.assertEqual(plugin_manager, [])

    def test_get_transport_plugins(self):
        plugin_manager = PluginManager()
        plugin_manager.get_transport_plugins()
        self.assertEqual(plugin_manager, [])

    def test_repr(self):
        plugin_manager = PluginManager()
        plugin_manager.__repr__()
        self.assertEqual(plugin_manager, [])

if __name__ == '__main__':
    unittest.main()