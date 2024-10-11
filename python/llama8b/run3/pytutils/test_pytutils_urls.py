import unittest
from pytutils.urls import update_query_params


class TestUpdateQueryParams(unittest.TestCase):
    def test_update_query_params(self):
        url = "http://example.com/path?param1=value1&param2=value2"
        params = {"param3": "value3", "param4": "value4"}
        result = update_query_params(url, params)
        self.assertEqual(result, "http://example.com/path?param1=value1&param2=value2&param3=value3&param4=value4")

    def test_update_query_params_doseq(self):
        url = "http://example.com/path?param1=value1&param2=value2"
        params = {"param3": ["value3", "value4"]}
        result = update_query_params(url, params, doseq=True)
        self.assertEqual(result, "http://example.com/path?param1=value1&param2=value2&param3=value3&param3=value4")

    def test_update_query_params_empty_params(self):
        url = "http://example.com/path?param1=value1&param2=value2"
        params = {}
        result = update_query_params(url, params)
        self.assertEqual(result, "http://example.com/path?param1=value1&param2=value2")

    def test_update_query_params_empty_url(self):
        url = ""
        params = {"param1": "value1"}
        with self.assertRaises(ValueError):
            update_query_params(url, params)

    def test_update_query_params_invalid_url(self):
        url = "invalid_url"
        params = {"param1": "value1"}
        with self.assertRaises(ValueError):
            update_query_params(url, params)

if __name__ == '__main__':
    unittest.main()