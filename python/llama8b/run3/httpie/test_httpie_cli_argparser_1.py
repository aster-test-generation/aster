import unittest
from httpie.cli.argparser import HTTPieHelpFormatter, RequestItems, Environment, plugin_manager, ExplicitNullAuth
from httpie.cli.argtypes import AuthCredentials, KeyValueArgType
from httpie.cli.constants import HTTP_GET, HTTP_POST, OUTPUT_OPTIONS, OUTPUT_OPTIONS_DEFAULT, OUTPUT_OPTIONS_DEFAULT_OFFLINE, OUTPUT_OPTIONS_DEFAULT_STDOUT_REDIRECTED, OUT_RESP_BODY, PRETTY_MAP, PRETTY_STDOUT_TTY_ONLY, RequestType, SEPARATOR_CREDENTIALS, SEPARATOR_GROUP_ALL_ITEMS, SEPARATOR_GROUP_DATA_ITEMS, URL_SCHEME_RE
from httpie.cli.exceptions import ParseError
from httpie.utils import get_content_type


class TestHTTPieHelpFormatter(unittest.TestCase):
    def test_init(self):
        formatter = HTTPieHelpFormatter()
        self.assertEqual(formatter.max_help_position, 6)

    def test_split_lines(self):
        text = "This is a test text.\nThis is another line."
        result = HTTPieHelpFormatter()._split_lines(text, 10)
        self.assertEqual(len(result), 3)

class TestRequestItems(unittest.TestCase):
    def test_init(self):
        request_items = RequestItems()
        self.assertEqual(request_items.request_type, RequestType.ALL)

    def test_set_request_type(self):
        request_items = RequestItems()
        request_items.request_type = RequestType.GET
        self.assertEqual(request_items.request_type, RequestType.GET)

class TestEnvironment(unittest.TestCase):
    def test_init(self):
        environment = Environment()
        self.assertEqual(environment.request_type, RequestType.ALL)

    def test_set_request_type(self):
        environment = Environment()
        environment.request_type = RequestType.POST
        self.assertEqual(environment.request_type, RequestType.POST)

class TestPluginManager(unittest.TestCase):
    def test_init(self):
        plugin_manager = plugin_manager()
        self.assertEqual(plugin_manager.plugins, [])

class TestExplicitNullAuth(unittest.TestCase):
    def test_init(self):
        auth = ExplicitNullAuth()
        self.assertEqual(auth.username, None)
        self.assertEqual(auth.password, None)

class TestAuthCredentials(unittest.TestCase):
    def test_init(self):
        auth = AuthCredentials()
        self.assertEqual(auth.username, None)
        self.assertEqual(auth.password, None)

class TestKeyValueArgType(unittest.TestCase):
    def test_init(self):
        arg_type = KeyValueArgType()
        self.assertEqual(arg_type.key, None)
        self.assertEqual(arg_type.value, None)

class TestConstants(unittest.TestCase):
    def test_http_get(self):
        self.assertEqual(HTTP_GET, 'GET')

    def test_http_post(self):
        self.assertEqual(HTTP_POST, 'POST')

    def test_output_options(self):
        self.assertEqual(OUTPUT_OPTIONS, 'output_options')

    def test_output_options_default(self):
        self.assertEqual(OUTPUT_OPTIONS_DEFAULT, 'default')

    def test_output_options_default_offline(self):
        self.assertEqual(OUTPUT_OPTIONS_DEFAULT_OFFLINE, 'offline')

    def test_output_options_default_stdout_redirected(self):
        self.assertEqual(OUTPUT_OPTIONS_DEFAULT_STDOUT_REDIRECTED, 'stdout_redirected')

    def test_out_resp_body(self):
        self.assertEqual(OUT_RESP_BODY, 'out_resp_body')

    def test_pretty_map(self):
        self.assertEqual(PRETTY_MAP, 'pretty_map')

    def test_pretty_stdout_tty_only(self):
        self.assertEqual(PRETTY_STDOUT_TTY_ONLY, 'pretty_stdout_tty_only')

    def test_request_type(self):
        self.assertEqual(RequestType, 'request_type')

    def test_separator_credentials(self):
        self.assertEqual(SEPARATOR_CREDENTIALS, 'separator_credentials')

    def test_separator_group_all_items(self):
        self.assertEqual(SEPARATOR_GROUP_ALL_ITEMS, 'separator_group_all_items')

    def test_separator_group_data_items(self):
        self.assertEqual(SEPARATOR_GROUP_DATA_ITEMS, 'separator_group_data_items')

    def test_url_scheme_re(self):
        self.assertEqual(URL_SCHEME_RE, 'url_scheme_re')

class TestParseError(unittest.TestCase):
    def test_init(self):
        error = ParseError()
        self.assertEqual(error.message, '')

class TestGetContentType(unittest.TestCase):
    def test_init(self):
        content_type = get_content_type()
        self.assertEqual(content_type, 'application/octet-stream')

if __name__ == '__main__':
    unittest.main()