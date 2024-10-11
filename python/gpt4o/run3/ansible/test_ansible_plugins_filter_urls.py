import unittest
from ansible.plugins.filter.urls import *


class TestUrlsModule(unittest.TestCase):
    def test_unicode_urldecode_py3(self):
        result = unicode_urldecode('hello%20world')
        self.assertEqual(result, 'hello world')

    def test_do_urldecode(self):
        result = do_urldecode('hello%20world')
        self.assertEqual(result, 'hello world')

    def test_unicode_urlencode_py3(self):
        result = unicode_urlencode('hello world')
        self.assertEqual(result, 'hello%20world')

    def test_unicode_urlencode_for_qs(self):
        result = unicode_urlencode('hello world', for_qs=True)
        self.assertEqual(result, 'hello+world')

    def test_do_urlencode_string(self):
        result = do_urlencode('hello world')
        self.assertEqual(result, 'hello%20world')

    def test_do_urlencode_dict(self):
        result = do_urlencode({'key': 'value'})
        self.assertEqual(result, 'key=value')

    def test_do_urlencode_list(self):
        result = do_urlencode([('key', 'value')])
        self.assertEqual(result, 'key=value')

    def test_do_urlencode_invalid(self):
        result = do_urlencode(b'123')
        self.assertEqual(result, '123')

class TestFilterModule(unittest.TestCase):
    def test_filters_with_urlencode(self):
        filter_module = FilterModule()
        filters = filter_module.filters()
        self.assertIn('urldecode', filters)
        self.assertIn('urldecode', filters)

    def test_filters_without_urlencode(self):
        global HAS_URLENCODE
        HAS_URLENCODE = False
        filter_module = FilterModule()
        filters = filter_module.filters()
        self.assertIn('urldecode', filters)
        self.assertIn('urldecode', filters)
        HAS_URLENCODE = True  # Reset to original state

if __name__ == '__main__':
    unittest.main()