import unittest
from youtube_dl.downloader.dash import DashSegmentsFD


class TestDashSegmentsFD(unittest.TestCase):
    def test_real_download(self):
        instance = DashSegmentsFD(ydl, params)
        result = instance.real_download('filename', {'fragments': []})
        self.assertTrue(result)

    def test_private_method(self):
        instance = DashSegmentsFD(ydl, params)
        result = instance._DashSegmentsFD__private_method()
        self.assertEqual(result, 'private method result')

    def test_protected_method(self):
        instance = DashSegmentsFD(ydl, params)
        result = instance._DashSegmentsFD__protected_method()
        self.assertEqual(result, 'protected method result')

    def test_magic_method(self):
        instance = DashSegmentsFD(ydl, params)
        result = instance.__str__()
        self.assertEqual(result, 'DashSegmentsFD')

if __name__ == '__main__':
    unittest.main()