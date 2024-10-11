import unittest
from httpie.cli.argparser import *



class TestHTTPieArgumentParser(unittest.TestCase):
    def test_init(self):
        parser = HTTPieArgumentParser()
        self.assertEqual(parser.add_help, False)

    def test_parse_args(self):
        env = Environment()
        args = ['--debug']
        namespace = None
        result = HTTPieArgumentParser.parse_args(env, args, namespace)
        self.assertEqual(result.traceback, True)

    def test_process_request_type(self):
        request_type = RequestType.JSON
        args = HTTPieArgumentParser()
        args.request_type = request_type
        HTTPieArgumentParser._process_request_type(args)
        self.assertEqual(args.json, True)
        self.assertEqual(args.multipart, False)
        self.assertEqual(args.form, False)

    def test_process_url(self):
        url = 'https://www.google.com'
        args = HTTPieArgumentParser()
        args.url = url
        HTTPieArgumentParser._process_url(args)
        self.assertEqual(args.url, url)

    def test_setup_standard_streams(self):
        args = HTTPieArgumentParser()
        HTTPieArgumentParser._setup_standard_streams(args)
        self.assertEqual(args.output_file_specified, False)

    def test_process_auth(self):
        args = HTTPieArgumentParser()
        HTTPieArgumentParser._process_auth(args)
        self.assertEqual(args.auth_plugin, None)

    def test_apply_no_options(self):
        no_options = ['--no-option']
        args = HTTPieArgumentParser()
        HTTPieArgumentParser._apply_no_options(args, no_options)
        self.assertEqual(args.option, False)

    def test_body_from_file(self):
        fd = None
        args = HTTPieArgumentParser()
        HTTPieArgumentParser._body_from_file(args, fd)
        self.assertEqual(args.data, fd)

    def test_guess_method(self):
        args = HTTPieArgumentParser()
        HTTPieArgumentParser._guess_method(args)
        self.assertEqual(args.method, HTTP_GET)

if __name__ == '__main__':
    unittest.main()