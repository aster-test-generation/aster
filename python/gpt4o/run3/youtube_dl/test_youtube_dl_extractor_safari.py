import unittest
from youtube_dl.extractor.safari import SafariBaseIE, SafariIE, SafariApiIE, SafariCourseIE
from youtube_dl.utils import ExtractorError


class TestSafariBaseIE(unittest.TestCase):
    def setUp(self):
        self.instance = SafariBaseIE()

    def test_real_initialize(self):
        with unittest.patch.object(self.instance, '_login') as mock_login:
            self.instance._real_initialize()
            mock_login.assert_called_once()

    def test_login_no_credentials(self):
        with unittest.mock.patch.object(self.instance, '_get_login_info', return_value=(None, None)):
            self.instance._login()
            self.assertFalse(self.instance.LOGGED_IN)

    def test_login_success(self):
        with unittest.patch.object(self.instance, '_get_login_info', return_value=('user', 'pass')), \
             unittest.mock.patch.object(self.instance, '_download_webpage_handle', return_value=(None, unittest.mock.Mock(geturl=lambda: 'https://learning.oreilly.com/home/'))):
            self.instance._login()
            self.assertTrue(self.instance.LOGGED_IN)

    def test_login_failure(self):
        with unittest.patch.object(self.instance, '_get_login_info', return_value=('user', 'pass')), \
             unittest.mock.patch.object(self.instance, '_download_webpage_handle', return_value=(None, unittest.mock.Mock(geturl=lambda: 'https://learning.oreilly.com/redirect'))), \
             unittest.mock.patch.object(self.instance, '_download_json_handle', return_value=({'logged_in': False, 'credentials': 'Invalid'}, None)), \
             self.assertRaises(ExtractorError):
            self.instance._login()

class TestSafariIE(unittest.TestCase):
    def setUp(self):
        self.instance = SafariIE()

    def test_real_extract(self):
        url = 'https://www.safaribooksonline.com/library/view/hadoop-fundamentals-livelessons/9780133392838/part00.html'
        with unittest.patch.object(self.instance, '_download_webpage_handle', return_value=('webpage', unittest.mock.Mock(geturl=lambda: url))), \
             unittest.mock.patch.object(self.instance, '_search_regex', side_effect=['ref_id', 'partner_id', 'ui_id']), \
             unittest.mock.patch.object(self.instance, 'url_result', return_value='result'):
            result = self.instance._real_extract(url)
            self.assertEqual(result, 'result')

class TestSafariApiIE(unittest.TestCase):
    def setUp(self):
        self.instance = SafariApiIE()

    def test_real_extract(self):
        url = 'https://www.safaribooksonline.com/api/v1/book/9780133392838/chapter/part00.html'
        with unittest.patch.object(self.instance, '_download_json', return_value={'web_url': 'https://example.com'}), \
             unittest.mock.patch.object(self.instance, 'url_result', return_value='result'):
            result = self.instance._real_extract(url)
            self.assertEqual(result, 'result')

class TestSafariCourseIE(unittest.TestCase):
    def setUp(self):
        self.instance = SafariCourseIE()

    def test_suitable(self):
        url = 'https://www.safaribooksonline.com/library/view/hadoop-fundamentals-livelessons/9780133392838/'
        self.assertTrue(SafariCourseIE.suitable(url))

    def test_real_extract(self):
        url = 'https://www.safaribooksonline.com/library/view/hadoop-fundamentals-livelessons/9780133392838/'
        with unittest.patch.object(self.instance, '_download_json', return_value={'chapters': ['chapter1', 'chapter2'], 'title': 'Course Title'}), \
             unittest.mock.patch.object(self.instance, 'url_result', side_effect=['result1', 'result2']), \
             unittest.mock.patch.object(self.instance, 'playlist_result', return_value='playlist'):
            result = self.instance._real_extract(url)
            self.assertEqual(result, 'playlist')

class TestSafariBaseIE(unittest.TestCase):
    def setUp(self):
        self.instance = SafariBaseIE()

    def test_real_initialize(self):
        self.instance._real_initialize()
        self.assertTrue(self.instance.LOGGED_IN)

    def test_login(self):
        self.instance._login()
        self.assertTrue(self.instance.LOGGED_IN)

    def test_private_login(self):
        self.instance._SafariBaseIE__login()
        self.assertTrue(self.instance.LOGGED_IN)

class TestSafariIE(unittest.TestCase):
    def setUp(self):
        self.instance = SafariIE()

    def test_real_extract(self):
        url = 'https://www.safaribooksonline.com/library/view/hadoop-fundamentals-livelessons/9780133392838/part00.html'
        result = self.instance._real_extract(url)
        self.assertIn('https://cdnapisec.kaltura.com/html5/html5lib/v2.37.1/mwEmbedFrame.php', result['url'])

class TestSafariApiIE(unittest.TestCase):
    def setUp(self):
        self.instance = SafariApiIE()

    def test_real_extract(self):
        url = 'https://www.safaribooksonline.com/api/v1/book/9780133392838/chapter/part00.html'
        result = self.instance._real_extract(url)
        self.assertIn('https://www.safaribooksonline.com/library/view/hadoop-fundamentals-livelessons/9780133392838/part00.html', result['url'])

class TestSafariCourseIE(unittest.TestCase):
    def setUp(self):
        self.instance = SafariCourseIE()

    def test_suitable(self):
        url = 'https://www.safaribooksonline.com/library/view/hadoop-fundamentals-livelessons/9780133392838/'
        result = self.instance.suitable(url)
        self.assertTrue(result)

    def test_real_extract(self):
        url = 'https://www.safaribooksonline.com/library/view/hadoop-fundamentals-livelessons/9780133392838/'
        result = self.instance._real_extract(url)
        self.assertEqual(result['id'], '9780133392838')
        self.assertEqual(result['title'], 'Hadoop Fundamentals LiveLessons')

if __name__ == '__main__':
    unittest.main()