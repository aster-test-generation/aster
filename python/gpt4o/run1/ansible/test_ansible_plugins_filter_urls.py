import unittest
from ansible.plugins.filter.urls import *


class TestUrlsModule(unittest.TestCase):
    def test_unicode_urldecode(self):
        result = unicode_urldecode('hello%20world')
        self.assertEqual(result, 'hello world')

    def test_do_urldecode(self):
        result = do_urldecode('hello%20world')
        self.assertEqual(result, 'hello world')

    def test_unicode_urlencode(self):
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
        result = do_urlencode(('hello', 'world'))
        self.assertEqual(result, 'hello%20world')

    def test_do_urlencode_non_iterable(self):
        result = do_urlencode(b'123')
        self.assertEqual(result, '123')

class TestFilterModule(unittest.TestCase):
    def test_filters(self):
        instance = FilterModule()
        filters = instance.filters()
        self.assertIn('urldecode', filters)
        if not HAS_URLENCODE:
            self.assertIn('urlencode', filters)

if __name__ == '__main__':
    unittest.main()