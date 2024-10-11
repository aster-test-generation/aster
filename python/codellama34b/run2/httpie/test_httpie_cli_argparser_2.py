import unittest
from httpie.cli.argparser import *


class TestHTTPieArgumentParser(unittest.TestCase):
    def test_init(self):
        parser = HTTPieArgumentParser()
        self.assertEqual(parser.env, None)
        self.assertEqual(parser.args, None)
        self.assertEqual(parser.has_stdin_data, False)

    def test_parse_args(self):
        env = Environment()
        args = ['--help']
        namespace = None
        result = HTTPieArgumentParser().parse_args(env, args, namespace)
        self.assertEqual(result, None)

    def test_process_request_type(self):
        args = argparse.Namespace(request_type=RequestType.JSON)
        parser = HTTPieArgumentParser()
        parser.args = args
        parser._process_request_type()
        self.assertEqual(args.json, True)
        self.assertEqual(args.multipart, False)
        self.assertEqual(args.form, False)

    def test_process_url(self):
        args = argparse.Namespace(url='http://httpie.io')
        parser = HTTPieArgumentParser()
        parser.args = args
        parser._process_url()
        self.assertEqual(args.url, 'http://httpie.io')

    def test_setup_standard_streams(self):
        args = argparse.Namespace(output_file=None)
        parser = HTTPieArgumentParser()
        parser.args = args
        parser.env = Environment()
        parser._setup_standard_streams()
        self.assertEqual(args.output_file_specified, False)
        self.assertEqual(parser.env.stdout, parser.env.stderr)
        self.assertEqual(parser.env.stdout_isatty, parser.env.stderr_isatty)

    def test_process_auth(self):
        args = argparse.Namespace(auth=None, auth_type=None)
        parser = HTTPieArgumentParser()
        parser.args = args
        parser._process_auth()
        self.assertEqual(args.auth_plugin, None)

    def test_apply_no_options(self):
        no_options = ['--no-option']
        parser = HTTPieArgumentParser()
        self.assertRaises(argparse.ArgumentError, parser._apply_no_options, no_options)

    def test_body_from_file(self):
        args = argparse.Namespace(data=None)
        parser = HTTPieArgumentParser()
        parser.args = args
        parser._body_from_file(None)
        self.assertEqual(args.data, None)

    def test_guess_method(self):
        args = argparse.Namespace(method=None, request_items=None)
        parser = HTTPieArgumentParser()
        parser.args = args
        parser.has_stdin_data = False
        parser._guess_method()
        self.assertEqual(args.method, 'GET')

    def test_parse_items(self):
        args = argparse.Namespace(request_items=None)
        parser = HTTPieArgumentParser()
        parser.args = args
        self.assertRaises(ParseError, parser._parse_items)

if __name__ == '__main__':
    unittest.main()