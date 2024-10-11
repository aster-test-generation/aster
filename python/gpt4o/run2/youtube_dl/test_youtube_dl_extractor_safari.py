import unittest
from youtube_dl.extractor.safari import SafariBaseIE, SafariIE, SafariApiIE, SafariCourseIE
from youtube_dl.utils import ExtractorError
from unittest.mock import patch, MagicMock


class TestSafariBaseIE(unittest.TestCase):
    def setUp(self):
        self.instance = SafariBaseIE()

    def test_real_initialize(self):
        self.instance._real_initialize()
        self.assertTrue(self.instance.LOGGED_IN is True)

    def test_login(self):
        self.instance._login()
        self.assertTrue(self.instance.LOGGED_IN is True)

    def test_private_login(self):
        self.instance._SafariBaseIE__login
        self.assertTrue(self.instance.LOGGED_IN)

class TestSafariIE(unittest.TestCase):
    def setUp(self):
        self.instance = SafariIE()

    def test_real_extract(self):
        url = 'https://www.safaribooksonline.com/library/view/hadoop-fundamentals-livelessons/9780133392838/part00.html'
        result = self.instance._real_extract(url).to_screen()
        self.assertIn('url', result)

class TestSafariApiIE(unittest.TestCase):
    def setUp(self):
        self.instance = SafariApiIE()

    def test_real_extract(self):
        url = 'https://www.safaribooksonline.com/api/v1/book/9780133392838/chapter/part00.html'
        result = self.instance._real_extract(url).to_screen()
        self.assertIn('url', result)

class TestSafariCourseIE(unittest.TestCase):
    def setUp(self):
        self.instance = SafariCourseIE()

    def test_real_extract(self):
        url = 'https://www.safaribooksonline.com/library/view/hadoop-fundamentals-livelessons/9780133392838/'
        result = self.instance._real_extract(url).to_screen()
        self.assertIn('entries', result)

    def test_suitable(self):
        url = 'https://www.safaribooksonline.com/library/view/hadoop-fundamentals-livelessons/9780133392838/'
        result = self.instance.suitable(url)
        self.assertTrue(result)

class TestSafariBaseIE(unittest.TestCase):
    def setUp(self):
        self.instance = SafariBaseIE()

    @patch('youtube_dl.extractor.safari.SafariBaseIE._get_login_info')
    @patch('youtube_dl.extractor.safari.SafariBaseIE._download_webpage_handle')
    def test_login_success(self, mock_download_webpage_handle, mock_get_login_info):
        mock_get_login_info.return_value = ('username', 'password')
        mock_urlh = MagicMock()
        mock_urlh.geturl.return_value = 'https://learning.oreilly.com/home/'
        mock_download_webpage_handle.return_value = (None, mock_urlh)
        
        self.instance._login()
        self.assertTrue(self.instance.LOGGED_IN)

    @patch('youtube_dl.extractor.safari.SafariBaseIE._get_login_info')
    @patch('youtube_dl.extractor.safari.SafariBaseIE._download_webpage_handle')
    def test_login_failure(self, mock_download_webpage_handle, mock_get_login_info):
        mock_get_login_info.return_value = ('username', 'password')
        mock_urlh = MagicMock()
        mock_urlh.geturl.return_value = 'https://learning.oreilly.com/accounts/login-check/'
        mock_download_webpage_handle.return_value = (None, mock_urlh)
        
        with self.assertRaises(ExtractorError):
            self.instance._login()

    @patch('youtube_dl.extractor.safari.SafariBaseIE._get_login_info')
    @patch('youtube_dl.extractor.safari.SafariBaseIE._download_webpage_handle')
    def test_login_no_credentials(self, mock_download_webpage_handle, mock_get_login_info):
        mock_get_login_info.return_value = (None, None)
        
        self.instance._login()
        self.assertFalse(self.instance.LOGGED_IN)

class TestSafariIE(unittest.TestCase):
    def setUp(self):
        self.instance = SafariIE()

    @patch('youtube_dl.extractor.safari.SafariIE._download_webpage_handle')
    @patch('youtube_dl.extractor.safari.SafariIE._search_regex')
    def test_real_extract(self, mock_search_regex, mock_download_webpage_handle):
        url = 'https://www.safaribooksonline.com/library/view/hadoop-fundamentals-livelessons/9780133392838/part00.html'
        mock_search_regex.side_effect = ['reference_id', 'partner_id', 'ui_id']
        mock_download_webpage_handle.return_value = ('webpage', MagicMock())
        
        result = self.instance._real_extract(url)
        self.assertIn('https://cdnapisec.kaltura.com/html5/html5lib/v2.37.1/mwEmbedFrame.php', result['url'])

class TestSafariApiIE(unittest.TestCase):
    def setUp(self):
        self.instance = SafariApiIE()

    @patch('youtube_dl.extractor.safari.SafariApiIE._download_json')
    def test_real_extract(self, mock_download_json):
        url = 'https://www.safaribooksonline.com/api/v1/book/9780133392838/chapter/part00.html'
        mock_download_json.return_value = {'web_url': 'https://example.com'}
        
        result = self.instance._real_extract(url)
        self.assertEqual(result['url'], 'https://example.com')

class TestSafariCourseIE(unittest.TestCase):
    def setUp(self):
        self.instance = SafariCourseIE()

    @patch('youtube_dl.extractor.safari.SafariCourseIE._download_json')
    def test_real_extract(self, mock_download_json):
        url = 'https://www.safaribooksonline.com/library/view/hadoop-fundamentals-livelessons/9780133392838/'
        mock_download_json.return_value = {
            'chapters': ['https://example.com/chapter1', 'https://example.com/chapter2'],
            'title': 'Hadoop Fundamentals LiveLessons'
        }
        
        result = self.instance._real_extract(url)
        self.assertEqual(result['title'], 'Hadoop Fundamentals LiveLessons')

    def test_suitable(self):
        url = 'https://www.safaribooksonline.com/library/view/hadoop-fundamentals-livelessons/9780133392838/'
        self.assertTrue(SafariCourseIE.suitable(url))

if __name__ == '__main__':
    unittest.main()