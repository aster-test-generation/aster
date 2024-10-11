import unittest
from string_utils.manipulation import camel_case_to_snake


class TestSlugify(unittest.TestCase):
    def test_slugify_with_default_separator(self):
        input_string = "Hello World!"
        expected_output = "hello-world"
        actual_output = slugify(input_string)
        self.assertEqual(actual_output, expected_output)

    def test_slugify_with_custom_separator(self):
        input_string = "Hello World!"
        expected_output = "hello_world"
        actual_output = slugify(input_string, separator="_")
        self.assertEqual(actual_output, expected_output)

    def test_slugify_with_invalid_input(self):
        input_string = 123
        with self.assertRaises(InvalidInputError):
            slugify(input_string)

class TestBooleanize(unittest.TestCase):
    def test_booleanize_with_true_values(self):
        true_values = ["true", "1", "yes", "y"]
        for value in true_values:
            self.assertTrue(booleanize(value))

    def test_booleanize_with_false_values(self):
        false_values = ["false", "0", "no", "n"]
        for value in false_values:
            self.assertFalse(booleanize(value))

    def test_booleanize_with_invalid_input(self):
        input_string = 123
        with self.assertRaises(InvalidInputError):
            booleanize(input_string)

class TestStripMargin(unittest.TestCase):
    def test_strip_margin_with_default_line_separator(self):
        input_string = "Hello\n  World!"
        expected_output = "Hello\nWorld!"
        actual_output = strip_margin(input_string)
        self.assertEqual(actual_output, expected_output)

    def test_strip_margin_with_custom_line_separator(self):
        input_string = "Hello|n  World!"
        expected_output = "Hello\nWorld!"
        actual_output = strip_margin(input_string, line_separator="|n")
        self.assertEqual(actual_output, expected_output)

    def test_strip_margin_with_invalid_input(self):
        input_string = 123
        with self.assertRaises(InvalidInputError):
            strip_margin(input_string)

class TestCompress(unittest.TestCase):
    def test_compress_with_default_encoding_and_compression_level(self):
        input_string = "Hello World!"
        expected_output = "SGVsbG8gV29ybGQh"
        actual_output = compress(input_string)
        self.assertEqual(actual_output, expected_output)

    def test_compress_with_custom_encoding_and_compression_level(self):
        input_string = "Hello World!"
        expected_output = "SGVsbG8gV29ybGQh"
        actual_output = compress(input_string, encoding="utf-8", compression_level=9)
        self.assertEqual(actual_output, expected_output)

    def test_compress_with_invalid_input(self):
        input_string = 123
        with self.assertRaises(InvalidInputError):
            compress(input_string)

class TestDecompress(unittest.TestCase):
    def test_decompress_with_default_encoding(self):
        input_string = "SGVsbG8gV29ybGQh"
        expected_output = "Hello World!"
        actual_output = decompress(input_string)
        self.assertEqual(actual_output, expected_output)

    def test_decompress_with_custom_encoding(self):
        input_string = "SGVsbG8gV29ybGQh"
        expected_output = "Hello World!"
        actual_output = decompress(input_string, encoding="utf-8")
        self.assertEqual(actual_output, expected_output)

    def test_decompress_with_invalid_input(self):
        input_string = 123
        with self.assertRaises(InvalidInputError):
            decompress(input_string)

if __name__ == '__main__':
    unittest.main()