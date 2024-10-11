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
        )
        parser.env = argparse.Namespace(
            stdout_isatty=True,
        )
        parser._process_output_options()
        self.assertEqual(parser.args.output_options, OUTPUT_OPTIONS_DEFAULT)
        self.assertEqual(parser.args.output_options_history, OUTPUT_OPTIONS_DEFAULT)

        parser.args = argparse.Namespace(
            verbose=True,
            offline=False,
            output_options=None,
            output_options_history=None,
        )
        parser._process_output_options()
        self.assertEqual(parser.args.output_options, OUTPUT_OPTIONS)
        self.assertEqual(parser.args.output_options_history, OUTPUT_OPTIONS)

        parser.args = argparse.Namespace(
            verbose=False,
            offline=True,
            output_options=None,
            output_options_history=None,
        )
        parser._process_output_options()
        self.assertEqual(parser.args.output_options, OUTPUT_OPTIONS_DEFAULT_OFFLINE)
        self.assertEqual(parser.args.output_options_history, OUTPUT_OPTIONS_DEFAULT_OFFLINE)

        parser.args = argparse.Namespace(
            verbose=False,
            offline=False,
            output_options=None,
            output_options_history=None,
        )
        parser.env = argparse.Namespace(
            stdout_isatty=False,
        )
        parser._process_output_options()
        self.assertEqual(parser.args.output_options, OUTPUT_OPTIONS_DEFAULT_STDOUT_REDIRECTED)
        self.assertEqual(parser.args.output_options_history, OUTPUT_OPTIONS_DEFAULT_STDOUT_REDIRECTED)

    def test_process_pretty_options(self):
        parser = HTTPieArgumentParser()
        parser.args = argparse.Namespace(
            prettify=None,
        )
        parser.env = argparse.Namespace(
            stdout_isatty=True,
            is_windows=False,
        )
        parser._process_pretty_options()
        self.assertEqual(parser.args.prettify, PRETTY_MAP[PRETTY_STDOUT_TTY_ONLY])

        parser.args = argparse.Namespace(
            prettify='all',
        )
        parser._process_pretty_options()
        self.assertEqual(parser.args.prettify, PRETTY_MAP['all'])

        parser.args = argparse.Namespace(
            prettify='none',
        )
        parser._process_pretty_options()
        self.assertEqual(parser.args.prettify, PRETTY_MAP['none'])

        parser.args = argparse.Namespace(
            prettify='auto',
        )
        parser.env = argparse.Namespace(
            stdout_isatty=False,
            is_windows=False,
        )
        parser._process_pretty_options()
        self.assertEqual(parser.args.prettify, PRETTY_MAP['none'])

        parser.args = argparse.Namespace(
            prettify='auto',
        )
        parser.env = argparse.Namespace(
            stdout_isatty=True,
            is_windows=True,
        )
        parser._process_pretty_options()
        self.assertEqual(parser.args.prettify, PRETTY_MAP['all'])

        parser.args = argparse.Namespace(
            prettify='auto',
        )
        parser.env = argparse.Namespace(
            stdout_isatty=True,
            is_windows=True,
        )
        parser.args = argparse.Namespace(
            output_file='/dev/null',
        )
        parser._process_pretty_options()
        self.assertEqual(parser.args.prettify, PRETTY_MAP['none'])

if __name__ == '__main__':
    unittest.main()