import unittest
from httpie.plugins.manager import PluginManager, ENTRY_POINT_NAMES
from httpie.plugins import AuthPlugin, ConverterPlugin, FormatterPlugin
from httpie.plugins.base import BasePlugin, TransportPlugin


class TestPluginManager(unittest.TestCase):
    def test_init(self):
        pm = PluginManager()
        self.assertIsInstance(pm, list)

    def test_register(self):
        pm = PluginManager()
        pm.register(AuthPlugin)
        self.assertIn(AuthPlugin, pm)

    def test_unregister(self):
        pm = PluginManager()
        pm.register(AuthPlugin)
        pm.unregister(AuthPlugin)
        self.assertNotIn(AuthPlugin, pm)

    def test_filter(self):
        pm = PluginManager()
        pm.register(AuthPlugin)
        pm.register(ConverterPlugin)
        self.assertEqual(pm.filter(AuthPlugin), [AuthPlugin])

    def test_load_installed_plugins(self):
        pm = PluginManager()
        pm.load_installed_plugins()
        self.assertGreater(len(pm), 0)

    def test_get_auth_plugins(self):
        pm = PluginManager()
        pm.register(AuthPlugin)
        self.assertEqual(pm.get_auth_plugins(), [AuthPlugin])

    def test_get_auth_plugin_mapping(self):
        pm = PluginManager()
        pm.register(AuthPlugin)
        self.assertIsInstance(pm.get_auth_plugin_mapping(), dict)

    def test_get_auth_plugin(self):
        pm = PluginManager()
        pm.register(AuthPlugin)
        self.assertEqual(pm.get_auth_plugin('auth_type'), AuthPlugin)

    def test_get_formatters(self):
        pm = PluginManager()
        pm.register(FormatterPlugin)
        self.assertEqual(pm.get_formatters(), [FormatterPlugin])

    def test_get_formatters_grouped(self):
        pm = PluginManager()
        pm.register(FormatterPlugin)
        self.assertIsInstance(pm.get_formatters_grouped(), dict)

    def test_get_converters(self):
        pm = PluginManager()
        pm.register(ConverterPlugin)
        self.assertEqual(pm.get_converters(), [ConverterPlugin])

    def test_get_transport_plugins(self):
        pm = PluginManager()
        pm.register(TransportPlugin)
        self.assertEqual(pm.get_transport_plugins(), [TransportPlugin])

    def test_repr(self):
        pm = PluginManager()
        self.assertEqual(pm.__repr__(), '<PluginManager: []>')

    def test_eq(self):
        pm1 = PluginManager()
        pm2 = PluginManager()
        self.assertEqual(pm1, pm2)

if __name__ == '__main__':
    unittest.main()