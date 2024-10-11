import unittest
from ansible.plugins.filter.urlsplit import *


class TestUrlsplit(unittest.TestCase):
    def test_urlsplit(self):
        result = urlsplit("https://www.example.com")
        self.assertEqual(result, "https://www.example.com")

    def test_split_url(self):
        result = split_url("https://www.example.com")
        self.assertEqual(result, "https://www.example.com")

    def test_object_to_dict(self):
        result = helpers.object_to_dict(urlsplit("https://www.example.com"))
        self.assertEqual(result, "https://www.example.com")

    def test_AnsibleFilterError(self):
        result = AnsibleFilterError("urlsplit: unknown URL component: %s" % query)
        self.assertEqual(result, "urlsplit: unknown URL component: %s" % query)

    def test_filters(self):
        result = FilterModule().filters()
        self.assertEqual(result, {'urlsplit': split_url})

if __name__ == '__main__':
    unittest.main()