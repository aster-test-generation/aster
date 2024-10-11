import unittest
from ansible.module_utils.urls import FilterModule, do_urldecode, do_urlencode, unicode_urldecode, unicode_urlencod


class TestFilterModule(unittest.TestCase):
    def test_filters(self):
        instance = FilterModule()
        result = instance.filters()
        self.assertIsInstance(result, dict)

    def test_init(self):
        instance = FilterModule()
        self.assertIsNotNone(instance)

    def test_str_method(self):
        instance = FilterModule()
        result = instance.__str__()
        self.assertIsInstance(result, str)

    def test_repr_method(self):
        instance = FilterModule()
        result = instance.__repr__()
        self.assertIsInstance(result, str)

class TestFunctions(unittest.TestCase):
    def test_unicode_urldecode(self):
        result = unicode_urldecode("https%3A%2F%2Fexample.com")
        self.assertEqual(result, "https://example.com")

    def test_do_urldecode(self):
        result = do_urldecode("https%3A%2F%2Fexample.com")
        self.assertEqual(result, "https://example.com")

    def test_unicode_urlencode(self):
        result = unicode_urlencode("https://example.com")
        self.assertEqual(result, "https%3A%2F%2Fexample.com")

    def test_do_urlencode(self):
        result = do_urlencode({"key": "value"})
        self.assertEqual(result, "key=value")

    def test_do_urlencode_dict(self):
        result = do_urlencode({"key": "value", "foo": "bar"})
        self.assertEqual(result, "key=value&foo=bar")

    def test_do_urlencode_list(self):
        result = do_urlencode(["key=value", "foo=bar"])
        self.assertEqual(result, "key=value&foo=bar")

if __name__ == '__main__':
    unittest.main()