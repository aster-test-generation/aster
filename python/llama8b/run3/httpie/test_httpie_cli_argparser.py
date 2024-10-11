import unittest
from httpie.cli.argparser import HTTPieArgumentParser
from httpie.cli.argtypes import AuthCredentials, KeyValueArgType
from httpie.cli.constants import HTTP_GET, HTTP_POST, OUTPUT_OPTIONS, OUTPUT_OPTIONS_DEFAULT, OUTPUT_OPTIONS_DEFAULT_OFFLINE, OUTPUT_OPTIONS_DEFAULT_STDOUT_REDIRECTED, OUT_RESP_BODY, PRETTY_MAP, PRETTY_STDOUT_TTY_ONLY, RequestType, SEPARATOR_CREDENTIALS, SEPARATOR_GROUP_ALL_ITEMS, SEPARATOR_GROUP_DATA_ITEMS, URL_SCHEME_RE
from httpie.cli.exceptions import ParseError
from httpie.cli.requestitems import RequestItems
from httpie.context import Environment
from httpie.plugins.registry import plugin_manager
from httpie.utils import ExplicitNullAuth, get_content_type


class TestHTTPieArgumentParser(unittest.TestCase):
    def test_init(self):
        parser = HTTPieArgumentParser()
        self.assertIsNone(parser.env)
        self.assertIsNone(parser.args)

    def test_process_output_options(self):
        parser = HTTPieArgumentParser()
        parser.args = {'verbose': True}
        parser._process_output_options()
        self.assertEqual(parser.args['output_options'], ''.join(OUTPUT_OPTIONS))

    def test_process_pretty_options(self):
        parser = HTTPieArgumentParser()
        parser.args = {'prettify': PRETTY_STDOUT_TTY_ONLY}
        parser._process_pretty_options()
        self.assertEqual(parser.args['prettify'], PRETTY_MAP['all' if parser.env.stdout_isatty else 'none'])

    def test_process_download_options(self):
        parser = HTTPieArgumentParser()
        parser.args = {'offline': True}
        parser._process_download_options()
        self.assertFalse(parser.args['download'])
        self.assertFalse(parser.args['download_resume'])

    def test_process_format_options(self):
        parser = HTTPieArgumentParser()
        parser.args = {'format_options': [{'key': 'value'}]}
        parsed_options = PARSED_DEFAULT_FORMAT_OPTIONS
        for options_group in parser.args['format_options']:
            parsed_options = parse_format_options(options_group, defaults=parsed_options)
        self.assertEqual(parser.args['format_options'], parsed_options)

    def test_str_method(self):
        parser = HTTPieArgumentParser()
        result = str(parser)
        self.assertEqual(result, 'HTTPieArgumentParser')

    def test_repr_method(self):
        parser = HTTPieArgumentParser()
        result = repr(parser)
        self.assertEqual(result, 'HTTPieArgumentParser()')

    def test_eq_method(self):
        parser1 = HTTPieArgumentParser()
        parser2 = HTTPieArgumentParser()
        self.assertEqual(parser1, parser2)

    def test_private_method(self):
        parser = HTTPieArgumentParser()
        with self.assertRaises(AttributeError):
            parser.__private_method()

    def test_protected_method(self):
        parser = HTTPieArgumentParser()
        with self.assertRaises(AttributeError):
            parser._process_output_options()

if __name__ == '__main__':
    unittest.main()