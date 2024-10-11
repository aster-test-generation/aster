import argparse
import unittest
from httpie.cli.argparser import HTTPieHelpFormatter


class TestHTTPieHelpFormatter(unittest.TestCase):
    def test_init(self):
        formatter = argparse.HelpFormatter(prog='PROG')
        formatter = HTTPieHelpFormatter(max_help_position=10)
        self.assertEqual(formatter.max_help_position, 10)

class TestAuthCredentials(unittest.TestCase):
    def test_init(self):
        auth = AuthCredentials('user', 'pass')
        self.assertEqual(auth.username, 'user')
        self.assertEqual(auth.password, 'pass')

class TestKeyValueArgType(unittest.TestCase):
    def test_init(self):
        arg_type = KeyValueArgType()
        self.assertEqual(arg_type('key=value'), {'key': 'value'})

class TestParseAuth(unittest.TestCase):
    def test_init(self):
        auth = parse_auth('user:pass')
        self.assertEqual(auth.username, 'user')
        self.assertEqual(auth.password, 'pass')

class TestParseFormatOptions(unittest.TestCase):
    def test_init(self):
        options = parse_format_options(format='json')
        self.assertEqual(options, {'indent': 4, 'sort_keys': True})

class TestRequestItems(unittest.TestCase):
    def test_init(self):
        items = RequestItems(HTTP_GET, 'http://example.com')
        self.assertEqual(items.method, HTTP_GET)
        self.assertEqual(items.url, 'http://example.com')

class TestEnvironment(unittest.TestCase):
    def test_init(self):
        env = Environment()
        self.assertEqual(env.plugins, plugin_manager)

class TestHTTPieHelpFormatter(unittest.TestCase):
    def test_max_help_position(self):
        formatter = HTTPieHelpFormatter(max_help_position=10)
        self.assertEqual(formatter._max_help_position, 10)

    def test_split_lines(self):
        text = """
        This is a test.
        """
        width = 10
        expected = ["This is a", "test."]
        result = HTTPieHelpFormatter._split_lines(text, width)
        self.assertEqual(result, expected)

if __name__ == '__main__':
    unittest.main()