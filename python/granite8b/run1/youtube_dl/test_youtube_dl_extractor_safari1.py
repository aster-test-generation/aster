import unittest
from youtube_dl.extractor.safari import SafariBaseIE

class SafariBaseIETest(unittest.TestCase):
    def test_login(self):
        ie = SafariBaseIE(None)
        ie.LOGGED_IN = False
        ie._login()
        self.assertTrue(ie.LOGGED_IN)

    def test_url_result(self):
        ie = SafariBaseIE(None)
        result = ie.url_result('https://example.com', 'example')
        self.assertEqual(result['ie_key'], 'example')
        self.assertEqual(result['url'], 'https://example.com')

if __name__ == '__main__':
    unittest.main()