import unittest
from unittest.mock import MagicMock, patch
from httpie.plugins.manager import PluginManager, ENTRY_POINT_NAMES
from httpie.plugins import AuthPlugin, ConverterPlugin, FormatterPlugin
from httpie.plugins.base import BasePlugin, TransportPlugin


class TestPluginManager(unittest.TestCase):
    def setUp(self):
        self.manager = PluginManager()

    def test_register(self):
        class TestPlugin(BasePlugin):
            pass
        self.manager.register(TestPlugin)
        self.assertIn(TestPlugin, self.manager)

    def test_unregister(self):
        class TestPlugin(BasePlugin):
            pass
        self.manager.register(TestPlugin)
        self.manager.unregister(TestPlugin)
        self.assertNotIn(TestPlugin, self.manager)

    def test_filter(self):
        class TestAuthPlugin(AuthPlugin):
            pass
        class TestFormatterPlugin(FormatterPlugin):
            pass
        self.manager.register(TestAuthPlugin, TestFormatterPlugin)
        result = self.manager.filter(AuthPlugin)
        self.assertEqual(result, [TestAuthPlugin])

    @patch('httpie.plugins.manager.iter_entry_points')
    def test_load_installed_plugins(self, mock_iter_entry_points):
        mock_entry_point = MagicMock()
        mock_entry_point.load.return_value = BasePlugin
        mock_entry_point.dist.key = 'test_package'
        mock_iter_entry_points.return_value = [mock_entry_point]
        self.manager.load_installed_plugins()
        self.assertIn(BasePlugin, self.manager)
        self.assertEqual(BasePlugin.package_name, 'test_package')

    def test_get_auth_plugins(self):
        class TestAuthPlugin(AuthPlugin):
            pass
        self.manager.register(TestAuthPlugin)
        result = self.manager.get_auth_plugins()
        self.assertEqual(result, [TestAuthPlugin])

    def test_get_auth_plugin_mapping(self):
        class TestAuthPlugin(AuthPlugin):
            auth_type = 'test'
        self.manager.register(TestAuthPlugin)
        result = self.manager.get_auth_plugin_mapping()
        self.assertEqual(result, {'test': TestAuthPlugin})

    def test_get_auth_plugin(self):
        class TestAuthPlugin(AuthPlugin):
            auth_type = 'test'
        self.manager.register(TestAuthPlugin)
        result = self.manager.get_auth_plugin('test')
        self.assertEqual(result, TestAuthPlugin)

    def test_get_formatters(self):
        class TestFormatterPlugin(FormatterPlugin):
            pass
        self.manager.register(TestFormatterPlugin)
        result = self.manager.get_formatters()
        self.assertEqual(result, [TestFormatterPlugin])

    def test_get_formatters_grouped(self):
        class TestFormatterPlugin(FormatterPlugin):
            group_name = 'test_group'
        self.manager.register(TestFormatterPlugin)
        result = self.manager.get_formatters_grouped()
        self.assertEqual(result, {'test_group': [TestFormatterPlugin]})

    def test_get_converters(self):
        class TestConverterPlugin(ConverterPlugin):
            pass
        self.manager.register(TestConverterPlugin)
        result = self.manager.get_converters()
        self.assertEqual(result, [TestConverterPlugin])

    def test_get_transport_plugins(self):
        class TestTransportPlugin(TransportPlugin):
            pass
        self.manager.register(TestTransportPlugin)
        result = self.manager.get_transport_plugins()
        self.assertEqual(result, [TestTransportPlugin])

    def test_repr(self):
        result = repr(self.manager)
        self.assertEqual(result, '<PluginManager: []>')

if __name__ == '__main__':
    unittest.main()