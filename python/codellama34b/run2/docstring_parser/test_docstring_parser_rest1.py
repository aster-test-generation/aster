
import unittest
from docstring_parser.rest import *

class TestParse(unittest.TestCase):
    def test_parse(self):
        text = ''
        result = parse(text)
        self.assertEqual(result.short_description, None)
        self.assertEqual(result.long_description, None)
        self.assertEqual(result.blank_after_short_description, False)
        self.assertEqual(result.blank_after_long_description, False)
        self.assertEqual(result.meta, [])

    def test_parse_2(self):
        text = ':param a: b'
        result = parse(text)
        self.assertEqual(result.short_description, None)
        self.assertEqual(result.long_description, None)
        self.assertEqual(result.blank_after_short_description, False)
        self.assertEqual(result.blank_after_long_description, False)
        self.assertEqual(result.meta, [DocstringMeta(args=['param', 'a'], description='b')])

    def test_parse_3(self):
        text = ':param a: b\n:param c: d'
        result = parse(text)
        self.assertEqual(result.short_description, None)
        self.assertEqual(result.long_description, None)
        self.assertEqual(result.blank_after_short_description, False)
        self.assertEqual(result.blank_after_long_description, False)
        self.assertEqual(result.meta, [DocstringMeta(args=['param', 'a'], description='b'), DocstringMeta(args=['param', 'c'], description='d')])

    def test_parse_4(self):
        text = ':param a: b\n:param c: d\n:returns: e'
        result = parse(text)
        self.assertEqual(result.short_description, None)
        self.assertEqual(result.long_description, None)
        self.assertEqual(result.blank_after_short_description, False)
        self.assertEqual(result.blank_after_long_description, False)
        self.assertEqual(result.meta, [DocstringMeta(args=['param', 'a'], description='b'), DocstringMeta(args=['param', 'c'], description='d'), DocstringMeta(args=['returns'], description='e')])

    def test_parse_5(self):
        text = ':param a: b\n:param c: d\n:returns: e\n:raises: f'
        result = parse(text)
        self.assertEqual(result.short_description, None)
        self.assertEqual(result.long_description, None)
        self.assertEqual(result.blank_after_short_description, False)
        self.assertEqual(result.blank_after_long_description, False)
        self.assertEqual(result.meta, [DocstringMeta(args=['param', 'a'], description='b'), DocstringMeta(args=['param', 'c'], description='d'), DocstringMeta(args=['returns'], description='e'), DocstringMeta(args=['raises'], description='f')])

    def test_parse_6(self):
        text = ':param a: b\n:param c: d\n:returns: e\n:raises: f\n:yields: g'
        result = parse(text)
        self.assertEqual(result.short_description, None)
        self.assertEqual(result.long_description, None)
        self.assertEqual(result.blank_after_short_description, False)
        self.assertEqual(result.blank_after_long_description, False)
        self.assertEqual(result.meta, [DocstringMeta(args=['param', 'a'], description='b'), DocstringMeta(args=['param', 'c'], description='d'), DocstringMeta(args=['returns'], description='e'), DocstringMeta(args=['raises'], description='f'), DocstringMeta(args=['yields'], description='g')])

if __name__ == '__main__':
    unittest.main()