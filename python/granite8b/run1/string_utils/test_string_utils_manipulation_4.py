import unittest
from string_utils.manipulation import camel_case_to_snake


class TestStringFormatter(unittest.TestCase):
    def test_format(self):
        input_string = "This is a test string with {url} and {email} placeholders."
        placeholders = {
            "url": "https://www.example.com",
            "email": "test@example.com"
        }
        expected_output = "This is a test string with https://www.example.com and test@example.com placeholders."
        formatter = __StringFormatter(input_string)
        output = formatter.format()
        self.assertEqual(output, expected_output)

class TestCamelCaseToSnake(unittest.TestCase):
    def test_camel_case_to_snake(self):
        input_string = "camelCaseToSnake"
        expected_output = "camel_case_to_snake"
        output = camel_case_to_snake(input_string)
        self.assertEqual(output, expected_output)

class TestSnakeCaseToCamel(unittest.TestCase):
    def test_snake_case_to_camel(self):
        input_string = "snake_case_to_camel"
        expected_output = "snakeCaseToCamel"
        output = snake_case_to_camel(input_string)
        self.assertEqual(output, expected_output)

class TestReverse(unittest.TestCase):
    def test_reverse(self):
        input_string = "hello world"
        expected_output = "dlrow olleh"
        output = reverse(input_string)
        self.assertEqual(output, expected_output)

class TestShuffle(unittest.TestCase):
    def test_shuffle(self):
        input_string = "hello world"
        expected_output = "dlrow olleh"
        output = shuffle(input_string)
        self.assertEqual(output, expected_output)

class TestStripHtml(unittest.TestCase):
    def test_strip_html(self):
        input_string = "<p>This is a <strong>test</strong> string with <em>HTML</em> tags.</p>"
        expected_output = "This is a test string with HTML tags."
        output = strip_html(input_string)
        self.assertEqual(output, expected_output)

class TestPrettify(unittest.TestCase):
    def test_prettify(self):
        input_string = "This is a test string with {url} and {email} placeholders."
        expected_output = "This is a test string with https://www.example.com and test@example.com placeholders."
        output = prettify(input_string, {"url": "https://www.example.com", "email": "test@example.com"})
        self.assertEqual(output, expected_output)

class TestAsciify(unittest.TestCase):
    def test_asciify(self):
        input_string = "This is a test string with éàèç characters."
        expected_output = "This is a test string with eac characters."
        output = asciify(input_string)
        self.assertEqual(output, expected_output)

class TestSlugify(unittest.TestCase):
    def test_slugify(self):
        input_string = "This is a test string with éàèç characters."
        expected_output = "this-is-a-test-string-with-eac-characters"
        output = slugify(input_string)
        self.assertEqual(output, expected_output)

class TestBooleanize(unittest.TestCase):
    def test_booleanize(self):
        input_string = "This is a test string."
        expected_output = True
        output = booleanize(input_string)
        self.assertEqual(output, expected_output)

class TestStripMargin(unittest.TestCase):
    def test_strip_margin(self):
        input_string = """
        |This is a test string.
        |It has leading spaces on each line.
        |""".strip()
        expected_output = "This is a test string.\nIt has leading spaces on each line."
        output = strip_margin(input_string)
        self.assertEqual(output, expected_output)

class TestCompress(unittest.TestCase):
    def test_compress(self):
        input_string = "This is a test string."
        expected_output = "This is a test string."
        output = compress(input_string)
        self.assertEqual(output, expected_output)


if __name__ == '__main__':
    unittest.main()