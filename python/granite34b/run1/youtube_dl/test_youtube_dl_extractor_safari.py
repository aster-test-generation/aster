import unittest
from youtube_dl.extractor.safari import SafariBaseIE, SafariIE, SafariApiIE, SafariCourseIE


class TestSafariBaseIE(unittest.TestCase):
    def test_login(self):
        instance = SafariBaseIE()
        instance._login()
        self.assertTrue(instance.LOGGED_IN)

class TestSafariIE(unittest.TestCase):
    def test_real_extract(self):
        instance = SafariIE()
        result = instance._real_extract('https://www.safaribooksonline.com/library/view/hadoop-fundamentals-livelessons/9780133392838/part00.html')
        self.assertEqual(result['id'], '0_qbqx90ic')
        self.assertEqual(result['ext'], 'mp4')
        self.assertEqual(result['title'], 'Introduction to Hadoop Fundamentals LiveLessons')
        self.assertEqual(result['timestamp'], 1437758058)
        self.assertEqual(result['upload_date'], '20150724')
        self.assertEqual(result['uploader_id'], 'stork')

class TestSafariApiIE(unittest.TestCase):
    def test_real_extract(self):
        instance = SafariApiIE()
        result = instance._real_extract('https://www.safaribooksonline.com/api/v1/book/9780133392838/chapter/part00.html')
        self.assertEqual(result['web_url'], 'https://www.safaribooksonline.com/library/view/hadoop-fundamentals-livelessons/9780133392838/part00.html')

class TestSafariCourseIE(unittest.TestCase):
    def test_real_extract(self):
        instance = SafariCourseIE()
        result = instance._real_extract('https://www.safaribooksonline.com/library/view/hadoop-fundamentals-livelessons/9780133392838/')
        self.assertEqual(result['id'], '9780133392838')
        self.assertEqual(result['title'], 'Hadoop Fundamentals LiveLessons')
        self.assertEqual(len(result['entries']), 22)

if __name__ == '__main__':
    unittest.main()