import unittest
from pytutils.urls import *


class TestUpdateQueryParams(unittest.TestCase):
    def test_update_query_params(self):
        url = "https://example.com/path?param1=value1"
        params = {"param2": "value2", "param1": "new_value1"}
        expected_url = "https://example.com/path?param1=new_value1&param2=value2"
        result = update_query_params(url, params)
        self.assertEqual(result, expected_url)

    def test_update_query_params_with_doseq(self):
        url = "https://example.com/path?param1=value1"
        params = {"param2": ["value2", "value3"]}
        expected_url = "https://example.com/path?param1=value1&param2=value2&param2=value3"
        result = update_query_params(url, params, doseq=True)
        self.assertEqual(result, expected_url)

    def test_update_query_params_with_empty_params(self):
        url = "https://example.com/path?param1=value1"
        params = {}
        expected_url = "https://example.com/path?param1=value1"
        result = update_query_params(url, params)
        self.assertEqual(result, expected_url)

    def test_update_query_params_with_empty_url(self):
        url = ""
        params = {"param1": "value1"}
        expected_url = "?param1=value1"
        result = update_query_params(url, params)
        self.assertEqual(result, expected_url)

    def test_update_query_params_with_empty_params_and_empty_url(self):
        url = ""
        params = {}
        expected_url = ""
        result = update_query_params(url, params)
        self.assertEqual(result, expected_url)

    def test_update_query_params_with_private_method(self):
        url = "https://example.com/path?param1=value1"
        params = {"param2": "value2"}
        expected_url = "https://example.com/path?param1=value1&param2=value2"
        result = _update_query_params(url, params)
        self.assertEqual(result, expected_url)

    def test_update_query_params_with_protected_method(self):
        url = "https://example.com/path?param1=value1"
        params = {"param2": "value2"}
        expected_url = "https://example.com/path?param1=value1&param2=value2"
        result = _update_query_params(url, params)
        self.assertEqual(result, expected_url)

    def test_update_query_params_with_magic_method(self):
        url = "https://example.com/path?param1=value1"
        params = {"param2": "value2"}
        expected_url = "https://example.com/path?param1=value1&param2=value2"
        result = self.__update_query_params(url, params)
        self.assertEqual(result, expected_url)

if __name__ == '__main__':
    unittest.main()