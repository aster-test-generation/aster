import unittest
from tornado.escape import *


class TestXhtmlEscape(unittest.TestCase):
    def test_xhtml_escape(self):
        self.assertEqual(xhtml_escape("Hello"), "Hello")
        self.assertEqual(xhtml_escape("<"), "&lt;")
        self.assertEqual(xhtml_escape(">"), "&gt;")
        self.assertEqual(xhtml_escape("&"), "&amp;")
        self.assertEqual(xhtml_escape('"'), "&quot;")
        self.assertEqual(xhtml_escape("'"), "'")

class TestJsonEncode(unittest.TestCase):
    def test_json_encode(self):
        self.assertEqual(json_encode({}), "{}")
        self.assertEqual(json_encode({"key": "value"}), '{"key": "value"}')
        self.assertEqual(json_encode([1, 2, 3]), "[1, 2, 3]")

class TestSqueeze(unittest.TestCase):
    def test_squeeze(self):
        self.assertEqual(squeeze("Hello"), "Hello")
        self.assertEqual(squeeze("Hello   "), "Hello")
        self.assertEqual(squeeze("Hello  World"), "Hello World")

class TestUrlEscape(unittest.TestCase):
    def test_url_escape(self):
        self.assertEqual(url_escape("Hello"), "Hello")
        self.assertEqual(url_escape("Hello World"), "Hello+World")
        self.assertEqual(url_escape("Hello World", plus=False), "Hello%20World")

class TestUrlUnescape(unittest.TestCase):
    def test_url_unescape(self):
        self.assertEqual(url_unescape("Hello"), "Hello")
        self.assertEqual(url_unescape("Hello%20World"), "Hello World")
        self.assertEqual(url_unescape("Hello%20World", plus=False), "Hello World")

class TestParseQSBytes(unittest.TestCase):
    def test_parse_qs_bytes(self):
        self.assertEqual(parse_qs_bytes("key=value"), {"key": ["value"]})
        self.assertEqual(parse_qs_bytes("key=value&key=value2"), {"key": ["value", "value2"]})
        self.assertEqual(parse_qs_bytes("key="), {"key": [""]})

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
        self.assertEqual(recursive_unicode({"key": "value"}), {"key": "value"})
        self.assertEqual(recursive_unicode([1, 2, 3]), [1, 2, 3])
        self.assertEqual(recursive_unicode((1, 2, 3)), (1, 2, 3))

class TestLinkify(unittest.TestCase):
    def test_linkify(self):
        self.assertEqual(linkify("Hello"), "Hello")
        self.assertEqual(linkify("Hello http://example.com"), 'Hello <a href="http://example.com">http://example.com</a>')
        self.assertEqual(linkify("Hello www.example.com"), 'Hello <a href="http://www.example.com">www.example.com</a>')
        self.assertEqual(linkify("Hello http://example.com", extra_params='rel="nofollow"'), 'Hello <a href="http://example.com" rel="nofollow">http://example.com</a>')
        self.assertEqual(linkify("Hello http://example.com", permitted_protocols=["http"]), 'Hello <a href="http://example.com">http://example.com</a>')


if __name__ == '__main__':
    unittest.main()