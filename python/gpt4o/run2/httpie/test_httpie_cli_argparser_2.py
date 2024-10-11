import unittest
from unittest.mock import MagicMock, patch
from httpie.cli.definition import HTTPieArgumentParser
from httpie.context import Environment
from httpie.plugins.registry import plugin_manager
from httpie.cli.constants import RequestType, SEPARATOR_CREDENTIALS
from httpie.cli.exceptions import ParseError
from httpie.cli.requestitems import RequestItems
from httpie.utils import ExplicitNullAuth
from requests.utils import get_netrc_auth
import argparse
import os
import re
import sys


class TestHTTPieArgumentParser(unittest.TestCase):

    def setUp(self):
        self.env = MagicMock(spec=Environment)
        self.env.stdin = None
        self.env.stdin_isatty = False
        self.env.stdout = sys.stdout
        self.env.stderr = sys.stderr
        self.env.stdout_isatty = False
        self.env.stderr_isatty = False
        self.env.stdout_encoding = 'utf-8'
        self.env.program_name = 'http'
        self.parser = HTTPieArgumentParser()

    def test_init(self):
        self.assertIsInstance(self.parser, HTTPieArgumentParser)
        self.assertFalse(self.parser.has_stdin_data)

    def test_parse_args(self):
        args = ['--debug', 'http://example.com']
        self.env.stdin = None
        self.env.stdin_isatty = True
        parsed_args = self.parser.parse_args(self.env, args)
        self.assertTrue(parsed_args.debug)
        self.assertTrue(parsed_args.traceback)

    def test_process_request_type(self):
        self.parser.args = MagicMock()
        self.parser.args.request_type = RequestType.JSON
        self.parser._process_request_type()
        self.assertTrue(self.parser.args.json)
        self.assertFalse(self.parser.args.multipart)
        self.assertFalse(self.parser.args.form)

    def test_process_url(self):
        self.parser.args = MagicMock()
        self.parser.args.url = 'example.com'
        self.parser.args.default_scheme = 'http'
        self.parser._process_url()
        self.assertEqual(self.parser.args.url, 'http://example.com')

    def test_print_message(self):
        with patch('sys.stdout', new_callable=MagicMock) as mock_stdout:
            self.parser._print_message('test message', file=sys.stdout)
            mock_stdout.write.assert_called_with('test message')

    def test_setup_standard_streams(self):
        self.parser.args = MagicMock()
        self.parser.args.output_file = None
        self.parser.args.download = False
        self.parser.args.quiet = True
        self.parser._setup_standard_streams()
        self.assertEqual(self.parser.env.stdout, self.parser.env.devnull)
        self.assertEqual(self.parser.env.stderr, self.parser.env.devnull)

    def test_process_auth(self):
        self.parser.args = MagicMock()
        self.parser.args.auth = None
        self.parser.args.auth_type = None
        self.parser.args.ignore_netrc = False
        self.parser.args.url = 'http://example.com'
        self.parser._process_auth()
        self.assertIsInstance(self.parser.args.auth, ExplicitNullAuth)

    def test_apply_no_options(self):
        self.parser.args = MagicMock()
        self.parser._actions = [argparse.Action(option_strings=['--no-test'], dest='test', default=None)]
        self.parser._apply_no_options(['--no-test'])
        self.assertIsNone(self.parser.args.test)

    def test_body_from_file(self):
        self.parser.args = MagicMock()
        self.parser.args.data = None
        self.parser.args.files = None
        fd = MagicMock()
        self.parser._body_from_file(fd)
        self.assertEqual(self.parser.args.data, fd)

    def test_guess_method(self):
        self.parser.args = MagicMock()
        self.parser.args.method = None
        self.parser.args.request_items = []
        self.parser.has_stdin_data = True
        self.parser._guess_method()
        self.assertEqual(self.parser.args.method, 'POST')

    def test_parse_items(self):
        self.parser.args = MagicMock()
        self.parser.args.request_items = []
        self.parser.args.form = False
        with patch.object(RequestItems, 'from_args', return_value=MagicMock(headers={}, data={}, files={}, params={}, multipart_data={})) as mock_from_args:
            self.parser._parse_items()
            mock_from_args.assert_called_once()

if __name__ == '__main__':
    unittest.main()