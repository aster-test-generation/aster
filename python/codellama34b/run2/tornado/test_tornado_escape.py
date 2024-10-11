import unittest
from tornado.escape import *


class TestXhtmlEscape(unittest.TestCase):
    def test_xhtml_escape(self):
        result = xhtml_escape("&<>\"'")
        self.assertEqual(result, "&amp;&lt;&gt;&quot;&#39;")

    def test_xhtml_unescape(self):
        result = xhtml_unescape("&amp;&lt;&gt;&quot;&#39;")
        self.assertEqual(result, "&<>\"'")

    def test_json_encode(self):
        result = json_encode("&<>\"'")
        self.assertEqual(result, "\"&<>\\\"'\"")

    def test_json_decode(self):
        result = json_decode("\"&<>\\\"'\"")
        self.assertEqual(result, "&<>\"'")

    def test_squeeze(self):
        result = squeeze("&<>\"'")
        self.assertEqual(result, "&<>\"'")

    def test_url_escape(self):
        result = url_escape("&<>\"'")
        self.assertEqual(result, "%26%3C%3E%22%27")

    def test_url_unescape(self):
        result = url_unescape("%26%3C%3E%22%27")
        self.assertEqual(result, "&<>\"'")

    def test_parse_qs_bytes(self):
        result = parse_qs_bytes("&<>\"'")
        self.assertEqual(result, "&<>\"'")

    def test_utf8(self):
        result = utf8("&<>\"'")
        self.assertEqual(result, "&<>\"'")

    def test_to_unicode(self):
        result = to_unicode("&<>\"'")
        self.assertEqual(result, "&<>\"'")

    def test_recursive_unicode(self):
        result = recursive_unicode("&<>\"'")
        self.assertEqual(result, "&<>\"'")

    def test_linkify(self):
        result = linkify("&<>\"'")
        self.assertEqual(result, "&<>'")

if __name__ == '__main__':
    unittest.main()