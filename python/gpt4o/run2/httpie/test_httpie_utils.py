from httpie.utils import max_age_to_expires
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

    def test_ExplicitNullAuth_call(self):
        auth = ExplicitNullAuth()
        request = requests.Request()
        result = auth(request)
        self.assertEqual(result, request)

    def test_get_content_type(self):
        result = get_content_type('example.txt')
        self.assertEqual(result, 'text/plain')

    def test_get_content_type_with_encoding(self):
        result = get_content_type('example.gz')
        self.assertEqual(result, 'application/gzip')

    def test_get_expired_cookies(self):
        headers = [('Set-Cookie', 'name=value; Max-Age=0')]
        result = get_expired_cookies(headers, now=time.time())
        self.assertEqual(result[0]['name'], 'name')

    def test_get_expired_cookies_no_expired(self):
        headers = [('Set-Cookie', 'name=value; Max-Age=3600')]
        result = get_expired_cookies(headers, now=time.time())
        self.assertEqual(result, [])

    def test_max_age_to_expires(self):
        cookies = [{'name': 'test', 'max-age': '3600'}]
        now = time.time()
        _max_age_to_expires(cookies, now)
        self.assertIn('expires', cookies[0])
        self.assertAlmostEqual(cookies[0]['expires'], now + 3600, delta=1)

if __name__ == '__main__':
    unittest.main()