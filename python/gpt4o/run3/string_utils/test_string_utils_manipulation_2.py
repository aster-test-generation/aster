import unittest
from string_utils.manipulation import camel_case_to_snake


class TestStringUtilsManipulation(unittest.TestCase):
    def test_slugify_valid_string(self):
        result = slugify("Hello World!")
        self.assertEqual(result, "hello-world")

    def test_slugify_invalid_input(self):
        with self.assertRaises(InvalidInputError):
            slugify(123)

    def test_booleanize_true(self):
        result = booleanize("true")
        self.assertTrue(result)

    def test_booleanize_false(self):
        result = booleanize("false")
        self.assertFalse(result)

    def test_booleanize_invalid_input(self):
        with self.assertRaises(InvalidInputError):
            booleanize(123)

    def test_strip_margin(self):
        input_string = "|Hello\n|World"
        result = strip_margin(input_string)
        self.assertEqual(result, "Hello\nWorld")

    def test_strip_margin_invalid_input(self):
        with self.assertRaises(InvalidInputError):
            strip_margin(123)

    def test_compress(self):
        input_string = "Hello World!"
        result = compress(input_string)
        self.assertIsInstance(result, str)

    def test_decompress(self):
        input_string = compress("Hello World!")
        result = decompress(input_string)
        self.assertEqual(result, "Hello World!")

    def test_compress_decompress(self):
        input_string = "Hello World!"
        compressed = compress(input_string)
        decompressed = decompress(compressed)
        self.assertEqual(decompressed, input_string)

    def test_private_compress_method(self):
        input_string = "Hello World!"
        result = __StringCompressor.compress(input_string, 'utf-8', 9)
        self.assertIsInstance(result, str)

    def test_private_decompress_method(self):
        input_string = __StringCompressor.compress("Hello World!", 'utf-8', 9)
        result = __StringCompressor.decompress(input_string, 'utf-8')
        self.assertEqual(result, "Hello World!")

if __name__ == '__main__':
    unittest.main()