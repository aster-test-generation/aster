import unittest
from httpie.cli.argparser import HTTPieHelpFormatter


class TestHTTPieHelpFormatter(unittest.TestCase):
    def test_init(self):
        instance = HTTPieHelpFormatter()
        self.assertEqual(instance.max_help_position, 6)

    def test__split_lines(self):
        instance = HTTPieHelpFormatter()
        text = "This is a test."
        width = 10
        result = instance._split_lines(text, width)
        self.assertEqual(result, ["This is a", "test."])

if __name__ == '__main__':
    unittest.main()