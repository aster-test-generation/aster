import unittest
from ansible.plugins.filter.urls import unicode_urldecode, do_urldecode, unicode_urlencode, do_urlencode


class TestUrls(unittest.TestCase):
    def test_unicode_urldecode(self):
        self.assertEqual(unicode_urldecode('hello%20world'), 'hello world')

    def test_do_urldecode(self):
        self.assertEqual(do_urldecode('hello%20world'), 'hello world')

    def test_unicode_urlencode(self):
        self.assertEqual(unicode_urlencode('hello world'), 'hello%20world')

    def test_do_urlencode(self):
        self.assertEqual(do_urlencode('hello world'), 'hello%20world')

if __name__ == '__main__':
    unittest.main()