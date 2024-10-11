
import unittest
from tornado.escape import *

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

if __name__ == '__main__':
    unittest.main()