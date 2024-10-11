import unittest
from unittest.mock import patch
from httpie.plugins.manager import PluginManager, ENTRY_POINT_NAMES
from httpie.plugins import AuthPlugin, ConverterPlugin, FormatterPlugin
from httpie.plugins.base import BasePlugin, TransportPlugin


class TestPluginManager(unittest.TestCase):
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
        self.assertEqual(filtered_plugins, [plugin])

    @patch('pkg_resources.iter_entry_points')
    def test_load_installed_plugins(self, mock_iter_entry_points):
        manager = PluginManager()
        mock_iter_entry_points.return_value = [
            MockEntryPoint('httpie.plugins.auth.v1', AuthPlugin),
            MockEntryPoint('httpie.plugins.formatter.v1', FormatterPlugin),
            MockEntryPoint('httpie.plugins.converter.v1', ConverterPlugin),
            MockEntryPoint('httpie.plugins.transport.v1', TransportPlugin),
        ]
        manager.load_installed_plugins()
        self.assertEqual(len(manager), 0)

    def test_get_auth_plugins(self):
        manager = PluginManager()
        manager.register(AuthPlugin)
        auth_plugins = manager.get_auth_plugins()
        self.assertEqual(auth_plugins, [AuthPlugin])

    def test_get_auth_plugin_mapping(self):
        manager = PluginManager()
        manager.register(AuthPlugin)
        auth_plugin_mapping = manager.get_auth_plugin_mapping()
        self.assertEqual(auth_plugin_mapping, {None: AuthPlugin})

    def test_get_auth_plugin(self):
        manager = PluginManager()
        manager.register(AuthPlugin)
        auth_plugin = manager.get_auth_plugin('password')
        self.assertEqual(auth_plugin, AuthPlugin)

    def test_get_formatters(self):
        manager = PluginManager()
        manager.register(FormatterPlugin)
        formatters = manager.get_formatters()
        self.assertEqual(formatters, [FormatterPlugin])

    def test_get_formatters_grouped(self):
        manager = PluginManager()
        manager.register(FormatterPlugin)
        formatters_grouped = manager.get_formatters_grouped()
        self.assertEqual(formatters_grouped, {'format': [FormatterPlugin]})

    def test_get_converters(self):
        manager = PluginManager()
        manager.register(ConverterPlugin)
        converters = manager.get_converters()
        self.assertEqual(converters, [ConverterPlugin])

    def test_get_transport_plugins(self):
        manager = PluginManager()
        manager.register(TransportPlugin)
        transport_plugins = manager.get_transport_plugins()
        self.assertEqual(transport_plugins, [TransportPlugin])

    def test_repr(self):
        manager = PluginManager()
        manager.register(BasePlugin)
        self.assertEqual(repr(manager), f'<PluginManager: {list(manager)}>')

class MockEntryPoint:
    def __init__(self, name, plugin):
        self.name = name
        self.plugin = plugin
    def load(self):
        return self.plugin

if __name__ == '__main__':
    unittest.main()