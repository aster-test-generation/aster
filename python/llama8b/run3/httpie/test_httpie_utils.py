import unittest
from httpie.utils import load_json_preserve_order, repr_dict, humanize_bytes, ExplicitNullAuth, get_content_type, get_expired_cookies, _max_age_to_expire


class TestHttpieUtils(unittest.TestCase):
    def test_load_json_preserve_order(self):
        json_str = '{"a": 1, "b": 2, "c": 3}'
        result = load_json_preserve_order(json_str)
        self.assertEqual(result, OrderedDict([('a', 1), ('b', 2), ('c', 3)]))

    def test_repr_dict(self):
        dict_obj = {'a': 1, 'b': 2, 'c': 3}
        result = repr_dict(dict_obj)
        self.assertEqual(result, "{'a': 1, 'b': 2, 'c': 3}")

    def test_humanize_bytes(self):
        bytes_value = 1024
        result = humanize_bytes(bytes_value)
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
        headers = [('Set-Cookie', 'cookie1=1; expires=Wed, 21-Jan-2026 12:00:00 GMT'), ('Set-Cookie', 'cookie2=2; max-age=3600')]
        now = time.time()
        result = get_expired_cookies(headers, now)
        self.assertEqual(result, [{'name': 'cookie1', 'path': '/'}])

    def test_max_age_to_expires(self):
        cookie = {'name': 'cookie', 'max-age': '3600'}
        _max_age_to_expires([cookie], time.time())
        self.assertIn('expires', cookie)

if __name__ == '__main__':
    unittest.main()