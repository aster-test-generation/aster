import unittest
from httpie.cli.argparser import HTTPieArgumentParser, ExplicitNullAuth, AuthCredentials, KeyValueArgType, RequestItems, Environment


class TestHTTPieArgumentParser(unittest.TestCase):
    def test_init(self):
        parser = HTTPieArgumentParser()
        self.assertIsInstance(parser, argparse.ArgumentParser)

    def test_parse_args(self):
        env = Environment()
        args = parser.parse_args(env, ['--debug', 'https://example.com'])
        self.assertIsInstance(args, argparse.Namespace)

    def test_process_request_type(self):
        parser = HTTPieArgumentParser()
        parser.args = argparse.Namespace(request_type=RequestType.JSON)
        parser._process_request_type()
        self.assertTrue(parser.args.json)

    def test_process_url(self):
        parser = HTTPieArgumentParser()
        parser.args = argparse.Namespace(url='example.com')
        parser._process_url()
        self.assertEqual(parser.args.url, 'http://example.com')

    def test_print_message(self):
        parser = HTTPieArgumentParser()
        parser.env = Environment()
        parser._print_message('Hello, world!')

    def test_setup_standard_streams(self):
        parser = HTTPieArgumentParser()
        parser.args = argparse.Namespace(output_file='output.txt')
        parser._setup_standard_streams()
        self.assertTrue(parser.args.output_file_specified)

    def test_process_auth(self):
        parser = HTTPieArgumentParser()
        parser.args = argparse.Namespace(auth='username:password')
        parser._process_auth()
        self.assertIsInstance(parser.args.auth, AuthCredentials)

    def test_apply_no_options(self):
        parser = HTTPieArgumentParser()
        parser._apply_no_options(['--no-foo'])

    def test_body_from_file(self):
        parser = HTTPieArgumentParser()
        parser.args = argparse.Namespace(data='Hello, world!')
        parser._body_from_file(sys.stdin)

    def test_guess_method(self):
        parser = HTTPieArgumentParser()
        parser.args = argparse.Namespace(method=None)
        parser._guess_method()
        self.assertEqual(parser.args.method, HTTP_GET)

    def test_parse_items(self):
        parser = HTTPieArgumentParser()
        parser.args = argparse.Namespace(request_items=['key=value'])
        parser._parse_items()
        self.assertIsInstance(parser.args.headers, dict)

    def test_private_method(self):
        parser = HTTPieArgumentParser()
        result = parser._HTTPieArgumentParser__private_method('foo')
        self.assertEqual(result, 'foo')

    def test_protected_method(self):
        parser = HTTPieArgumentParser()
        result = parser._process_download_options()
        self.assertIsNone(result)

    def test_magic_method(self):
        parser = HTTPieArgumentParser()
        result = parser.__str__()
        self.assertEqual(result, '')

    def test_repr_method(self):
        parser = HTTPieArgumentParser()
        result = parser.__repr__()
        self.assertEqual(result, 'HTTPieArgumentParser()')

class TestExplicitNullAuth(unittest.TestCase):
    def test_init(self):
        auth = ExplicitNullAuth()
        self.assertIsInstance(auth, ExplicitNullAuth)

class TestAuthCredentials(unittest.TestCase):
    def test_init(self):
        auth = AuthCredentials(key='username', value='password')
        self.assertIsInstance(auth, AuthCredentials)

class TestKeyValueArgType(unittest.TestCase):
    def test_init(self):
        kv = KeyValueArgType('key=value')
        self.assertIsInstance(kv, KeyValueArgType)

class TestRequestItems(unittest.TestCase):
    def test_from_args(self):
        request_items = RequestItems.from_args(request_item_args=['key=value'])
        self.assertIsInstance(request_items, RequestItems)

if __name__ == '__main__':
    unittest.main()