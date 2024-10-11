import unittest
from httpie.cli.argparser import HTTPieArgumentParser


class TestHTTPieArgumentParser(unittest.TestCase):
    def test_init(self):
        parser = HTTPieArgumentParser()
        self.assertEqual(parser.formatter_class, HTTPieHelpFormatter)
        self.assertFalse(parser.add_help)

    def test_parse_args(self):
        parser = HTTPieArgumentParser()
        env = Environment()
        args = parser.parse_args(env, namespace=None)
        self.assertEqual(args, parser.args)

    def test_process_request_type(self):
        parser = HTTPieArgumentParser()
        parser.args.request_type = RequestType.JSON
        parser._process_request_type()
        self.assertTrue(parser.args.json)
        self.assertFalse(parser.args.multipart)

    def test_process_url(self):
        parser = HTTPieArgumentParser()
        parser.args.url = 'http://example.com'
        parser._process_url()
        self.assertEqual(parser.args.url, 'http://example.com')

    def test_print_message(self):
        parser = HTTPieArgumentParser()
        file = sys.stdout
        message = 'Hello, World!'
        parser._print_message(message, file)
        self.assertEqual(message, file.buffer.decode())

    def test_setup_standard_streams(self):
        parser = HTTPieArgumentParser()
        parser.args.output_file = 'output.txt'
        parser._setup_standard_streams()
        self.assertEqual(parser.args.output_file, 'output.txt')

    def test_process_auth(self):
        parser = HTTPieArgumentParser()
        parser.args.auth = AuthCredentials(key='username', value='password', sep=SEPARATOR_CREDENTIALS)
        parser._process_auth()
        self.assertEqual(parser.args.auth_plugin, plugin_manager.get_auth_plugin(parser.args.auth_type)())

    def test_apply_no_options(self):
        parser = HTTPieArgumentParser()
        no_options = ['--no-option1', '--no-option2']
        parser._apply_no_options(no_options)
        self.assertEqual(parser.args.option1, parser.args.option1_default)
        self.assertEqual(parser.args.option2, parser.args.option2_default)

    def test_body_from_file(self):
        parser = HTTPieArgumentParser()
        fd = open('file.txt', 'r')
        parser._body_from_file(fd)
        self.assertEqual(parser.args.data, fd)

    def test_guess_method(self):
        parser = HTTPieArgumentParser()
        parser.args.method = 'POST'
        parser._guess_method()
        self.assertEqual(parser.args.method, HTTP_POST)

    def test_parse_items(self):
        parser = HTTPieArgumentParser()
        request_items = RequestItems.from_args(request_item_args=['key=value'], as_form=True)
        parser._parse_items()
        self.assertEqual(parser.args.headers, {'Content-Type': 'application/x-www-form-urlencoded'})
        self.assertEqual(parser.args.data, 'key=value')

    def test_private_method(self):
        parser = HTTPieArgumentParser()
        result = parser._HTTPieArgumentParser__private_method()
        self.assertEqual(result, None)

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