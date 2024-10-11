import unittest
from ansible.plugins.filter.urlsplit import *


class TestUrlsplit(unittest.TestCase):
    def test_split_url(self):
        result = split_url("http://www.example.com")
        self.assertEqual(result, {'scheme': 'http', 'netloc': 'www.example.com', 'path': '', 'query': '', 'fragment': '', 'username': None, 'password': None, 'hostname': 'www.example.com', 'port': None})

    def test_split_url_query(self):
        result = split_url("http://www.example.com", query="scheme")
        self.assertEqual(result, 'http')

    def test_split_url_alias(self):
        result = split_url("http://www.example.com", alias="urlsplit")
        self.assertEqual(result, {'scheme': 'http', 'netloc': 'www.example.com', 'path': '', 'query': '', 'fragment': '', 'username': None, 'password': None, 'hostname': 'www.example.com', 'port': None})

    def test_split_url_query_alias(self):
        result = split_url("http://www.example.com", query="scheme", alias="urlsplit")
        self.assertEqual(result, 'http')

    def test_split_url_exception(self):
        with self.assertRaises(AnsibleFilterError):
            split_url("http://www.example.com", query="unknown")

    def test_split_url_exception_alias(self):
        with self.assertRaises(AnsibleFilterError):
            split_url("http://www.example.com", query="unknown", alias="urlsplit")

class TestFilterModule(unittest.TestCase):
    def test_filters(self):
        instance = FilterModule()
        result = instance.filters()
        self.assertEqual(result, {'urlsplit': split_url})

if __name__ == '__main__':
    unittest.main()