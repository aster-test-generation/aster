from httpie.utils import _max_age_to_expires
import unittest
from httpie.utils import *


class TestLoadJsonPreserveOrder(unittest.TestCase):
    def test_load_json_preserve_order(self):
        json_str = '{"key": "value", "foo": "bar"}'
        result = load_json_preserve_order(json_str)
        self.assertIsInstance(result, OrderedDict)
        self.assertEqual(result, OrderedDict([('key', 'value'), ('foo', 'bar')]))

class TestReprDict(unittest.TestCase):
    def test_repr_dict(self):
        d = {'key': 'value', 'foo': 'bar'}
        result = repr_dict(d)
        self.assertIsInstance(result, str)
        self.assertEqual(result, "{'key': 'value', 'foo': 'bar'}")

class TestHumanizeBytes(unittest.TestCase):
    def test_humanize_bytes(self):
        result = humanize_bytes(1024)
        self.assertIsInstance(result, str)
        self.assertEqual(result, '1.00 kB')

class TestExplicitNullAuth(unittest.TestCase):
    def test_explicit_null_auth(self):
        auth = ExplicitNullAuth()
        request = {'foo': 'bar'}
        result = auth(request)
        self.assertEqual(result, request)

class TestGetContentType(unittest.TestCase):
    def test_get_content_type(self):
        result = get_content_type('example.txt')
        self.assertIsInstance(result, str)
        self.assertEqual(result, 'text/plain')

class TestGetExpiredCookies(unittest.TestCase):
    def test_get_expired_cookies(self):
        headers = [('Set-Cookie', 'cookie1=foo; expires=Wed, 21-Jan-2026 01:23:45 GMT'), 
                   ('Set-Cookie', 'cookie2=bar; max-age=3600')]
        result = get_expired_cookies(headers)
        self.assertIsInstance(result, list)
        self.assertEqual(result, [{'name': 'cookie1', 'path': '/'}, {'name': 'cookie2', 'path': '/'}])

class TestMaxAgeToExpires(unittest.TestCase):
    def test_max_age_to_expires(self):
        cookies = [{'name': 'cookie', 'max-age': '3600'}]
        _max_age_to_expires(cookies=cookies, now=time.time())
        self.assertIn('expires', cookies[0])

if __name__ == '__main__':
    unittest.main()