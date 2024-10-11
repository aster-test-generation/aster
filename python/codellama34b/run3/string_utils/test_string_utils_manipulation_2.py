import unittest
from string_utils.manipulation import camel_case_to_snake


class TestStringCompressor(unittest.TestCase):
    def test_compress(self):
        result = compress("Hello World")
        self.assertEqual(result, "Hello World")

    def test_decompress(self):
        result = decompress("Hello World")
        self.assertEqual(result, "Hello World")

class TestStringUtils(unittest.TestCase):
    def test_slugify(self):
        result = slugify("Hello World")
        self.assertEqual(result, "Hello World")

    def test_booleanize(self):
        result = booleanize("Hello World")
        self.assertEqual(result, "Hello World")

    def test_strip_margin(self):
        result = strip_margin("Hello World")
        self.assertEqual(result, "Hello World")

if __name__ == '__main__':
    unittest.main()