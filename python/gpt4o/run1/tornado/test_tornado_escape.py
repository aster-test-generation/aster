import unittest
from tornado.escape import *


class TestTornadoEscape(unittest.TestCase):
    def test_xhtml_escape(self):
        result = xhtml_escape("<div>")
        self.assertEqual(result, "&lt;div&gt;")

    def test_xhtml_unescape(self):
        result = xhtml_unescape("&lt;div&gt;")
        self.assertEqual(result, "<div>")

    def test_json_encode(self):
        result = json_encode({"key": "value"})
        self.assertEqual(result, '{"key": "value"}')

    def test_json_decode(self):
        result = json_decode('{"key": "value"}')
        self.assertEqual(result, {"key": "value"})

    def test_squeeze(self):
        result = squeeze("  a  b  c  ")
        self.assertEqual(result, "a b c")

    def test_url_escape(self):
        result = url_escape("a b c")
        self.assertEqual(result, "a+b+c")

    def test_url_unescape(self):
        result = url_unescape("a+b+c")
        self.assertEqual(result, "a b c")

    def test_parse_qs_bytes(self):
        result = parse_qs_bytes("a=b&c=d")
        self.assertEqual(result, {'a': [b'b'], 'c': [b'd']})

    def test_utf8_bytes(self):
        result = utf8(b"test")
        self.assertEqual(result, b"test")

    def test_utf8_str(self):
        result = utf8("test")
        self.assertEqual(result, b"test")

    def test_utf8_none(self):
        result = utf8(None)
        self.assertEqual(result, None)

    def test_to_unicode_str(self):
        result = to_unicode("test")
        self.assertEqual(result, "test")

    def test_to_unicode_bytes(self):
        result = to_unicode(b"test")
        self.assertEqual(result, "test")

    def test_to_unicode_none(self):
        result = to_unicode(None)
        self.assertEqual(result, None)

    def test_recursive_unicode_dict(self):
        result = recursive_unicode({"key": b"value"})
        self.assertEqual(result, {"key": "value"})

    def test_recursive_unicode_list(self):
        result = recursive_unicode([b"value"])
        self.assertEqual(result, ["value"])

    def test_recursive_unicode_tuple(self):
        result = recursive_unicode((b"value",))
        self.assertEqual(result, ("value",))

    def test_recursive_unicode_bytes(self):
        result = recursive_unicode(b"value")
        self.assertEqual(result, "value")

    def test_recursive_unicode_other(self):
        result = recursive_unicode(123)
        self.assertEqual(result, 123)

    def test_convert_entity(self):
        result = convert_entity(re.match(r"&(#?)(\d+);", "&#123;"))
        self.assertEqual(result, "{")

    def test_build_unicode_map(self):
        result = build_unicode_map()
        self.assertIn("quot", result)
        self.assertEqual(result["quot"], '"')

class TestTornadoEscape(unittest.TestCase):
    def test_xhtml_escape(self):
        result = xhtml_escape("<div>")
        self.assertEqual(result, "&lt;div&gt;")

    def test_xhtml_unescape(self):
        result = xhtml_unescape("&lt;div&gt;")
        self.assertEqual(result, "<div>")

    def test_json_encode(self):
        result = json_encode({"key": "value"})
        self.assertEqual(result, '{"key": "value"}')

    def test_json_decode(self):
        result = json_decode('{"key": "value"}')
        self.assertEqual(result, {"key": "value"})

    def test_squeeze(self):
        result = squeeze("  a  b  c  ")
        self.assertEqual(result, "a b c")

    def test_url_escape(self):
        result = url_escape("a b c")
        self.assertEqual(result, "a+b+c")

    def test_url_unescape(self):
        result = url_unescape("a+b+c")
        self.assertEqual(result, "a b c")

    def test_parse_qs_bytes(self):
        result = parse_qs_bytes("a=b&c=d")
        self.assertEqual(result, {"a": [b"b"], "c": [b"d"]})

    def test_utf8_bytes(self):
        result = utf8(b"test")
        self.assertEqual(result, b"test")

    def test_utf8_str(self):
        result = utf8("test")
        self.assertEqual(result, b"test")

    def test_utf8_none(self):
        result = utf8(None)
        self.assertEqual(result, None)

    def test_to_unicode_str(self):
        result = to_unicode("test")
        self.assertEqual(result, "test")

    def test_to_unicode_bytes(self):
        result = to_unicode(b"test")
        self.assertEqual(result, "test")

    def test_to_unicode_none(self):
        result = to_unicode(None)
        self.assertEqual(result, None)

    def test_recursive_unicode_dict(self):
        result = recursive_unicode({"key": b"value"})
        self.assertEqual(result, {"key": "value"})

    def test_recursive_unicode_list(self):
        result = recursive_unicode([b"value"])
        self.assertEqual(result, ["value"])

    def test_recursive_unicode_tuple(self):
        result = recursive_unicode((b"value",))
        self.assertEqual(result, ("value",))

    def test_recursive_unicode_bytes(self):
        result = recursive_unicode(b"value")
        self.assertEqual(result, "value")

    def test_recursive_unicode_other(self):
        result = recursive_unicode(123)
        self.assertEqual(result, 123)

    def test_linkify(self):
        result = linkify("Hello http://tornadoweb.org!")
        self.assertEqual(result, 'Hello <a href="http://tornadoweb.org">http://tornadoweb.org</a>!')

    def test__convert_entity(self):
        result = _convert_entity(re.match(r"&(#?)(\d+);", "&#123;"))
        self.assertEqual(result, "{")

    def test__build_unicode_map(self):
        result = _build_unicode_map()
        self.assertIn("quot", result)
        self.assertEqual(result["quot"], '"')

if __name__ == '__main__':
    unittest.main()