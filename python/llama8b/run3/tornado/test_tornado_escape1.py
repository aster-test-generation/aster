import unittest
from tornado.escape import *

class TestTornadoEscape(unittest.TestCase):
    def test_xhtml_escape(self):
        self.assertEqual(xhtml_escape("Hello & World!"), "Hello &amp; World!")
        self.assertEqual(xhtml_escape("Hello < World!"), "Hello &lt; World!")
        self.assertEqual(xhtml_escape("Hello > World!"), "Hello &gt; World!")
        self.assertEqual(xhtml_escape("Hello \" World!"), "Hello &quot; World!")
        self.assertEqual(xhtml_escape("Hello ' World!"), "Hello &#39; World!")

    def test_xhtml_unescape(self):
        self.assertEqual(xhtml_unescape("Hello &amp; World!"), "Hello & World!")
        self.assertEqual(xhtml_unescape("Hello &lt; World!"), "Hello < World!")
        self.assertEqual(xhtml_unescape("Hello &gt; World!"), "Hello > World!")
        self.assertEqual(xhtml_unescape("Hello &quot; World!"), "Hello \" World!")
        self.assertEqual(xhtml_unescape("Hello &#39; World!"), "Hello ' World!")

    def test_json_encode(self):
        self.assertEqual(json_encode({"a": 1, "b": 2}), '{"a": 1, "b": 2}')
        self.assertEqual(json_encode([1, 2, 3]), '[1, 2, 3]')
        self.assertEqual(json_encode("Hello"), '"Hello"')
        self.assertEqual(json_encode(True), 'true')
        self.assertEqual(json_encode(False), 'false')
        self.assertEqual(json_encode(None), 'null')

    def test_json_decode(self):
        self.assertEqual(json_decode('{"a": 1, "b": 2}'), {"a": 1, "b": 2})
        self.assertEqual(json_decode('[1, 2, 3]'), [1, 2, 3])
        self.assertEqual(json_decode('"Hello"'), "Hello")
        self.assertEqual(json_decode('true'), True)
        self.assertEqual(json_decode('false'), False)
        self.assertEqual(json_decode('null'), None)

    def test_squeeze(self):
        self.assertEqual(squeeze("   Hello   "), "Hello")
        self.assertEqual(squeeze("Hello   "), "Hello")
        self.assertEqual(squeeze("   Hello"), "Hello")
        self.assertEqual(squeeze("Hello"), "Hello")

    def test_url_escape(self):
        self.assertEqual(url_escape("Hello World!"), "Hello+World%21")
        self.assertEqual(url_escape("Hello World!"), "Hello+World%21")
        self.assertEqual(url_escape("Hello World!", plus=False), "Hello%20World!")

    def test_url_unescape(self):
        self.assertEqual(url_unescape("Hello+World%21"), "Hello World!")
        self.assertEqual(url_unescape("Hello+World%21"), "Hello World!")
        self.assertEqual(url_unescape("Hello%20World!"), "Hello World!")

    def test_parse_qs_bytes(self):
        self.assertEqual(parse_qs_bytes("a=1&b=2"), {"a": ["1"], "b": ["2"]})
        self.assertEqual(parse_qs_bytes(b"a=1&b=2"), {"a": ["1"], "b": ["2"]})

    def test_utf8(self):
        self.assertEqual(utf8("Hello"), b"Hello")
        self.assertEqual(utf8(b"Hello"), b"Hello")
        self.assertEqual(utf8(None), None)

    def test_to_unicode(self):
        self.assertEqual(to_unicode("Hello"), "Hello")
        self.assertEqual(to_unicode(b"Hello"), "Hello")
        self.assertEqual(to_unicode(None), None)

    def test_recursive_unicode(self):
        self.assertEqual(recursive_unicode({"a": 1, "b": 2}), {"a": 1, "b": 2})
        self.assertEqual(recursive_unicode([1, 2, 3]), [1, 2, 3])
        self.assertEqual(recursive_unicode((1, 2, 3)), (1, 2, 3))
        self.assertEqual(recursive_unicode(b"Hello"), "Hello")
        self.assertEqual(recursive_unicode(None), None)

    def test_linkify(self):
        self.assertEqual(linkify("Hello http://tornadoweb.org!"), "Hello <a href=\"http://tornadoweb.org\">http://tornadoweb.org</a>!")
        self.assertEqual(linkify("Hello http://example.com!"), "Hello <a href=\"http://example.com\">http://example.com</a>!")
        self.assertEqual(linkify("Hello http://example.com/path/to/page!"), "Hello <a href=\"http://example.com/path/to/page\">http://example.com/path/to/page</a>!")

if __name__ == '__main__':
    unittest.main()