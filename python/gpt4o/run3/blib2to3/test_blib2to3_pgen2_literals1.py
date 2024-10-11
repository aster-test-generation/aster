import unittest
import re
from blib2to3.pgen2.literals import escape, evalString, simple_escapes

class TestEscapeFunction(unittest.TestCase):
    def test_escape_simple_escape(self):
        match = re.match(r'\\(.)', r'\n')
        result = escape(match)
        self.assertEqual(result, '\n')

    def test_escape_hex_escape(self):
        match = re.match(r'\\(x[0-9A-Fa-f]{2})', r'\x41')
        result = escape(match)
        self.assertEqual(result, 'A')

    def test_escape_invalid_hex_escape(self):
        match = re.match(r'\\(x[0-9A-Fa-f]{0,1})', r'\x')
        with self.assertRaises(ValueError):
            escape(match)

    def test_escape_octal_escape(self):
        match = re.match(r'\\([0-7]{1,3})', r'\101')
        result = escape(match)
        self.assertEqual(result, 'A')

    def test_escape_invalid_octal_escape(self):
        match = re.match(r'\\([0-7]{1,3})', r'\999')
        with self.assertRaises(ValueError):
            escape(match)

class TestEvalStringFunction(unittest.TestCase):
    def test_evalString_single_quotes(self):
        result = evalString("'hello\\nworld'")
        self.assertEqual(result, 'hello\nworld')

    def test_evalString_double_quotes(self):
        result = evalString('"hello\\nworld"')
        self.assertEqual(result, 'hello\nworld')

    def test_evalString_triple_single_quotes(self):
        result = evalString("'''hello\\nworld'''")
        self.assertEqual(result, 'hello\nworld')

    def test_evalString_triple_double_quotes(self):
        result = evalString('"""hello\\nworld"""')
        self.assertEqual(result, 'hello\nworld')

    def test_evalString_invalid_start(self):
        with self.assertRaises(AssertionError):
            evalString("hello")

    def test_evalString_invalid_end(self):
        with self.assertRaises(AssertionError):
            evalString("'hello")

class TestSimpleEscapesDict(unittest.TestCase):
    def test_simple_escapes(self):
        self.assertEqual(simple_escapes['n'], '\n')
        self.assertEqual(simple_escapes['t'], '\t')
        self.assertEqual(simple_escapes['\\'], '\\')

if __name__ == '__main__':
    unittest.main()