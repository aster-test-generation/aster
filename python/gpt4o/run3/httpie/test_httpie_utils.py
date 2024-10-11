from httpie.utils import _max_age_to_expires
import unittest
from httpie.utils import *


class TestUtils(unittest.TestCase):
    def test_load_json_preserve_order(self):
        json_str = '{"b": 1, "a": 2}'
        result = load_json_preserve_order(json_str)
        self.assertEqual(list(result.keys()), ['b', 'a'])

    def test_repr_dict(self):
        d = {'a': 1, 'b': 2}
        result = repr_dict(d)
        self.assertIn("'a': 1", result)
        self.assertIn("'b': 2", result)

    def test_humanize_bytes(self):
        result = humanize_bytes(1024)
        self.assertEqual(result, '1.00 kB')

    def test_humanize_bytes_single_byte(self):
        result = humanize_bytes(1)
        self.assertEqual(result, '1 B')

    def test_get_content_type(self):
        result = get_content_type('example.txt')
        self.assertEqual(result, 'text/plain')

    def test_get_content_type_with_encoding(self):
        result = get_content_type('example.gz')
        self.assertEqual(result, 'application/gzip')

    def test_get_expired_cookies(self):
        headers = [('Set-Cookie', 'name=value; Max-Age=0')]
        result = get_expired_cookies(headers)
        self.assertEqual(result, [{'name': 'name', 'path': '/'}])

    def test_get_expired_cookies_with_expires(self):
        headers = [('Set-Cookie', 'name=value; Expires=Wed, 21 Oct 2015 07:28:00 GMT')]
        result = get_expired_cookies(headers, now=1445412480)  # 21 Oct 2015 07:28:00 GMT
        self.assertEqual(result, [{'name': 'name', 'path': '/'}])

    def test_max_age_to_expires(self):
        cookies = [{'name': 'name', 'max-age': '10'}]
        _max_age_to_expires(cookies, now=1000)
        self.assertEqual(cookies[0]['expires'], 1010)

    def test_max_age_to_expires_with_expires(self):
        cookies = [{'name': 'name', 'expires': 1000}]
        _max_age_to_expires(cookies, now=1000)
        self.assertEqual(cookies[0]['expires'], 1000)

class TestExplicitNullAuth(unittest.TestCase):
    def test_call(self):
        auth = ExplicitNullAuth()
        request = requests.Request()
        result = auth(request)
        self.assertEqual(result, request)

if __name__ == '__main__':
    unittest.main()