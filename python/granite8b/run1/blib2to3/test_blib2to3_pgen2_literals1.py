import unittest
from blib2to3.pgen2.literals import escape, evalString

class TestEscape(unittest.TestCase):
    def test_simple_escapes(self):
        for char, escaped in simple_escapes.items():
            self.assertEqual(escape(rf"\{char}"), escaped)

    def test_invalid_hex_escape(self):
        with self.assertRaises(ValueError):
            escape(r"\x")

    def test_invalid_octal_escape(self):
        with self.assertRaises(ValueError):
            escape(r"\7")

class TestEvalString(unittest.TestCase):
    def test_simple_strings(self):
        self.assertEqual(evalString("'a'"), "a")
        self.assertEqual(evalString('"b"'), "b")

    def test_triple_quoted_strings(self):
        self.assertEqual(evalString("'''c'''"), "c")
        self.assertEqual(evalString('"""d"""'), "d")

    def test_unicode_escapes(self):
        self.assertEqual(evalString(r"'\u0061'"), "a")
        self.assertEqual(evalString(r"'\U00010000'"), "\U00010000")

    def test_octal_escapes(self):
        self.assertEqual(evalString(r"'\101'"), "A")
        self.assertEqual(evalString(r"'\777'"), "\777")

    def test_invalid_unicode_escape(self):
        with self.assertRaises(ValueError):
            evalString(r"'\u00000'")

if __name__ == '__main__':
    unittest.main()