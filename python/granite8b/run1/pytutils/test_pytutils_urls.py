import unittest
from pytutils.urls import update_query_params


class TestUpdateQueryParams(unittest.TestCase):
    def test_update_query_params(self):
        url = "https://www.example.com/path?param1=value1"
        params = {"param2": "value2", "param1": "new_value1"}
        expected_url = "https://www.example.com/path?param1=new_value1&param2=value2"
        actual_url = update_query_params(url, params)
        self.assertEqual(actual_url, expected_url)

    def test_update_query_params_with_doseq(self):
        url = "https://www.example.com/path?param1=value1"
        params = {"param2": ["value2_1", "value2_2"]}
        expected_url = "https://www.example.com/path?param1=value1&param2=value2_1&param2=value2_2"
        actual_url = update_query_params(url, params, doseq=True)
        self.assertEqual(actual_url, expected_url)

    def test_update_query_params_with_no_params(self):
        url = "https://www.example.com/path?param1=value1"
        params = {}
        expected_url = "https://www.example.com/path?param1=value1"
        actual_url = update_query_params(url, params)
        self.assertEqual(actual_url, expected_url)

    def test_update_query_params_with_empty_params(self):
        url = "https://www.example.com/path?param1=value1"
        params = {}
        expected_url = "https://www.example.com/path?param1=value1"
        actual_url = update_query_params(url, params)
        self.assertEqual(actual_url, expected_url)

    def test_update_query_params_with_no_query_string(self):
        url = "https://www.example.com/path"
        params = {"param1": "value1"}
        expected_url = "https://www.example.com/path?param1=value1"
        actual_url = update_query_params(url, params)
        self.assertEqual(actual_url, expected_url)

    def test_update_query_params_with_empty_query_string(self):
        url = "https://www.example.com/path?"
        params = {"param1": "value1"}
        expected_url = "https://www.example.com/path?param1=value1"
        actual_url = update_query_params(url, params)
        self.assertEqual(actual_url, expected_url)

    def test_update_query_params_with_no_scheme_or_netloc(self):
        url = "/path?param1=value1"
        params = {"param2": "value2"}
        expected_url = "/path?param1=value1&param2=value2"
        actual_url = update_query_params(url, params)
        self.assertEqual(actual_url, expected_url)

    def test_update_query_params_with_empty_scheme_or_netloc(self):
        url = "//path?param1=value1"
        params = {"param2": "value2"}
        expected_url = "//path?param1=value1&param2=value2"
        actual_url = update_query_params(url, params)
        self.assertEqual(actual_url, expected_url)

    def test_update_query_params_with_no_path(self):
        url = "https://www.example.com?"
        params = {"param1": "value1"}
        expected_url = "https://www.example.com?param1=value1"
        actual_url = update_query_params(url, params)
        self.assertEqual(actual_url, expected_url)

    def test_update_query_params_with_empty_path(self):
        url = "https://www.example.com?param1=value1"
        params = {}
        expected_url = "https://www.example.com?param1=value1"
        actual_url = update_query_params(url, params)
        self.assertEqual(actual_url, expected_url)

if __name__ == '__main__':
    unittest.main()