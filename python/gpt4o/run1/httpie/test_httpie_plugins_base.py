import unittest
from httpie.plugins.base import BasePlugin, AuthPlugin, TransportPlugin, ConverterPlugin, FormatterPlugin


class TestBasePlugin(unittest.TestCase):
    def test_base_plugin_attributes(self):
        instance = BasePlugin()
        self.assertIsNone(instance.name)
        self.assertIsNone(instance.description)
        self.assertIsNone(instance.package_name)

class TestAuthPlugin(unittest.TestCase):
    def test_auth_plugin_attributes(self):
        instance = AuthPlugin()
        self.assertIsNone(instance.auth_type)
        self.assertTrue(instance.auth_require)
        self.assertTrue(instance.auth_parse)
        self.assertFalse(instance.netrc_parse)
        self.assertTrue(instance.prompt_password)
        self.assertIsNone(instance.raw_auth)

    def test_get_auth(self):
        instance = AuthPlugin()
        with self.assertRaises(NotImplementedError):
            instance.get_auth()

class TestTransportPlugin(unittest.TestCase):
    def test_transport_plugin_attributes(self):
        instance = TransportPlugin()
        self.assertIsNone(instance.prefix)

    def test_get_adapter(self):
        instance = TransportPlugin()
        with self.assertRaises(NotImplementedError):
            instance.get_adapter()

class TestConverterPlugin(unittest.TestCase):
    def test_converter_plugin_init(self):
        instance = ConverterPlugin(mime='application/json')
        self.assertEqual(instance.mime, 'application/json')

    def test_convert(self):
        instance = ConverterPlugin(mime='application/json')
        with self.assertRaises(NotImplementedError):
            instance.convert(b'content')

    def test_supports(self):
        with self.assertRaises(NotImplementedError):
            ConverterPlugin.supports('application/json')

class TestFormatterPlugin(unittest.TestCase):
    def test_formatter_plugin_init(self):
        instance = FormatterPlugin(format_options={'option1': 'value1'})
        self.assertTrue(instance.enabled)
        self.assertEqual(instance.kwargs, {'format_options': {'option1': 'value1'}})
        self.assertEqual(instance.format_options, {'option1': 'value1'})

    def test_format_headers(self):
        instance = FormatterPlugin(format_options={'option1': 'value1'})
        result = instance.format_headers('headers')
        self.assertEqual(result, 'headers')

    def test_format_body(self):
        instance = FormatterPlugin(format_options={'option1': 'value1'})
        result = instance.format_body('content', 'mime')
        self.assertEqual(result, 'content')

if __name__ == '__main__':
    unittest.main()