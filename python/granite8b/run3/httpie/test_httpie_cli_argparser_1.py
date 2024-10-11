import unittest
from httpie.cli.argparser import HTTPieHelpFormatter


class TestHTTPieHelpFormatter(unittest.TestCase):
    def test_max_help_position(self):
        formatter = HTTPieHelpFormatter(max_help_position=10)
        self.assertEqual(formatter.max_help_position, 10)

    def test_split_lines(self):
        formatter = HTTPieHelpFormatter()
        text = "This is a test."
        width = 10
        result = formatter._split_lines(text, width)
        self.assertEqual(result, ["This is a", "test."])

if __name__ == '__main__':
    unittest.main()