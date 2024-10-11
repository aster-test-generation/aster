import unittest
from string_utils.manipulation import camel_case_to_snake


class TestStringCompressor(unittest.TestCase):
    def test_compress(self):
        input_string = "Hello, World!"
        encoding = "utf-8"
        compression_level = 9
        result = compress(input_string, encoding, compression_level)
        self.assertEqual(result, "Hello, World!")

    def test_decompress(self):
        input_string = "Hello, World!"
        encoding = "utf-8"
        result = decompress(input_string, encoding)
        self.assertEqual(result, "Hello, World!")

class TestStringUtils(unittest.TestCase):
    def test_slugify(self):
        input_string = "Hello, World!"
        separator = "-"
        result = slugify(input_string, separator)
        self.assertEqual(result, "Hello, World!")

    def test_booleanize(self):
        input_string = "Hello, World!"
        result = booleanize(input_string)
        self.assertEqual(result, False)

    def test_strip_margin(self):
        input_string = "Hello, World!"
        result = strip_margin(input_string)
        self.assertEqual(result, "Hello, World!")

if __name__ == '__main__':
    unittest.main()