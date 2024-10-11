import unittest
from httpie.cli.argparser import HTTPieArgumentParser, HTTPieHelpFormatter


class TestHTTPieArgumentParser(unittest.TestCase):
    def test_init(self):
        parser = HTTPieArgumentParser()
        self.assertIsInstance(parser, argparse.ArgumentParser)
        self.assertIsNone(parser.env)
        self.assertIsNone(parser.args)
        self.assertFalse(parser.has_stdin_data)

    def test_process_output_options(self):
        parser = HTTPieArgumentParser()
        parser.args = argparse.Namespace(verbose=True, output_options=None, offline=False)
        parser._process_output_options()
        self.assertEqual(parser.args.output_options, ''.join(OUTPUT_OPTIONS))

    def test_process_pretty_options(self):
        parser = HTTPieArgumentParser()
        parser.args = argparse.Namespace(prettify=PRETTY_STDOUT_TTY_ONLY, output_file=None)
        parser.env = Environment(stdout_isatty=True)
        parser._process_pretty_options()
        self.assertEqual(parser.args.prettify, PRETTY_MAP['all'])

    def test_process_download_options(self):
        parser = HTTPieArgumentParser()
        parser.args = argparse.Namespace(offline=True, download=True, download_resume=True)
        parser._process_download_options()
        self.assertFalse(parser.args.download)
        self.assertFalse(parser.args.download_resume)

    def test_process_format_options(self):
        parser = HTTPieArgumentParser()
        parser.args = argparse.Namespace(format_options=[['foo=bar']])
        parser._process_format_options()
        self.assertEqual(parser.args.format_options, {'foo': 'bar'})

    def test_private_method__process_output_options_check_options(self):
        parser = HTTPieArgumentParser()
        parser.args = argparse.Namespace(output_options=['foo', 'bar'])
        with self.assertRaises(argparse.ArgumentError):
            parser._HTTPieArgumentParser__process_output_options_check_options(['foo', 'bar'], '--print')

    def test_magic_method__str__(self):
        parser = HTTPieArgumentParser()
        self.assertEqual(str(parser), 'HTTPieArgumentParser')

    def test_magic_method__repr__(self):
        parser = HTTPieArgumentParser()
        self.assertEqual(repr(parser), 'HTTPieArgumentParser()')

class TestHTTPieHelpFormatter(unittest.TestCase):
    def test_init(self):
        formatter = HTTPieHelpFormatter()
        self.assertIsInstance(formatter, RawDescriptionHelpFormatter)

    def test_format_help(self):
        formatter = HTTPieHelpFormatter()
        self.assertEqual(formatter.format_help(), '')

if __name__ == '__main__':
    unittest.main()