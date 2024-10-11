import unittest
from pytutils.urls import *


class TestUpdateQueryParams(unittest.TestCase):
    def test_update_query_params(self):
        url = "http://www.example.com/path?a=1&b=2"
        params = {"c": 3}
        doseq = True
        result = update_query_params(url, params, doseq)
        self.assertEqual(result, "http://www.example.com/path?a=1&b=2&c=3")

if __name__ == '__main__':
    unittest.main()