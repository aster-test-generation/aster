import unittest
from httpie.utils import load_json_preserve_order, repr_dict, humanize_bytes, ExplicitNullAuth, get_content_type, get_expired_cookies, _max_age_to_expires


class TestHttpieUtils(unittest.TestCase):
    def test_load_json_preserve_order(self):
        json_string = '{"a": 1, "b": 2, "c": 3}'
        result = load_json_preserve_order(json_string)
        self.assertEqual(result, OrderedDict([('a', 1), ('b', 2), ('c', 3)]))

    def test_repr_dict(self):
        dictionary = {'a': 1, 'b': 2, 'c': 3}
        result = repr_dict(dictionary)
        self.assertEqual(result, "{'a': 1, 'b': 2, 'c': 3}")

    def test_humanize_bytes(self):
        bytes = 1024
        result = humanize_bytes(bytes)
        self.assertEqual(result, '1.00 kB')

    def test_explicit_null_auth(self):
        auth = ExplicitNullAuth()
        response = requests.Response()
        result = auth(response)
        self.assertEqual(result, response)

    def test_get_content_type(self):
        filename = 'test.txt'
        result = get_content_type(filename)
        self.assertEqual(result, 'text/plain')

    def test_get_expired_cookies(self):
        headers = [('Set-Cookie', 'cookie1=1; expires=2022-01-01T00:00:00'), ('Set-Cookie', 'cookie2=2; max-age=3600')]
        now = time.time()
        result = get_expired_cookies(headers, now)
        self.assertEqual(result, [{'name': 'cookie1', 'path': '/'}])

    def test_max_age_to_expires(self):
        cookie = {'name': 'cookie', 'max-age': '3600'}
        _max_age_to_expires([cookie], time.time())
        self.assertEqual(cookie, {'name': 'cookie', 'expires': time.time() + 3600})

if __name__ == '__main__':
    unittest.main()