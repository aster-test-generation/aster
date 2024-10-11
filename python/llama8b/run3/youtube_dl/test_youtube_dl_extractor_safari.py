import unittest
from youtube_dl.extractor.safari import SafariBaseIE, SafariIE, SafariApiIE, SafariCourseIE


class TestSafariBaseIE(unittest.TestCase):
    def test__real_initialize(self):
        ie = SafariBaseIE()
        ie._real_initialize()
        self.assertTrue(ie.LOGGED_IN)

    def test__login(self):
        ie = SafariBaseIE()
        ie._login()
        self.assertTrue(ie.LOGGED_IN)

    def test__download_webpage_handle(self):
        ie = SafariBaseIE()
        urlh = ie._download_webpage_handle('https://example.com', None, 'Downloading webpage')
        self.assertIsNotNone(urlh)

    def test__download_json_handle(self):
        ie = SafariBaseIE()
        urlh = ie._download_json_handle('https://example.com', None, 'Downloading JSON', data=b'{}', headers={'Content-Type': 'application/json'}, expected_status=200)
        self.assertIsNotNone(urlh)

    def test__apply_first_set_cookie_header(self):
        ie = SafariBaseIE()
        urlh = ie._apply_first_set_cookie_header(None, 'cookie')
        self.assertIsNotNone(urlh)

class TestSafariIE(unittest.TestCase):
    def test__real_extract(self):
        ie = SafariIE()
        url = 'https://www.safaribooksonline.com/library/view/hadoop-fundamentals-livelessons/9780133392838/part00.html'
        result = ie._real_extract(url)
        self.assertIsNotNone(result)

    def test__search_regex(self):
        ie = SafariIE()
        webpage = '<div data-reference-id="reference_id">'
        result = ie._search_regex(r'data-reference-id=(["\'])(?P<id>(?:(?!\1).)+)\1', webpage, 'kaltura reference id', group='id')
        self.assertEqual(result, 'reference_id')

class TestSafariApiIE(unittest.TestCase):
    def test__real_extract(self):
        ie = SafariApiIE()
        url = 'https://www.safaribooksonline.com/api/v1/book/9780133392838/chapter/part00.html'
        result = ie._real_extract(url)
        self.assertIsNotNone(result)

class TestSafariCourseIE(unittest.TestCase):
    def test__real_extract(self):
        ie = SafariCourseIE()
        url = 'https://www.safaribooksonline.com/library/view/hadoop-fundamentals-livelessons/9780133392838/'
        result = ie._real_extract(url)
        self.assertIsNotNone(result)

if __name__ == '__main__':
    unittest.main()