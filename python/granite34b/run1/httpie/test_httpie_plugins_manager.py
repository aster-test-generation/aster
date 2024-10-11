from unittest import TestCase
from httpie.plugins.manager import PluginManager, ENTRY_POINT_NAMES
from httpie.plugins import AuthPlugin, ConverterPlugin, FormatterPlugin
from httpie.plugins.base import BasePlugin, TransportPlugin


class TestPluginManager(TestCase):
    def test_register(self):
        manager = PluginManager()
        plugin = BasePlugin
        manager.register(plugin)
        self.assertIn(plugin, manager)

    def test_unregister(self):
        manager = PluginManager()
        plugin = BasePlugin
        manager.register(plugin)
        manager.unregister(plugin)
        self.assertNotIn(plugin, manager)

    def test_filter(self):
        manager = PluginManager()
        plugin = BasePlugin
        manager.register(plugin)
        filtered_plugins = manager.filter(by_type=BasePlugin)
        self.assertIn(plugin, filtered_plugins)

    def test_load_installed_plugins(self):
        manager = PluginManager()
        manager.load_installed_plugins()
        for entry_point_name in ENTRY_POINT_NAMES:
            for entry_point in iter_entry_points(entry_point_name):
                plugin = entry_point.load()
                plugin.package_name = entry_point.dist.key
                manager.register(entry_point.load())

    def test_get_auth_plugins(self):
        manager = PluginManager()
        auth_plugins = manager.get_auth_plugins()
        self.assertListEqual(auth_plugins, [])

    def test_get_auth_plugin_mapping(self):
        manager = PluginManager()
        auth_plugin_mapping = manager.get_auth_plugin_mapping()
        self.assertDictEqual(auth_plugin_mapping, {})

    def test_get_auth_plugin(self):
        manager = PluginManager()
        auth_type = "example"
        auth_plugin = manager.get_auth_plugin(auth_type)
        self.assertIsNone(auth_plugin)

    def test_get_formatters(self):
        manager = PluginManager()
        formatters = manager.get_formatters()
        self.assertListEqual(formatters, [])

    def test_get_formatters_grouped(self):
        manager = PluginManager()
        formatters_grouped = manager.get_formatters_grouped()
        self.assertDictEqual(formatters_grouped, {})

    def test_get_converters(self):
        manager = PluginManager()
        converters = manager.get_converters()
        self.assertListEqual(converters, [])

    def test_get_transport_plugins(self):
        manager = PluginManager()
        transport_plugins = manager.get_transport_plugins()
        self.assertListEqual(transport_plugins, [])

if __name__ == '__main__':
    unittest.main()