import unittest
from httpie.plugins.base import *


class TestBasePlugin(unittest.TestCase):
    def test_name(self):
        instance = BasePlugin()
        self.assertIsNone(instance.name)

    def test_description(self):
        instance = BasePlugin()
        self.assertIsNone(instance.description)

    def test_package_name(self):
        instance = BasePlugin()
        self.assertIsNone(instance.package_name)

class TestAuthPlugin(unittest.TestCase):
    def test_auth_type(self):
        instance = AuthPlugin()
        self.assertIsNone(instance.auth_type)

    def test_auth_require(self):
        instance = AuthPlugin()
        self.assertTrue(instance.auth_require)

    def test_auth_parse(self):
        instance = AuthPlugin()
        self.assertTrue(instance.auth_parse)

    def test_netrc_parse(self):
        instance = AuthPlugin()
        self.assertFalse(instance.netrc_parse)

    def test_prompt_password(self):
        instance = AuthPlugin()
        self.assertTrue(instance.prompt_password)

    def test_raw_auth(self):
        instance = AuthPlugin()
        self.assertIsNone(instance.raw_auth)

    def test_get_auth(self):
        instance = AuthPlugin()
        with self.assertRaises(NotImplementedError):
            instance.get_auth()

class TestTransportPlugin(unittest.TestCase):
    def test_prefix(self):
        instance = TransportPlugin()
        self.assertIsNone(instance.prefix)

    def test_get_adapter(self):
        instance = TransportPlugin()
        with self.assertRaises(NotImplementedError):
            instance.get_adapter()

class TestConverterPlugin(unittest.TestCase):
    def test_init(self):
        instance = ConverterPlugin('mime')
        self.assertEqual(instance.mime, 'mime')

    def test_convert(self):
        instance = ConverterPlugin('mime')
        with self.assertRaises(NotImplementedError):
            instance.convert(b'content')

    def test_supports(self):
        with self.assertRaises(NotImplementedError):
            ConverterPlugin.supports('mime')

class TestFormatterPlugin(unittest.TestCase):
    def test_init(self):
        instance = FormatterPlugin(format_options={})
        self.assertTrue(instance.enabled)
        self.assertEqual(instance.kwargs, {'format_options': {}})
        self.assertEqual(instance.format_options, {})

    def test_format_headers(self):
        instance = FormatterPlugin(format_options={})
        self.assertEqual(instance.format_headers('headers'), 'headers')

    def test_format_body(self):
        instance = FormatterPlugin(format_options={})
        self.assertEqual(instance.format_body('content', 'mime'), 'content')

if __name__ == '__main__':
    unittest.main()