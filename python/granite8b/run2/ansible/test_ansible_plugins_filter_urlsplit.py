import unittest
from ansible.plugins.filter.core import *


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

    def test_filter_module(self):
        filter_module = FilterModule()
        self.assertEqual(filter_module.filters(), {
            'urlsplit': split_url
        })

if __name__ == '__main__':
    unittest.main()