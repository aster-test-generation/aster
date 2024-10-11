import unittest
from unittest.mock import patch
from ansible.module_utils.basic import *


class TestUrlSplit(unittest.TestCase):
    def test_split_url(self):
        result = split_url('http://example.com/path?query=1&query=2')
        self.assertEqual(result, {'query': 'query=1&query=2'})

    def test_split_url_query_not_found(self):
        with self.assertRaises(AnsibleFilterError):
            split_url('http://example.com/path', query='non-existent')

    def test_split_url_query_found(self):
        result = split_url('http://example.com/path?query=1', query='query')
        self.assertEqual(result, '1')

    def test_split_url_no_query(self):
        result = split_url('http://example.com/path')
        self.assertEqual(result, {})

    def test_split_url_invalid_url(self):
        with self.assertRaises(AnsibleFilterError):
            split_url('invalid_url')

    @patch.object(helpers, 'object_to_dict')
    def test_split_url_helper_called(self, mock_object_to_dict):
        split_url('http://example.com/path')
        mock_object_to_dict.assert_called_once_with(urlsplit('http://example.com/path'), exclude=['count', 'index', 'geturl', 'encode'])

    def test_filter_module_filters(self):
        filter_module = FilterModule()
        self.assertEqual(filter_module.filters(), {'urlsplit': split_url})

if __name__ == '__main__':
    unittest.main()