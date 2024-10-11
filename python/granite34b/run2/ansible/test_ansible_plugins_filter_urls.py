import unittest
from ansible.plugins.filter.urls import do_urldecode, do_urlencode


class TestUrls(unittest.TestCase):
    def test_do_urldecode(self):
        self.assertEqual(do_urldecode("hello%20world"), "hello world")
        self.assertEqual(do_urldecode("hello+world"), "hello world")

    def test_do_urlencode(self):
        self.assertEqual(do_urlencode("hello world"), "hello%20world")
        self.assertEqual(do_urlencode("hello world", for_qs=True), "hello%20world")

if __name__ == '__main__':
    unittest.main()