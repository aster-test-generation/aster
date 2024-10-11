import unittest
from youtube_dl.extractor.safari import *



class TestSafariBaseIE(unittest.TestCase):
    def test_real_initialize(self):
        instance = SafariBaseIE()
        instance._real_initialize()

    def test_login(self):
        instance = SafariBaseIE()
        instance._login()

    def test_api_base(self):
        instance = SafariBaseIE()
        result = instance._API_BASE
        self.assertEqual(result, "https://learning.oreilly.com/api/v1")

    def test_api_format(self):
        instance = SafariBaseIE()
        result = instance._API_FORMAT
        self.assertEqual(result, "json")

    def test_netrc_machine(self):
        instance = SafariBaseIE()
        result = instance._NETRC_MACHINE
        self.assertEqual(result, "safari")

    def test_login_url(self):
        instance = SafariBaseIE()
        result = instance._LOGIN_URL
        self.assertEqual(result, "https://learning.oreilly.com/accounts/login/")

class TestSafariIE(unittest.TestCase):
    def test_real_extract(self):
        instance = SafariIE()
        result = instance._real_extract("https://www.safaribooksonline.com/library/view/hadoop-fundamentals-livelessons/9780133392838/part00.html")
        self.assertEqual(result, "Kaltura")

    def test_ie_name(self):
        instance = SafariIE()
        result = instance.IE_NAME
        self.assertEqual(result, "safari")

    def test_ie_desc(self):
        instance = SafariIE()
        result = instance.IE_DESC
        self.assertEqual(result, "safaribooksonline.com online video")

    def test_valid_url(self):
        instance = SafariIE()
        result = instance._VALID_URL
        self.assertEqual(result, "(?x)https?://(?:www\\.)?(?:safaribooksonline|(?:learning\\.)?oreilly)\\.com/(?:library/view/[^/]+/(?P<course_id>[^/]+)/(?P<part>[^/?\\#&]+)\\.html|videos/[^/]+/[^/]+/(?P<reference_id>[^-]+-[^/?\\#&]+)")

    def test_partner_id(self):
        instance = SafariIE()
        result = instance._PARTNER_ID
        self.assertEqual(result, "1926081")

    def test_uiconf_id(self):
        instance = SafariIE()
        result = instance._UICONF_ID
        self.assertEqual(result, "29375172")


class TestSafariBaseIE(unittest.TestCase):
    def test_real_initialize(self):
        instance = SafariBaseIE()
        result = instance._real_initialize()
        self.assertEqual(result, None)

    def test_login(self):
        instance = SafariBaseIE()
        result = instance._login()
        self.assertEqual(result, None)

    def test_api_base(self):
        instance = SafariBaseIE()
        result = instance._API_BASE
        self.assertEqual(result, 'https://learning.oreilly.com/api/v1')

    def test_api_format(self):
        instance = SafariBaseIE()
        result = instance._API_FORMAT
        self.assertEqual(result, 'json')

    def test_netrc_machine(self):
        instance = SafariBaseIE()
        result = instance._NETRC_MACHINE
        self.assertEqual(result, 'safari')

    def test_login_url(self):
        instance = SafariBaseIE()
        result = instance._LOGIN_URL
        self.assertEqual(result, 'https://learning.oreilly.com/accounts/login/')

class TestSafariIE(unittest.TestCase):
    def test_real_extract(self):
        instance = SafariIE()
        result = instance._real_extract('https://www.safaribooksonline.com/library/view/hadoop-fundamentals-livelessons/9780133392838/part00.html')
        self.assertEqual(result, None)

    def test_partner_id(self):
        instance = SafariIE()
        result = instance._PARTNER_ID
        self.assertEqual(result, '1926081')

    def test_uiconf_id(self):
        instance = SafariIE()
        result = instance._UICONF_ID
        self.assertEqual(result, '29375172')

class TestSafariApiIE(unittest.TestCase):
    def test_real_extract(self):
        instance = SafariApiIE()
        result = instance._real_extract('https://www.safaribooksonline.com/api/v1/book/9780133392838/chapter/part00.html')
        self.assertEqual(result, None)

class TestSafariCourseIE(unittest.TestCase):
    def test_real_extract(self):
        instance = SafariCourseIE()
        result = instance._real_extract('https://www.safaribooksonline.com/library/view/hadoop-fundamentals-livelessons/9780133392838/')
        self.assertEqual(result, None)

if __name__ == '__main__':
    unittest.main()