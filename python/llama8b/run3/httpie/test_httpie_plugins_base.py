import unittest
from httpie.plugins.base_plugin import BasePlugin, AuthPlugin, TransportPlugin, ConverterPlugin, FormatterPlugi


class TestBasePlugin(unittest.TestCase):
    def test_init(self):
        plugin = BasePlugin()
        self.assertIsNone(plugin.name)
        self.assertIsNone(plugin.description)
        self.assertIsNone(plugin.package_name)

    def test_str_method(self):
        plugin = BasePlugin()
        result = str(plugin)
        self.assertEqual(result, "<BasePlugin>")

    def test_repr_method(self):
        plugin = BasePlugin()
        result = repr(plugin)
        self.assertEqual(result, "BasePlugin()")

class TestAuthPlugin(unittest.TestCase):
    def test_init(self):
        plugin = AuthPlugin()
        self.assertIsNone(plugin.auth_type)
        self.assertTrue(plugin.auth_require)
        self.assertTrue(plugin.auth_parse)
        self.assertFalse(plugin.netrc_parse)
        self.assertTrue(plugin.prompt_password)
        self.assertIsNone(plugin.raw_auth)

    def test_get_auth(self):
        plugin = AuthPlugin()
        with self.assertRaises(NotImplementedError):
            plugin.get_auth()

class TestTransportPlugin(unittest.TestCase):
    def test_init(self):
        plugin = TransportPlugin()
        self.assertIsNone(plugin.prefix)

    def test_get_adapter(self):
        plugin = TransportPlugin()
        with self.assertRaises(NotImplementedError):
            plugin.get_adapter()

class TestConverterPlugin(unittest.TestCase):
    def test_init(self):
        plugin = ConverterPlugin('mime')
        self.assertEqual(plugin.mime, 'mime')

    def test_convert(self):
        plugin = ConverterPlugin('mime')
        with self.assertRaises(NotImplementedError):
            plugin.convert(b'content')

    @classmethod
    def test_supports(cls):
        plugin = ConverterPlugin('mime')
        with self.assertRaises(NotImplementedError):
            ConverterPlugin.supports('mime')

class TestFormatterPlugin(unittest.TestCase):
    def test_init(self):
        plugin = FormatterPlugin(format_options={'format_options': 'value'})
        self.assertTrue(plugin.enabled)
        self.assertEqual(plugin.format_options, {'format_options': 'value'})

    def test_format_headers(self):
        plugin = FormatterPlugin()
        result = plugin.format_headers('headers')
        self.assertEqual(result, 'headers')

    def test_format_body(self):
        plugin = FormatterPlugin()
        result = plugin.format_body('content', 'mime')
        self.assertEqual(result, 'content')

if __name__ == '__main__':
    unittest.main()