import unittest
from httpie.plugins.manager import PluginManager, BasePlugin, AuthPlugin, ConverterPlugin, FormatterPlugin, TransportPlugin


class TestPluginManager(unittest.TestCase):
    def test_register(self):
        manager = PluginManager()
        plugin1 = type('Plugin1', (BasePlugin,), {})
        plugin2 = type('Plugin2', (BasePlugin,), {})
        manager.register(plugin1, plugin2)
        self.assertEqual(len(manager), 2)
        self.assertIn(plugin1, manager)
        self.assertIn(plugin2, manager)

    def test_unregister(self):
        manager = PluginManager()
        plugin1 = type('Plugin1', (BasePlugin,), {})
        plugin2 = type('Plugin2', (BasePlugin,), {})
        manager.register(plugin1, plugin2)
        manager.unregister(plugin1)
        self.assertEqual(len(manager), 1)
        self.assertNotIn(plugin1, manager)
        self.assertIn(plugin2, manager)

    def test_filter(self):
        manager = PluginManager()
        plugin1 = type('Plugin1', (BasePlugin,), {})
        plugin2 = type('Plugin2', (AuthPlugin,), {})
        plugin3 = type('Plugin3', (FormatterPlugin,), {})
        manager.register(plugin1, plugin2, plugin3)
        auth_plugins = manager.filter(AuthPlugin)
        formatter_plugins = manager.filter(FormatterPlugin)
        self.assertEqual(len(auth_plugins), 1)
        self.assertEqual(len(formatter_plugins), 1)
        self.assertIn(plugin2, auth_plugins)
        self.assertIn(plugin3, formatter_plugins)

    def test_load_installed_plugins(self):
        manager = PluginManager()
        manager.load_installed_plugins()
        self.assertGreater(len(manager), 0)

    def test_get_auth_plugins(self):
        manager = PluginManager()
        manager.load_installed_plugins()
        auth_plugins = manager.get_auth_plugins()
        self.assertGreater(len(auth_plugins), 0)

    def test_get_auth_plugin_mapping(self):
        manager = PluginManager()
        manager.load_installed_plugins()
        auth_plugin_mapping = manager.get_auth_plugin_mapping()
        self.assertGreater(len(auth_plugin_mapping), 0)

    def test_get_auth_plugin(self):
        manager = PluginManager()
        manager.load_installed_plugins()
        auth_plugin = manager.get_auth_plugin('some_auth_type')
        self.assertIsInstance(auth_plugin, AuthPlugin)

    def test_get_formatters(self):
        manager = PluginManager()
        manager.load_installed_plugins()
        formatters = manager.get_formatters()
        self.assertGreater(len(formatters), 0)

    def test_get_formatters_grouped(self):
        manager = PluginManager()
        manager.load_installed_plugins()
        formatters_grouped = manager.get_formatters_grouped()
        self.assertGreater(len(formatters_grouped), 0)

    def test_get_converters(self):
        manager = PluginManager()
        manager.load_installed_plugins()
        converters = manager.get_converters()
        self.assertGreater(len(converters), 0)

    def test_get_transport_plugins(self):
        manager = PluginManager()
        manager.load_installed_plugins()
        transport_plugins = manager.get_transport_plugins()
        self.assertGreater(len(transport_plugins), 0)

    def test_repr(self):
        manager = PluginManager()
        manager.load_installed_plugins()
        repr_manager = repr(manager)
        self.assertIn('<PluginManager:', repr_manager)

if __name__ == '__main__':
    unittest.main()