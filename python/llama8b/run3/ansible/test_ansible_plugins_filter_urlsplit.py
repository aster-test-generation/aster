from ansible.module_utils.common import to_nativ
import unittest
from unittest.mock import patch
from ansible.plugins.filter.urlsplit import split_url, FilterModule


class TestUrlSplit(unittest.TestCase):
    def test_split_url(self):
        result = split_url('http://example.com/path?query=123')
        self.assertEqual(result, {'query': 'query=123'})

    def test_split_url_query(self):
        result = split_url('http://example.com/path?query=123', query='fragment')
        self.assertEqual(result, {'fragment': 'query=123'})

    def test_split_url_query_not_found(self):
        with self.assertRaises(AnsibleFilterError):
            split_url('http://example.com/path', query='fragment')

    def test_split_url_invalid_url(self):
        with self.assertRaises(AnsibleFilterError):
            split_url('invalid_url')

    def test_filters(self):
        fm = FilterModule()
        self.assertEqual(fm.filters(), {'urlsplit': split_url})

    def test_split_url_private_method(self):
        with patch.object(split_url, '__private_method', return_value='private_method_called'):
            result = split_url('http://example.com/path')
            self.assertEqual(result, {'private_method_called': 'private_method_called'})

    def test_split_url_protected_method(self):
        with patch.object(split_url, '_protected_method', return_value='protected_method_called'):
            result = split_url('http://example.com/path')
            self.assertEqual(result, {'protected_method_called': 'protected_method_called'})

    def test_split_url_magic_method(self):
        with patch.object(split_url, '__str__', return_value='str_method_called'):
            result = str(split_url('http://example.com/path'))
            self.assertEqual(result, 'str_method_called')

        with patch.object(split_url, '__repr__', return_value='repr_method_called'):
            result = repr(split_url('http://example.com/path'))
            self.assertEqual(result, 'repr_method_called')

if __name__ == '__main__':
    unittest.main()