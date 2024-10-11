import unittest
from ansible.plugins.filter.core import FilterModule


class TestUrlDecode(unittest.TestCase):
    def setUp(self):
        self.filter_module = FilterModule()

    def test_unicode_urldecode(self):
        self.assertEqual(self.filter_module.unicode_urldecode('a%20b'), 'a b')

    def test_do_urldecode(self):
        self.assertEqual(self.filter_module.do_urldecode('a%20b'), 'a b')

class TestUrlEncode(unittest.TestCase):
    def setUp(self):
        self.filter_module = FilterModule()

    def test_unicode_urlencode(self):
        self.assertEqual(self.filter_module.unicode_urlencode('a b'), 'a%20b')

    def test_do_urlencode(self):
        self.assertEqual(self.filter_module.do_urlencode('a b'), 'a+b')

class TestFilterModule(unittest.TestCase):
    def setUp(self):
        self.filter_module = FilterModule()

    def test_filters(self):
        filters = self.filter_module.filters()
        self.assertIn('urldecode', filters)
        self.assertIn('urlencode', filters)

if __name__ == '__main__':
    unittest.main()