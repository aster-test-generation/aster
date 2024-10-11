import unittest
from pytutils.urls import update_query_params


class TestUpdateQueryParams(unittest.TestCase):
    def test_update_query_params(self):
        url = "http://example.com/path?a=1&b=2"
        params = {"c": 3, "d": 4}
        result = update_query_params(url, params)
        self.assertEqual(result, "http://example.com/path?a=1&b=2&c=3&d=4")

    def test_update_query_params_doseq(self):
        url = "http://example.com/path?a=1&b=2"
        params = {"c": [3, 4]}
        result = update_query_params(url, params, doseq=True)
        self.assertEqual(result, "http://example.com/path?a=1&b=2&c=3&c=4")

    def test_update_query_params_empty_params(self):
        url = "http://example.com/path?a=1&b=2"
        params = {}
        result = update_query_params(url, params)
        self.assertEqual(result, "http://example.com/path?a=1&b=2")

    def test_update_query_params_empty_url(self):
        url = ""
        params = {"a": 1, "b": 2}
        with self.assertRaises(ValueError):
            update_query_params(url, params)

    def test_update_query_params_invalid_url(self):
        url = "invalid_url"
        params = {"a": 1, "b": 2}
        with self.assertRaises(ValueError):
            update_query_params(url, params)

if __name__ == '__main__':
    unittest.main()