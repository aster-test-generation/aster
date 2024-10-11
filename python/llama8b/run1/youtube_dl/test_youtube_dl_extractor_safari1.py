import unittest
from youtube_dl.extractor.safari import SafariBaseIE, SafariIE, SafariApiIE, SafariCourseIE

class TestSafariBaseIE(unittest.TestCase):
    def test_real_initialize(self):
        ie = SafariBaseIE()
        ie._real_initialize()
        self.assertTrue(ie.LOGGED_IN)

    def test_login(self):
        ie = SafariBaseIE()
        ie._login()
        self.assertTrue(ie.LOGGED_IN)

    def test_apply_first_set_cookie_header(self):
        ie = SafariBaseIE()
        ie._apply_first_set_cookie_header(None, 'groot_sessionid')
        self.assertTrue(True)

    def test_download_webpage_handle(self):
        ie = SafariBaseIE()
        _, urlh = ie._download_webpage_handle('https://learning.oreilly.com/accounts/login-check/', None, 'Downloading login page')
        self.assertTrue(urlh)

    def test_download_json_handle(self):
        ie = SafariBaseIE()
        _, urlh = ie._download_json_handle('https://www.oreilly.com/member/auth/login/', None, 'Logging in', data=json.dumps({'email': 'test@example.com', 'password': 'test_password'}).encode(), headers={'Content-Type': 'application/json', 'Referer': 'https://learning.oreilly.com/accounts/login-check/'}, expected_status=400)
        self.assertTrue(urlh)

class TestSafariIE(unittest.TestCase):
    def test_real_extract(self):
        ie = SafariIE()
        result = ie._real_extract('https://www.safaribooksonline.com/library/view/hadoop-fundamentals-livelessons/9780133392838/part00.html')
        self.assertEqual(result['id'], '0_qbqx90ic')

    def test_search_regex(self):
        ie = SafariIE()
        webpage = 'data-reference-id="("id")'
        reference_id = ie._search_regex(r'data-reference-id=(["\'])(?P<id>(?:(?!\1).)+)\1', webpage, 'kaltura reference id', group='id')
        self.assertEqual(reference_id, 'id')

    def test_url_result(self):
        ie = SafariIE()
        result = ie.url_result('https://cdnapisec.kaltura.com/html5/html5lib/v2.37.1/mwEmbedFrame.php', 'Kaltura')
        self.assertEqual(result['id'], 'Kaltura')

class TestSafariApiIE(unittest.TestCase):
    def test_real_extract(self):
        ie = SafariApiIE()
        result = ie._real_extract('https://www.safaribooksonline.com/api/v1/book/9780133392838/chapter/part00.html')
        self.assertEqual(result['web_url'], 'https://www.safaribooksonline.com/api/v1/book/9780133392838/chapter/part00.html')

    def test_search_regex(self):
        ie = SafariApiIE()
        part = ie._download_json('https://www.safaribooksonline.com/api/v1/book/9780133392838/chapter/part00.html', 'part00.html', 'Downloading part JSON')
        self.assertEqual(part['web_url'], 'https://www.safaribooksonline.com/api/v1/book/9780133392838/chapter/part00.html')

class TestSafariCourseIE(unittest.TestCase):
    def test_real_extract(self):
        ie = SafariCourseIE()
        result = ie._real_extract('https://www.safaribooksonline.com/library/view/hadoop-fundamentals-livelessons/9780133392838/')
        self.assertEqual(result['id'], '9780133392838')

    def test_suitable(self):
        ie = SafariCourseIE()
        self.assertFalse(ie.suitable('https://www.safaribooksonline.com/api/v1/book/9780133392838/chapter/part00.html'))

if __name__ == '__main__':
    unittest.main()