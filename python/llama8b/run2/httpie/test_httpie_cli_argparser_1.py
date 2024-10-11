import unittest
from httpie.cli.argparser import HTTPieHelpFormatter, Environment


class TestHTTPieHelpFormatter(unittest.TestCase):
    def test_init(self):
        formatter = HTTPieHelpFormatter()
        self.assertEqual(formatter.max_help_position, 6)

    def test_split_lines(self):
        text = "This is a test text.\nThis is another line."
        formatter = HTTPieHelpFormatter()
        result = formatter._split_lines(text, 10)
        self.assertEqual(len(result), 3)

    def test_split_lines_with_width(self):
        text = "This is a test text.\nThis is another line."
        formatter = HTTPieHelpFormatter(max_help_position=8)
        result = formatter._split_lines(text, 10)
        self.assertEqual(len(result), 3)

class TestEnvironment(unittest.TestCase):
    def test_init(self):
        environment = Environment()
        self.assertEqual(environment.request_type, None)

if __name__ == '__main__':
    unittest.main()