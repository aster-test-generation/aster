import unittest
from pytutils.urls import update_query_params

class TestUpdateQueryParams(unittest.TestCase):
    def test_update_query_params_with_empty_params(self):
        url = "https://example.com/path?existing_param=value"
        params = {}
        new_url = update_query_params(url, params)
        self.assertEqual(new_url, "https://example.com/path?existing_param=value")

    def test_update_query_params_with_new_params(self):
        url = "https://example.com/path"
        params = {"new_param": "value"}
        new_url = update_query_params(url, params)
        self.assertEqual(new_url, "https://example.com/path?new_param=value")

    def test_update_query_params_with_existing_and_new_params(self):
        url = "https://example.com/path?existing_param=value"
        params = {"new_param": "value"}
        new_url = update_query_params(url, params)
        self.assertEqual(new_url, "https://example.com/path?existing_param=value&new_param=value")

    def test_update_query_params_with_doseq_set_to_false(self):
        url = "https://example.com/path"
        params = {"param_list": ["value1", "value2"]}
        new_url = update_query_params(url, params, doseq=False)
        self.assertEqual(new_url, "https://example.com/path?param_list=%5B%27value1%27%2C+%27value2%27%5D")

    def test_update_query_params_with_url_that_already_has_query_string(self):
        url = "https://example.com/path?existing_param=value"
        params = {"new_param": "value"}
        new_url = update_query_params(url, params)
        self.assertEqual(new_url, "https://example.com/path?existing_param=value&new_param=value")

if __name__ == '__main__':
    unittest.main()