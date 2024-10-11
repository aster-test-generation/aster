import unittest
from pytutils.urls import update_query_params


class TestUpdateQueryParams(unittest.TestCase):
    def test_update_query_params(self):
        url = "https://example.com/path?a=1&b=2"
        params = {"a": 3, "c": 4}
        result = update_query_params(url, params)
        self.assertEqual(result, "https://example.com/path?a=3&b=2&c=4")

    def test_update_query_params_doseq(self):
        url = "https://example.com/path?a=1&a=2"
        params = {"a": [3, 4]}
        result = update_query_params(url, params, doseq=True)
        self.assertEqual(result, "https://example.com/path?a=3&a=4"

    def test_update_query_params_fragment(self):
        url = "https://example.com/path?a=1#fragment"
        params = {"b": 2}
        result = update_query_params(url, params)
        self.assertEqual(result, "https://example.com/path?a=1&b=2#fragment")

    def test_update_query_params_no_query_string(self):
        url = "https://example.com/path"
        params = {"a": 1}
        result = update_query_params(url, params)
        self.assertEqual(result, "https://example.com/path?a=1")

if __name__ == '__main__':
    unittest.main()