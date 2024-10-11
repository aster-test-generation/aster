import unittest
import json
import time
from collections import OrderedDict
from http.cookiejar import parse_ns_headers
from pprint import pformat
import requests
import mimetypes
from httpie.utils import (
    load_json_preserve_order,
    repr_dict,
    humanize_bytes,
    ExplicitNullAuth,
    get_content_type,
    get_expired_cookies,
    _max_age_to_expires
)


class TestUtils(unittest.TestCase):

    def test_load_json_preserve_order(self):
        json_str = '{"b": 1, "a": 2}'
        result = load_json_preserve_order(json_str)
        self.assertEqual(list(result.keys()), ['b', 'a'])

    def test_repr_dict(self):
        d = {'a': 1, 'b': 2}
        result = repr_dict(d)
        self.assertEqual(result, pformat(d))

    def test_humanize_bytes(self):
        result = humanize_bytes(1024)
        self.assertEqual(result, '1.00 kB')

    def test_humanize_bytes_single_byte(self):
        result = humanize_bytes(1)
        self.assertEqual(result, '1 B')

    def test_ExplicitNullAuth_call(self):
        auth = ExplicitNullAuth()
        request = requests.Request()
        result = auth(request)
        self.assertEqual(result, request)

    def test_get_content_type(self):
        result = get_content_type('example.txt')
        self.assertEqual(result, 'text/plain')

    def test_get_content_type_with_encoding(self):
        mimetypes.add_type('application/x-gzip', '.gz')
        result = get_content_type('example.gz')
        self.assertEqual(result, 'application/x-gzip; charset=None')

    def test_get_expired_cookies(self):
        headers = [('Set-Cookie', 'name=value; Max-Age=0')]
        now = time.time()
        result = get_expired_cookies(headers, now)
        self.assertEqual(result, [{'name': 'name', 'path': '/'}])

    def test_max_age_to_expires(self):
        cookies = [{'name': 'name', 'max-age': '10'}]
        now = time.time()
        _max_age_to_expires(cookies, now)
        self.assertIn('expires', cookies[0])
        self.assertAlmostEqual(cookies[0]['expires'], now + 10, delta=1)

if __name__ == '__main__':
    unittest.main()