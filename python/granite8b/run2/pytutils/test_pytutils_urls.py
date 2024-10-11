import unittest
from pytutils.urls import update_query_params


class TestUpdateQueryParams(unittest.TestCase):
    def test_update_query_params(self):
        url = 'https://example.com/path?param1=value1'
        params = {'param2': 'value2', 'param3': 'value3'}
        new_url = update_query_params(url, params)
        expected_url = 'https://example.com/path?param1=value1&param2=value2&param3=value3'
        self.assertEqual(new_url, expected_url)

    def test_update_query_params_with_doseq(self):
        url = 'https://example.com/path?param1=value1'
        params = {'param2': ['value2', 'value3']}
        new_url = update_query_params(url, params, doseq=True)
        expected_url = 'https://example.com/path?param1=value1&param2=value2&param2=value3'
        self.assertEqual(new_url, expected_url)

    def test_update_query_params_with_empty_params(self):
        url = 'https://example.com/path?param1=value1'
        params = {}
        new_url = update_query_params(url, params)
        expected_url = 'https://example.com/path?param1=value1'
        self.assertEqual(new_url, expected_url)

    def test_update_query_params_with_empty_url(self):
        url = ''
        params = {'param1': 'value1'}
        new_url = update_query_params(url, params)
        expected_url = '?param1=value1'
        self.assertEqual(new_url, expected_url)

if __name__ == '__main__':
    unittest.main()