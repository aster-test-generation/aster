import unittest
from ansible.plugins.filter.core import FilterModule


class TestUrlDecode(unittest.TestCase):
    def test_unicode_urldecode(self):
        result = FilterModule().filters()['urldecode']('a+b')
        self.assertEqual(result, 'a b')

class TestUrlEncode(unittest.TestCase):
    def test_unicode_urlencode(self):
        result = FilterModule().filters()['urlencode']('a b')
        self.assertEqual(result, 'a+b')

class TestFilterModule(unittest.TestCase):
    def test_filters(self):
        filters = FilterModule().filters()
        self.assertIn('urldecode', filters)
        self.assertIn('urlencode', filters)

if __name__ == '__main__':
    unittest.main()