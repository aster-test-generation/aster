import unittest
from string_utils import manipulatio


class TestStringUtils(unittest.TestCase):
    def test_reverse(self):
        result = reverse("hello")
        self.assertEqual(result, "olleh")

    def test_camel_case_to_snake(self):
        result = camel_case_to_snake("helloWorld")
        self.assertEqual(result, "hello_world")

    def test_snake_case_to_camel(self):
        result = snake_case_to_camel("hello_world", upper_case_first=True)
        self.assertEqual(result, "HelloWorld")

    def test_shuffle(self):
        result = shuffle("hello")
        self.assertNotEqual(result, "hello")

    def test_strip_html(self):
        result = strip_html("<p>hello</p>")
        self.assertEqual(result, "hello")

    def test_prettify(self):
        result = prettify("hello")
        self.assertEqual(result, "hello")

    def test_asciify(self):
        result = asciify("hello")
        self.assertEqual(result, "hello")

    def test_is_string(self):
        self.assertTrue(is_string("hello"))
        self.assertFalse(is_string(123))

    def test_is_snake_case(self):
        self.assertTrue(is_snake_case("hello_world"))
        self.assertFalse(is_snake_case("helloWorld"))

    def test_is_camel_case(self):
        self.assertTrue(is_camel_case("helloWorld"))
        self.assertFalse(is_camel_case("hello_world"))

    def test_is_integer(self):
        self.assertTrue(is_integer(123))
        self.assertFalse(is_integer("hello"))

    def test_is_full_string(self):
        self.assertTrue(is_full_string("hello"))
        self.assertFalse(is_full_string(123))

    def test_compression(self):
        input_string = "hello"
        compressed = compress(input_string)
        decompressed = decompress(compressed)
        self.assertEqual(input_string, decompressed)

    def test_roman_encode(self):
        result = roman_encode(123)
        self.assertEqual(result, "CXXIII")

    def test_roman_decode(self):
        result = roman_decode("CXXIII")
        self.assertEqual(result, 123)

    def test_slugify(self):
        result = slugify("hello world")
        self.assertEqual(result, "hello-world")

    def test_booleanize(self):
        result = booleanize(True)
        self.assertTrue(result)

    def test_strip_margin(self):
        result = strip_margin("    hello")
        self.assertEqual(result, "hello")

    def test_compress(self):
        input_string = "hello"
        compressed = compress(input_string)
        self.assertIsInstance(compressed, bytes)

    def test_decompress(self):
        input_string = "hello"
        compressed = compress(input_string)
        decompressed = decompress(compressed)
        self.assertEqual(input_string, decompressed)

if __name__ == '__main__':
    unittest.main()