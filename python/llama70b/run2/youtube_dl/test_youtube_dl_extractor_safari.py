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

    def test_private_method(self):
        instance = SafariBaseIE()
        result = instance._SafariBaseIE__login()
        self.assertTrue(instance.LOGGED_IN)

    def test_str_method(self):
        instance = SafariBaseIE()
        result = instance.__str__()
        self.assertEqual(result, 'SafariBaseIE')

    def test_repr_method(self):
        instance = SafariBaseIE()
        result = instance.__repr__()
        self.assertEqual(result, 'SafariBaseIE()')

class TestSafariIE(unittest.TestCase):
    def test_real_extract(self):
        instance = SafariIE()
        url = 'https://www.safaribooksonline.com/library/view/hadoop-fundamentals-livelessons/9780133392838/part00.html'
        result = instance._real_extract(url)
        self.assertIsInstance(result, dict)

    def test_valid_url(self):
        instance = SafariIE()
        url = 'https://www.safaribooksonline.com/library/view/hadoop-fundamentals-livelessons/9780133392838/part00.html'
        result = instance._VALID_URL.match(url)
        self.assertIsNotNone(result)

    def test_search_regex(self):
        instance = SafariIE()
        webpage = '<html><body>data-reference-id="12345"</body></html>'
        result = instance._search_regex(r'data-reference-id=(["\'])(?P<id>(?:(?!\1).)+)\1', webpage, 'kaltura reference id', group='id')
        self.assertEqual(result, '12345')

class TestSafariApiIE(unittest.TestCase):
    def test_real_extract(self):
        instance = SafariApiIE()
        url = 'https://www.safaribooksonline.com/api/v1/book/9780133392838/chapter/part00.html'
        result = instance._real_extract(url)
        self.assertIsInstance(result, dict)

    def test_valid_url(self):
        instance = SafariApiIE()
        url = 'https://www.safaribooksonline.com/api/v1/book/9780133392838/chapter/part00.html'
        result = instance._VALID_URL.match(url)
        self.assertIsNotNone(result)

class TestSafariCourseIE(unittest.TestCase):
    def test_real_extract(self):
        instance = SafariCourseIE()
        url = 'https://www.safaribooksonline.com/library/view/hadoop-fundamentals-livelessons/9780133392838/'
        result = instance._real_extract(url)
        self.assertIsInstance(result, dict)

    def test_valid_url(self):
        instance = SafariCourseIE()
        url = 'https://www.safaribooksonline.com/library/view/hadoop-fundamentals-livelessons/9780133392838/'
        result = instance._VALID_URL.match(url)
        self.assertIsNotNone(result)

    def test_suitable(self):
        instance = SafariCourseIE()
        url = 'https://www.safaribooksonline.com/library/view/hadoop-fundamentals-livelessons/9780133392838/'
        result = instance.suitable(url)
        self.assertTrue(result)

if __name__ == '__main__':
    unittest.main()