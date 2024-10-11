from string_utils import manipulatio
import unittest
from string_utils.manipulation import __StringCompressor


class TestStringCompressor(unittest.TestCase):
    def test_compress(self):
        compressor = __StringCompressor()
        input_string = "Hello, World!"
        encoding = 'utf-8'
        compression_level = 9
        result = compressor.compress(input_string, encoding, compression_level)
        self.assertIsInstance(result, str)

    def test_decompress(self):
        compressor = __StringCompressor()
        input_string = "Hello, World!"
        encoding = 'utf-8'
        compressed_string = compressor.compress(input_string, encoding)
        result = compressor.decompress(compressed_string, encoding)
        self.assertEqual(result, input_string)

    def test_require_valid_input_and_encoding(self):
        compressor = __StringCompressor()
        input_string = "Hello, World!"
        encoding = 'utf-8'
        with self.assertRaises(InvalidInputError):
            compressor.__require_valid_input_and_encoding(None, encoding)
        with self.assertRaises(InvalidInputError):
            compressor.__require_valid_input_and_encoding(input_string, None)
        with self.assertRaises(ValueError):
            compressor.__require_valid_input_and_encoding(input_string, "invalid_encoding")

    def test_compress_invalid_input(self):
        compressor = __StringCompressor()
        with self.assertRaises(InvalidInputError):
            compressor.compress(None, 'utf-8', 9)
        with self.assertRaises(InvalidInputError):
            compressor.compress("", 'utf-8', 9)

    def test_decompress_invalid_input(self):
        compressor = __StringCompressor()
        with self.assertRaises(InvalidInputError):
            compressor.decompress(None, 'utf-8')
        with self.assertRaises(InvalidInputError):
            compressor.decompress("", 'utf-8')

    def test_compress_invalid_compression_level(self):
        compressor = __StringCompressor()
        with self.assertRaises(ValueError):
            compressor.compress("Hello, World!", 'utf-8', -1)
        with self.assertRaises(ValueError):
            compressor.compress("Hello, World!", 'utf-8', 10)

    def test_init(self):
        compressor = __StringCompressor()
        self.assertIsInstance(compressor, __StringCompressor)

if __name__ == '__main__':
    unittest.main()