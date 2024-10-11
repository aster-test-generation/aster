import unittest
from httpie.plugins.manager import PluginManager


class TestPluginManager(unittest.TestCase):
    def test_register(self):
        manager = PluginManager()
        plugin = object()
        manager.register(plugin)
        self.assertEqual(manager, [plugin])

    def test_unregister(self):
        manager = PluginManager()
        plugin = object()
        manager.register(plugin)
        manager.unregister(plugin)
        self.assertEqual(manager, [])

    def test_filter(self):
        manager = PluginManager()
        plugin1 = object()
        plugin2 = object()
        manager.register(plugin1, plugin2)
        filtered_plugins = manager.filter()
        self.assertEqual(filtered_plugins, [plugin1, plugin2])

    def test_load_installed_plugins(self):
        manager = PluginManager()
        manager.load_installed_plugins()
        self.assertTrue(len(manager) > 0)

    def test_get_auth_plugins(self):
        manager = PluginManager()
        plugin1 = object()
        plugin2 = object()
        manager.register(plugin1, plugin2)
        auth_plugins = manager.get_auth_plugins()
        self.assertEqual(auth_plugins, [])

    def test_get_auth_plugin_mapping(self):
        manager = PluginManager()
        plugin1 = object()
        plugin2 = object()
        manager.register(plugin1, plugin2)
        auth_plugin_mapping = mapping.get_auth_plugin_mapping()
        self.assertEqual(auth_plugin_mapping, {})

    def test_get_auth_plugin(self):
        manager = PluginManager()
        plugin1 = object()
        plugin2 = object()
        manager.register(plugin1, plugin2)
        auth_plugin = manager.get_auth_plugin('password')
        self.assertEqual(auth_plugin, None)

    def test_get_formatters(self):
        manager = PluginManager()
        plugin1 = object()
        plugin2 = object()
        manager.register(plugin1, plugin2)
        formatters = manager.get_formatters()
        self.assertEqual(formatters, [])

    def test_get_formatters_grouped(self):
        manager = PluginManager()
        plugin1 = object()
        plugin2 = object()
        manager.register(plugin1, plugin2)
        formatters_grouped = manager.get_formatters_grouped()
        self.assertEqual(formatters_grouped, {})

    def test_get_converters(self):
        manager = PluginManager()
        plugin1 = object()
        plugin2 = object()
        manager.register(plugin1, plugin2)
        converters = manager.get_converters()
        self.assertEqual(converters, [])

    def test_get_transport_plugins(self):
        manager = PluginManager()
        plugin1 = object()
        plugin2 = object()
        manager.register(plugin1, plugin2)
        transport_plugins = manager.get_transport_plugins()
        self.assertEqual(transport_plugins, [])

    def test_repr(self):
        manager = PluginManager()
        plugin1 = object()
        plugin2 = object()
        manager.register(plugin1, plugin2)
        repr_string = repr(manager)
        self.assertEqual(repr_string, f"<PluginManager: {list(manager)}>")

if __name__ == '__main__':
    unittest.main()