import unittest
from httpie.cli.argparser import HTTPieHelpFormatter, RequestItems, Environment, ParseError


class TestHTTPieHelpFormatter(unittest.TestCase):
    def test_init(self):
        formatter = HTTPieHelpFormatter()
        self.assertIsInstance(formatter, RawDescriptionHelpFormatter)

    def test_split_lines(self):
        formatter = HTTPieHelpFormatter()
        text = "This is a test string"
        result = formatter._split_lines(text, 80)
        self.assertEqual(result, ["This is a test string", ""])

    def test_private_method__init__(self):
        formatter = HTTPieHelpFormatter()
        result = formatter._HTTPieHelpFormatter__init__()
        self.assertIsNone(result)

class TestRequestItems(unittest.TestCase):
    def test_init(self):
        items = RequestItems()
        self.assertIsInstance(items, list)

    def test_append(self):
        items = RequestItems()
        item = "test item"
        items.append(item)
        self.assertIn(item, items)

    def test_private_method__iter__(self):
        items = RequestItems()
        result = iter(items)
        self.assertIsInstance(result, iter)

class TestEnvironment(unittest.TestCase):
    def test_init(self):
        env = Environment()
        self.assertIsInstance(env, Environment)

    def test_get(self):
        env = Environment()
        key = "TEST_KEY"
        value = "test value"
        env[key] = value
        result = env.get(key)
        self.assertEqual(result, value)

    def test_private_method__getitem__(self):
        env = Environment()
        key = "TEST_KEY"
        value = "test value"
        env[key] = value
        result = env._Environment__getitem__(key)
        self.assertEqual(result, value)

class TestParseError(unittest.TestCase):
    def test_init(self):
        error = ParseError("test error message")
        self.assertIsInstance(error, Exception)

    def test_str(self):
        error = ParseError("test error message")
        result = str(error)
        self.assertEqual(result, "test error message")

    def test_repr(self):
        error = ParseError("test error message")
        result = repr(error)
        self.assertEqual(result, "ParseError('test error message')")

if __name__ == '__main__':
    unittest.main()