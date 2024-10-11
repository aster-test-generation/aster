import unittest
from httpie.plugins.base import (
    BasePlugin,
    AuthPlugin,
    TransportPlugin,
    ConverterPlugin,
    FormatterPlugin,
)

class TestBasePlugin(unittest.TestCase):
    def test_base_plugin(self):
        base_plugin = BasePlugin()
        self.assertIsNone(base_plugin.name)
        self.assertIsNone(base_plugin.description)
        self.assertIsNone(base_plugin.package_name)

class TestAuthPlugin(unittest.TestCase):
    def test_auth_plugin(self):
        auth_plugin = AuthPlugin()
        self.assertIsNone(auth_plugin.auth_type)
        self.assertTrue(auth_plugin.auth_require)
        self.assertTrue(auth_plugin.auth_parse)
        self.assertFalse(auth_plugin.netrc_parse)
        self.assertTrue(auth_plugin.prompt_password)
        self.assertIsNone(auth_plugin.raw_auth)

    def test_get_auth(self):
        auth_plugin = AuthPlugin()
        with self.assertRaises(NotImplementedError):
            auth_plugin.get_auth()

class TestTransportPlugin(unittest.TestCase):
    def test_transport_plugin(self):
        transport_plugin = TransportPlugin()
        self.assertIsNone(transport_plugin.prefix)

    def test_get_adapter(self):
        transport_plugin = TransportPlugin()
        with self.assertRaises(NotImplementedError):
            transport_plugin.get_adapter()

class TestConverterPlugin(unittest.TestCase):
    def test_converter_plugin(self):
        converter_plugin = ConverterPlugin('text/plain')
        self.assertEqual(converter_plugin.mime, 'text/plain')

    def test_convert(self):
        converter_plugin = ConverterPlugin('text/plain')
        with self.assertRaises(NotImplementedError):
            converter_plugin.convert(b'content')

    def test_supports(self):
        converter_plugin = ConverterPlugin('text/plain')
        with self.assertRaises(NotImplementedError):
            converter_plugin.supports('text/plain')

class TestFormatterPlugin(unittest.TestCase):
    def test_formatter_plugin(self):
        formatter_plugin = FormatterPlugin(format_options={})
        self.assertTrue(formatter_plugin.enabled)
        self.assertEqual(formatter_plugin.kwargs, {'format_options': {}})
        self.assertEqual(formatter_plugin.format_options, {})

    def test_format_headers(self):
        formatter_plugin = FormatterPlugin(format_options={})
        headers = 'Content-Type: application/json'
        formatted_headers = formatter_plugin.format_headers(headers)
        self.assertEqual(formatted_headers, headers)

    def test_format_body(self):
        formatter_plugin = FormatterPlugin(format_options={})
        content = 'content'
        mime = 'text/plain'
        formatted_body = formatter_plugin.format_body(content, mime)
        self.assertEqual(formatted_body, content)

if __name__ == '__main__':
    unittest.main()