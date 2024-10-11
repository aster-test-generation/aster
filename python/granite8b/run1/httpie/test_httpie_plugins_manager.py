import unittest
from httpie.plugins.manager import PluginManager


class TestPluginManager(unittest.TestCase):
    def test_register(self):
        manager = PluginManager()
        self.assertEqual(len(manager), 0)
        manager.register(AuthPlugin, ConverterPlugin)
        self.assertEqual(len(manager), 2)

    def test_unregister(self):
        manager = PluginManager()
        manager.register(AuthPlugin, ConverterPlugin)
        self.assertEqual(len(manager), 2)
        manager.unregister(AuthPlugin)
        self.assertEqual(len(manager), 1)

    def test_filter(self):
        manager = PluginManager()
        manager.register(AuthPlugin, ConverterPlugin)
        self.assertEqual(len(manager.filter(AuthPlugin)), 1)
        self.assertEqual(len(manager.filter(ConverterPlugin)), 1)

    def test_load_installed_plugins(self):
        manager = PluginManager()
        self.assertEqual(len(manager), 0)
        manager.load_installed_plugins()
        self.assertGreater(len(manager.get_all_items()), 0)

    def test_get_auth_plugins(self):
        manager = PluginManager()
        manager.register('AuthPlugin')
        self.assertEqual(len(manager.get_auth_plugins()), 1)

    def test_get_auth_plugin_mapping(self):
        manager = PluginManager()
        manager.register(auth_plugin)
        self.assertEqual(len(manager.get_auth_plugin_mapping()), 1)

    def test_get_auth_plugin(self):
        manager = PluginManager()
        manager.register('AuthPlugin')
        self.assertEqual(manager.get_auth_plugin('test'), AuthPlugin)

    def test_get_formatters(self):
        manager = PluginManager()
        manager.register(FormatterPlugin())
        self.assertEqual(len(manager.get_formatters()), 1)

    def test_get_formatters_grouped(self):
        manager = PluginManager()
        manager.register(FormatterPlugin)
        self.assertEqual(len(manager.get_formatters_grouped()), 1)

    def test_get_converters(self):
        manager = PluginManager()
        manager.register(ConverterPlugin)
        self.assertEqual(len(manager.get_converters()), 1)

    def test_get_transport_plugins(self):
        manager = PluginManager()
        manager.register(plugins.TransportPlugin)
        self.assertEqual(len(manager.get_transport_plugins()), 1)

    def test_repr(self):
        manager = PluginManager()
        manager.register(auth_plugin)
        self.assertEqual(repr(manager), "<PluginManager: [<class 'httpie.plugins.base.AuthPlugin'>]>")

if __name__ == '__main__':
    unittest.main()