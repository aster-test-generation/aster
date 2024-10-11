import argparse
import unittest
from httpie.cli.argparser import HTTPieArgumentParser
from httpie.cli.argtypes import AuthCredentials, KeyValueArgType, PARSED_DEFAULT_FORMAT_OPTIONS, parse_auth, parse_format_options
from httpie.cli.constants import HTTP_GET, HTTP_POST, OUTPUT_OPTIONS, OUTPUT_OPTIONS_DEFAULT, OUTPUT_OPTIONS_DEFAULT_OFFLINE, OUTPUT_OPTIONS_DEFAULT_STDOUT_REDIRECTED, OUT_RESP_BODY, PRETTY_MAP, PRETTY_STDOUT_TTY_ONLY, RequestType, SEPARATOR_CREDENTIALS, SEPARATOR_GROUP_ALL_ITEMS, SEPARATOR_GROUP_DATA_ITEMS, URL_SCHEME_RE
from httpie.cli.exceptions import ParseError
from httpie.cli.requestitems import RequestItems
from httpie.context import Environment
from httpie.plugins.registry import plugin_manager
from httpie.utils import ExplicitNullAuth, get_content_type


class TestHTTPieArgumentParser(unittest.TestCase):
    def test_process_output_options(self):
        parser = HTTPieArgumentParser()
        parser.args = argparse.Namespace(
            verbose=True,
            output_options=None,
            output_options_history=None,
            offline=False
        )
        parser._process_output_options()
        self.assertEqual(parser.args.output_options, ''.join(OUTPUT_OPTIONS))

    def test_process_pretty_options(self):
        parser = HTTPieArgumentParser()
        parser.args = argparse.Namespace(
            prettify=PRETTY_STDOUT_TTY_ONLY,
            output_file=None,
            output_options=None,
            output_options_history=None,
            offline=False
        )
        parser._process_pretty_options()
        self.assertEqual(parser.args.prettify, PRETTY_MAP['all' if parser.env.stdout_isatty else 'none'])

    def test_process_download_options(self):
        parser = HTTPieArgumentParser()
        parser.args = argparse.Namespace(
            download=True,
            download_resume=False,
            output_file=None,
            output_options=None,
            output_options_history=None,
            offline=False
        )
        parser._process_download_options()
        self.assertEqual(parser.args.download, True)
        self.assertEqual(parser.args.download_resume, False)

    def test_process_format_options(self):
        parser = HTTPieArgumentParser()
        parser.args = argparse.Namespace(
            format_options=None,
            output_options=None,
            output_options_history=None,
            offline=False
        )
        parser._process_format_options()
        self.assertEqual(parser.args.format_options, PARSED_DEFAULT_FORMAT_OPTIONS)

if __name__ == '__main__':
    unittest.main()