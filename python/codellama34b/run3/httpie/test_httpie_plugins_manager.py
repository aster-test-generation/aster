import unittest
from httpie.plugins.manager import *


class TestPluginManager(unittest.TestCase):
    def test_register(self):
        plugin_manager = PluginManager()
        plugin_manager.register(BasePlugin)
        self.assertEqual(len(plugin_manager), 1)

    def test_unregister(self):
        plugin_manager = PluginManager()
        plugin_manager.register(BasePlugin)
        plugin_manager.unregister(BasePlugin)
        self.assertEqual(len(plugin_manager), 0)

    def test_filter(self):
        plugin_manager = PluginManager()
        plugin_manager.register(BasePlugin)
        result = plugin_manager.filter(BasePlugin)
        self.assertEqual(len(result), 1)

    def test_load_installed_plugins(self):
        plugin_manager = PluginManager()
        plugin_manager.load_installed_plugins()
        self.assertGreater(len(plugin_manager), 1)

    def test_get_auth_plugins(self):
        plugin_manager = PluginManager()
        plugin_manager.register(AuthPlugin)
        result = plugin_manager.get_auth_plugins()
        self.assertEqual(len(result), 1)

    def test_get_auth_plugin_mapping(self):
        plugin_manager = PluginManager()
        plugin_manager.register(AuthPlugin)
        result = plugin_manager.get_auth_plugin_mapping()
        self.assertEqual(len(result), 1)

    def test_get_auth_plugin(self):
        plugin_manager = PluginManager()
        plugin_manager.register(AuthPlugin)
        result = plugin_manager.get_auth_plugin('auth_type')
        self.assertEqual(result, AuthPlugin)

    def test_get_formatters(self):
        plugin_manager = PluginManager()
        plugin_manager.register(FormatterPlugin)
        result = plugin_manager.get_formatters()
        self.assertEqual(len(result), 1)

    def test_get_formatters_grouped(self):
        plugin_manager = PluginManager()
        plugin_manager.register(FormatterPlugin)
        result = plugin_manager.get_formatters_grouped()
        self.assertEqual(len(result), 1)

    def test_get_converters(self):
        plugin_manager = PluginManager()
        plugin_manager.register(ConverterPlugin)
        result = plugin_manager.get_converters()
        self.assertEqual(len(result), 1)

    def test_get_transport_plugins(self):
        plugin_manager = PluginManager()
        plugin_manager.register(TransportPlugin)
        result = plugin_manager.get_transport_plugins()
        self.assertEqual(len(result), 1)

    def test_repr(self):
        plugin_manager = PluginManager()
        plugin_manager.register(BasePlugin)
        result = plugin_manager.__repr__()
        self.assertEqual(result, '<PluginManager: [<class \'httpie.plugins.base.BasePlugin\'>]>')

if __name__ == '__main__':
    unittest.main()