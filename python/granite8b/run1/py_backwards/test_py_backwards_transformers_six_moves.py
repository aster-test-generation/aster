import unittest
from six.moves import urllib


class TestUrllib(unittest.TestCase):
    def test_quote(self):
        result = six.moves.urllib.parse.quote('http://example.com')
        self.assertEqual(result, 'http%3A//example.com')

    def test_quote_plus(self):
        result = six.moves.urllib.parse.quote_plus('http://example.com')
        self.assertEqual(result, 'http%3A%2F%2Fexample.com')

    def test_unquote(self):
        result = six.moves.urllib.unquote('http%3A//example.com')
        self.assertEqual(result, 'http://example.com')

    def test_unquote_plus(self):
        result = six.moves.urllib.unquote_plus('http%3A%2F%2Fexample.com')
        self.assertEqual(result, 'http://example.com')

    def test_urlencode(self):
        result = urllib.parse.urlencode({'key': 'value'})
        self.assertEqual(result, 'key=value')

    def test_splitquery(self):
        result = six.moves.urllib.splitquery('http://example.com?key=value')
        self.assertEqual(result, ('http://example.com', 'key=value'))

    def test_splittag(self):
        result = urllib.parse.splittag('http://example.com#tag')
        self.assertEqual(result, ('http://example.com', 'tag'))

    def test_splituser(self):
        result = urllib.parse.splituser('user:password@example.com')
        self.assertEqual(result, ('user:password', 'example.com'))

    def test_splitvalue(self):
        result = urllib.parse.splitvalue('key=value')
        self.assertEqual(result, ('key', 'value'))

    def test_uses_fragment(self):
        result = six.moves.urllib.uses_fragment
        self.assertTrue(result)

if __name__ == '__main__':
    unittest.main()