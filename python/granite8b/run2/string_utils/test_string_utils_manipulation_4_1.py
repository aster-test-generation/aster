import unittest
from string_utils.manipulation import camel_case_to_snake


class TestStringCompressor(unittest.TestCase):
    def test_compress(self):
        input_string = "Hello, world!"
        compressed_string = compress(input_string)
        self.assertIsInstance(compressed_string, str)
        self.assertGreater(len(compressed_string), len(input_string))
        decompressed_string = decompress(compressed_string)
        self.assertEqual(decompressed_string, input_string)

    def test_decompress(self):
        input_string = "Hello, world!"
        compressed_string = compress(input_string)
        decompressed_string = decompress(compressed_string)
        self.assertEqual(decompressed_string, input_string)

    def test_invalid_input(self):
        with self.assertRaises(InvalidInputError):
            compress(123)
        with self.assertRaises(InvalidInputError):
            compress(None)
        with self.assertRaises(InvalidInputError):
            compress([])
        with self.assertRaises(InvalidInputError):
            compress({})
        with self.assertRaises(InvalidInputError):
            compress(True)
        with self.assertRaises(InvalidInputError):
            compress(False)

    def test_invalid_encoding(self):
        with self.assertRaises(ValueError):
            compress("Hello, world!", encoding="invalid")
        with self.assertRaises(ValueError):
            decompress("Hello, world!", encoding="invalid")

    def test_invalid_compression_level(self):
        with self.assertRaises(ValueError):
            compress("Hello, world!", compression_level=-1)
        with self.assertRaises(ValueError):
            compress("Hello, world!", compression_level=10)
        with self.assertRaises(ValueError):
            compress("Hello, world!", compression_level="invalid")

if __name__ == '__main__':
    unittest.main()