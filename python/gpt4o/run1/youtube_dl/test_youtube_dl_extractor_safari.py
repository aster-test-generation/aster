import unittest
from youtube_dl.extractor.safari import SafariBaseIE, SafariIE, SafariApiIE, SafariCourseIE
from youtube_dl.utils import ExtractorError


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

if __name__ == '__main__':
    unittest.main()