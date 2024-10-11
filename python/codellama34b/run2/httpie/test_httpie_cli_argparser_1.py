import unittest
from httpie.cli.argparser import *



class TestHTTPieHelpFormatter(unittest.TestCase):
    def test_init(self):
        instance = HTTPieHelpFormatter()
        self.assertEqual(instance.max_help_position, 6)

    def test_split_lines(self):
        instance = HTTPieHelpFormatter()
        text = "text"
        width = 10
        result = instance._split_lines(text, width)
        self.assertEqual(result, ["text"])


class TestHTTPieArgParser(unittest.TestCase):
    def test_init(self):
        instance = HTTPieArgParser()
        self.assertEqual(instance.formatter_class, HTTPieHelpFormatter)

    def test_error(self):
        instance = HTTPieArgParser()
        message = "message"
        result = instance.error(message)
        self.assertEqual(result, None)

    def test_parse_args(self):
        instance = HTTPieArgParser()
        args = ["args"]
        result = instance.parse_args(args)
        self.assertEqual(result, None)

    def test_add_argument(self):
        instance = HTTPieArgParser()
        args = ["args"]
        kwargs = {"kwargs": "kwargs"}
        result = instance.add_argument(*args, **kwargs)
        self.assertEqual(result, None)

    def test_add_arguments(self):
        instance = HTTPieArgParser()
        result = instance.add_arguments()
        self.assertEqual(result, None)

    def test_add_output_options(self):
        instance = HTTPieArgParser()
        result = instance.add_output_options()
        self.assertEqual(result, None)

    def test_add_authentication_options(self):
        instance = HTTPieArgParser()
        result = instance.add_authentication_options()
        self.assertEqual(result, None)

    def test_add_debug_options(self):
        instance = HTTPieArgParser()
        result = instance.add_debug_options()
        self.assertEqual(result, None)

    def test_add_plugins_args(self):
        instance = HTTPieArgParser()
        result = instance.add_plugins_args()
        self.assertEqual(result, None)

    def test_add_session_options(self):
        instance = HTTPieArgParser()
        result = instance.add_session_options()
        self.assertEqual(result, None)

    def test_add_SSL_options(self):
        instance = HTTPieArgParser()
        result = instance.add_SSL_options()
        self.assertEqual(result, None)

    def test_add_legacy_options(self):
        instance = HTTPieArgParser()
        result = instance.add_legacy_options()
        self.assertEqual(result, None)

    def test_add_deprecated_options(self):
        instance = HTTPieArgParser()
        result = instance.add_deprecated_options()
        self.assertEqual(result, None)

    def test_add_request_items_options(self):
        instance = HTTPieArgParser()
        result = instance.add_request_items_options()
        self.assertEqual(result, None)

    def test_add_subparser(self):
        instance = HTTPieArgParser()
        args = ["args"]
        kwargs = {"kwargs": "kwargs"}
        result = instance.add_subparser(*args, **kwargs)
        self.assertEqual(result, None)

    def test_parse_known_args(self):
        instance = HTTPieArgParser()
        args = ["args"]
        namespace = "namespace"
        result = instance.parse_known_args(args, namespace)
        self.assertEqual(result, None)

    def test_parse_known_args_with_namespace(self):
        instance = HTTPieArgParser()
        args = ["args"]
        namespace = "namespace"
        result = instance.parse_known_args(args, namespace)
        self.assertEqual(result, None)

if __name__ == '__main__':
    unittest.main()