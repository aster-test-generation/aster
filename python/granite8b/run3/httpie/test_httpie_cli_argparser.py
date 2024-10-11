from httpie.cli.argparser import Environment
import argparse
import unittest
from httpie.cli.argparser import HTTPieArgumentParser


class TestHTTPieArgumentParser(unittest.TestCase):
    def test_process_output_options(self):
        parser = HTTPieArgumentParser()
        parser.args = argparse.Namespace(
            verbose=True,
            output_options=None,
            output_options_history=None,
            offline=False,
            download=False,
            download_resume=False,
            env=Environment()
        )
        parser._process_output_options()
        self.assertEqual(parser.args.output_options, 'bBcdhH')
        self.assertEqual(parser.args.output_options_history, 'bBcdhH')

    def test_process_pretty_options(self):
        parser = HTTPieArgumentParser()
        parser.args = argparse.Namespace(
            prettify=None,
            env=Environment()
        )
        parser._process_pretty_options()
        self.assertEqual(parser.args.prettify, 'all')

    def test_process_download_options(self):
        parser = HTTPieArgumentParser()
        parser.args = argparse.Namespace(
            offline=False,
            download=False,
            download_resume=False,
            output_file=None,
            env=Environment()
        )
        parser._process_download_options()
        self.assertFalse(parser.args.download)
        self.assertFalse(parser.args.download_resume)

        parser.args = argparse.Namespace(
            offline=False,
            download=True,
            download_resume=False,
            output_file=None,
            env=Environment()
        )
        parser._process_download_options()
        self.assertTrue(parser.args.download)
        self.assertFalse(parser.args.download_resume)

        parser.args = argparse.Namespace(
            offline=False,
            download=True,
            download_resume=True,
            output_file=None,
            env=Environment()
        )
        parser._process_download_options()
        self.assertTrue(parser.args.download)
        self.assertTrue(parser.args.download_resume)

        parser.args = argparse.Namespace(
            offline=True,
            download=True,
            download_resume=True,
            output_file=None,
            env=Environment()
        )
        parser._process_download_options()
        self.assertFalse(parser.args.download)
        self.assertFalse(parser.args.download_resume)

    def test_process_format_options(self):
        parser = HTTPieArgumentParser()
        parser.args = argparse.Namespace(
            format_options=None,
            env=Environment()
        )
        parser._process_format_options()
        self.assertEqual(parser.args.format_options, {})

        parser.args = argparse.Namespace(
            format_options=['json'],
            env=Environment()
        )
        parser._process_format_options()
        self.assertEqual(parser.args.format_options, {'json': {}})

        parser.args = argparse.Namespace(
            format_options=['json', 'indent=4'],
            env=Environment()
        )
        parser._process_format_options()
        self.assertEqual(parser.args.format_options, {'json': {'indent': '4'}})

if __name__ == '__main__':
    unittest.main()