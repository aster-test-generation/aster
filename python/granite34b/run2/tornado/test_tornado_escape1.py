import unittest
from tornado.escape import *

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