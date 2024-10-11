import unittest
from httpie.cli.argparser import HTTPieHelpFormatter

class TestHTTPieHelpFormatter(unittest.TestCase):
    def test_max_help_position(self):
        formatter = HTTPieHelpFormatter(max_help_position=10)
        self.assertEqual(formatter._max_help_position, 10)

    def test_split_lines(self):
        text = """
        This is a test.
        """
        width = 10
        expected = ["This is a", "test."]
        result = HTTPieHelpFormatter._split_lines(text, width)
        self.assertEqual(result, expected)

if __name__ == '__main__':
    unittest.main()