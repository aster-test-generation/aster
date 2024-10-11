import unittest
from ansible.plugins.filter.urlsplit import split_url, FilterModule


class TestUrlSplit(unittest.TestCase):
    def test_split_url(self):
        result = split_url('https://www.example.com/path?query=value')
        self.assertEqual(result['scheme'], 'https')
        self.assertEqual(result['netloc'], 'www.example.com')
        self.assertEqual(result['path'], '/path')
        self.assertEqual(result['query'], 'query=value')

    def test_split_url_with_query(self):
        result = split_url('https://www.example.com/path?query=value', query='scheme')
        self.assertEqual(result, 'https')

    def test_filter_module(self):
        filter_module = FilterModule()
        filters = filter_module.filters()
        self.assertIn('urlsplit', filters)

if __name__ == '__main__':
    unittest.main()