import unittest
from ansible.module_utils.urls import urldecode, urlencode, unicode_urldecode, unicode_urlencod


class TestFilterModule(unittest.TestCase):
    def test_filters(self):
        filter_module = FilterModule()
        filters = filter_module.filters()
        self.assertIn('urldecode', filters)
        if not hasattr(__builtins__, 'hasattr'):
            self.assertIn('urlencode', filters)

    def test_do_urldecode(self):
        result = do_urldecode('abc%20def')
        self.assertEqual(result, 'abc def')

    def test_do_urlencode(self):
        result = do_urlencode({'a': 'b', 'c': 'd'})
        self.assertEqual(result, 'a=b&c=d')

    def test_unicode_urldecode(self):
        result = unicode_urldecode('abc%20def')
        self.assertEqual(result, 'abc def')

    def test_unicode_urlencode(self):
        result = unicode_urlencode('abc def')
        self.assertEqual(result, 'abc%20def')

    def test_urldecode(self):
        result = FilterModule().urldecode('abc%20def')
        self.assertEqual(result, 'abc def')

    def test_urlencode(self):
        result = FilterModule().urlencode({'a': 'b', 'c': 'd'})
        self.assertEqual(result, 'a=b&c=d')

if __name__ == '__main__':
    unittest.main()