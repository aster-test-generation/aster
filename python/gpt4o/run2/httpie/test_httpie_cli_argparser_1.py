import unittest
from httpie.cli.definition import HTTPieHelpFormatter


class TestHTTPieHelpFormatter(unittest.TestCase):
    def test_init(self):
        formatter = HTTPieHelpFormatter()
        self.assertEqual(formatter._max_help_position, 6)

    def test_split_lines(self):
        formatter = HTTPieHelpFormatter()
        text = "This is a test text.\nWith multiple lines."
        result = formatter._split_lines(text, 80)
        expected = ["This is a test text.", "With multiple lines.", ""]
        self.assertEqual(result, expected)

    def test_split_lines_empty(self):
        formatter = HTTPieHelpFormatter()
        text = ""
        result = formatter._split_lines(text, 80)
        expected = [""]
        self.assertEqual(result, expected)

    def test_split_lines_single_line(self):
        formatter = HTTPieHelpFormatter()
        text = "Single line text."
        result = formatter._split_lines(text, 80)
        expected = ["Single line text.", ""]
        self.assertEqual(result, expected)

if __name__ == '__main__':
    unittest.main()