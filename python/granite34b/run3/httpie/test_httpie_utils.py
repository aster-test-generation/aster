import unittest
from target_module import ExplicitNullAuth, get_content_type, get_expired_cookies


class TestTargetModule(unittest.TestCase):
    def test_load_json_preserve_order(self):
        s = '[{"key1": "value1"}, {"key2": "value2"}]'
        result = load_json_preserve_order(s)
        self.assertEqual(result, [{"key1": "value1"}, {"key2": "value2"}])

    def test_repr_dict(self):
        d = {"key1": "value1", "key2": "value2"}
        result = repr_dict(d)
        self.assertEqual(result, "{'key1': 'value1', 'key2': 'value2'}")

    def test_humanize_bytes(self):
        n = 1024
        result = humanize_bytes(n)
        self.assertEqual(result, "1.0 kB")

    def test_explicit_null_auth(self):
        r = requests.Request("GET", "http://example.com")
        auth = ExplicitNullAuth()
        r = auth(r)
        self.assertEqual(r.headers, {})

    def test_get_content_type(self):
        filename = "example.txt"
        result = get_content_type(filename)
        self.assertEqual(result, "text/plain")

    def test_get_expired_cookies(self):
        headers = [("Set-Cookie", "name=value; expires=Thu, 01-Jan-1970 00:00:01 GMT")]
        result = get_expired_cookies(headers)
        self.assertEqual(result, [{"name": "name", "path": "/"}])

if __name__ == '__main__':
    unittest.main()