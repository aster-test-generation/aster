import unittest
from httpie.plugins.manager import PluginManager, ENTRY_POINT_NAMES


class TestPluginManager(unittest.TestCase):
    def test_init(self):
        pm = PluginManager()
        self.assertIsInstance(pm, list)

    def test_register(self):
        pm = PluginManager()
        class MockPlugin(BasePlugin):
            pass
        pm.register(MockPlugin)
        self.assertIn(MockPlugin, pm)

    def test_unregister(self):
        pm = PluginManager()
        class MockPlugin(BasePlugin):
            pass
        pm.register(MockPlugin)
        pm.unregister(MockPlugin)
        self.assertNotIn(MockPlugin, pm)

    def test_filter(self):
        pm = PluginManager()
        class MockPlugin(BasePlugin):
            pass
        class MockAuthPlugin(AuthPlugin):
            pass
        pm.register(MockPlugin)
        pm.register(MockAuthPlugin)
        self.assertEqual(pm.filter(AuthPlugin), [MockAuthPlugin])

    def test_load_installed_plugins(self):
        pm = PluginManager()
        pm.load_installed_plugins()
        self.assertGreater(len(pm), 0)

    def test_get_auth_plugins(self):
        pm = PluginManager()
        class MockAuthPlugin(AuthPlugin):
            pass
        pm.register(MockAuthPlugin)
        self.assertEqual(pm.get_auth_plugins(), [MockAuthPlugin])

    def test_get_auth_plugin_mapping(self):
        pm = PluginManager()
        class MockAuthPlugin(AuthPlugin):
            auth_type = 'mock'
        pm.register(MockAuthPlugin)
        self.assertEqual(pm.get_auth_plugin_mapping(), {'mock': MockAuthPlugin})

    def test_get_auth_plugin(self):
        pm = PluginManager()
        class MockAuthPlugin(AuthPlugin):
            auth_type = 'mock'
        pm.register(MockAuthPlugin)
        self.assertEqual(pm.get_auth_plugin('mock'), MockAuthPlugin)

    def test_get_formatters(self):
        pm = PluginManager()
        class MockFormatterPlugin(FormatterPlugin):
            pass
        pm.register(MockFormatterPlugin)
        self.assertEqual(pm.get_formatters(), [MockFormatterPlugin])

    def test_get_formatters_grouped(self):
        pm = PluginManager()
        class MockFormatterPlugin1(FormatterPlugin):
            group_name = 'group1'
        class MockFormatterPlugin2(FormatterPlugin):
            group_name = 'group2'
        pm.register(MockFormatterPlugin1)
        pm.register(MockFormatterPlugin2)
        self.assertEqual(pm.get_formatters_grouped(), {'group1': [MockFormatterPlugin1], 'group2': [MockFormatterPlugin2]})

    def test_get_converters(self):
        pm = PluginManager()
        class MockConverterPlugin(ConverterPlugin):
            pass
        pm.register(MockConverterPlugin)
        self.assertEqual(pm.get_converters(), [MockConverterPlugin])

    def test_get_transport_plugins(self):
        pm = PluginManager()
        class MockTransportPlugin(TransportPlugin):
            pass
        pm.register(MockTransportPlugin)
        self.assertEqual(pm.get_transport_plugins(), [MockTransportPlugin])

    def test_repr(self):
        pm = PluginManager()
        self.assertEqual(pm.__repr__(), '<PluginManager: []>')

    def test_eq(self):
        pm1 = PluginManager()
        pm2 = PluginManager()
        self.assertEqual(pm1, pm2)

if __name__ == '__main__':
    unittest.main()