import unittest
from thonny.roughparse import *



class TestRoughParser(unittest.TestCase):
    def test_rough_parse(self):
        result = rough_parse('')
        self.assertEqual(result, '')

    def test_rough_parse_with_text(self):
        result = rough_parse('text')
        self.assertEqual(result, 'text')

    def test_rough_parse_with_text_and_newline(self):
        result = rough_parse('text\n')
        self.assertEqual(result, 'text\n')

    def test_rough_parse_with_text_and_newline_and_indent(self):
        result = rough_parse('text\n    ')
        self.assertEqual(result, 'text\n    ')

    def test_rough_parse_with_text_and_newline_and_indent_and_text(self):
        result = rough_parse('text\n    text')
        self.assertEqual(result, 'text\n    text')

    def test_rough_parse_with_text_and_newline_and_indent_and_text_and_newline(self):
        result = rough_parse('text\n    text\n')
        self.assertEqual(result, 'text\n    text\n')

    def test_rough_parse_with_text_and_newline_and_indent_and_text_and_newline_and_indent(self):
        result = rough_parse('text\n    text\n    ')
        self.assertEqual(result, 'text\n    text\n    ')

    def test_rough_parse_with_text_and_newline_and_indent_and_text_and_newline_and_indent_and_text(self):
        result = rough_parse('text\n    text\n    text')
        self.assertEqual(result, 'text\n    text\n    text')

    def test_rough_parse_with_text_and_newline_and_indent_and_text_and_newline_and_indent_and_text_and_newline(self):
        result = rough_parse('text\n    text\n    text\n')
        self.assertEqual(result, 'text\n    text\n    text\n')

    def test_rough_parse_with_text_and_newline_and_indent_and_text_and_newline_and_indent_and_text_and_newline_and_indent(self):
        result = rough_parse('text\n    text\n    text\n    ')
        self.assertEqual(result, 'text\n    text\n    text\n    ')

    def test_rough_parse_with_text_and_newline_and_indent_and_text_and_newline_and_indent_and_text_and_newline_and_indent_and_text(self):
        result = rough_parse('text\n    text\n    text\n    text')
        self.assertEqual(result, 'text\n    text\n    text\n    text')

    def test_rough_parse_with_text_and_newline_and_indent_and_text_and_newline_and_indent_and_text_and_newline_and_indent_and_text_and_newline(self):
        result = rough_parse('text\n    text\n    text\n    text\n')
        self.assertEqual(result, 'text\n    text\n    text\n    text\n')

    def test_rough_parse_with_text_and_newline_and_indent_and_text_and_newline_and_indent_and_text_and_newline_and_indent_and_text_and_newline_and_indent(self):
        result = rough_parse('text\n    text\n    text\n    text\n    ')
        self.assertEqual(result, 'text\n    text\n    text\n    text\n    ')

if __name__ == '__main__':
    unittest.main()