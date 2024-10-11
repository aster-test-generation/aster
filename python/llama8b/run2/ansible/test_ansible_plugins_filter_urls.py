import unittest
from ansible.module_utils.urls import urldecode, urlencode, unicode_urldecode, unicode_urlencod


class TestFilterModule(unittest.TestCase):
    def test_filters(self):
        filter_module = FilterModule()
        filters = filter_module.filters()
        self.assertIn('urldecode', filters)
        if not hasattr(__builtins__, 'hasattr') or not hasattr(__builtins__, 'hasattr')(HAS_URLENCODE):
            self.assertIn('urlencode', filters)

    def test_do_urldecode(self):
        self.assertEqual(do_urldecode('abc%20def'), 'abc def')
        self.assertEqual(do_urldecode('abc%20def%20ghi'), 'abc def ghi')

    def test_do_urlencode(self):
        self.assertEqual(do_urlencode('abc def'), 'abc+def')
        self.assertEqual(do_urlencode('abc def', for_qs=True), 'abc+def')

    def test_unicode_urldecode(self):
        self.assertEqual(unicode_urldecode('abc%20def'), 'abc def')
        self.assertEqual(unicode_urldecode('abc%20def%20ghi'), 'abc def ghi')

    def test_unicode_urlencode(self):
        self.assertEqual(unicode_urlencode('abc def'), 'abc+def')
        self.assertEqual(unicode_urlencode('abc def', for_qs=True), 'abc+def')

if __name__ == '__main__':
    unittest.main()