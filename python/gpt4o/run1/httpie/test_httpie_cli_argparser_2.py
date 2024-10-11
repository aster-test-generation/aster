from httpie.cli.argparser import ExplicitNullAuth
import unittest
from unittest.mock import MagicMock, patch
from httpie.cli.argparser import HTTPieArgumentParser
from httpie.context import Environment
from httpie.plugins.registry import plugin_manager
from httpie.cli.constants import RequestType, SEPARATOR_CREDENTIALS
from httpie.cli.argtypes import AuthCredentials
import argparse
import sys
import os
import re


class TestHTTPieArgumentParser(unittest.TestCase):

    def setUp(self):
        self.env = Environment()
        self.parser = HTTPieArgumentParser()

    def test_init(self):
        self.assertIsInstance(self.parser, HTTPieArgumentParser)
        self.assertFalse(self.parser.has_stdin_data)

    def test_parse_args(self):
        args = ['--debug', 'http://example.com']
        self.env.stdin = None
        self.env.stdin_isatty = False
        self.env.program_name = 'http'
        self.env.stdout = sys.stdout
        self.env.stderr = sys.stderr
        self.env.stdout_encoding = 'utf-8'
        self.env.stdout_isatty = True
        self.env.stderr_isatty = True
        self.env.devnull = open(os.devnull, 'w')
        self.parser.parse_args(self.env, args)
        self.assertTrue(self.parser.args.debug)
        self.assertTrue(self.parser.args.traceback)

    def test_process_request_type(self):
        self.parser.args = argparse.Namespace(request_type=RequestType.JSON)
        self.parser._process_request_type()
        self.assertTrue(self.parser.args.json)
        self.assertFalse(self.parser.args.multipart)
        self.assertFalse(self.parser.args.form)

    def test_process_url(self):
        self.parser.args = argparse.Namespace(url='example.com', default_scheme='http')
        self.env.program_name = 'http'
        self.parser._process_url()
        self.assertEqual(self.parser.args.url, 'http://example.com')

    def test_print_message(self):
        with patch('sys.stdout', new_callable=MagicMock) as mock_stdout:
            self.parser._print_message('test message', sys.stdout)
            mock_stdout.write.assert_called_with('test message')

    def test_setup_standard_streams(self):
        self.parser.args = argparse.Namespace(output_file=None, download=False, quiet=True)
        self.env.stdout = sys.stdout
        self.env.stderr = sys.stderr
        self.env.devnull = open(os.devnull, 'w')
        self.parser._setup_standard_streams()
        self.assertEqual(self.env.stdout, self.env.devnull)
        self.assertEqual(self.env.stderr, self.env.devnull)

    def test_process_auth(self):
        self.parser.args = argparse.Namespace(auth=None, auth_type=None, url='http://example.com', ignore_netrc=False, ignore_stdin=False)
        self.parser._process_auth()
        self.assertIsInstance(self.parser.args.auth, ExplicitNullAuth)

    def test_apply_no_options(self):
        self.parser.args = argparse.Namespace()
        self.parser._actions = [argparse.Action(option_strings=['--no-test'], dest='test', default=None)]
        self.parser._apply_no_options(['--no-test'])
        self.assertIsNone(self.parser.args.test)

    def test_body_from_file(self):
        self.parser.args = argparse.Namespace(data=None, files=None)
        fd = MagicMock()
        self.parser._body_from_file(fd)
        self.assertEqual(self.parser.args.data, fd)

    def test_guess_method(self):
        self.parser.args = argparse.Namespace(method=None, request_items=[], url='http://example.com')
        self.parser.has_stdin_data = False
        self.parser._guess_method()
        self.assertEqual(self.parser.args.method, 'GET')

    def test_parse_items(self):
        self.parser.args = argparse.Namespace(request_items=[], form=False, headers={}, data={}, files={}, params={}, multipart_data={})
        self.parser._parse_items()
        self.assertIsInstance(self.parser.args.headers, dict)

if __name__ == '__main__':
    unittest.main()