import unittest
from httpie.cli.argparser import HTTPieArgumentParser, Environment


class TestHTTPieArgumentParser(unittest.TestCase):
    def test_init(self):
        parser = HTTPieArgumentParser()
        self.assertEqual(parser.env, None)
        self.assertEqual(parser.args, None)

    def test_parse_args(self):
        env = Environment()
        parser = HTTPieArgumentParser()
        args = parser.parse_args(env, ['--help'])
        self.assertEqual(args, argparse.Namespace())

    def test_process_request_type(self):
        parser = HTTPieArgumentParser()
        parser.args = argparse.Namespace(request_type=RequestType.JSON)
        parser._process_request_type()
        self.assertTrue(parser.args.json)

    def test_process_url(self):
        parser = HTTPieArgumentParser()
        parser.args = argparse.Namespace(url='http://example.com')
        parser._process_url()
        self.assertEqual(parser.args.url, 'http://example.com')

    def test_print_message(self):
        parser = HTTPieArgumentParser()
        file = sys.stdout
        message = 'Hello, world!'
        parser._print_message(message, file)
        self.assertEqual(message, file.write(message))

    def test_setup_standard_streams(self):
        parser = HTTPieArgumentParser()
        parser.args = argparse.Namespace(output_file='output.txt')
        parser._setup_standard_streams()
        self.assertEqual(parser.args.output_file, 'output.txt')

    def test_process_auth(self):
        parser = HTTPieArgumentParser()
        parser.args = argparse.Namespace(auth='username:password')
        parser._process_auth()
        self.assertEqual(parser.args.auth, AuthCredentials(key='username', value='password'))

    def test_apply_no_options(self):
        parser = HTTPieArgumentParser()
        parser._actions = [argparse._Action('test', 'test', 'test')]
        parser._apply_no_options(['--no-test'])
        self.assertEqual(parser.args.test, False)

    def test_body_from_file(self):
        parser = HTTPieArgumentParser()
        parser._body_from_file(open('test.txt', 'r'))
        self.assertEqual(parser.args.data, open('test.txt', 'r'))

    def test_guess_method(self):
        parser = HTTPieArgumentParser()
        parser.args = argparse.Namespace()
        parser._guess_method()
        self.assertEqual(parser.args.method, HTTP_GET)

    def test_parse_items(self):
        parser = HTTPieArgumentParser()
        parser.args = argparse.Namespace(request_items=['key=value'])
        parser._parse_items()
        self.assertEqual(parser.args.headers, {'Content-Type': 'application/x-www-form-urlencoded'})
        self.assertEqual(parser.args.data, 'key=value')

    def test__private_method(self):
        parser = HTTPieArgumentParser()
        with self.assertRaises(AttributeError):
            parser.__private_method()

    def test__protected_method(self):
        parser = HTTPieArgumentParser()
        with self.assertRaises(AttributeError):
            parser._protected_method()

    def test__str__(self):
        parser = HTTPieArgumentParser()
        self.assertEqual(str(parser), 'HTTPieArgumentParser')

    def test__repr__(self):
        parser = HTTPieArgumentParser()
        self.assertEqual(repr(parser), 'HTTPieArgumentParser()')

    def test__eq__(self):
        parser1 = HTTPieArgumentParser()
        parser2 = HTTPieArgumentParser()
        self.assertEqual(parser1, parser2)

if __name__ == '__main__':
    unittest.main()