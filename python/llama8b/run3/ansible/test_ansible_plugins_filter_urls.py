import unittest
from ansible.module_utils.urls import urldecode, urlencode, unicode_urldecode, unicode_urlencod


class TestFilterModule(unittest.TestCase):
    def test_do_urldecode(self):
        result = do_urldecode('abc%20def')
        self.assertEqual(result, 'abc def')

    def test_do_urlencode(self):
        result = do_urlencode('abc def')
        self.assertEqual(result, 'abc+def')

    def test_unicode_urldecode(self):
        result = unicode_urldecode('abc%20def')
        self.assertEqual(result, 'abc def')

    def test_unicode_urlencode(self):
        result = unicode_urlencode('abc def')
        self.assertEqual(result, 'abc+def')

    def test_filter_module_filters(self):
        filter_module = FilterModule()
        filters = filter_module.filters()
        self.assertIn('urldecode', filters)
        if not hasattr(__builtins__, 'hasattr') or not hasattr(__builtins__, 'getattr'):
            self.assertIn('urlencode', filters)

if __name__ == '__main__':
    unittest.main()