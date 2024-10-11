import unittest
from pytutils.urls import update_query_params


class TestUpdateQueryParams(unittest.TestCase):
    def test_update_query_params_with_empty_params(self):
        url = "http://example.com/path?foo=bar"
        params = {}
        result = update_query_params(url, params)
        self.assertEqual(result, "http://example.com/path?foo=bar")

    def test_update_query_params_with_new_params(self):
        url = "http://example.com/path?foo=bar"
        params = {'baz': 'qux'}
        result = update_query_params(url, params)
        self.assertEqual(result, "http://example.com/path?foo=bar&baz=qux")

    def test_update_query_params_with_existing_params(self):
        url = "http://example.com/path?foo=bar"
        params = {'foo': 'baz'}
        result = update_query_params(url, params)
        self.assertEqual(result, "http://example.com/path?foo=baz")

    def test_update_query_params_with_multiple_values(self):
        url = "http://example.com/path?foo=bar"
        params = {'foo': ['baz', 'qux']}
        result = update_query_params(url, params)
        self.assertEqual(result, "http://example.com/path?foo=baz&foo=qux")

    def test_update_query_params_with_doseq_false(self):
        url = "http://example.com/path?foo=bar"
        params = {'foo': ['baz', 'qux']}
        result = update_query_params(url, params, doseq=False)
        self.assertEqual(result, "http://example.com/path?foo=['baz', 'qux']")

if __name__ == '__main__':
    unittest.main()