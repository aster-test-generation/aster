import unittest
from httpie.cli.argparser import HTTPieHelpFormatter, RequestItems, Environment, ParseError


class TestHTTPieHelpFormatter(unittest.TestCase):
    def test_init(self):
        formatter = HTTPieHelpFormatter()
        self.assertIsInstance(formatter, RawDescriptionHelpFormatter)

    def test_split_lines(self):
        formatter = HTTPieHelpFormatter()
        text = "Hello\nWorld"
        result = formatter._split_lines(text, 10)
        self.assertEqual(result, ["Hello", "World", "", ""])

class TestRequestItems(unittest.TestCase):
    def test_init(self):
        items = RequestItems()
        self.assertIsInstance(items, list)

    def test_add_item(self):
        items = RequestItems()
        item = "key=value"
        items.add_item(item)
        self.assertEqual(items, [item])

class TestEnvironment(unittest.TestCase):
    def test_init(self):
        env = Environment()
        self.assertIsInstance(env, Environment)

    def test_get_content_type(self):
        env = Environment()
        result = env.get_content_type("application/json")
        self.assertEqual(result, "application/json")

class TestParseError(unittest.TestCase):
    def test_init(self):
        error = ParseError("Error message")
        self.assertIsInstance(error, Exception)

    def test_str(self):
        error = ParseError("Error message")
        result = str(error)
        self.assertEqual(result, "Error message")

if __name__ == '__main__':
    unittest.main()