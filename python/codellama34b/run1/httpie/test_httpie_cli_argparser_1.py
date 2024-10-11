import unittest
from httpie.cli.argparser import *



class TestHTTPieHelpFormatter(unittest.TestCase):
    def test_init(self):
        instance = HTTPieHelpFormatter()
        self.assertIsInstance(instance, HTTPieHelpFormatter)

    def test_split_lines(self):
        instance = HTTPieHelpFormatter()
        result = instance._split_lines("test", 10)
        self.assertEqual(result, ["test"])

class TestArgparser(unittest.TestCase):
    def test_init(self):
        instance = Argparser()
        self.assertIsInstance(instance, Argparser)

    def test_add_argument(self):
        instance = Argparser()
        instance.add_argument("test")

    def test_add_arguments(self):
        instance = Argparser()
        instance.add_arguments()

    def test_parse_args(self):
        instance = Argparser()
        result = instance.parse_args()
        self.assertIsInstance(result, argparse.Namespace)

    def test_error(self):
        instance = Argparser()
        instance.error("test")

    def test_exit(self):
        instance = Argparser()
        instance.exit(0, "test")

    def test_parse_known_args(self):
        instance = Argparser()
        result = instance.parse_known_args()
        self.assertIsInstance(result, tuple)

    def test_print_help(self):
        instance = Argparser()
        instance.print_help()

    def test_print_usage(self):
        instance = Argparser()
        instance.print_usage()

    def test_print_version(self):
        instance = Argparser()
        instance.print_version()

    def test_set_defaults(self):
        instance = Argparser()
        instance.set_defaults(test="test")

    def test_set_usage(self):
        instance = Argparser()
        instance.set_usage("test")

class TestRequestItems(unittest.TestCase):
    def test_init(self):
        instance = RequestItems()
        self.assertIsInstance(instance, RequestItems)

    def test_add_item(self):
        instance = RequestItems()
        instance.add_item("test", "test")

    def test_add_json_item(self):
        instance = RequestItems()
        instance.add_json_item("test", "test")

    def test_add_file_item(self):
        instance = RequestItems()
        instance.add_file_item("test", "test")

    def test_add_form_file(self):
        instance = RequestItems()
        instance.add_form_file("test", "test")

    def test_add_form_field(self):
        instance = RequestItems()
        instance.add_form_field("test", "test")

    def test_add_file_form_field(self):
        instance = RequestItems()
        instance.add_file_form_field("test", "test")

    def test_add_file_form_file(self):
        instance = RequestItems()
        instance.add_file_form_file("test", "test")

    def test_add_file(self):
        instance = RequestItems()
        instance.add_file("test")

    def test_add_file_from_pipe(self):
        instance = RequestItems()
        instance.add_file_from_pipe("test")

    def test_add_data_from_file(self):
        instance = RequestItems()
        instance.add_data_from_file("test")

    def test_add_data_from_form_file(self):
        instance = RequestItems()
        instance.add_data_from_form_file("test")

    def test_add_data_from_file_field(self):
        instance = RequestItems()
        instance.add_data_from_file_field("test")

if __name__ == '__main__':
    unittest.main()