import unittest
from httpie.utils import (
    ExplicitNullAuth,
    get_content_type,
    get_expired_cookies,
    humanize_bytes,
    load_json_preserve_order,
    repr_dict,
)


class TestExplicitNullAuth(unittest.TestCase):
    def test_call(self):
        auth = ExplicitNullAuth()
        request = requests.Request('GET', 'http://example.com')
        request = auth(request)
        self.assertEqual(request.headers, {})

class TestGetContentType(unittest.TestCase):
    def test_with_extension(self):
        content_type = get_content_type('file.txt')
        self.assertEqual(content_type, 'text/plain')

    def test_with_mimetype(self):
        content_type = get_content_type('file.json')
        self.assertEqual(content_type, 'application/json')

    def test_with_unknown_extension(self):
        content_type = get_content_type('file.unknown')
        self.assertEqual(content_type, 'application/octet-stream')

    def test_with_unknown_mimetype(self):
        content_type = get_content_type('file.unknown')
        self.assertEqual(content_type, 'application/octet-stream')

class TestGetExpiredCookies(unittest.TestCase):
    def test_with_expired_cookies(self):
        headers = [
            ('Set-Cookie', 'session=abc; expires=Thu, 01-Jan-1970 00:00:00 GMT'),
            ('Set-Cookie', 'other=def; expires=Thu, 01-Jan-1970 00:00:00 GMT'),
        ]
        cookies = get_expired_cookies(headers)
        self.assertEqual(cookies, [
            {'name': 'session', 'path': '/'},
            {'name': 'other', 'path': '/'},
        ])

    def test_with_non_expired_cookies(self):
        headers = [
            ('Set-Cookie', 'session=abc; expires=Fri, 01-Jan-2023 00:00:00 GMT'),
            ('Set-Cookie', 'other=def; expires=Fri, 01-Jan-2023 00:00:00 GMT'),
        ]
        cookies = get_expired_cookies(headers)
        self.assertEqual(cookies, [])

class TestHumanizeBytes(unittest.TestCase):
    def test_with_zero_bytes(self):
        self.assertEqual(humanize_bytes(0), '0 B')

    def test_with_one_byte(self):
        self.assertEqual(humanize_bytes(1), '1 B')

    def test_with_one_kilobyte(self):
        self.assertEqual(humanize_bytes(1024), '1.0 kB')

    def test_with_one_megabyte(self):
        self.assertEqual(humanize_bytes(1024 * 1024), '1.0 MB')

    def test_with_one_gigabyte(self):
        self.assertEqual(humanize_bytes(1024 * 1024 * 1024), '1.0 GB')

    def test_with_one_terabyte(self):
        self.assertEqual(humanize_bytes(1024 * 1024 * 1024 * 1024), '1.0 TB')

    def test_with_one_petabyte(self):
        self.assertEqual(humanize_bytes(1024 * 1024 * 1024 * 1024 * 1024), '1.0 PB')

class TestLoadJsonPreserveOrder(unittest.TestCase):
    def test_with_ordered_dict(self):
        json_str = '{"a": 1, "b": 2}'
        data = load_json_preserve_order(json_str)
        self.assertIsInstance(data, OrderedDict)
        self.assertEqual(data, OrderedDict([('a', 1), ('b', 2)]))

if __name__ == '__main__':
    unittest.main()