import unittest
from tornado.escape import *



class TestTornadoEscape(unittest.TestCase):
    def test_xhtml_escape(self):
        self.assertEqual(xhtml_escape("&"), "&amp;")
        self.assertEqual(xhtml_escape("<"), "&lt;")
        self.assertEqual(xhtml_escape(">"), "&gt;")
        self.assertEqual(xhtml_escape('"'), "&quot;")
        self.assertEqual(xhtml_escape("'"), "&#39;")
        self.assertEqual(xhtml_escape("&<>\"'"), "&amp;&lt;&gt;&quot;&apos;")

    def test_xhtml_unescape(self):
        self.assertEqual(xhtml_unescape("&amp;"), "&")
        self.assertEqual(xhtml_unescape("&lt;"), "<")
        self.assertEqual(xhtml_unescape("&gt;"), ">")
        self.assertEqual(xhtml_unescape("&quot;"), '"')
        self.assertEqual(xhtml_unescape("&apos;"), "&apos;")
        self.assertEqual(xhtml_unescape("&amp;&lt;&gt;&quot;&apos;"), "&<>\"'")

    def test_json_encode(self):
        self.assertEqual(json_encode(None), "null")
        self.assertEqual(json_encode(True), "true")
        self.assertEqual(json_encode(False), "false")
        self.assertEqual(json_encode(1), "1")
        self.assertEqual(json_encode(3.14), "3.14")
        self.assertEqual(json_encode("str"), '"str"')
        self.assertEqual(json_encode("</"), '"<\/"')
        self.assertEqual(json_encode([1, 2, 3]), "[1,2,3]")
        self.assertEqual(json_encode({"a": 1, "b": 2}), '{"a":1,"b":2}')

    def test_json_decode(self):
        self.assertEqual(json_decode("null"), None)
        self.assertEqual(json_decode("true"), True)
        self.assertEqual(json_decode("false"), False)
        self.assertEqual(json_decode("1"), 1)
        self.assertEqual(json_decode("3.14"), 3.14)
        self.assertEqual(json_decode('"str"'), "str")
        self.assertEqual(json_decode('"</"'), "</")
        self.assertEqual(json_decode("[1,2,3]"), [1, 2, 3])
        self.assertEqual(json_decode('{"a":1,"b":2}'), {"a": 1, "b": 2})

    def test_squeeze(self):
        self.assertEqual(squeeze("  "), "")
        self.assertEqual(squeeze("  a  "), " a ")
        self.assertEqual(squeeze("  a  b  "), " a b ")
        self.assertEqual(squeeze("  a  b  c  "), " a b c ")

class TestTornadoEscape(unittest.TestCase):
    def test_xhtml_escape(self):
        self.assertEqual(xhtml_escape("&"), "&amp;")
        self.assertEqual(xhtml_escape("<"), "&lt;")
        self.assertEqual(xhtml_escape(">"), "&gt;")
        self.assertEqual(xhtml_escape('"'), "&quot;")
        self.assertEqual(xhtml_escape("'"), "&#39;")

    def test_xhtml_unescape(self):
        self.assertEqual(xhtml_unescape("&amp;"), "&")
        self.assertEqual(xhtml_unescape("&lt;"), "<")
        self.assertEqual(xhtml_unescape("&gt;"), ">")
        self.assertEqual(xhtml_unescape("&quot;"), '"')
        self.assertEqual(xhtml_unescape("&#39;"), "'")

    def test_json_encode(self):
        self.assertEqual(json_encode(1), "1")
        self.assertEqual(json_encode(1.1), "1.1")
        self.assertEqual(json_encode("1"), '"1"')
        self.assertEqual(json_encode("1.1"), '"1.1"')
        self.assertEqual(json_encode(True), "true")
        self.assertEqual(json_encode(False), "false")
        self.assertEqual(json_encode(None), "null")
        self.assertEqual(json_encode([]), "[]")
        self.assertEqual(json_encode([1]), "[1]")
        self.assertEqual(json_encode([1, 2]), "[1,2]")
        self.assertEqual(json_encode({}), "{}")
        self.assertEqual(json_encode({"a": 1}), '{"a":1}')
        self.assertEqual(json_encode({"a": 1, "b": 2}), '{"a":1,"b":2}')

    def test_json_decode(self):
        self.assertEqual(json_decode("1"), 1)
        self.assertEqual(json_decode("1.1"), 1.1)
        self.assertEqual(json_decode('"1"'), "1")
        self.assertEqual(json_decode('"1.1"'), "1.1")
        self.assertEqual(json_decode("true"), True)
        self.assertEqual(json_decode("false"), False)
        self.assertEqual(json_decode("null"), None)
        self.assertEqual(json_decode("[]"), [])
        self.assertEqual(json_decode("[1]"), [1])
        self.assertEqual(json_decode("[1,2]"), [1, 2])
        self.assertEqual(json_decode("{}"), {})
        self.assertEqual(json_decode('{"a":1}'), {"a": 1})
        self.assertEqual(json_decode('{"a":1,"b":2}'), {"a": 1, "b": 2})

    def test_squeeze(self):
        self.assertEqual(squeeze(""), "")
        self.assertEqual(squeeze("a"), "a")
        self.assertEqual(squeeze("  a"), "a")
        self.assertEqual(squeeze("a  "), "a")
        self.assertEqual(squeeze("  a  "), "a")
        self.assertEqual(squeeze("a b"), "a b")
        self.assertEqual(squeeze("a  b"), "a b")
        self.assertEqual(squeeze("  a  b  "), "a b")


class TestTornadoEscape(unittest.TestCase):
    def test_xhtml_escape(self):
        result = xhtml_escape("")
        self.assertEqual(result, "")

    def test_xhtml_unescape(self):
        result = xhtml_unescape("")
        self.assertEqual(result, "")

    def test_json_encode(self):
        result = json_encode("")
        self.assertEqual(result, "")

    def test_json_decode(self):
        result = json_decode("")
        self.assertEqual(result, "")

    def test_squeeze(self):
        result = squeeze("")
        self.assertEqual(result, "")

    def test_url_escape(self):
        result = url_escape("")
        self.assertEqual(result, "")

    def test_url_unescape(self):
        result = url_unescape("")
        self.assertEqual(result, "")

    def test_parse_qs_bytes(self):
        result = parse_qs_bytes("")
        self.assertEqual(result, "")

    def test_utf8(self):
        result = utf8("")
        self.assertEqual(result, "")

    def test_to_unicode(self):
        result = to_unicode("")
        self.assertEqual(result, "")

    def test_recursive_unicode(self):
        result = recursive_unicode("")
        self.assertEqual(result, "")

    def test_linkify(self):
        result = linkify("")
        self.assertEqual(result, "")

if __name__ == '__main__':
    unittest.main()