import unittest
from string_utils import manipulatio


class TestStringUtils(unittest.TestCase):
    def test_slugify(self):
        result = slugify("Hello World")
        self.assertEqual(result, "hello-world")

    def test_booleanize(self):
        result = booleanize("True")
        self.assertTrue(result)
        result = booleanize("false")
        self.assertFalse(result)

    def test_strip_margin(self):
        result = strip_margin("  Hello\n  World")
        self.assertEqual(result, "Hello\nWorld")

    def test_compress(self):
        result = compress("Hello World")
        self.assertIsInstance(result, str)

    def test_decompress(self):
        compressed = compress("Hello World")
        result = decompress(compressed)
        self.assertEqual(result, "Hello World")

    def test_camel_case_to_snake(self):
        result = camel_case_to_snake("HelloWorld")
        self.assertEqual(result, "hello_world")

    def test_snake_case_to_camel(self):
        result = snake_case_to_camel("hello_world")
        self.assertEqual(result, "HelloWorld")

    def test_reverse(self):
        result = reverse("Hello World")
        self.assertEqual(result, "dlroW olleH")

    def test_shuffle(self):
        result = shuffle("Hello World")
        self.assertNotEqual(result, "Hello World")

    def test_strip_html(self):
        result = strip_html("<p>Hello World</p>")
        self.assertEqual(result, "Hello World")

    def test_prettify(self):
        result = prettify("Hello World")
        self.assertEqual(result, "Hello\nWorld")

    def test_asciify(self):
        result = asciify("Hello World")
        self.assertEqual(result, "Hello World")

    def test_is_snake_case(self):
        self.assertTrue(is_snake_case("hello_world"))
        self.assertFalse(is_snake_case("helloWorld"))

    def test_is_full_string(self):
        self.assertTrue(is_full_string("Hello World"))
        self.assertFalse(is_full_string("Hello"))

    def test_is_camel_case(self):
        self.assertTrue(is_camel_case("HelloWorld"))
        self.assertFalse(is_camel_case("hello_world"))

    def test_is_integer(self):
        self.assertFalse(is_integer("Hello World"))
        self.assertTrue(is_integer(123))

    def test_is_string(self):
        self.assertTrue(is_string("Hello World"))
        self.assertFalse(is_string(123))

    def test_roman_encode(self):
        result = roman_encode(123)
        self.assertIsInstance(result, str)

    def test_roman_decode(self):
        result = roman_decode("CXXIII")
        self.assertEqual(result, 123)

if __name__ == '__main__':
    unittest.main()