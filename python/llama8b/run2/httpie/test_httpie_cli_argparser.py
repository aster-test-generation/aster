import unittest
from httpie.cli.argparser import HTTPieArgumentParser


class TestHTTPieArgumentParser(unittest.TestCase):
    def test_init(self):
        parser = HTTPieArgumentParser()
        self.assertEqual(parser.add_help, False)
        self.assertEqual(parser.formatter_class, HTTPieHelpFormatter)
        self.assertIsNone(parser.env)
        self.assertIsNone(parser.args)
        self.assertFalse(parser.has_stdin_data)

    def test_process_output_options(self):
        parser = HTTPieArgumentParser()
        parser.args = argparse.Namespace()
        parser.args.verbose = True
        parser.args.output_options = None
        parser._process_output_options()
        self.assertEqual(parser.args.output_options, ''.join(OUTPUT_OPTIONS))

    def test_process_pretty_options(self):
        parser = HTTPieArgumentParser()
        parser.args = argparse.Namespace()
        parser.args.prettify = PRETTY_STDOUT_TTY_ONLY
        parser.env = Environment()
        parser.env.stdout_isatty = True
        parser._process_pretty_options()
        self.assertEqual(parser.args.prettify, PRETTY_MAP['all'])

    def test_process_download_options(self):
        parser = HTTPieArgumentParser()
        parser.args = argparse.Namespace()
        parser.args.offline = True
        parser._process_download_options()
        self.assertFalse(parser.args.download)
        self.assertFalse(parser.args.download_resume)

    def test_process_format_options(self):
        parser = HTTPieArgumentParser()
        parser.args = argparse.Namespace()
        parser.args.format_options = ['group1', 'group2']
        parsed_options = PARSED_DEFAULT_FORMAT_OPTIONS
        for options_group in parser.args.format_options:
            parsed_options = parse_format_options(options_group, defaults=parsed_options)
        self.assertEqual(parser.args.format_options, parsed_options)

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

if __name__ == '__main__':
    unittest.main()