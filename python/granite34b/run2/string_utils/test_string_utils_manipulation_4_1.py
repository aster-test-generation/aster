from string_utils.manipulation import camel_case_to_snake
import unittest
from string_utils.manipulation import __StringCompressor


class Test__StringCompressor(unittest.TestCase):
    def test___require_valid_input_and_encoding(self):
        with self.assertRaises(InvalidInputError):
            __StringCompressor.__require_valid_input_and_encoding(123, 'utf-8')
        with self.assertRaises(ValueError):
            __StringCompressor.__require_valid_input_and_encoding('', 'utf-8')
        with self.assertRaises(ValueError):
            __StringCompressor.__require_valid_input_and_encoding('abc', 123)

    def test_compress(self):
        input_string = 'Hello, world!'
        expected_output = 'eJxzkLEOgzAQRFFRUVF'
        output = __StringCompressor.compress(input_string)
        self.assertEqual(output, expected_output)

    def test_decompress(self):
        input_string = 'eJxzkLEOgzAQRFFRUVF'
        expected_output = 'Hello, world!'
        output = __StringCompressor.decompress(input_string)
        self.assertEqual(output, expected_output)

if __name__ == '__main__':
    unittest.main()