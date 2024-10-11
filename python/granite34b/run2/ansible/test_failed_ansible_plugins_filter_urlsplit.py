from ansible.plugins.filter.urlsplit import AnsibleFilterError
import unittest
from ansible.plugins.filter.urlsplit import split_url

class TestUrlSplit(unittest.TestCase):
    def test_split_url(self):
        value = "https://www.example.com/path?query=1#fragment"
        expected_result = {
            'scheme': 'https',
            'netloc': 'www.example.com',
            'path': '/path',
            'query': 'query=1',
            'fragment': 'fragment'
        }
        result = split_url(value)
        self.assertEqual(result, {'scheme': 'https', 'netloc': 'www.example.com', 'path': '/path', 'query': 'query=1', 'username': None, 'password': None, 'hostname': 'www.example.com', 'port': None, 'fragment': 'fragment'})

    def test_split_url_with_query(self):
        value = "https://www.example.com/path?query=1#fragment"
        query = "scheme"
        expected_result = "https"
        result = split_url(value, query)
        self.assertEqual(result, expected_result)

    def test_split_url_with_invalid_query(self):
        value = "https://www.example.com/path?query=1#fragment"
        query = "invalid"
        with self.assertRaises(AnsibleFilterError) as context:
            split_url(value, query)
        self.assertTrue("unknown URL component" in str(context.exception))

if __name__ == '__main__':
    unittest.main()