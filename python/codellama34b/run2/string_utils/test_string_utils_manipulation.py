import unittest
from string_utils.manipulation import camel_case_to_snake


class TestStringUtilsManipulation(unittest.TestCase):
    def test_camel_case_to_snake(self):
        result = camel_case_to_snake("testCamelCase")
        self.assertEqual(result, "test_camel_case")

    def test_snake_case_to_camel(self):
        result = snake_case_to_camel("test_snake_case")
        self.assertEqual(result, "testSnakeCase")

    def test_reverse(self):
        result = reverse("test")
        self.assertEqual(result, "tset")

    def test_shuffle(self):
        result = shuffle("test")
        self.assertEqual(result, "tset")

    def test_strip_html(self):
        result = strip_html("<html>test</html>")
        self.assertEqual(result, "test")

    def test_prettify(self):
        result = prettify("test")
        self.assertEqual(result, "test")

    def test_asciify(self):
        result = asciify("test")
        self.assertEqual(result, "test")

    def test_slugify(self):
        result = slugify("test")
        self.assertEqual(result, "test")

    def test_booleanize(self):
        result = booleanize("test")
        self.assertEqual(result, True)

    def test_strip_margin(self):
        result = strip_margin("test")
        self.assertEqual(result, "test")

    def test_compress(self):
        result = compress("test")
        self.assertEqual(result, "test")

    def test_decompress(self):
        result = decompress("test")
        self.assertEqual(result, "test")

    def test_roman_encode(self):
        result = roman_encode("test")
        self.assertEqual(result, "test")

    def test_roman_decode(self):
        result = roman_decode("test")
        self.assertEqual(result, "test")

if __name__ == '__main__':
    unittest.main()