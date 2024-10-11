from string_utils.manipulation import camel_case_to_snake
import unittest
from string_utils.manipulation import *


class TestStringCompressor(unittest.TestCase):
    def test_compress(self):
        input_string = "Hello World"
        encoding = "utf-8"
        compression_level = 9
        result = __StringCompressor.compress(input_string, encoding, compression_level)
        self.assertEqual(result, "eJxLTs1SyVUoJCQ")

    def test_decompress(self):
        input_string = "eJxLTs1SyVUoJCQ"
        encoding = "utf-8"
        result = __StringCompressor.decompress(input_string, encoding)
        self.assertEqual(result, "Hello World")

if __name__ == '__main__':
    unittest.main()