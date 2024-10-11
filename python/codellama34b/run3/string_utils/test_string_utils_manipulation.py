import unittest
from string_utils.manipulation import camel_case_to_snake



class TestStringUtilsManipulation(unittest.TestCase):
    def test_camel_case_to_snake(self):
        result = camel_case_to_snake("testString")
        self.assertEqual(result, "test_string")

    def test_snake_case_to_camel(self):
        result = snake_case_to_camel("test_string")
        self.assertEqual(result, "testString")

    def test_reverse(self):
        result = reverse("testString")
        self.assertEqual(result, "gnirtStset")

    def test_shuffle(self):
        result = shuffle("testString")
        self.assertEqual(result, "tsetgString")

    def test_strip_html(self):
        result = strip_html("<p>testString</p>")
        self.assertEqual(result, "testString")

    def test_prettify(self):
        result = prettify("<p>testString</p>")
        self.assertEqual(result, "<p>testString</p>")

    def test_asciify(self):
        result = asciify("testString")
        self.assertEqual(result, "testString")

    def test_slugify(self):
        result = slugify("testString")
        self.assertEqual(result, "test-string")

    def test_booleanize(self):
        result = booleanize("testString")
        self.assertEqual(result, True)

    def test_strip_margin(self):
        result = strip_margin("testString")
        self.assertEqual(result, "testString")

    def test_compress(self):
        result = compress("testString")
        self.assertEqual(result, "testString")

    def test_decompress(self):
        result = decompress("testString")
        self.assertEqual(result, "testString")

    def test_roman_encode(self):
        result = roman_encode("testString")
        self.assertEqual(result, "testString")

if __name__ == '__main__':
    unittest.main()