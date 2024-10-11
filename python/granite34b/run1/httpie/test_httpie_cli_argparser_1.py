import unittest
from httpie.cli.argparser import (
    HTTPieHelpFormatter,
    AuthCredentials,
    KeyValueArgType,
    PARSED_DEFAULT_FORMAT_OPTIONS,
    parse_auth,
    parse_format_options,
    RequestItems,
    RequestType,
    URL_SCHEME_RE,
)
from httpie.cli.constants import (
    HTTP_GET,
    HTTP_POST,
    OUTPUT_OPTIONS,
    OUTPUT_OPTIONS_DEFAULT,
    OUTPUT_OPTIONS_DEFAULT_OFFLINE,
    OUTPUT_OPTIONS_DEFAULT_STDOUT_REDIRECTED,
    OUT_RESP_BODY,
    PRETTY_MAP,
    PRETTY_STDOUT_TTY_ONLY,
    SEPARATOR_CREDENTIALS,
    SEPARATOR_GROUP_ALL_ITEMS,
    SEPARATOR_GROUP_DATA_ITEMS,
)
from httpie.cli.exceptions import ParseError
from httpie.context import Environment
from httpie.plugins.registry import plugin_manager
from httpie.utils import ExplicitNullAuth, get_content_type


class TestHTTPieHelpFormatter(unittest.TestCase):
    def test_init(self):
        formatter = HTTPieHelpFormatter()
        self.assertEqual(formatter.max_help_position, 6)

    def test_split_lines(self):
        text = "This is a test"
        width = 10
        formatter = HTTPieHelpFormatter()
        lines = formatter._split_lines(text, width)
        self.assertEqual(lines, ["This is a", "test"])

class TestAuthCredentials(unittest.TestCase):
    def test_init(self):
        credentials = AuthCredentials("username", "password")
        self.assertEqual(credentials.username, "username")
        self.assertEqual(credentials.password, "password")

class TestKeyValueArgType(unittest.TestCase):
    def test_convert(self):
        arg_type = KeyValueArgType()
        value = "key=value"
        result = arg_type.convert(value)
        self.assertEqual(result, {"key": "value"})

class TestParsedDefaultFormatOptions(unittest.TestCase):
    def test_init(self):
        options = PARSED_DEFAULT_FORMAT_OPTIONS
        self.assertEqual(options.output_options, OUTPUT_OPTIONS_DEFAULT)

class TestParseAuth(unittest.TestCase):
    def test_parse_auth(self):
        auth = "username:password"
        result = parse_auth(auth)
        self.assertEqual(result, AuthCredentials("username", "password"))

class TestParseFormatOptions(unittest.TestCase):
    def test_parse_format_options(self):
        options = parse_format_options(["--output", "json"])
        self.assertEqual(options.output_options, {"json"})

class TestRequestItems(unittest.TestCase):
    def test_init(self):
        items = RequestItems()
        self.assertEqual(items.request_type, RequestType.HTTP)

class TestRequestType(unittest.TestCase):
    def test_init(self):
        request_type = RequestType(HTTP_GET)
        self.assertEqual(request_type.method, HTTP_GET)

class TestURLSchemeRE(unittest.TestCase):
    def test_match(self):
        url = "https://example.com"
        result = URL_SCHEME_RE.match(url)
        self.assertEqual(result.group(), "https")

class TestEnvironment(unittest.TestCase):
    def test_init(self):
        environment = Environment()
        self.assertEqual(environment.stdout, sys.stdout)

class TestPluginManager(unittest.TestCase):
    def test_init(self):
        plugin_manager = PluginManager()
        self.assertEqual(plugin_manager.plugins, [])

class TestExplicitNullAuth(unittest.TestCase):
    def test_init(self):
        auth = ExplicitNullAuth()
        self.assertEqual(auth.username, None)
        self.assertEqual(auth.password, None)


if __name__ == '__main__':
    unittest.main()