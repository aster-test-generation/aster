import unittest
from string_utils import manipulatio


class TestStringManipulation(unittest.TestCase):
    def test_reverse(self):
        result = reverse("hello")
        self.assertEqual(result, "olleh")

    def test_camel_case_to_snake(self):
        result = camel_case_to_snake("HelloWorld")
        self.assertEqual(result, "hello_world")

    def test_snake_case_to_camel(self):
        result = snake_case_to_camel("hello_world")
        self.assertEqual(result, "HelloWorld")

    def test_shuffle(self):
        result = shuffle("hello")
        self.assertNotEqual(result, "hello")  # shuffle is random, so we can't assert a specific result

    def test_strip_html(self):
        result = strip_html("<p>Hello, <span>world!</span></p>")
        self.assertEqual(result, "Hello, world!")

    def test_prettify(self):
        result = prettify("Hello, world!")
        self.assertEqual(result, "Hello, world!")  # prettify doesn't change the string in this case

    def test_asciify(self):
        result = asciify("Hëllo, wørld!")
        self.assertEqual(result, "Hello, world!")

    def test_booleanize(self):
        result = booleanize("true")
        self.assertTrue(result)

    def test_strip_margin(self):
        result = strip_margin("  Hello, world!  ")
        self.assertEqual(result, "Hello, world!")

    def test_compress(self):
        result = compress("Hello, world!")
        self.assertIsInstance(result, bytes)

    def test_decompress(self):
        compressed = compress("Hello, world!")
        result = decompress(compressed)
        self.assertEqual(result, "Hello, world!")

    def test_roman_encode(self):
        result = roman_encode(1)
        self.assertEqual(result, "I")

    def test_roman_decode(self):
        result = roman_decode("I")
        self.assertEqual(result, 1)

    def test__StringFormatter_init(self):
        formatter = __StringFormatter("Hello, world!")
        self.assertIsInstance(formatter, __StringFormatter)

    def test__StringFormatter_format(self):
        formatter = __StringFormatter("Hello, world!")
        result = formatter.format()
        self.assertEqual(result, "Hello, world!")

if __name__ == '__main__':
    unittest.main()