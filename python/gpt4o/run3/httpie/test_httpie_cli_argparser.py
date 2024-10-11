import unittest
from httpie.cli.definition import HTTPieArgumentParser
from httpie.cli.constants import OUTPUT_OPTIONS, OUTPUT_OPTIONS_DEFAULT, OUTPUT_OPTIONS_DEFAULT_OFFLINE, OUTPUT_OPTIONS_DEFAULT_STDOUT_REDIRECTED, OUT_RESP_BODY, PRETTY_STDOUT_TTY_ONLY, PRETTY_MAP, PARSED_DEFAULT_FORMAT_OPTIONS
from unittest.mock import MagicMock


class TestHTTPieArgumentParser(unittest.TestCase):
    def setUp(self):
        self.parser = HTTPieArgumentParser()
        self.parser.env = MagicMock()
        self.parser.args = MagicMock()

    def test_init(self):
        parser = HTTPieArgumentParser()
        self.assertFalse(parser.has_stdin_data)

    def test_process_output_options_verbose(self):
        self.parser.args.verbose = True
        self.parser.args.output_options = None
        self.parser.args.offline = False
        self.parser.env.stdout_isatty = True
        self.parser._process_output_options()
        self.assertTrue(self.parser.args.all)

    def test_process_output_options_default(self):
        self.parser.args.verbose = False
        self.parser.args.output_options = None
        self.parser.args.offline = False
        self.parser.env.stdout_isatty = True
        self.parser._process_output_options()
        self.assertEqual(self.parser.args.output_options, OUTPUT_OPTIONS_DEFAULT)

    def test_process_output_options_offline(self):
        self.parser.args.verbose = False
        self.parser.args.output_options = None
        self.parser.args.offline = True
        self.parser.env.stdout_isatty = True
        self.parser._process_output_options()
        self.assertEqual(self.parser.args.output_options, OUTPUT_OPTIONS_DEFAULT_OFFLINE)

    def test_process_output_options_stdout_redirected(self):
        self.parser.args.verbose = False
        self.parser.args.output_options = None
        self.parser.args.offline = False
        self.parser.env.stdout_isatty = False
        self.parser._process_output_options()
        self.assertEqual(self.parser.args.output_options, OUTPUT_OPTIONS_DEFAULT_STDOUT_REDIRECTED)

    def test_process_output_options_history(self):
        self.parser.args.output_options_history = None
        self.parser.args.output_options = 'test'
        self.parser._process_output_options()
        self.assertEqual(self.parser.args.output_options_history, 'test')

    def test_process_output_options_download(self):
        self.parser.args.download = True
        self.parser.args.output_options = OUT_RESP_BODY
        self.parser._process_output_options()
        self.assertNotIn(OUT_RESP_BODY, self.parser.args.output_options)

    def test_process_pretty_options_tty_only(self):
        self.parser.args.prettify = PRETTY_STDOUT_TTY_ONLY
        self.parser.env.stdout_isatty = True
        self.parser._process_pretty_options()
        self.assertEqual(self.parser.args.prettify, PRETTY_MAP['all'])

    def test_process_pretty_options_windows(self):
        self.parser.args.prettify = True
        self.parser.env.is_windows = True
        self.parser.args.output_file = True
        with self.assertRaises(SystemExit):
            self.parser._process_pretty_options()

    def test_process_pretty_options_default(self):
        self.parser.args.prettify = 'none'
        self.parser._process_pretty_options()
        self.assertEqual(self.parser.args.prettify, PRETTY_MAP['none'])

    def test_process_download_options_offline(self):
        self.parser.args.offline = True
        self.parser._process_download_options()
        self.assertFalse(self.parser.args.download)
        self.assertFalse(self.parser.args.download_resume)

    def test_process_download_options_resume_without_download(self):
        self.parser.args.download = False
        self.parser.args.download_resume = True
        with self.assertRaises(SystemExit):
            self.parser._process_download_options()

    def test_process_download_options_resume_without_output(self):
        self.parser.args.download = True
        self.parser.args.download_resume = True
        self.parser.args.output_file = None
        with self.assertRaises(SystemExit):
            self.parser._process_download_options()

    def test_process_format_options_default(self):
        self.parser.args.format_options = None
        self.parser._process_format_options()
        self.assertEqual(self.parser.args.format_options, PARSED_DEFAULT_FORMAT_OPTIONS)

    def test_process_format_options_custom(self):
        self.parser.args.format_options = ['option1', 'option2']
        self.parser._process_format_options()
        self.assertNotEqual(self.parser.args.format_options, PARSED_DEFAULT_FORMAT_OPTIONS)

if __name__ == '__main__':
    unittest.main()