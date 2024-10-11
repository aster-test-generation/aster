import unittest
from string_utils import manipulatio


class TestReverse(unittest.TestCase):
    def test_reverse_string(self):
        result = reverse("hello")
        self.assertEqual(result, "olleh")

    def test_reverse_non_string(self):
        with self.assertRaises(InvalidInputError):
            reverse(123)

class TestCamelCaseToSnake(unittest.TestCase):
    def test_camel_case_to_snake(self):
        result = camel_case_to_snake("helloWorld")
        self.assertEqual(result, "hello_world")

    def test_camel_case_to_snake_with_separator(self):
        result = camel_case_to_snake("helloWorld", separator="-")
        self.assertEqual(result, "hello-world")

    def test_camel_case_to_snake_non_string(self):
        with self.assertRaises(InvalidInputError):
            camel_case_to_snake(123)

class TestSnakeCaseToCamel(unittest.TestCase):
    def test_snake_case_to_camel(self):
        result = snake_case_to_camel("hello_world")
        self.assertEqual(result, "helloWorld")

    def test_snake_case_to_camel_upper_case_first(self):
        result = snake_case_to_camel("hello_world", upper_case_first=False)
        self.assertEqual(result, "helloWorld")

    def test_snake_case_to_camel_non_string(self):
        with self.assertRaises(InvalidInputError):
            snake_case_to_camel(123)

class TestShuffle(unittest.TestCase):
    def test_shuffle_string(self):
        result = shuffle("hello")
        self.assertNotEqual(result, "hello")

    def test_shuffle_non_string(self):
        with self.assertRaises(InvalidInputError):
            shuffle(123)

class TestStripHtml(unittest.TestCase):
    def test_strip_html(self):
        result = strip_html("<p>hello</p>")
        self.assertEqual(result, "hello")

    def test_strip_html_keep_tag_content(self):
        result = strip_html("<p>hello</p>", keep_tag_content=True)
        self.assertEqual(result, "<p>hello</p>")

    def test_strip_html_non_string(self):
        with self.assertRaises(InvalidInputError):
            strip_html(123)

class TestPrettify(unittest.TestCase):
    def test_prettify_string(self):
        result = prettify("hello")
        self.assertEqual(result, "hello")

    def test_prettify_non_string(self):
        with self.assertRaises(InvalidInputError):
            prettify(123)

class TestAsciify(unittest.TestCase):
    def test_asciify_string(self):
        result = asciify("hello")
        self.assertEqual(result, "hello")

    def test_asciify_non_string(self):
        with self.assertRaises(InvalidInputError):
            asciify(123)

if __name__ == '__main__':
    unittest.main()