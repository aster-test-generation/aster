import unittest
from tornado.escape import *


class TestXhtmlEscape(unittest.TestCase):
    def test_xhtml_escape_str(self):
        self.assertEqual(xhtml_escape("hello"), "hello")

    def test_xhtml_escape_bytes(self):
        self.assertEqual(xhtml_escape(b"hello"), "hello")

    def test_xhtml_escape_dict(self):
        self.assertEqual(xhtml_escape(dict(a=1)), '&lt;a=1&gt;')

class TestJsonEncode(unittest.TestCase):
    def test_json_encode_dict(self):
        self.assertEqual(json_encode({"a": 1}), '{"a": 1}')

    def test_json_encode_list(self):
        self.assertEqual(json_encode([1, 2, 3]), "[1, 2, 3]")

    def test_json_encode_str(self):
        self.assertEqual(json_encode("hello"), '"hello"')

class TestSqueeze(unittest.TestCase):
    def test_squeeze_str(self):
        self.assertEqual(squeeze("hello world"), "hello world")

    def test_squeeze_bytes(self):
        self.assertEqual(squeeze(b"hello world"), b"hello world")

    def test_squeeze_unicode(self):
        self.assertEqual(squeeze(u"hello world"), "hello world")

class TestUrlEscape(unittest.TestCase):
    def test_url_escape_str(self):
        self.assertEqual(url_escape("hello"), "hello")

    def test_url_escape_bytes(self):
        self.assertEqual(url_escape(b"hello"), "hello")

    def test_url_escape_dict(self):
        self.assertEqual(url_escape({"a": 1}), "%7B%22a%22%3A+1%7D")

class TestUrlUnescape(unittest.TestCase):
    def test_url_unescape_str(self):
        self.assertEqual(url_unescape("hello"), "hello")

    def test_url_unescape_bytes(self):
        self.assertEqual(url_unescape(b"hello"), "hello")

    def test_url_unescape_dict(self):
        self.assertEqual(url_unescape("%7B%22a%22%3A+1%7D"), '{"a": 1}')

class TestParseQSBytes(unittest.TestCase):
    def test_parse_qs_bytes_str(self):
        self.assertEqual(parse_qs_bytes("a=1&b=2"), {"a": [b"1"], "b": [b"2"]})

    def test_parse_qs_bytes_bytes(self):
        self.assertEqual(parse_qs_bytes(b"a=1&b=2"), {"a": [b"1"], "b": [b"2"]})

    def test_parse_qs_bytes_dict(self):
        self.assertEqual(parse_qs_bytes({"a": 1}), {"a": ["1"]})

class TestUtf8(unittest.TestCase):
    def test_utf8_str(self):
        self.assertEqual(utf8("hello"), b"hello")

    def test_utf8_bytes(self):
        self.assertEqual(utf8(b"hello"), b"hello")

    def test_utf8_none(self):
        self.assertEqual(utf8(None), None)

class TestToUnicode(unittest.TestCase):
    def test_to_unicode_str(self):
        self.assertEqual(to_unicode("hello"), "hello")

    def test_to_unicode_bytes(self):
        self.assertEqual(to_unicode(b"hello"), "hello")

    def test_to_unicode_none(self):
        self.assertEqual(to_unicode(None), None)

class TestRecursiveUnicode(unittest.TestCase):
    def test_recursive_unicode_dict(self):
        self.assertEqual(recursive_unicode({"a": 1}), {"a": 1})

    def test_recursive_unicode_list(self):
        self.assertEqual(recursive_unicode([1, 2, 3]), [1, 2, 3])

    def test_recursive_unicode_bytes(self):
        self.assertEqual(recursive_unicode(b"hello"), "hello")

class TestLinkify(unittest.TestCase):
    def test_linkify_str(self):
        self.assertEqual(linkify("hello"), "hello")

if __name__ == '__main__':
    unittest.main()