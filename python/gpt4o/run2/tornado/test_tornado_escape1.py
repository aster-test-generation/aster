import unittest
import html.entities
import json
import re
import urllib.parse
from tornado.util import unicode_type
from tornado.escape import *

class TestTornadoEscape(unittest.TestCase):
    def test_xhtml_escape(self):
        result = xhtml_escape('<div>"Hello"&\'World\'</div>')
        self.assertEqual(result, '&lt;div&gt;&quot;Hello&quot;&amp;&apos;World&apos;&lt;/div&gt;')

    def test_xhtml_unescape(self):
        result = xhtml_unescape('&lt;div&gt;&quot;Hello&quot;&amp;&apos;World&apos;&lt;/div&gt;')
        self.assertEqual(result, '<div>"Hello"&\'World\'</div>')

    def test_json_encode(self):
        result = json_encode({"key": "value"})
        self.assertEqual(result, '{"key": "value"}')

    def test_json_decode(self):
        result = json_decode('{"key": "value"}')
        self.assertEqual(result, {"key": "value"})

    def test_squeeze(self):
        result = squeeze('  Hello   World  ')
        self.assertEqual(result, 'Hello World')

    def test_url_escape(self):
        result = url_escape('Hello World')
        self.assertEqual(result, 'Hello+World')

    def test_url_unescape(self):
        result = url_unescape('Hello+World')
        self.assertEqual(result, 'Hello World')

    def test_parse_qs_bytes(self):
        result = parse_qs_bytes(b'foo=bar&baz=qux')
        self.assertEqual(result, {'foo': [b'bar'], 'baz': [b'qux']})

    def test_utf8(self):
        result = utf8('Hello World')
        self.assertEqual(result, b'Hello World')

    def test_to_unicode(self):
        result = to_unicode(b'Hello World')
        self.assertEqual(result, 'Hello World')

    def test_recursive_unicode(self):
        result = recursive_unicode({'key': b'value'})
        self.assertEqual(result, {'key': 'value'})

    def test_linkify(self):
        result = linkify('Hello http://tornadoweb.org!')
        self.assertEqual(result, 'Hello <a href="http://tornadoweb.org">http://tornadoweb.org</a>!')

    def test__convert_entity(self):
        result = _convert_entity(re.match(r'&(#x[0-9a-fA-F]+);', '&#x26;'))
        self.assertEqual(result, '&')

    def test__build_unicode_map(self):
        result = _build_unicode_map()
        self.assertEqual(result['amp'], '&')

if __name__ == '__main__':
    unittest.main()