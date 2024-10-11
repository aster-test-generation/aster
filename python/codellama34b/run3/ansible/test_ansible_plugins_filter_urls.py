import unittest
from ansible.plugins.filter.urls import *


class TestFilterModule(unittest.TestCase):
    def test_filter_module(self):
        instance = FilterModule()
        result = instance.filters()
        self.assertEqual(result, {'urldecode': do_urldecode})

    def test_do_urldecode(self):
        result = do_urldecode("test")
        self.assertEqual(result, "test")

    def test_do_urlencode(self):
        result = do_urlencode("test")
        self.assertEqual(result, "test")

    def test_unicode_urldecode(self):
        result = unicode_urldecode("test")
        self.assertEqual(result, "test")

    def test_unicode_urlencode(self):
        result = unicode_urlencode("test")
        self.assertEqual(result, "test")

if __name__ == '__main__':
    unittest.main()