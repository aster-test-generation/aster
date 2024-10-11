import unittest
from youtube_dl.downloader.common import FileDownloader

class TestFileDownloader(unittest.TestCase):
    def test_format_seconds(self):
        self.assertEqual(FileDownloader.format_seconds(10), '00:10')
        self.assertEqual(FileDownloader.format_seconds(60), '01:00')
        self.assertEqual(FileDownloader.format_seconds(3600), '01:00:00')
        self.assertEqual(FileDownloader.format_seconds(86400), '1 day, 00:00:00')

    def test_calc_percent(self):
        self.assertEqual(FileDownloader.calc_percent(0, 100), 0)
        self.assertEqual(FileDownloader.calc_percent(50, 100), 50)
        self.assertEqual(FileDownloader.calc_percent(100, 100), 100)
        self.assertEqual(FileDownloader.calc_percent(100, 0), None)

    def test_format_percent(self):
        self.assertEqual(FileDownloader.format_percent(0), '---.-%')
        self.assertEqual(FileDownloader.format_percent(50), '50.0%')
        self.assertEqual(FileDownloader.format_percent(100), '100.0%')

    def test_calc_eta(self):
        self.assertEqual(FileDownloader.calc_eta(0, 0, 100), None)
        self.assertEqual(FileDownloader.calc_eta(0, 1, 100), 99)
        self.assertEqual(FileDownloader.calc_eta(1, 1, 100), 0)
        self.assertEqual(FileDownloader.calc_eta(1, 2, 100), 1)

    def test_format_eta(self):
        self.assertEqual(FileDownloader.format_eta(None), '--:--')
        self.assertEqual(FileDownloader.format_eta(0), '00:00')
        self.assertEqual(FileDownloader.format_eta(1), '00:01')
        self.assertEqual(FileDownloader.format_eta(60), '01:00')
        self.assertEqual(FileDownloader.format_eta(3600), '01:00:00')

    def test_calc_speed(self):
        self.assertEqual(FileDownloader.calc_speed(0, 0, 100), None)
        self.assertEqual(FileDownloader.calc_speed(1, 1, 100), 100)
        self.assertEqual(FileDownloader.calc_speed(1, 2, 100), 50)

    def test_format_speed(self):
        self.assertEqual(FileDownloader.format_speed(None), '%10s' % '---b/s')
        self.assertEqual(FileDownloader.format_speed(100), '%10s' % '100.0b/s')
        self.assertEqual(FileDownloader.format_speed(1000000), '%10s' % '1.0MB/s')

if __name__ == '__main__':
    unittest.main()