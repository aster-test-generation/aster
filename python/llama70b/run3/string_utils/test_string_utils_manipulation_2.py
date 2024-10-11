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
        input_string = "  Hello, World!\n  Foo Bar"
        result = strip_margin(input_string)
        self.assertEqual(result, "Hello, World!\nFoo Bar")

    def test_compress_function(self):
        input_string = "Hello, World!"
        result = compress(input_string)
        self.assertIsInstance(result, str)

    def test_decompress_function(self):
        input_string = "Hello, World!"
        compressed = compress(input_string)
        result = decompress(compressed)
        self.assertEqual(result, input_string)

class TestPrivateMethods(unittest.TestCase):
    def test__StringCompressor__init__(self):
        compressor = __StringCompressor()
        self.assertIsInstance(compressor, __StringCompressor)

    def test__StringCompressor__str__(self):
        compressor = __StringCompressor()
        result = compressor.__str__()
        self.assertIsInstance(result, str)

    def test__StringCompressor__repr__(self):
        compressor = __StringCompressor()
        result = compressor.__repr__()
        self.assertIsInstance(result, str)

if __name__ == '__main__':
    unittest.main()