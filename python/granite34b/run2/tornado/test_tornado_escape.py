import unittest
import target_module
from tornado.escape import *


class TestXhtmlEscape(unittest.TestCase):
    def test_xhtml_escape(self):
        self.assertEqual(xhtml_escape("Hello"), "Hello")
        self.assertEqual(xhtml_escape("<"), "&lt;")
        self.assertEqual(xhtml_escape(">"), "&gt;")
        self.assertEqual(xhtml_escape("&"), "&amp;")
        self.assertEqual(xhtml_escape('"'), "&quot;")
        self.assertEqual(xhtml_escape("'"), "&amp;apos;")

class TestJsonEncode(unittest.TestCase):
    def test_json_encode(self):
        self.assertEqual(json_encode({"a": 1, "b": 2}), '{"a": 1, "b": 2}')
        self.assertEqual(json_encode([1, 2, 3]), "[1, 2, 3]")
        self.assertEqual(json_encode("Hello"), '"Hello"')

class TestSqueeze(unittest.TestCase):
    def test_squeeze(self):
        self.assertEqual(squeeze("Hello"), "Hello")
        self.assertEqual(squeeze("   Hello   "), " Hello ")
        self.assertEqual(squeeze("   Hello   World   "), " Hello World ")

class TestUrlEscape(unittest.TestCase):
    def test_url_escape(self):
        self.assertEqual(url_escape("Hello"), "Hello")
        self.assertEqual(url_escape("Hello World"), "Hello%20World")
        self.assertEqual(url_escape("Hello World", plus=False), "Hello%20World")

class TestUrlUnescape(unittest.TestCase):
    def test_url_unescape(self):
        self.assertEqual(url_unescape("Hello"), "Hello")
        self.assertEqual(url_unescape("Hello%20World"), "Hello World")
        self.assertEqual(url_unescape("Hello%20World", plus=False), "Hello%20World")

class TestParseQSBytes(unittest.TestCase):
    def test_parse_qs_bytes(self):
        self.assertEqual(parse_qs_bytes("a=1&b=2"), {"a": ["1"], "b": ["2"]})
        self.assertEqual(parse_qs_bytes("a=1&b=2&a=3"), {"a": ["1", "3"], "b": ["2"]})
        self.assertEqual(parse_qs_bytes("a=1&b=2&a=3&b=4"), {"a": ["1", "3"], "b": ["2", "4"]})

class TestUtf8(unittest.TestCase):
    def test_utf8(self):
        self.assertEqual(utf8("Hello"), b"Hello")
        self.assertEqual(utf8(b"Hello"), b"Hello")
        self.assertEqual(utf8(None), None)

class TestToUnicode(unittest.TestCase):
    def test_to_unicode(self):
        self.assertEqual(to_unicode("Hello"), "Hello")
        self.assertEqual(to_unicode(b"Hello"), "Hello")
        self.assertEqual(to_unicode(None), None)

class TestRecursiveUnicode(unittest.TestCase):
    def test_recursive_unicode(self):
        self.assertEqual(recursive_unicode("Hello"), "Hello")
        self.assertEqual(recursive_unicode(b"Hello"), "Hello")
        self.assertEqual(recursive_unicode(None), None)
        self.assertEqual(recursive_unicode([b"Hello", b"World"]), ["Hello", "World"])
        self.assertEqual(recursive_unicode({"a": b"Hello", "b": b"World"}), {"a": "Hello", "b": "World"})

class TestLinkify(unittest.TestCase):
    def test_linkify(self):
        self.assertEqual(linkify("Hello"), "Hello")
        self.assertEqual(linkify("Hello http://example.com"), 'Hello <a href="http://example.com">http://example.com</a>')
        self.assertEqual(linkify("Hello www.example.com"), 'Hello <a href="http://www.example.com">www.example.com</a>')
        self.assertEqual(linkify("Hello http://example.com www.example.com"), 'Hello <a href="http://example.com">http://example.com</a> <a href="http://www.example.com">www.example.com</a>')


class TestXhtmlEscape(unittest.TestCase):
    def test_xhtml_escape(self):
        self.assertEqual(xhtml_escape("foo"), "foo")
        self.assertEqual(xhtml_escape("<"), "&lt;")
        self.assertEqual(xhtml_escape("&"), "&amp;")
        self.assertEqual(xhtml_escape('"'), "&quot;")
        self.assertEqual(xhtml_escape("'"), "&amp;apos;")
        self.assertEqual(xhtml_escape(b"foo"), "foo")
        self.assertEqual(xhtml_escape(b"<"), "&lt;")
        self.assertEqual(xhtml_escape(b"&"), "&amp;")
        self.assertEqual(xhtml_escape(b'"'), "&quot;")
        self.assertEqual(xhtml_escape(b"'"), "&amp;apos;")

class TestJsonEncode(unittest.TestCase):
    def test_json_encode(self):
        self.assertEqual(json_encode(1), "1")
        self.assertEqual(json_encode("foo"), '"foo"')
        self.assertEqual(json_encode(None), "null")
        self.assertEqual(json_encode(True), "true")
        self.assertEqual(json_encode(False), "false")
        self.assertEqual(json_encode([1, 2, 3]), "[1,2,3]")
        self.assertEqual(json_encode({"a": 1, "b": 2}), '{"a":1,"b":2}')

class TestSqueeze(unittest.TestCase):
    def test_squeeze(self):
        self.assertEqual(squeeze(" foo bar "), " foo bar ")
        self.assertEqual(squeeze(" foo  bar  "), " foo bar ")
        self.assertEqual(squeeze(" foo\tbar\n"), " foo bar ")
        self.assertEqual(squeeze(" foo\t\tbar\n\n"), " foo bar ")

class TestUrlEscape(unittest.TestCase):
    def test_url_escape(self):
        self.assertEqual(url_escape("foo"), "foo")
        self.assertEqual(url_escape("foo bar"), "foo+bar")
        self.assertEqual(url_escape("foo+bar"), "foo%2Bbar")
        self.assertEqual(url_escape("foo bar", plus=False), "foo%20bar")
        self.assertEqual(url_escape(b"foo"), "foo")
        self.assertEqual(url_escape(b"foo bar"), "foo+bar")
        self.assertEqual(url_escape(b"foo+bar"), "foo%2Bbar")
        self.assertEqual(url_escape(b"foo bar", plus=False), "foo%20bar")

class TestUrlUnescape(unittest.TestCase):
    def test_url_unescape(self):
        self.assertEqual(url_unescape("foo"), "foo")
        self.assertEqual(url_unescape("foo+bar"), "foo bar")
        self.assertEqual(url_unescape("foo%2Bbar"), "foo+bar")
        self.assertEqual(url_unescape("foo%20bar"), "foo bar")
        self.assertEqual(url_unescape("foo+bar", plus=False), "foo%2Bbar")
        self.assertEqual(url_unescape(b"foo"), b"foo")
        self.assertEqual(url_unescape(b"foo+bar"), b"foo bar")
        self.assertEqual(url_unescape(b"foo%2Bbar"), b"foo+bar")
        self.assertEqual(url_unescape(b"foo%20bar"), b"foo bar")
        self.assertEqual(url_unescape(b"foo+bar", plus=False), b"foo%2Bbar")


if __name__ == '__main__':
    unittest.main()