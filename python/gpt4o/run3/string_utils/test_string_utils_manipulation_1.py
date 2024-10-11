import unittest
from string_utils import manipulation


class TestStringUtilsManipulation(unittest.TestCase):
    def test_reverse_valid_string(self):
        result = reverse("hello")
        self.assertEqual(result, "olleh")

    def test_reverse_invalid_input(self):
        with self.assertRaises(InvalidInputError):
            reverse(123)

    def test_camel_case_to_snake_valid_string(self):
        result = camel_case_to_snake("CamelCaseString")
        self.assertEqual(result, "camel_case_string")

    def test_camel_case_to_snake_invalid_input(self):
        with self.assertRaises(InvalidInputError):
            camel_case_to_snake(123)

    def test_camel_case_to_snake_not_camel_case(self):
        result = camel_case_to_snake("notcamelcase")
        self.assertEqual(result, "notcamelcase")

    def test_snake_case_to_camel_valid_string(self):
        result = snake_case_to_camel("snake_case_string")
        self.assertEqual(result, "SnakeCaseString")

    def test_snake_case_to_camel_invalid_input(self):
        with self.assertRaises(InvalidInputError):
            snake_case_to_camel(123)

    def test_snake_case_to_camel_not_snake_case(self):
        result = snake_case_to_camel("notsnakecase")
        self.assertEqual(result, "notsnakecase")

    def test_snake_case_to_camel_lower_first(self):
        result = snake_case_to_camel("snake_case_string", upper_case_first=False)
        self.assertEqual(result, "snakeCaseString")

    def test_shuffle_valid_string(self):
        input_string = "hello"
        result = shuffle(input_string)
        self.assertNotEqual(result, input_string)
        self.assertEqual(sorted(result), sorted(input_string))

    def test_shuffle_invalid_input(self):
        with self.assertRaises(InvalidInputError):
            shuffle(123)

    def test_strip_html_valid_string(self):
        result = strip_html("<p>Hello</p>")
        self.assertEqual(result, "Hello")

    def test_strip_html_keep_tag_content(self):
        result = strip_html("<p>Hello</p>", keep_tag_content=True)
        self.assertEqual(result, "Hello")

    def test_strip_html_invalid_input(self):
        with self.assertRaises(InvalidInputError):
            strip_html(123)

    def test_prettify_valid_string(self):
        result = prettify("hello")
        self.assertEqual(result, "Hello")

    def test_asciify_valid_string(self):
        result = asciify("café")
        self.assertEqual(result, "cafe")

    def test_asciify_invalid_input(self):
        with self.assertRaises(InvalidInputError):
            asciify(123)

if __name__ == '__main__':
    unittest.main()