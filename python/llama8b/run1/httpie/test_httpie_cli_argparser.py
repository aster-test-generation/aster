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
        self.assertEqual(parser.env, None)
        self.assertEqual(parser.args, None)
        self.assertFalse(parser.has_stdin_data)

    def test_process_output_options(self):
        parser = HTTPieArgumentParser()
        parser.args = {'verbose': True, 'output_options': None}
        parser._process_output_options()
        self.assertEqual(parser.args['output_options'], ''.join(OUTPUT_OPTIONS))

    def test_process_pretty_options(self):
        parser = HTTPieArgumentParser()
        parser.args = {'prettify': PRETTY_STDOUT_TTY_ONLY}
        parser._process_pretty_options()
        self.assertEqual(parser.args['prettify'], PRETTY_MAP['all' if parser.env.stdout_isatty else 'none'])

    def test_process_download_options(self):
        parser = HTTPieArgumentParser()
        parser.args = {'offline': True, 'download': False, 'download_resume': False}
        parser._process_download_options()
        self.assertFalse(parser.args['download'])
        self.assertFalse(parser.args['download_resume'])

    def test_process_format_options(self):
        parser = HTTPieArgumentParser()
        parser.args = {'format_options': [['key1', 'value1'], ['key2', 'value2']]}
        parsed_options = PARSED_DEFAULT_FORMAT_OPTIONS
        for options_group in parser.args['format_options']:
            parsed_options = parse_format_options(options_group, defaults=parsed_options)
        self.assertEqual(parser.args['format_options'], parsed_options)

    def test_process_output_options_history(self):
        parser = HTTPieArgumentParser()
        parser.args = {'output_options_history': None}
        parser._process_output_options()
        self.assertEqual(parser.args['output_options_history'], parser.args['output_options'])

    def test_check_options(self):
        parser = HTTPieArgumentParser()
        parser.args = {'output_options': 'unknown'}
        with self.assertRaises(ParseError):
            parser._check_options('output_options', 'unknown')

    def test_str_method(self):
        parser = HTTPieArgumentParser()
        result = str(parser)
        self.assertEqual(result, '<HTTPieArgumentParser>')

    def test_repr_method(self):
        parser = HTTPieArgumentParser()
        result = repr(parser)
        self.assertEqual(result, 'HTTPieArgumentParser()')

    def test_eq_method(self):
        parser1 = HTTPieArgumentParser()
        parser2 = HTTPieArgumentParser()
        self.assertEqual(parser1, parser2)

if __name__ == '__main__':
    unittest.main()