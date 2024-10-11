import unittest
from string_utils.manipulation import slugify


class TestStringUtilsManipulation(unittest.TestCase):
    def test_reverse(self):
        result = reverse("hello")
        self.assertEqual(result, "olleh")

    def test_camel_case_to_snake(self):
        result = camel_case_to_snake("helloWorld")
        self.assertEqual(result, "hello_world")

    def test_snake_case_to_camel(self):
        result = snake_case_to_camel("hello_world")
        self.assertEqual(result, "helloWorld")

    def test_shuffle(self):
        result = shuffle("hello")
        self.assertEqual(result, "llohe")

    def test_strip_html(self):
        result = strip_html("<html>hello</html>")
        self.assertEqual(result, "hello")

    def test_prettify(self):
        result = prettify("hello")
        self.assertEqual(result, "hello")

    def test_asciify(self):
        result = asciify("hello")
        self.assertEqual(result, "hello")

if __name__ == '__main__':
    unittest.main()