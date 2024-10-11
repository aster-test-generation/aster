import unittest
from ansible.parsing.quoting import *


class TestQuoting(unittest.TestCase):
    def test_is_quoted(self):
        result = is_quoted("'test'")
        self.assertEqual(result, True)

    def test_is_quoted_2(self):
        result = is_quoted('"test"')
        self.assertEqual(result, True)

    def test_is_quoted_3(self):
        result = is_quoted("test")
        self.assertEqual(result, False)

    def test_unquote(self):
        result = unquote("'test'")
        self.assertEqual(result, "test")

    def test_unquote_2(self):
        result = unquote('"test"')
        self.assertEqual(result, "test")

    def test_unquote_3(self):
        result = unquote("test")
        self.assertEqual(result, "test")

if __name__ == '__main__':
    unittest.main()