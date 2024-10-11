import unittest
from httpie.plugins.manager import PluginManager


class TestPluginManager(unittest.TestCase):
    def test_register(self):
        manager = PluginManager()
        plugin = object()
        manager.register(plugin)
        self.assertEqual(manager, [plugin])

    def test_unregister(self):
        manager = PluginManager([object()])
        plugin = manager[0]
        manager.unregister(plugin)
        self.assertEqual(manager, [])

    def test_filter(self):
        manager = PluginManager([object(), object(), object()])
        self.assertEqual(len(manager.filter()), 2)

    def test_load_installed_plugins(self):
        manager = PluginManager()
        self.assertEqual(len(manager), 0)
        manager.load_installed_plugins()
        self.assertGreater(len(manager.get_all_items()), 0)

    def test_get_auth_plugins(self):
        manager = PluginManager()
        self.assertEqual(len(manager.get_auth_plugins()), 0)

    def test_get_auth_plugin_mapping(self):
        manager = PluginManager()
        self.assertEqual(len(manager.get_auth_plugin_mapping()), 0)

    def test_get_auth_plugin(self):
        manager = PluginManager()
        with self.assertRaises(KeyError):
            manager.get_auth_plugin('foo')

    def test_get_formatters(self):
        manager = PluginManager()
        self.assertEqual(len(manager.get_formatters()), 0)

    def test_get_formatters_grouped(self):
        manager = PluginManager()
        self.assertEqual(manager.get_formatters_grouped(), {})

    def test_get_converters(self):
        manager = PluginManager()
        self.assertEqual(len(manager.get_converters()), 0)

    def test_get_transport_plugins(self):
        manager = PluginManager()
        self.assertEqual(len(manager.get_transport_plugins()), 0)

    def test_repr(self):
        manager = PluginManager()
        self.assertEqual(repr(manager), "<PluginManager: []>")

if __name__ == '__main__':
    unittest.main()