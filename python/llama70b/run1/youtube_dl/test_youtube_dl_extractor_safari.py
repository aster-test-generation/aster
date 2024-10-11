import unittest
from youtube_dl.extractor.safari import SafariBaseIE, SafariIE, SafariApiIE, SafariCourseIE


class TestSafariBaseIE(unittest.TestCase):
    def test__real_initialize(self):
        instance = SafariBaseIE()
        instance._real_initialize()
        self.assertTrue(instance.LOGGED_IN)

    def test__login(self):
        instance = SafariBaseIE()
        instance._login()
        self.assertTrue(instance.LOGGED_IN)

    def test__download_webpage_handle(self):
        instance = SafariBaseIE()
        result = instance._download_webpage_handle('https://example.com', None, 'Downloading webpage')
        self.assertIsNotNone(result)

    def test__download_json_handle(self):
        instance = SafariBaseIE()
        result = instance._download_json_handle('https://example.com', None, 'Downloading JSON')
        self.assertIsNotNone(result)

    def test__apply_first_set_cookie_header(self):
        instance = SafariBaseIE()
        result = instance._apply_first_set_cookie_header(None, 'cookie_name')
        self.assertIsNone(result)

class TestSafariIE(unittest.TestCase):
    def test__real_extract(self):
        instance = SafariIE()
        result = instance._real_extract('https://example.com')
        self.assertIsNotNone(result)

    def test_IE_NAME(self):
        instance = SafariIE()
        self.assertEqual(instance.IE_NAME, 'safari')

    def test_IE_DESC(self):
        instance = SafariIE()
        self.assertEqual(instance.IE_DESC, 'safaribooksonline.com online video')

    def test__VALID_URL(self):
        instance = SafariIE()
        self.assertIsNotNone(instance._VALID_URL)

    def test__PARTNER_ID(self):
        instance = SafariIE()
        self.assertEqual(instance._PARTNER_ID, '1926081')

    def test__UICONF_ID(self):
        instance = SafariIE()
        self.assertEqual(instance._UICONF_ID, '29375172')

class TestSafariApiIE(unittest.TestCase):
    def test__real_extract(self):
        instance = SafariApiIE()
        result = instance._real_extract('https://example.com')
        self.assertIsNotNone(result)

    def test_IE_NAME(self):
        instance = SafariApiIE()
        self.assertEqual(instance.IE_NAME, 'safari:api')

    def test__VALID_URL(self):
        instance = SafariApiIE()
        self.assertIsNotNone(instance._VALID_URL)

class TestSafariCourseIE(unittest.TestCase):
    def test_suitable(self):
        instance = SafariCourseIE()
        result = instance.suitable('https://example.com')
        self.assertTrue(result)

    def test__real_extract(self):
        instance = SafariCourseIE()
        result = instance._real_extract('https://example.com')
        self.assertIsNotNone(result)

    def test_IE_NAME(self):
        instance = SafariCourseIE()
        self.assertEqual(instance.IE_NAME, 'safari:course')

    def test_IE_DESC(self):
        instance = SafariCourseIE()
        self.assertEqual(instance.IE_DESC, 'safaribooksonline.com online courses')

    def test__VALID_URL(self):
        instance = SafariCourseIE()
        self.assertIsNotNone(instance._VALID_URL)

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
        url = 'https://learning.oreilly.com/accounts/login-check/'
        result, urlh = ie._download_webpage_handle(url, None, 'Downloading login page')
        self.assertIsNotNone(result)

    def test__download_json_handle(self):
        ie = SafariBaseIE()
        url = 'https://www.oreilly.com/member/auth/login/'
        result, urlh = ie._download_json_handle(url, None, 'Logging in', data='{}', headers={'Content-Type': 'application/json'})
        self.assertIsNotNone(result)

    def test__apply_first_set_cookie_header(self):
        ie = SafariBaseIE()
        urlh = object()
        ie._apply_first_set_cookie_header(urlh, 'groot_sessionid')
        # No assertion, just test that it doesn't raise an error

class TestSafariIE(unittest.TestCase):
    def test__real_extract(self):
        ie = SafariIE()
        url = 'https://www.safaribooksonline.com/library/view/hadoop-fundamentals-livelessons/9780133392838/part00.html'
        result = ie._real_extract(url)
        self.assertIsNotNone(result)

    def test__search_regex(self):
        ie = SafariIE()
        webpage = '<html><body data-reference-id="12345"></body></html>'
        result = ie._search_regex(r'data-reference-id=(["\'])(?P<id>(?:(?!\1).)+)\1', webpage, 'kaltura reference id', group='id')
        self.assertEqual(result, '12345')

class TestSafariApiIE(unittest.TestCase):
    def test__real_extract(self):
        ie = SafariApiIE()
        url = 'https://www.safaribooksonline.com/api/v1/book/9780133392838/chapter/part00.html'
        result = ie._real_extract(url)
        self.assertIsNotNone(result)

class TestSafariCourseIE(unittest.TestCase):
    def test_suitable(self):
        ie = SafariCourseIE()
        url = 'https://www.safaribooksonline.com/library/view/hadoop-fundamentals-livelessons/9780133392838/'
        self.assertTrue(ie.suitable(url))

    def test__real_extract(self):
        ie = SafariCourseIE()
        url = 'https://www.safaribooksonline.com/library/view/hadoop-fundamentals-livelessons/9780133392838/'
        result = ie._real_extract(url)
        self.assertIsNotNone(result)

    def test__match_id(self):
        ie = SafariCourseIE()
        url = 'https://www.safaribooksonline.com/library/view/hadoop-fundamentals-livelessons/9780133392838/'
        result = ie._match_id(url)
        self.assertEqual(result, '9780133392838')

if __name__ == '__main__':
    unittest.main()