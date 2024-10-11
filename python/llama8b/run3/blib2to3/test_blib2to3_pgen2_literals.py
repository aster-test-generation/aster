import re
import unittest
from blib2to3.pgen2.literals import escape, evalString


class TestEscape(unittest.TestCase):
    def test_escape(self):
        result = escape(re.escape("\\a"))
        self.assertEqual(result, "\a")

    def test_escape_hex(self):
        result = escape(re.escape("\\x1a"))
        self.assertEqual(result, "\x1a")

    def test_escape_octal(self):
        result = escape(re.escape("\\012"))
        self.assertEqual(result, "\012")

    def test_escape_invalid_hex(self):
        with self.assertRaises(ValueError):
            escape(re.escape("\\x"))

    def test_escape_invalid_octal(self):
        with self.assertRaises(ValueError):
            escape(re.escape("\\0123"))

class TestEvalString(unittest.TestCase):
    def test_eval_string(self):
        result = evalString("'hello'")
        self.assertEqual(result, "hello")

    def test_eval_string_escape(self):
        result = evalString("'hello\\nworld'")
        self.assertEqual(result, "hello\nworld")

    def test_eval_string_escape_hex(self):
        result = evalString("'hello\\x1aworld'")
        self.assertEqual(result, "hello\x1aworld")

    def test_eval_string_escape_octal(self):
        result = evalString("'hello\\012world'")
        self.assertEqual(result, "hello\012world")

    def test_eval_string_invalid_escape(self):
        with self.assertRaises(ValueError):
            evalString("'hello\\x'")

if __name__ == '__main__':
    unittest.main()