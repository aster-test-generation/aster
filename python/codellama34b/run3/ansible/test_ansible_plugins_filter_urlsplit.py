import unittest
from ansible.plugins.filter.urlsplit import *


class TestSplitUrl(unittest.TestCase):
    def test_split_url(self):
        result = split_url("https://www.example.com/path/to/file?query=123")
        self.assertEqual(result, {'scheme': 'https', 'netloc': 'www.example.com', 'path': '/path/to/file', 'query': 'query=123', 'fragment': '', 'username': None, 'password': None, 'hostname': 'www.example.com', 'port': None})

    def test_split_url_query(self):
        result = split_url("https://www.example.com/path/to/file?query=123", query="query")
        self.assertEqual(result, '123')

    def test_split_url_alias(self):
        result = split_url("https://www.example.com/path/to/file?query=123", alias="urlsplit")
        self.assertEqual(result, {'scheme': 'https', 'netloc': 'www.example.com', 'path': '/path/to/file', 'query': 'query=123', 'fragment': '', 'username': None, 'password': None, 'hostname': 'www.example.com', 'port': None})

    def test_split_url_alias_query(self):
        result = split_url("https://www.example.com/path/to/file?query=123", query="query", alias="urlsplit")
        self.assertEqual(result, '123')

    def test_split_url_exception(self):
        with self.assertRaises(AnsibleFilterError):
            split_url("https://www.example.com/path/to/file?query=123", query="unknown")

    def test_split_url_exception_alias(self):
        with self.assertRaises(AnsibleFilterError):
            split_url("https://www.example.com/path/to/file?query=123", query="unknown", alias="urlsplit")

class TestFilterModule(unittest.TestCase):
    def test_filter_module(self):
        instance = FilterModule()
        result = instance.filters()
        self.assertEqual(result, {'urlsplit': split_url})

    def test_filter_module_exception(self):
        with self.assertRaises(AnsibleFilterError):
            instance = FilterModule()
            result = instance.filters()
            self.assertEqual(result, {'urlsplit': split_url})

if __name__ == '__main__':
    unittest.main()