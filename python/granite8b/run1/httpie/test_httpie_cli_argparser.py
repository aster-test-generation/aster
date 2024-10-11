import argparse
import unittest
from httpie.cli.argparser import HTTPieArgumentParser


class TestHTTPieArgumentParser(unittest.TestCase):
    def test_process_output_options(self):
        parser = HTTPieArgumentParser()
        parser.args = argparse.Namespace(
            verbose=False,
            offline=False,
            output_options=None,
            output_options_history=None,
            download=False,
            download_resume=False,
            prettify=None,
            format_options=None,
        )
        parser.env = argparse.Namespace(
            stdout_isatty=True,
        )
        parser._process_output_options()
        self.assertEqual(parser.args.output_options, 's')
        self.assertEqual(parser.args.output_options_history, 's')

        parser.args = argparse.Namespace(
            verbose=True,
            offline=False,
            output_options=None,
            output_options_history=None,
            download=False,
            download_resume=False,
            prettify=None,
            format_options=None,
        )
        parser._process_output_options()
        self.assertEqual(parser.args.output_options, 'as')
        self.assertEqual(parser.args.output_options_history, 'as')

        parser.args = argparse.Namespace(
            verbose=False,
            offline=True,
            output_options=None,
            output_options_history=None,
            download=False,
            download_resume=False,
            prettify=None,
            format_options=None,
        )
        parser._process_output_options()
        self.assertEqual(parser.args.output_options, 's')
        self.assertEqual(parser.args.output_options_history, 's')

        parser.args = argparse.Namespace(
            verbose=False,
            offline=False,
            output_options=None,
            output_options_history=None,
            download=True,
            download_resume=False,
            prettify=None,
            format_options=None,
        )
        parser.env = argparse.Namespace(
            stdout_isatty=False,
        )
        parser._process_output_options()
        self.assertEqual(parser.args.output_options, 's')
        self.assertEqual(parser.args.output_options_history, 's')

        parser.args = argparse.Namespace(
            verbose=False,
            offline=False,
            output_options=None,
            output_options_history=None,
            download=True,
            download_resume=True,
            prettify=None,
            format_options=None,
        )
        parser.env = argparse.Namespace(
            stdout_isatty=True,
        )
        parser._process_output_options()
        self.assertEqual(parser.args.output_options, 'as')
        self.assertEqual(parser.args.output_options_history, 'as')

if __name__ == '__main__':
    unittest.main()