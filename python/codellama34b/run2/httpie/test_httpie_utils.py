import unittest
from httpie.utils import *


class TestLoadJsonPreserveOrder(unittest.TestCase):
    def test_load_json_preserve_order(self):
        result = load_json_preserve_order("")
        self.assertEqual(result, OrderedDict())

class TestReprDict(unittest.TestCase):
    def test_repr_dict(self):
        result = repr_dict({})
        self.assertEqual(result, "{}")

class TestHumanizeBytes(unittest.TestCase):
    def test_humanize_bytes(self):
        result = humanize_bytes(1)
        self.assertEqual(result, "1 B")

class TestExplicitNullAuth(unittest.TestCase):
    def test_explicit_null_auth(self):
        result = ExplicitNullAuth()
        self.assertEqual(result, requests.auth.AuthBase())

class TestGetContentType(unittest.TestCase):
    def test_get_content_type(self):
        result = get_content_type("")
        self.assertEqual(result, None)

class TestGetExpiredCookies(unittest.TestCase):
    def test_get_expired_cookies(self):
        result = get_expired_cookies([])
        self.assertEqual(result, [])

class TestMaxAgeToExpires(unittest.TestCase):
    def test_max_age_to_expires(self):
        result = _max_age_to_expires([], 0)
        self.assertEqual(result, None)

if __name__ == '__main__':
    unittest.main()