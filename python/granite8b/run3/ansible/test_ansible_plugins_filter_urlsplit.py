import unittest
from ansible.plugins.filter.core import urlsplit as split_url


class TestUrlsplit(unittest.TestCase):
    def test_split_url(self):
        result = split_url('https://www.example.com/path?query=value')
        self.assertEqual(result, {
            'scheme': 'https',
            'netloc': 'www.example.com',
            'path': '/path',
            'query': 'query=value',
            'fragment': ''
        })

    def test_split_url_with_query(self):
        result = split_url('https://www.example.com/path?query=value', query='scheme')
        self.assertEqual(result, 'https')

    def test_split_url_with_unknown_query(self):
        with self.assertRaises(Exception) as cm:
            split_url('https://www.example.com/path?query=value', query='unknown')
        self.assertEqual(str(cm.exception), "unknown URL component: unknown")

if __name__ == '__main__':
    unittest.main()