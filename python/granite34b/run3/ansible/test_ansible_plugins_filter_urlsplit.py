from ansible.plugins.filter.urlsplit import AnsibleFilterError
import unittest
from ansible.plugins.filter.urlsplit import split_url


class TestUrlSplit(unittest.TestCase):
    def test_split_url_default(self):
        value = "https://www.example.com/path?query=value#fragment"
        expected = {
            'scheme': 'https',
            'netloc': 'www.example.com',
            'path': '/path',
            'query': 'query=value',
            'fragment': 'fragment'
        }
        result = split_url(value)
        self.assertEqual(result, expected)

    def test_split_url_query(self):
        value = "https://www.example.com/path?query=value#fragment"
        query = "query"
        expected = "query=value"
        result = split_url(value, query)
        self.assertEqual(result, expected)

    def test_split_url_alias(self):
        value = "https://www.example.com/path?query=value#fragment"
        query = "query"
        alias = "url_info"
        expected = "query=value"
        with self.assertRaises(AnsibleFilterError) as context:
            split_url(value, query, alias)
        self.assertEqual(str(context.exception), f"{alias}: unknown URL component: {query}")

if __name__ == '__main__':
    unittest.main()