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

    def test_strip_margin_valid_string(self):
        input_string = "|Hello\n|World"
        result = strip_margin(input_string)
        self.assertEqual(result, "Hello\nWorld")

    def test_strip_margin_invalid_input(self):
        with self.assertRaises(InvalidInputError):
            strip_margin(123)

    def test_compress_valid_string(self):
        result = compress("Hello World!")
        self.assertIsInstance(result, str)

    def test_decompress_valid_string(self):
        compressed_string = compress("Hello World!")
        result = decompress(compressed_string)
        self.assertEqual(result, "Hello World!")

    def test_compress_decompress_cycle(self):
        original_string = "Hello World!"
        compressed_string = compress(original_string)
        decompressed_string = decompress(compressed_string)
        self.assertEqual(decompressed_string, original_string)

    def test_compress_invalid_input(self):
        with self.assertRaises(TypeError):
            compress(123)

    def test_decompress_invalid_input(self):
        with self.assertRaises(TypeError):
            decompress(123)

if __name__ == '__main__':
    unittest.main()