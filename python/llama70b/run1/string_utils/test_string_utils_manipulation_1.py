import unittest
from string_utils import manipulatio


class TestStringManipulation(unittest.TestCase):
    def test_reverse(self):
        result = reverse("hello")
        self.assertEqual(result, "olleh")

    def test_camel_case_to_snake(self):
        result = camel_case_to_snake("CamelCase")
        self.assertEqual(result, "camel_case")

    def test_snake_case_to_camel(self):
        result = snake_case_to_camel("snake_case")
        self.assertEqual(result, "SnakeCase")

    def test_shuffle(self):
        result = shuffle("hello")
        self.assertNotEqual(result, "hello")  # shuffle is random, so we can't assert a specific result

    def test_strip_html(self):
        result = strip_html("<p>Hello, <span>world!</span></p>")
        self.assertEqual(result, "Hello, world!")

    def test_prettify(self):
        result = prettify("hello\nworld")
        self.assertEqual(result, "hello world")

    def test_asciify(self):
        result = asciify(" café ")
        self.assertEqual(result, "cafe ")

    def test_compress(self):
        result = compress("hello")
        self.assertIsInstance(result, bytes)

    def test_decompress(self):
        compressed = compress("hello")
        result = decompress(compressed)
        self.assertEqual(result, "hello")

    def test_roman_encode(self):
        result = roman_encode(1)
        self.assertEqual(result, "I")

    def test_roman_decode(self):
        result = roman_decode("I")
        self.assertEqual(result, 1)

    def test_booleanize(self):
        result = booleanize("true")
        self.assertTrue(result)

    def test_strip_margin(self):
        result = strip_margin("  hello\n  world")
        self.assertEqual(result, "hello\nworld")

    def test___init___StringFormatter(self):
        formatter = __StringFormatter("hello")
        self.assertIsInstance(formatter, __StringFormatter)

    def test___str___StringFormatter(self):
        formatter = __StringFormatter("hello")
        result = str(formatter)
        self.assertEqual(result, "hello")

    def test___repr___StringFormatter(self):
        formatter = __StringFormatter("hello")
        result = repr(formatter)
        self.assertEqual(result, "__StringFormatter('hello')")

if __name__ == '__main__':
    unittest.main()