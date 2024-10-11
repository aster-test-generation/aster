import unittest
from string_utils import manipulatio


class TestStringCompressor(unittest.TestCase):
    def test_compress(self):
        compressor = __StringCompressor()
        input_string = "Hello, World!"
        result = compressor.compress(input_string)
        self.assertIsInstance(result, str)

    def test_decompress(self):
        compressor = __StringCompressor()
        input_string = "Hello, World!"
        compressed = compressor.compress(input_string)
        result = compressor.decompress(compressed)
        self.assertEqual(result, input_string)

class TestFunctions(unittest.TestCase):
    def test_slugify(self):
        input_string = "Hello, World!"
        result = slugify(input_string)
        self.assertIsInstance(result, str)

    def test_booleanize(self):
        input_string = "True"
        result = booleanize(input_string)
        self.assertTrue(result)

    def test_strip_margin(self):
        input_string = "  Hello, World!  "
        result = strip_margin(input_string)
        self.assertEqual(result, "Hello, World!")

    def test_compress_function(self):
        input_string = "Hello, World!"
        result = compress(input_string)
        self.assertIsInstance(result, str)

    def test_decompress_function(self):
        input_string = "Hello, World!"
        compressed = compress(input_string)
        result = decompress(compressed)
        self.assertEqual(result, input_string)

if __name__ == '__main__':
    unittest.main()