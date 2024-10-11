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
        result = instance._SafariBaseIE__private_method('test')
        self.assertEqual(result, 'test')

    def test_protected_method(self):
        instance = SafariBaseIE()
        result = instance._get_login_info()
        self.assertIsNone(result)

    def test_magic_method_init(self):
        instance = SafariBaseIE()
        self.assertIsInstance(instance, SafariBaseIE)

    def test_magic_method_str(self):
        instance = SafariBaseIE()
        result = str(instance)
        self.assertEqual(result, 'SafariBaseIE')

    def test_magic_method_repr(self):
        instance = SafariBaseIE()
        result = repr(instance)
        self.assertEqual(result, 'SafariBaseIE()')

class TestSafariIE(unittest.TestCase):
    def test_real_extract(self):
        instance = SafariIE()
        url = 'https://www.safaribooksonline.com/library/view/hadoop-fundamentals-livelessons/9780133392838/part00.html'
        result = instance._real_extract(url)
        self.assertIsInstance(result, dict)

    def test_private_method(self):
        instance = SafariIE()
        result = instance._SafariIE__private_method('test')
        self.assertEqual(result, 'test')

    def test_protected_method(self):
        instance = SafariIE()
        result = instance._search_regex('pattern', 'string', 'group')
        self.assertIsNone(result)

    def test_magic_method_init(self):
        instance = SafariIE()
        self.assertIsInstance(instance, SafariIE)

    def test_magic_method_str(self):
        instance = SafariIE()
        result = str(instance)
        self.assertEqual(result, 'SafariIE')

    def test_magic_method_repr(self):
        instance = SafariIE()
        result = repr(instance)
        self.assertEqual(result, 'SafariIE()')

class TestSafariApiIE(unittest.TestCase):
    def test_real_extract(self):
        instance = SafariApiIE()
        url = 'https://www.safaribooksonline.com/api/v1/book/9780133392838/chapter/part00.html'
        result = instance._real_extract(url)
        self.assertIsInstance(result, dict)

    def test_private_method(self):
        instance = SafariApiIE()
        result = instance._SafariApiIE__private_method('test')
        self.assertEqual(result, 'test')

    def test_protected_method(self):
        instance = SafariApiIE()
        result = instance._download_json('url', 'video_id', 'message')
        self.assertIsNone(result)

    def test_magic_method_init(self):
        instance = SafariApiIE()
        self.assertIsInstance(instance, SafariApiIE)

    def test_magic_method_str(self):
        instance = SafariApiIE()
        result = str(instance)
        self.assertEqual(result, 'SafariApiIE')

    def test_magic_method_repr(self):
        instance = SafariApiIE()
        result = repr(instance)
        self.assertEqual(result, 'SafariApiIE()')

class TestSafariCourseIE(unittest.TestCase):
    def test_real_extract(self):
        instance = SafariCourseIE()
        url = 'https://www.safaribooksonline.com/library/view/hadoop-fundamentals-livelessons/9780133392838/'
        result = instance._real_extract(url)
        self.assertIsInstance(result, dict)

    def test_private_method(self):
        instance = SafariCourseIE()
        result = instance._SafariCourseIE__private_method('test')
        self.assertEqual(result, 'test')

    def test_protected_method(self):
        instance = SafariCourseIE()
        result = instance._match_id('url')
        self.assertIsNone(result)

    def test_magic_method_init(self):
        instance = SafariCourseIE()
        self.assertIsInstance(instance, SafariCourseIE)

    def test_magic_method_str(self):
        instance = SafariCourseIE()
        result = str(instance)
        self.assertEqual(result, 'SafariCourseIE')

    def test_magic_method_repr(self):
        instance = SafariCourseIE()
        result = repr(instance)
        self.assertEqual(result, 'SafariCourseIE()')

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