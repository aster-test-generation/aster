import unittest
from string_utils import manipulatio
from string_utils.manipulation import is_string, is_snake_case, is_full_string, is_camel_case, is_integer, is_integer
from string_utils.manipulation import camel_case_to_snake, snake_case_to_camel, reverse, shuffle, strip_html, prettify, asciify, slugify, booleanize, strip_margin, compress, decompress, roman_encode, roman_decode


class TestStringFormatter(unittest.TestCase):
    def test_init(self):
        instance = __StringFormatter("Hello World")
        self.assertEqual(instance.input_string, "Hello World")

    def test_init_invalid_input(self):
        with self.assertRaises(InvalidInputError):
            __StringFormatter(123)

    def test_format(self):
        instance = __StringFormatter("Hello {name}!")
        result = instance.format()
        self.assertEqual(result, "Hello $<uuid4>.hex>!")

    def test_format_placeholder(self):
        instance = __StringFormatter("Hello {name}!")
        result = instance.format()
        self.assertIn("$<uuid4>.hex>", result)

    def test_format_uppercase_first_char(self):
        instance = __StringFormatter("hello world")
        result = instance.format()
        self.assertEqual(result, "Hello World")

    def test_format_remove_duplicates(self):
        instance = __StringFormatter("hellooo world")
        result = instance.format()
        self.assertEqual(result, "hello world")

    def test_format_ensure_right_space_only(self):
        instance = __StringFormatter("hello world")
        result = instance.format()
        self.assertEqual(result, "hello world ")

    def test_format_ensure_left_space_only(self):
        instance = __StringFormatter(" hello world")
        result = instance.format()
        self.assertEqual(result, " hello world")

    def test_format_ensure_spaces_around(self):
        instance = __StringFormatter("hello world")
        result = instance.format()
        self.assertEqual(result, " hello world ")

    def test_format_remove_internal_spaces(self):
        instance = __StringFormatter("hello   world")
        result = instance.format()
        self.assertEqual(result, "hello world")

    def test_format_fix_saxon_genitive(self):
        instance = __StringFormatter("hello world's")
        result = instance.format()
        self.assertEqual(result, "hello world 's")

    def test_format_uppercase_after_sign(self):
        instance = __StringFormatter("hello-world")
        result = instance.format()
        self.assertEqual(result, "hello-World")

    def test_str_method(self):
        instance = __StringFormatter("Hello World")
        result = str(instance)
        self.assertEqual(result, "StringFormatter")

    def test_repr_method(self):
        instance = __StringFormatter("Hello World")
        result = repr(instance)
        self.assertEqual(result, "StringFormatter('Hello World')")

    def test_eq_method(self):
        instance1 = __StringFormatter("Hello World")
        instance2 = __StringFormatter("Hello World")
        self.assertEqual(instance1, instance2)

    def test_ne_method(self):
        instance1 = __StringFormatter("Hello World")
        instance2 = __StringFormatter("Hello World!")
        self.assertNotEqual(instance1, instance2)

if __name__ == '__main__':
    unittest.main()