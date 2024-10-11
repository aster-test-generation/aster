import unittest
from tornado.escape import *


class TestTornadoEscape(unittest.TestCase):
    def test_xhtml_escape(self):
        instance = xhtml_escape
        result = instance("&")
        self.assertEqual(result, "&amp;")

    def test_xhtml_unescape(self):
        instance = xhtml_unescape
        result = instance("&")
        self.assertEqual(result, "&")

    def test_json_encode(self):
        instance = json_encode
        result = instance("")
        self.assertEqual(result, "\"\"")

    def test_json_decode(self):
        instance = json_decode
        result = instance("{}")
        self.assertEqual(result, "")

    def test_squeeze(self):
        instance = squeeze
        result = instance("")
        self.assertEqual(result, "")

    def test_url_escape(self):
        instance = url_escape
        result = instance("")
        self.assertEqual(result, "")

    def test_url_unescape(self):
        instance = url_unescape
        result = instance("")
        self.assertEqual(result, "")

    def test_parse_qs_bytes(self):
        instance = parse_qs_bytes
        result = instance("")
        self.assertEqual(result, {})

    def test_utf8(self):
        instance = utf8
        result = instance("")
        self.assertEqual(result, b"")

    def test_to_unicode(self):
        instance = to_unicode
        result = instance("")
        self.assertEqual(result, "")

    def test_recursive_unicode(self):
        instance = recursive_unicode
        result = instance("")
        self.assertEqual(result, "")

    def test_linkify(self):
        instance = linkify
        result = instance("")
        self.assertEqual(result, "")

if __name__ == '__main__':
    unittest.main()