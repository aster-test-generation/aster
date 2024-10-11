import unittest
from tornado.escape import *


class TestXhtmlEscape(unittest.TestCase):
    def test_xhtml_escape(self):
        result = xhtml_escape("<>&\"'")
        self.assertEqual(result, "&lt;&gt;&amp;&quot;")

class TestXhtmlUnescape(unittest.TestCase):
    def test_xhtml_unescape(self):
        result = xhtml_unescape("&lt;&gt;&amp;&quot;")
        self.assertEqual(result, "<>&\"'")

class TestJsonEncode(unittest.TestCase):
    def test_json_encode(self):
        result = json_encode({"key": "value"})
        self.assertEqual(result, '{"key": "value"}')

class TestJsonDecode(unittest.TestCase):
    def test_json_decode(self):
        result = json_decode('{"key": "value"}')
        self.assertEqual(result, {"key": "value"})

class TestSqueeze(unittest.TestCase):
    def test_squeeze(self):
        result = squeeze("   hello   world   ")
        self.assertEqual(result, "hello world")

class TestUrlEscape(unittest.TestCase):
    def test_url_escape(self):
        result = url_escape("hello world")
        self.assertEqual(result, "hello+world")

class TestUrlUnescape(unittest.TestCase):
    def test_url_unescape(self):
        result = url_unescape("hello+world")
        self.assertEqual(result, "hello world")

class TestParseQsBytes(unittest.TestCase):
    def test_parse_qs_bytes(self):
        result = parse_qs_bytes("key=value&foo=bar")
        self.assertEqual(result, {"key": [b"value"], "foo": [b"bar"]})

class TestUtf8(unittest.TestCase):
    def test_utf8(self):
        result = utf8("hello")
        self.assertEqual(result, b"hello")

class TestToUnicode(unittest.TestCase):
    def test_to_unicode(self):
        result = to_unicode(b"hello")
        self.assertEqual(result, "hello")

class TestRecursiveUnicode(unittest.TestCase):
    def test_recursive_unicode(self):
        result = recursive_unicode({"key": b"value", "foo": ["bar", "baz"]})
        self.assertEqual(result, {"key": "value", "foo": ["bar", "baz"]})

class TestLinkify(unittest.TestCase):
    def test_linkify(self):
        result = linkify("Hello http://tornadoweb.org!")
        self.assertEqual(result, "Hello <a href=\"http://tornadoweb.org\">http://tornadoweb.org</a>!")

class TestConvertEntity(unittest.TestCase):
    def test_convert_entity(self):
        result = _convert_entity(typing.Match("&#123;"))
        self.assertEqual(result, chr(123))

class TestBuildUnicodeMap(unittest.TestCase):
    def test_build_unicode_map(self):
        result = _build_unicode_map()
        self.assertIsInstance(result, dict)

if __name__ == '__main__':
    unittest.main()