import unittest
from youtube_dl.extractor.safari import SafariBaseIE, SafariIE, SafariApiIE, SafariCourseIE

class TestSafariBaseIE(unittest.TestCase):
    def test___init__(self):
        instance = SafariBaseIE()
        self.assertIsNotNone(instance)

    def test__real_initialize(self):
        instance = SafariBaseIE()
        instance._real_initialize()
        self.assertTrue(instance.LOGGED_IN)

    def test__login(self):
        instance = SafariBaseIE()
        instance._login()
        self.assertTrue(instance.LOGGED_IN)

    def test__get_login_info(self):
        instance = SafariBaseIE()
        username, password = instance._get_login_info()
        self.assertIsNotNone(username)
        self.assertIsNotNone(password)

class TestSafariIE(unittest.TestCase):
    def test_IE_NAME(self):
        self.assertEqual(SafariIE.IE_NAME, 'safari')

    def test_IE_DESC(self):
        self.assertEqual(SafariIE.IE_DESC, 'safaribooksonline.com online video')

    def test__VALID_URL(self):
        self.assertIsNotNone(SafariIE._VALID_URL)

    def test__PARTNER_ID(self):
        self.assertEqual(SafariIE._PARTNER_ID, '1926081')

    def test__UICONF_ID(self):
        self.assertEqual(SafariIE._UICONF_ID, '29375172')

    def test_real_extract(self):
        instance = SafariIE()
        url = 'https://www.safaribooksonline.com/library/view/hadoop-fundamentals-livelessons/9780133392838/part00.html'
        result = instance._real_extract(url)
        self.assertIsNotNone(result)

class TestSafariApiIE(unittest.TestCase):
    def test_IE_NAME(self):
        self.assertEqual(SafariApiIE.IE_NAME, 'safari:api')

    def test__VALID_URL(self):
        self.assertIsNotNone(SafariApiIE._VALID_URL)

    def test_real_extract(self):
        instance = SafariApiIE()
        url = 'https://www.safaribooksonline.com/api/v1/book/9780133392838/chapter/part00.html'
        result = instance._real_extract(url)
        self.assertIsNotNone(result)

class TestSafariCourseIE(unittest.TestCase):
    def test_IE_NAME(self):
        self.assertEqual(SafariCourseIE.IE_NAME, 'safari:course')

    def test_IE_DESC(self):
        self.assertEqual(SafariCourseIE.IE_DESC, 'safaribooksonline.com online courses')

    def test__VALID_URL(self):
        self.assertIsNotNone(SafariCourseIE._VALID_URL)

    def test_suitable(self):
        url = 'https://www.safaribooksonline.com/library/view/hadoop-fundamentals-livelessons/9780133392838/'
        self.assertTrue(SafariCourseIE.suitable(url))

    def test_real_extract(self):
        instance = SafariCourseIE()
        url = 'https://www.safaribooksonline.com/library/view/hadoop-fundamentals-livelessons/9780133392838/'
        result = instance._real_extract(url)
        self.assertIsNotNone(result)

if __name__ == '__main__':
    unittest.main()