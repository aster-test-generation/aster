import unittest
from pytutils.urls import update_query_params


class TestUpdateQueryParams(unittest.TestCase):
    def test_update_query_params_with_empty_params(self):
        url = "https://example.com/path?existing_param=value"
        params = {}
        expected_url = "https://example.com/path?existing_param=value"
        actual_url = update_query_params(url, params)
        self.assertEqual(actual_url, expected_url)

    def test_update_query_params_with_new_params(self):
        url = "https://example.com/path"
        params = {"new_param": "value"}
        expected_url = "https://example.com/path?new_param=value"
        actual_url = update_query_params(url, params)
        self.assertEqual(actual_url, expected_url)

    def test_update_query_params_with_existing_and_new_params(self):
        url = "https://example.com/path?existing_param=value"
        params = {"new_param": "value"}
        expected_url = "https://example.com/path?existing_param=value&new_param=value"
        actual_url = update_query_params(url, params)
        self.assertEqual(actual_url, expected_url)

    def test_update_query_params_with_doseq_false(self):
        url = "https://example.com/path"
        params = {"param": ["value1", "value2"]}
        expected_url = "https://example.com/path?param=value1&param=value2"
        actual_url = update_query_params(url, params, doseq=False)
        self.assertEqual(actual_url, expected_url)

    def test_update_query_params_with_doseq_true(self):
        url = "https://example.com/path"
        params = {"param": ["value1", "value2"]}
        expected_url = "https://example.com/path?param=value1&param=value2"
        actual_url = update_query_params(url, params, doseq=True)
        self.assertEqual(actual_url, expected_url)

if __name__ == '__main__':
    unittest.main()