from unittest import mock
import unittest
from httpie.utils import (
    ExplicitNullAuth,
    get_content_type,
    get_expired_cookies,
    load_json_preserve_order,
    repr_dict,
    humanize_bytes,
)


class TestExplicitNullAuth(unittest.TestCase):
    def test_call(self):
        auth = ExplicitNullAuth()
        request = requests.Request('GET', 'http://example.com')
        request = auth(request)
        self.assertEqual(request.headers, {})

class TestGetContentType(unittest.TestCase):
    def test_filename_only(self):
        filename = 'example.txt'
        content_type = get_content_type(filename)
        self.assertEqual(content_type, 'text/plain')

    def test_filename_and_encoding(self):
        filename = 'example.txt'
        content_type = get_content_type(filename)
        self.assertEqual(content_type, 'text/plain')

class TestGetExpiredCookies(unittest.TestCase):
    def test_no_cookies(self):
        headers = []
        expired_cookies = get_expired_cookies(headers)
        self.assertEqual(expired_cookies, [])

    def test_expired_cookies(self):
        headers = [
            ('Set-Cookie', 'session=abc; expires=Thu, 01-Jan-1970 00:00:00 GMT'),
            ('Set-Cookie', 'other=def; expires=Thu, 01-Jan-1970 00:00:00 GMT'),
        ]
        expired_cookies = get_expired_cookies(headers)
        self.assertEqual(expired_cookies, [
            {'name': 'session', 'path': '/'},
            {'name': 'other', 'path': '/'},
        ])

class TestLoadJsonPreserveOrder(unittest.TestCase):
    def test_dict(self):
        json_str = '{"a": 1, "b": 2}'
        data = load_json_preserve_order(json_str)
        self.assertEqual(data, {'a': 1, 'b': 2})

    def test_list(self):
        json_str = '[1, 2, 3]'
        data = load_json_preserve_order(json_str)
        self.assertEqual(data, [1, 2, 3])

    def test_nested(self):
        json_str = '{"a": 1, "b": {"c": 2, "d": 3}}'
        data = load_json_preserve_order(json_str)
        self.assertEqual(data, {'a': 1, 'b': {'c': 2, 'd': 3}})

class TestReprDict(unittest.TestCase):
    def test_dict(self):
        data = {'a': 1, 'b': 2}
        repr_str = repr_dict(data)
        self.assertEqual(repr_str, "{'a': 1, 'b': 2}")

class TestHumanizeBytes(unittest.TestCase):
    def test_bytes(self):
        size = 1024
        human_size = humanize_bytes(size)
        self.assertEqual(human_size, '1.00 KB')

    def test_kilobytes(self):
        size = 1024 * 1024
        human_size = humanize_bytes(size)
        self.assertEqual(human_size, '1.00 MB')

if __name__ == '__main__':
    unittest.main()