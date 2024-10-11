import unittest
from unittest.mock import patch, Mock
from httpie.cli.argparser import HTTPieArgumentParser
from httpie.cli.argtypes import AuthCredentials
from httpie.cli.exceptions import ParseError
from httpie.cli.requestitems import RequestItems
from httpie.context import Environment
from httpie.plugins.registry import plugin_manager
from httpie.utils import ExplicitNullAuth, get_content_type


class TestHTTPieArgumentParser(unittest.TestCase):
    def setUp(self):
        self.parser = HTTPieArgumentParser()
        self.env = Environment()
        self.args = argparse.Namespace()

    def test_init(self):
        self.parser.__init__(self.parser, *args, formatter_class=HTTPieHelpFormatter, **kwargs)
        self.assertEqual(self.parser.env, None)
        self.assertEqual(self.parser.args, None)

    def test_parse_args(self):
        self.parser.parse_args(self.env, args=None, namespace=self.args)
        self.assertEqual(self.parser.env, self.env)
        self.assertEqual(self.parser.args, self.args)

    def test_process_request_type(self):
        self.parser._process_request_type()
        self.assertEqual(self.parser.args.json, False)
        self.assertEqual(self.parser.args.multipart, False)
        self.assertEqual(self.parser.args.form, False)

    def test_process_url(self):
        self.parser._process_url()
        self.assertEqual(self.parser.args.url, 'https://localhost')

    def test_print_message(self):
        with patch('sys.stdout') as stdout:
            self.parser._print_message('message', file=stdout)
            self.assertEqual(stdout.write.call_args[0][0], b'message')

    def test_setup_standard_streams(self):
        self.parser._setup_standard_streams()
        self.assertEqual(self.parser.args.output_file_specified, False)
        self.assertEqual(self.parser.args.output_file, None)

    def test_process_auth(self):
        self.parser._process_auth()
        self.assertEqual(self.parser.args.auth_plugin, None)
        self.assertEqual(self.parser.args.auth_type, None)

    def test_apply_no_options(self):
        self.parser._apply_no_options(['--no-option'])
        self.assertEqual(self.parser.args.option, False)

    def test_body_from_file(self):
        with patch('sys.stdin') as stdin:
            self.parser._body_from_file(stdin)
            self.assertEqual(self.parser.args.data, stdin)

    def test_guess_method(self):
        self.parser._guess_method()
        self.assertEqual(self.parser.args.method, HTTP_GET)

    def test_parse_items(self):
        request_items = RequestItems.from_args(request_item_args=self.args.request_items, as_form=self.args.form)
        self.parser._parse_items()
        self.assertEqual(self.parser.args.headers, request_items.headers)
        self.assertEqual(self.parser.args.data, request_items.data)
        self.assertEqual(self.parser.args.files, request_items.files)
        self.assertEqual(self.parser.args.params, request_items.params)
        self.assertEqual(self.parser.args.multipart_data, request_items.multipart_data)

    def test__private_method(self):
        with self.assertRaises(AttributeError):
            self.parser.__private_method()

    def test__protected_method(self):
        with self.assertRaises(AttributeError):
            self.parser._protected_method()

    def test__magic_methods(self):
        self.assertEqual(str(self.parser), 'HTTPieArgumentParser')
        self.assertEqual(repr(self.parser), 'HTTPieArgumentParser(HTTPieArgumentParser)')

if __name__ == '__main__':
    unittest.main()