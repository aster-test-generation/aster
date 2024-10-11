import unittest
from httpie.plugins.base import BasePlugin, AuthPlugin, TransportPlugin, ConverterPlugin, FormatterPlugin

class TestBasePlugin(unittest.TestCase):
    def test_base_plugin(self):
        plugin = BasePlugin()
        self.assertIsNone(plugin.name)
        self.assertIsNone(plugin.description)
        self.assertIsNone(plugin.package_name)

class TestAuthPlugin(unittest.TestCase):
    def test_auth_plugin(self):
        plugin = AuthPlugin()
        self.assertIsNone(plugin.auth_type)
        self.assertTrue(plugin.auth_require)
        self.assertTrue(plugin.auth_parse)
        self.assertFalse(plugin.netrc_parse)
        self.assertTrue(plugin.prompt_password)
        self.assertIsNone(plugin.raw_auth)
        with self.assertRaises(NotImplementedError):
            plugin.get_auth()

class TestTransportPlugin(unittest.TestCase):
    def test_transport_plugin(self):
        plugin = TransportPlugin()
        self.assertIsNone(plugin.prefix)
        with self.assertRaises(NotImplementedError):
            plugin.get_adapter()

class TestConverterPlugin(unittest.TestCase):
    def test_converter_plugin(self):
        plugin = ConverterPlugin('text/plain')
        self.assertEqual(plugin.mime, 'text/plain')
        with self.assertRaises(NotImplementedError):
            plugin.convert(b'content')
        with self.assertRaises(NotImplementedError):
            ConverterPlugin.supports('text/plain')

class TestFormatterPlugin(unittest.TestCase):
    def test_formatter_plugin(self):
        plugin = FormatterPlugin(format_options={})
        self.assertTrue(plugin.enabled)
        self.assertEqual(plugin.kwargs, {'format_options': {}})
        self.assertEqual(plugin.format_options, {})
        self.assertEqual(plugin.format_headers('headers'), 'headers')
        self.assertEqual(plugin.format_body('content', 'text/plain'), 'content')

if __name__ == '__main__':
    unittest.main()