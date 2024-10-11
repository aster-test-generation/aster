import unittest
from youtube_dl.extractor.safari import SafariBaseIE, SafariIE, SafariApiIE, SafariCourseIE


class TestSafariBaseIE(unittest.TestCase):
    def test_real_initialize(self):
        instance = SafariBaseIE()
        instance._real_initialize()

    def test_login(self):
        instance = SafariBaseIE()
        instance._login()

    def test_real_extract(self):
        instance = SafariBaseIE()
        instance._real_extract('https://www.safaribooksonline.com/library/view/hadoop-fundamentals-livelessons/9780133392838/part00.html')

class TestSafariIE(unittest.TestCase):
    def test_real_extract(self):
        instance = SafariIE()
        instance._real_extract('https://www.safaribooksonline.com/library/view/hadoop-fundamentals-livelessons/9780133392838/part00.html')

class TestSafariApiIE(unittest.TestCase):
    def test_real_extract(self):
        instance = SafariApiIE()
        instance._real_extract('https://www.safaribooksonline.com/api/v1/book/9780133392838/chapter/part00.html')

class TestSafariCourseIE(unittest.TestCase):
    def test_real_extract(self):
        instance = SafariCourseIE()
        instance._real_extract('https://www.safaribooksonline.com/library/view/hadoop-fundamentals-livelessons/9780133392838/')

if __name__ == '__main__':
    unittest.main()