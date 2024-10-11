import unittest
from httpie.utils import (
    ExplicitNullAuth,
    _max_age_to_expires,
    get_content_type,
    get_expired_cookies,
    load_json_preserve_order,
    repr_dict,
    humanize_bytes,
)


class TestExplicitNullAuth(unittest.TestCase):
    def test_call(self):
        auth = ExplicitNullAuth()
        request = object()
        result = auth(request)
        self.assertEqual(result, request)

class TestLoadJsonPreserveOrder(unittest.TestCase):
    def test_load_json_preserve_order(self):
        s = '{"a": 1, "b": 2}'
        result = load_json_preserve_order(s)
        self.assertEqual(result, {'a': 1, 'b': 2})

class TestReprDict(unittest.TestCase):
    def test_repr_dict(self):
        d = {'a': 1, 'b': 2}
        result = repr_dict(d)
        self.assertEqual(result, "{'a': 1, 'b': 2}")

class TestHumanizeBytes(unittest.TestCase):
    def test_humanize_bytes(self):
        result = humanize_bytes(1024)
        self.assertEqual(result, "1.00 KB")

class TestGetExpiredCookies(unittest.TestCase):
    def test_get_expired_cookies(self):
        headers = [
            ('Set-Cookie', 'a=1; expires=Thu, 01-Jan-1970 00:00:00 GMT'),
            ('Set-Cookie', 'b=2; max-age=3600'),
            ('Set-Cookie', 'c=3'),
        ]
        now = 1609459200
        result = get_expired_cookies(headers, now)
        self.assertEqual(result, [{'name': 'a', 'path': '/'}, {'name': 'c', 'path': '/'}])

class TestGetContentType(unittest.TestCase):
    def test_get_content_type(self):
        result = get_content_type('test.txt')
        self.assertEqual(result, 'text/plain')

class TestMaxAgeToExpires(unittest.TestCase):
    def test_max_age_to_expires(self):
        cookies = [{'name': 'a', 'max-age': 3600}]
        now = 1609459200
        _max_age_to_expires(cookies, now)
        self.assertEqual(cookies[0]['expires'], 1609495200)

if __name__ == '__main__':
    unittest.main()