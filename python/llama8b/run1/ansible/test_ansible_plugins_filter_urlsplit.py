import unittest
from unittest.mock import patch
from ansible.module_utils.six.moves.urllib.parse import urlsplit
from ansible.module_utils.basic import *


class TestUrlSplit(unittest.TestCase):
    def test_split_url(self):
        result = split_url('http://example.com/path?query=1&query=2')
        self.assertEqual(result, {'query': 'query=1&query=2'})

    def test_split_url_query(self):
        result = split_url('http://example.com/path?query=1&query=2', query='query')
        self.assertEqual(result, 'query=1&query=2')

    def test_split_url_query_not_found(self):
        with self.assertRaises(AnsibleFilterError):
            split_url('http://example.com/path', query='query')

    def test_split_url_no_query(self):
        result = split_url('http://example.com/path')
        self.assertEqual(result, {})

    def test_split_url_invalid_url(self):
        with self.assertRaises(AnsibleFilterError):
            split_url('invalid_url')

    def test_filter_module_filters(self):
        filter_module = FilterModule()
        self.assertEqual(filter_module.filters(), {'urlsplit': split_url})

    def test_filter_module_init(self):
        filter_module = FilterModule()
        self.assertEqual(filter_module.__class__, FilterModule)

    def test_filter_module_str(self):
        filter_module = FilterModule()
        self.assertEqual(str(filter_module), 'URI filter')

    def test_filter_module_repr(self):
        filter_module = FilterModule()
        self.assertEqual(repr(filter_module), 'FilterModule()')

    def test_filter_module_eq(self):
        filter_module1 = FilterModule()
        filter_module2 = FilterModule()
        self.assertEqual(filter_module1, filter_module2)

if __name__ == '__main__':
    unittest.main()