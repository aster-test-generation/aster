from httpie.cli.argparser import Environment
import unittest
from httpie.cli.argparser import HTTPieArgumentParser


class TestHTTPieArgumentParser(unittest.TestCase):
    def test_parse_args_with_no_options(self):
        parser = HTTPieArgumentParser()
        args = parser.parse_args(env=Environment(), args=['--no-verify'])
        self.assertFalse(args.verify)

    def test_parse_args_with_no_options_and_stdin_data(self):
        parser = HTTPieArgumentParser()
        args = parser.parse_args(env=Environment(stdin=b'foo'), args=['--no-verify'])
        self.assertFalse(args.verify)

    def test_parse_args_with_request_type_json(self):
        parser = HTTPieArgumentParser()
        args = parser.parse_args(env=Environment(), args=['--json', 'https://httpbin.org/post'])
        self.assertTrue(args.json)

    def test_parse_args_with_request_type_multipart(self):
        parser = HTTPieArgumentParser()
        args = parser.parse_args(env=Environment(), args=['--multipart', 'https://httpbin.org/post'])
        self.assertTrue(args.multipart)

    def test_parse_args_with_request_type_form(self):
        parser = HTTPieArgumentParser()
        args = parser.parse_args(env=Environment(), args=['--form', 'https://httpbin.org/post'])
        self.assertTrue(args.form)

    def test_parse_args_with_url_scheme(self):
        parser = HTTPieArgumentParser()
        args = parser.parse_args(env=Environment(), args=['https://httpbin.org/post'])
        self.assertEqual(args.url, 'https://httpbin.org/post')

    def test_parse_args_with_url_scheme_and_port(self):
        parser = HTTPieArgumentParser()
        args = parser.parse_args(env=Environment(), args=['https://httpbin.org:8080/post'])
        self.assertEqual(args.url, 'https://httpbin.org:8080/post')

    def test_parse_args_with_url_scheme_and_path(self):
        parser = HTTPieArgumentParser()
        args = parser.parse_args(env=Environment(), args=['https://httpbin.org/foo/bar'])
        self.assertEqual(args.url, 'https://httpbin.org/foo/bar')

    def test_parse_args_with_url_scheme_and_query_params(self):
        parser = HTTPieArgumentParser()
        args = parser.parse_args(env=Environment(), args=['https://httpbin.org/foo/bar?a=1&b=2'])
        self.assertEqual(args.url, 'https://httpbin.org/foo/bar?a=1&b=2')

    def test_parse_args_with_url_scheme_and_fragment(self):
        parser = HTTPieArgumentParser()
        args = parser.parse_args(env=Environment(), args=['https://httpbin.org/foo/bar#section1'])
        self.assertEqual(args.url, 'https://httpbin.org/foo/bar#section1')

    def test_parse_args_with_url_scheme_and_path_and_query_params(self):
        parser = HTTPieArgumentParser()
        args = parser.parse_args(env=Environment(), args=['https://httpbin.org/foo/bar?a=1&b=2'])
        self.assertEqual(args.url, 'https://httpbin.org/foo/bar?a=1&b=2')

if __name__ == '__main__':
    unittest.main()