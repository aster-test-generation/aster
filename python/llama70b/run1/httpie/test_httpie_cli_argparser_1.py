import unittest
from httpie.cli.argparser import HTTPieHelpFormatter, RequestItems, Environment, ParseError


class TestHTTPieHelpFormatter(unittest.TestCase):
    def test_init(self):
        formatter = HTTPieHelpFormatter()
        self.assertIsInstance(formatter, RawDescriptionHelpFormatter)

    def test_split_lines(self):
        formatter = HTTPieHelpFormatter()
        text = "Some help text"
        result = formatter._split_lines(text, 80)
        self.assertEqual(result, ["Some help text", ""])

    def test_max_help_position(self):
        formatter = HTTPieHelpFormatter(max_help_position=10)
        self.assertEqual(formatter.max_help_position, 10)

class TestRequestItems(unittest.TestCase):
    def test_init(self):
        items = RequestItems()
        self.assertIsInstance(items, list)

    def test_append(self):
        items = RequestItems()
        item = "some item"
        items.append(item)
        self.assertIn(item, items)

class TestEnvironment(unittest.TestCase):
    def test_init(self):
        env = Environment()
        self.assertIsInstance(env, Environment)

    def test_get(self):
        env = Environment()
        key = "some_key"
        value = "some_value"
        env[key] = value
        self.assertEqual(env.get(key), value)

class TestParseError(unittest.TestCase):
    def test_init(self):
        error = ParseError("some error message")
        self.assertIsInstance(error, Exception)

    def test_str(self):
        error = ParseError("some error message")
        self.assertEqual(str(error), "some error message")

if __name__ == '__main__':
    unittest.main()