import unittest
from string_utils.manipulation import camel_case_to_snake
from string_utils.errors import InvalidInputError


class TestStringCompressor(unittest.TestCase):
    def test_init(self):
        instance = __StringCompressor()
        self.assertIsInstance(instance, __StringCompressor)

    def test_private_require_valid_input_and_encoding_valid(self):
        instance = __StringCompressor()
        instance._StringCompressor__require_valid_input_and_encoding("test", "utf-8")
        # No assertion needed as we are just checking that no exception is raised

    def test_private_require_valid_input_and_encoding_invalid_input_string(self):
        instance = __StringCompressor()
        with self.assertRaises(InvalidInputError):
            instance._StringCompressor__require_valid_input_and_encoding(123, "utf-8")

    def test_private_require_valid_input_and_encoding_empty_input_string(self):
        instance = __StringCompressor()
        with self.assertRaises(ValueError):
            instance._StringCompressor__require_valid_input_and_encoding("", "utf-8")

    def test_private_require_valid_input_and_encoding_invalid_encoding(self):
        instance = __StringCompressor()
        with self.assertRaises(ValueError):
            instance._StringCompressor__require_valid_input_and_encoding("test", 123)

    def test_compress_valid(self):
        result = __StringCompressor.compress("test", "utf-8", 9)
        self.assertIsInstance(result, str)

    def test_compress_invalid_compression_level(self):
        with self.assertRaises(ValueError):
            __StringCompressor.compress("test", "utf-8", 10)

    def test_compress_invalid_compression_level_type(self):
        with self.assertRaises(ValueError):
            __StringCompressor.compress("test", "utf-8", "high")

    def test_decompress_valid(self):
        compressed = __StringCompressor.compress("test", "utf-8", 9)
        result = __StringCompressor.decompress(compressed, "utf-8")
        self.assertEqual(result, "test")

    def test_decompress_invalid_input_string(self):
        with self.assertRaises(ValueError):
            __StringCompressor.decompress("", "utf-8")

if __name__ == '__main__':
    unittest.main()