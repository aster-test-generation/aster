import unittest
from httpie.plugins.manager import PluginManager, AuthPlugin, ConverterPlugin, FormatterPlugin, TransportPlugin


class TestPluginManager(unittest.TestCase):
    def test_register(self):
        manager = PluginManager()
        manager.register(AuthPlugin)
        self.assertEqual(len(manager), 1)
        self.assertEqual(manager[0], AuthPlugin)

    def test_unregister(self):
        manager = PluginManager()
        manager.register(AuthPlugin)
        manager.unregister(AuthPlugin)
        self.assertEqual(len(manager), 0)

    def test_filter(self):
        manager = PluginManager()
        manager.register(AuthPlugin, ConverterPlugin, FormatterPlugin, TransportPlugin)
        filtered = manager.filter(ConverterPlugin)
        self.assertEqual(len(filtered), 1)
        self.assertEqual(filtered[0], ConverterPlugin)

    def test_load_installed_plugins(self):
        manager = PluginManager()
        manager.load_installed_plugins()
        self.assertGreater(len(manager.employees), 0)

    def test_get_auth_plugins(self):
        manager = PluginManager()
        manager.register(AuthPlugin)
        auth_plugins = manager.get_auth_plugins()
        self.assertEqual(len(auth_plugins), 1)
        self.assertEqual(auth_plugins[0], AuthPlugin)

    def test_get_auth_plugin_mapping(self):
        manager = PluginManager()
        manager.register(AuthPlugin)
        mapping = manager.get_auth_plugin_mapping()
        self.assertEqual(len(mapping), 1)
        self.assertEqual(mapping['auth_type'], 'password')

    def test_get_auth_plugin(self):
        manager = PluginManager()
        manager.register(AuthPlugin)
        plugin = manager.get_auth_plugin('password')
        self.assertEqual(plugin, AuthPlugin)

    def test_get_formatters(self):
        manager = PluginManager()
        manager.register(FormatterPlugin)
        formatters = manager.get_formatters()
        self.assertEqual(len(formatters), 1)
        self.assertEqual(formatters[0], FormatterPlugin)

    def test_get_formatters_grouped(self):
        manager = PluginManager()
        manager.register(FormatterPlugin)
        grouped = manager.get_formatters_grouped()
        self.assertEqual(len(grouped), 1)
        self.assertEqual(grouped['group_name'], [GroupedFormatter])

    def test_get_converters(self):
        manager = PluginManager()
        manager.register(ConverterPlugin)
        converters = manager.get_converters()
        self.assertEqual(len(converters), 1)
        self.assertEqual(converters[0], ConverterPlugin)

    def test_get_transport_plugins(self):
        manager = PluginManager()
        manager.register(TransportPlugin)
        transport_plugins = manager.get_transport_plugins()
        self.assertEqual(len(transport_plugins), 1)
        self.assertEqual(transport_plugins[0], TransportPlugin)

    def test_repr(self):
        manager = PluginManager()
        manager.register(AuthPlugin)
        self.assertEqual(repr(manager), f'<PluginManager: {list(manager)}>')

if __name__ == '__main__':
    unittest.main()