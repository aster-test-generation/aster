import unittest
from youtube_dl.extractor.safari import SafariBaseIE, SafariIE, SafariApiIE, SafariCourseIE

class TestSafariBaseIE(unittest.TestCase):
    def test_real_initialize(self):
        instance = SafariBaseIE()
        result = instance._real_initialize()
        self.assertEqual(result, None)

    def test_login(self):
        instance = SafariBaseIE()
        result = instance._login()
        self.assertEqual(result, None)

    def test_real_extract(self):
        instance = SafariBaseIE()
        result = instance._real_extract('https://www.safaribooksonline.com/library/view/hadoop-fundamentals-livelessons/9780133392838/part00.html')
        self.assertEqual(result, None)

class TestSafariIE(unittest.TestCase):
    def test_real_extract(self):
        instance = SafariIE()
        result = instance._real_extract('https://www.safaribooksonline.com/library/view/hadoop-fundamentals-livelessons/9780133392838/part00.html')
        self.assertEqual(result, None)

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