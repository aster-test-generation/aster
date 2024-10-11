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

    def test_xhtml_unescape(self):
        self.assertEqual(xhtml_unescape("&lt;"), "<")
        self.assertEqual(xhtml_unescape("&amp;"), "&")
        self.assertEqual(xhtml_unescape("&quot;"), '"')
        self.assertEqual(xhtml_unescape("&#x27;"), "'")

    def test_json_encode(self):
        self.assertEqual(json_encode({"foo": "bar"}), '{"foo": "bar"}')

    def test_json_decode(self):
        self.assertEqual(json_decode('{"foo": "bar"}'), {"foo": "bar"})

    def test_squeeze(self):
        self.assertEqual(squeeze(" foo  bar  "), "foo bar")

    def test_url_escape(self):
        self.assertEqual(url_escape("foo bar"), "foo+bar")
        self.assertEqual(url_escape("foo bar", plus=False), "foo%20bar")

    def test_url_unescape(self):
        self.assertEqual(url_unescape("foo+bar"), "foo bar")
        self.assertEqual(url_unescape("foo%20bar"), "foo bar")

    def test_parse_qs_bytes(self):
        self.assertEqual(parse_qs_bytes(b"foo=1&bar=2"), {"foo": [b"1"], "bar": [b"2"]})

    def test_utf8(self):
        self.assertEqual(utf8("foo"), b"foo")
        self.assertEqual(utf8(b"foo"), b"foo")
        self.assertEqual(utf8(None), None)

    def test_to_unicode(self):
        self.assertEqual(to_unicode("foo"), "foo")
        self.assertEqual(to_unicode(b"foo"), "foo")
        self.assertEqual(to_unicode(None), None)

    def test_recursive_unicode(self):
        self.assertEqual(recursive_unicode({"foo": "bar"}), {"foo": "bar"})
        self.assertEqual(recursive_unicode([1, 2, 3]), [1, 2, 3])
        self.assertEqual(recursive_unicode(b"foo"), "foo")
        self.assertEqual(recursive_unicode(None), None)

if __name__ == '__main__':
    unittest.main()