import unittest
from pytutils.urls import update_query_params


class TestUpdateQueryParams(unittest.TestCase):
    def test_update_query_params(self):
        url = "https://example.com/path?param1=value1&param2=value2"
        params = {"param2": "new_value", "param3": "value3"}
        expected_url = "https://example.com/path?param1=value1&param2=new_value&param3=value3"
        actual_url = update_query_params(url, params)
        self.assertEqual(actual_url, expected_url)

    def test_update_query_params_with_doseq(self):
        url = "https://example.com/path?param1=value1"
        params = {"param1": ["value2", "value3"]}
        expected_url = "https://example.com/path?param1=value1&param1=value2&param1=value3"
        actual_url = update_query_params(url, params, doseq=True)
        self.assertEqual(actual_url, expected_url)

    def test_update_query_params_with_private_method(self):
        url = "https://example.com/path?param1=value1"
        params = {"param1": "new_value"}
        expected_url = "https://example.com/path?param1=new_value"
        actual_url = update_query_params(url, params, doseq=True)
        self.assertEqual(actual_url, expected_url)

    def test_update_query_params_with_protected_method(self):
        url = "https://example.com/path?param1=value1"
        params = {"param1": "new_value"}
        expected_url = "https://example.com/path?param1=new_value"
        actual_url = update_query_params(url, params, doseq=True)
        self.assertEqual(actual_url, expected_url)

    def test_update_query_params_with_magic_method(self):
        url = "https://example.com/path?param1=value1"
        params = {"param1": "new_value"}
        expected_url = "https://example.com/path?param1=new_value"
        actual_url = update_query_params(url, params, doseq=True)
        self.assertEqual(actual_url, expected_url)

if __name__ == '__main__':
    unittest.main()