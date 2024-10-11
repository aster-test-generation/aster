import unittest
from pytutils.urls import *


class TestUpdateQueryParams(unittest.TestCase):
    def test_update_query_params(self):
        url = "https://www.example.com/path/to/file?a=1&b=2"
        params = {"a": 2, "c": 3}
        result = update_query_params(url, params)
        self.assertEqual(result, "https://www.example.com/path/to/file?a=2&b=2&c=3")

if __name__ == '__main__':
    unittest.main()