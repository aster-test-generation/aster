import unittest
from tornado.escape import (
    xhtml_escape,
    xhtml_unescape,
    json_encode,
    json_decode,
    squeeze,
    url_escape,
    url_unescape,
    parse_qs_bytes,
    utf8,
    to_unicode,
    recursive_unicode,
    linkify,
)

class TestEscape(unittest.TestCase):
    def test_xhtml_escape(self):
        self.assertEqual(xhtml_escape("<"), "&lt;")
        self.assertEqual(xhtml_escape("&"), "&amp;")
        self.assertEqual(xhtml_escape('"'), "&quot;")
        self.assertEqual(xhtml_escape("'"), "&#x27;")
        self.assertEqual(xhtml_escape(">"), "&gt;")

    def test_xhtml_unescape(self):
        self.assertEqual(xhtml_unescape("&lt;"), "<")
        self.assertEqual(xhtml_unescape("&amp;"), "&")
        self.assertEqual(xhtml_unescape("&quot;"), '"')
        self.assertEqual(xhtml_unescape("&#x27;"), "'")
        self.assertEqual(xhtml_unescape("&gt;"), ">")

    def test_json_encode(self):
        self.assertEqual(json_encode({"a": 1}), '{"a": 1}')
        self.assertEqual(json_encode([1, 2, 3]), '[1, 2, 3]')
        self.assertEqual(json_encode("hello"), '"hello"')

    def test_json_decode(self):
        self.assertEqual(json_decode('{"a": 1}'), {"a": 1})
        self.assertEqual(json_decode('[1, 2, 3]'), [1, 2, 3])
        self.assertEqual(json_decode('"hello"'), "hello")

    def test_squeeze(self):
        self.assertEqual(squeeze("hello   world"), "hello world")
        self.assertEqual(squeeze("   hello   world   "), "hello world")

    def test_url_escape(self):
        self.assertEqual(url_escape("hello world"), "hello%20world")
        self.assertEqual(url_escape("hello world", plus=False), "hello%20world")

    def test_url_unescape(self):
        self.assertEqual(url_unescape("hello%20world"), "hello world")
        self.assertEqual(url_unescape("hello%20world", plus=False), "hello world")

    def test_parse_qs_bytes(self):
        self.assertEqual(parse_qs_bytes(b"a=1&b=2"), {"a": [b"1"], "b": [b"2"]})
        self.assertEqual(parse_qs_bytes(b"a=1&a=2"), {"a": [b"1", b"2"]})

    def test_utf8(self):
        self.assertEqual(utf8("hello"), b"hello")
        self.assertEqual(utf8(b"hello"), b"hello")
        self.assertEqual(utf8(None), None)

    def test_to_unicode(self):
        self.assertEqual(to_unicode("hello"), "hello")
        self.assertEqual(to_unicode(b"hello"), "hello")
        self.assertEqual(to_unicode(None), None)

    def test_recursive_unicode(self):
        self.assertEqual(recursive_unicode({"a": 1}), {"a": "1"})
        self.assertEqual(recursive_unicode([1, 2, 3]), ["1", "2", "3"])
        self.assertEqual(recursive_unicode(b"hello"), "hello")
        self.assertEqual(recursive_unicode(None), None)


if __name__ == '__main__':
    unittest.main()