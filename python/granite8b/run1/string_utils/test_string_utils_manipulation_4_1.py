import unittest
from string_utils.manipulation import camel_case_to_snake


class TestStringManipulation(unittest.TestCase):
    def test_compress(self):
        input_string = "Hello, world!"
        compressed_string = compress(input_string)
        self.assertIsInstance(compressed_string, str)
        self.assertNotEqual(compressed_string, input_string)
        self.assertEqual(decompress(compressed_string), input_string)

    def test_decompress(self):
        input_string = "Hello, world!"
        compressed_string = compress(input_string)
        self.assertEqual(decompress(compressed_string), input_string)

    def test_invalid_input(self):
        with self.assertRaises(InvalidInputError):
            compress(123)

    def test_invalid_encoding(self):
        with self.assertRaises(ValueError):
            compress("Hello, world!", encoding="invalid")

    def test_invalid_compression_level(self):
        with self.assertRaises(ValueError):
            compress("Hello, world!", compression_level=10)

if __name__ == '__main__':
    unittest.main()