import unittest
from docstring_parser.parser import parse



class TestParse(unittest.TestCase):
    def test_parse(self):
        text = "test"
        style = Style.default
        result = parse(text, style)
        self.assertIsInstance(result, Docstring)

    def test_parse_with_style(self):
        text = "test"
        style = Style.auto
        result = parse(text, style)
        self.assertIsInstance(result, Docstring)

    def test_parse_with_style_auto(self):
        text = "test"
        style = Style.auto
        result = parse(text, style)
        self.assertIsInstance(result, Docstring)

    def test_parse_with_style_google(self):
        text = "test"
        style = styles.Style.google
        result = parse(text, style)
        self.assertIsInstance(result, Docstring)

    def test_parse_with_style_numpy(self):
        text = "test"
        style = Styler.numpy
        result = parse(text, style)
        self.assertIsInstance(result, Docstring)

    def test_parse_with_style_rest(self):
        text = "test"
        style = styles.Style.rest
        result = parse(text, style)
        self.assertIsInstance(result, Docstring)

    def test_parse_with_style_rest_invalid(self):
        text = "test"
        style = Style.REST_INVALID
        result = parse(text, style)
        self.assertIsInstance(result, Docstring)

    def test_parse_with_style_rest_invalid_invalid(self):
        text = "test"
        style = Style.rest_invalid_invalid
        result = parse(text, style)
        self.assertIsInstance(result, Docstring)

    def test_parse_with_style_rest_invalid_invalid_invalid(self):
        text = "test"
        style = Style.rest_invalid_invalid_invalid
        result = parse(text, style)
        self.assertIsInstance(result, Docstring)

    def test_parse_with_style_rest_invalid_invalid_invalid_invalid(self):
        text = "test"
        style = Style.rest_invalid_invalid_invalid_invalid
        result = parse(text, style)
        self.assertIsInstance(result, Docstring)

    def test_parse_with_style_rest_invalid_invalid_invalid_invalid_invalid(self):
        text = "test"
        style = Style.rest_invalid_invalid_invalid_invalid_invalid
        result = parse(text, style)
        self.assertIsInstance(result, Docstring)

    def test_parse_with_style_rest_invalid_invalid_invalid_invalid_invalid_invalid(self):
        text = "test"
        style = Style.rest_invalid_invalid_invalid_invalid_invalid_invalid
        result = parse(text, style)
        self.assertIsInstance(result, Docstring)

    def test_parse_with_style_rest_invalid_invalid_invalid_invalid_invalid_invalid_invalid(self):
        text = "test"
        style = Style.rest_invalid_invalid_invalid_invalid_invalid_invalid_invalid
        result = parse(text, style)
        self.assertIsInstance(result, Docstring)

    def test_parse_with_style_rest_invalid_invalid_invalid_invalid_invalid_invalid_invalid_invalid(self):
        text = "test"
        style = Style.rest_invalid_invalid_invalid_invalid_invalid_invalid_invalid_invalid
        result = parse(text, style)
        self.assertIsInstance(result, Docstring)

    def test_parse_with_style_rest_invalid_invalid_invalid_invalid_invalid_invalid_invalid_invalid_invalid(self):
        text = "test"
        style = Style.rest_invalid_invalid_invalid_invalid_invalid_invalid_invalid_invalid_invalid
        result = parse(text, style)
        self.assertIsInstance(result, Docstring)

if __name__ == '__main__':
    unittest.main()