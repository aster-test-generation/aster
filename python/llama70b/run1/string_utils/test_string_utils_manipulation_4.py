import unittest
from string_utils import camel_case_to_snak


class TestStringFormatter(unittest.TestCase):
    def test_init(self):
        formatter = __StringFormatter("Hello World")
        self.assertEqual(formatter.input_string, "Hello World")

    def test_uppercase_first_char(self):
        formatter = __StringFormatter("hello world")
        result = formatter._StringFormatter__uppercase_first_char("hello")
        self.assertEqual(result, "Hello")

    def test_remove_duplicates(self):
        formatter = __StringFormatter("hello world")
        result = formatter._StringFormatter__remove_duplicates("hello")
        self.assertEqual(result, "helo")

    def test_uppercase_first_letter_after_sign(self):
        formatter = __StringFormatter("hello world")
        result = formatter._StringFormatter__uppercase_first_letter_after_sign("hello.")
        self.assertEqual(result, "hello.")

    def test_ensure_right_space_only(self):
        formatter = __StringFormatter("hello world")
        result = formatter._StringFormatter__ensure_right_space_only("hello ")
        self.assertEqual(result, "hello ")

    def test_ensure_left_space_only(self):
        formatter = __StringFormatter("hello world")
        result = formatter._StringFormatter__ensure_left_space_only(" hello")
        self.assertEqual(result, " hello")

    def test_ensure_spaces_around(self):
        formatter = __StringFormatter("hello world")
        result = formatter._StringFormatter__ensure_spaces_around("hello")
        self.assertEqual(result, " hello ")

    def test_remove_internal_spaces(self):
        formatter = __StringFormatter("hello world")
        result = formatter._StringFormatter__remove_internal_spaces("hello world")
        self.assertEqual(result, "helloworld")

    def test_fix_saxon_genitive(self):
        formatter = __StringFormatter("hello world")
        result = formatter._StringFormatter__fix_saxon_genitive("hello world")
        self.assertEqual(result, "helloworld ")

    def test_placeholder_key(self):
        formatter = __StringFormatter("hello world")
        result = formatter._StringFormatter__placeholder_key()
        self.assertIsInstance(result, str)

    def test_format(self):
        formatter = __StringFormatter("hello world")
        result = formatter.format()
        self.assertEqual(result, "Hello World")

class TestFunctions(unittest.TestCase):
    def test_camel_case_to_snake(self):
        result = camel_case_to_snake("HelloWorld")
        self.assertEqual(result, "hello_world")

    def test_snake_case_to_camel(self):
        result = snake_case_to_camel("hello_world")
        self.assertEqual(result, "HelloWorld")

    def test_reverse(self):
        result = reverse("hello")
        self.assertEqual(result, "olleh")

    def test_shuffle(self):
        result = shuffle("hello")
        self.assertNotEqual(result, "hello")

    def test_strip_html(self):
        result = strip_html("<p>Hello World</p>")
        self.assertEqual(result, "Hello World")

    def test_prettify(self):
        result = prettify("hello world")
        self.assertEqual(result, "Hello World")

    def test_asciify(self):
        result = asciify("hello world")
        self.assertEqual(result, "hello world")

    def test_slugify(self):
        result = slugify("hello world")
        self.assertEqual(result, "hello-world")

    def test_booleanize(self):
        result = booleanize("true")
        self.assertTrue(result)

    def test_strip_margin(self):
        result = strip_margin("  hello world  ")
        self.assertEqual(result, "hello world")

    def test_compress(self):
        result = compress("hello world")
        self.assertIsInstance(result, bytes)

    def test_decompress(self):
        compressed = compress("hello world")
        result = decompress(compressed)
        self.assertEqual(result, "hello world")

    def test_roman_encode(self):
        result = roman_encode(1)
        self.assertEqual(result, "I")

    def test_roman_decode(self):
        result = roman_decode("I")
        self.assertEqual(result, 1)

if __name__ == '__main__':
    unittest.main()