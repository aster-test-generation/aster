import unittest
from youtube_dl.downloader.common import FileDownloader

class TestFileDownloader(unittest.TestCase):
    def setUp(self):
        self.ydl = None
        self.params = {}
        self.fd = FileDownloader(self.ydl, self.params)

    def test_format_seconds(self):
        self.assertEqual(self.fd.format_seconds(0), '00:00')
        self.assertEqual(self.fd.format_seconds(1), '00:01')
        self.assertEqual(self.fd.format_seconds(60), '01:00')
        self.assertEqual(self.fd.format_seconds(3600), '01:00:00')

    def test_calc_percent(self):
        self.assertEqual(self.fd.calc_percent(0, 100), 0.0)
        self.assertEqual(self.fd.calc_percent(50, 100), 50.0)
        self.assertEqual(self.fd.calc_percent(100, 100), 100.0)
        self.assertEqual(self.fd.calc_percent(100, 0), None)

    def test_format_percent(self):
        self.assertEqual(self.fd.format_percent(0.0), '00.0%')
        self.assertEqual(self.fd.format_percent(50.0), '50.0%')
        self.assertEqual(self.fd.format_percent(100.0), '100.0%')
        self.assertEqual(self.fd.format_percent(None), '---.-%')

if __name__ == '__main__':
    unittest.main()