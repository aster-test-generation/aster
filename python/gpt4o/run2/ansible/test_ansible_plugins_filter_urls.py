import unittest
from ansible.plugins.filter.urls import *


class TestUrlsModule(unittest.TestCase):
    def test_unicode_urldecode_py3(self):
        result = unicode_urldecode('hello%20world')
        self.assertEqual(result, 'hello world')

    def test_unicode_urldecode_py2(self):
        # Simulate PY2 environment
        global PY3
        PY3 = False
        result = unicode_urldecode('hello%20world')
        self.assertEqual(result, 'hello world')
        PY3 = True  # Reset to original state

    def test_do_urldecode(self):
        result = do_urldecode('hello%20world')
        self.assertEqual(result, 'hello world')

    def test_unicode_urlencode_py3(self):
        result = unicode_urlencode('hello world')
        self.assertEqual(result, 'hello%20world')

    def test_unicode_urlencode_py2(self):
        # Simulate PY2 environment
        global PY3
        PY3 = False
        result = unicode_urlencode('hello world')
        self.assertEqual(result, 'hello%20world')
        PY3 = True  # Reset to original state

    def test_unicode_urlencode_for_qs(self):
        result = unicode_urlencode('hello world', for_qs=True)
        self.assertEqual(result, 'hello+world')

    def test_do_urlencode_string(self):
        result = do_urlencode('hello world')
        self.assertEqual(result, 'hello%20world')

    def test_do_urlencode_dict(self):
        result = do_urlencode({'key': 'value'})
        self.assertEqual(result, 'key=value')

    def test_do_urlencode_iterable(self):
        result = do_urlencode([('key1', 'value1'), ('key2', 'value2')])
        self.assertEqual(result, 'key1=value1&key2=value2')

    def test_do_urlencode_non_iterable(self):
        result = do_urlencode(b'12345')
        self.assertEqual(result, '12345')

class TestFilterModule(unittest.TestCase):
    def test_filters(self):
        filter_module = FilterModule()
        filters = filter_module.filters()
        self.assertIn('urldecode', filters)
        if not HAS_URLENCODE:
            self.assertIn('urlencode', filters)

if __name__ == '__main__':
    unittest.main()