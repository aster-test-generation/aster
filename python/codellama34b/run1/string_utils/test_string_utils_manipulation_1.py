import unittest
from string_utils.manipulation import slugify


class TestCamelCaseToSnake(unittest.TestCase):
    def test_camel_case_to_snake(self):
        result = camel_case_to_snake("testCamelCase")
        self.assertEqual(result, "test_camel_case")

    def test_camel_case_to_snake_with_separator(self):
        result = camel_case_to_snake("testCamelCase", "-")
        self.assertEqual(result, "test-camel-case")

    def test_camel_case_to_snake_with_invalid_input(self):
        with self.assertRaises(InvalidInputError):
            camel_case_to_snake(123)

class TestSnakeCaseToCamel(unittest.TestCase):
    def test_snake_case_to_camel(self):
        result = snake_case_to_camel("test_snake_case")
        self.assertEqual(result, "testSnakeCase")

    def test_snake_case_to_camel_with_upper_case_first(self):
        result = snake_case_to_camel("test_snake_case", upper_case_first=False)
        self.assertEqual(result, "testSnakeCase")

    def test_snake_case_to_camel_with_separator(self):
        result = snake_case_to_camel("test-snake-case", separator="-")
        self.assertEqual(result, "testSnakeCase")

    def test_snake_case_to_camel_with_invalid_input(self):
        with self.assertRaises(InvalidInputError):
            snake_case_to_camel(123)

class TestReverse(unittest.TestCase):
    def test_reverse(self):
        result = reverse("test")
        self.assertEqual(result, "tset")

    def test_reverse_with_invalid_input(self):
        with self.assertRaises(InvalidInputError):
            reverse(123)

class TestShuffle(unittest.TestCase):
    def test_shuffle(self):
        result = shuffle("test")
        self.assertEqual(result, "tset")

    def test_shuffle_with_invalid_input(self):
        with self.assertRaises(InvalidInputError):
            shuffle(123)

class TestStripHtml(unittest.TestCase):
    def test_strip_html(self):
        result = strip_html("<html>test</html>")
        self.assertEqual(result, "test")

    def test_strip_html_with_keep_tag_content(self):
        result = strip_html("<html>test</html>", keep_tag_content=True)
        self.assertEqual(result, "test")

    def test_strip_html_with_invalid_input(self):
        with self.assertRaises(InvalidInputError):
            strip_html(123)

class TestPrettify(unittest.TestCase):
    def test_prettify(self):
        result = prettify("test")
        self.assertEqual(result, "test")

    def test_prettify_with_invalid_input(self):
        with self.assertRaises(InvalidInputError):
            prettify(123)

class TestAsciify(unittest.TestCase):
    def test_asciify(self):
        result = asciify("test")
        self.assertEqual(result, "test")

    def test_asciify_with_invalid_input(self):
        with self.assertRaises(InvalidInputError):
            asciify(123)

if __name__ == '__main__':
    unittest.main()