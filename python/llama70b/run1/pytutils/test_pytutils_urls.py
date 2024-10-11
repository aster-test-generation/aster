import unittest
from pytutils.urls import update_query_params


class TestUpdateQueryParams(unittest.TestCase):
    def test_update_query_params(self):
        url = "https://example.com/path?a=1&b=2"
        params = {"a": 3, "c": 4}
        new_url = update_query_params(url, params)
        self.assertEqual(new_url, "https://example.com/path?a=3&b=2&c=4")

    def test_update_query_params_doseq(self):
        url = "https://example.com/path?a=1&a=2"
        params = {"a": [3, 4]}
        new_url = update_query_params(url, params, doseq=True)
        self.assertEqual(new_url, "https://example.com/path?a=3&a=4"

    def test_update_query_params_no_doseq(self):
        url = "https://example.com/path?a=1&a=2"
        params = {"a": [3, 4]}
        new_url = update_query_params(url, params, doseq=False)
        self.assertEqual(new_url, "https://example.com/path?a=%5B3%2C+4%5D"

if __name__ == '__main__':
    unittest.main()