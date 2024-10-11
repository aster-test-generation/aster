import unittest
from ansible.module_utils.urls import FilterModule, do_urldecode, do_urlencode, unicode_urldecode, unicode_urlencod


class TestFilterModule(unittest.TestCase):
    def test_init(self):
        instance = FilterModule()
        self.assertIsInstance(instance, FilterModule)

    def test_filters(self):
        instance = FilterModule()
        filters = instance.filters()
        self.assertIn('urldecode', filters)
        self.assertEqual(filters['urldecode'], do_urldecode)

    def test_filters_with_urllib(self):
        instance = FilterModule()
        filters = instance.filters()
        self.assertIn('urlencode', filters)
        self.assertEqual(filters['urlencode'], do_urlencode)

    def test_str_method(self):
        instance = FilterModule()
        result = instance.__str__()
        self.assertEqual(result, "Ansible core jinja2 filters")

    def test_repr_method(self):
        instance = FilterModule()
        result = instance.__repr__()
        self.assertEqual(result, "FilterModule()")

class TestFunctions(unittest.TestCase):
    def test_unicode_urldecode(self):
        result = unicode_urldecode("Hello%20World")
        self.assertEqual(result, "Hello World")

    def test_do_urldecode(self):
        result = do_urldecode("Hello%20World")
        self.assertEqual(result, "Hello World")

    def test_unicode_urlencode(self):
        result = unicode_urlencode("Hello World")
        self.assertEqual(result, "Hello%20World")

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