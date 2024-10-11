import unittest
from ansible.plugins.filter.urlsplit import split_url, FilterModule
from ansible.errors import AnsibleFilterError


class TestSplitUrlFunction(unittest.TestCase):
    def test_split_url_no_query(self):
        result = split_url('http://example.com/path?query=1')
        expected = {
            'scheme': 'http',
            'netloc': 'example.com',
            'path': '/path',
            'query': 'query=1',
            'fragment': ''
        }
        self.assertDictEqual(result, expected)

    def test_split_url_with_query(self):
        result = split_url('http://example.com/path?query=1', 'query')
        self.assertEqual(result, 'query=1')

    def test_split_url_with_invalid_query(self):
        with self.assertRaises(AnsibleFilterError) as context:
            split_url('http://example.com/path?query=1', 'invalid_query')
        self.assertEqual(str(context.exception), 'urlsplit: unknown URL component: invalid_query')

class TestFilterModule(unittest.TestCase):
    def test_filters(self):
        filter_module = FilterModule()
        filters = filter_module.filters()
        self.assertIn('urlsplit', filters)
        self.assertEqual(filters['urlsplit'], split_url)

if __name__ == '__main__':
    unittest.main()