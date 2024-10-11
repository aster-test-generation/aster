import unittest
from tornado.escape import *

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