import unittest
from youtube_dl.downloader.common import FileDownloader

class TestFileDownloader(unittest.TestCase):
    def test_format_seconds(self):
        self.assertEqual(FileDownloader.format_seconds(100), '01:40')
        self.assertEqual(FileDownloader.format_seconds(60), '01:00')
        self.assertEqual(FileDownloader.format_seconds(61), '01:01')
        self.assertEqual(FileDownloader.format_seconds(3600), '1:00:00')
        self.assertEqual(FileDownloader.format_seconds(3661), '1:01:01')

    def test_calc_percent(self):
        self.assertEqual(FileDownloader.calc_percent(100, 200), 50.0)
        self.assertEqual(FileDownloader.calc_percent(0, 200), 0.0)
        self.assertEqual(FileDownloader.calc_percent(100, 0), None)

    def test_format_percent(self):
        self.assertEqual(FileDownloader.format_percent(0.5), '50.0%')
        self.assertEqual(FileDownloader.format_percent(0.0), '0.0%')
        self.assertEqual(FileDownloader.format_percent(None), '---.-%')

    def test_calc_eta(self):
        self.assertEqual(FileDownloader.calc_eta(10, 20, 100, 10), 10)
        self.assertEqual(FileDownloader.calc_eta(10, 20, 100, 20), 20)
        self.assertEqual(FileDownloader.calc_eta(10, 20, 100, 0), None)

    def test_format_eta(self):
        self.assertEqual(FileDownloader.format_eta(10), '00:10')
        self.assertEqual(FileDownloader.format_eta(60), '01:00')
        self.assertEqual(FileDownloader.format_eta(3600), '1:00:00')
        self.assertEqual(FileDownloader.format_eta(None), '--:--')

    def test_calc_speed(self):
        self.assertEqual(FileDownloader.calc_speed(10, 20, 100), 100.0)
        self.assertEqual(FileDownloader.calc_speed(10, 20, 0), None)

    def test_format_speed(self):
        self.assertEqual(FileDownloader.format_speed(100), '100b/s')
        self.assertEqual(FileDownloader.format_speed(1024), '1.00Kb/s')
        self.assertEqual(FileDownloader.format_speed(1024 * 1024), '1.00Mb/s')
        self.assertEqual(FileDownloader.format_speed(1024 * 1024 * 1024), '1.00Gb/s')
        self.assertEqual(FileDownloader.format_speed(None), '%10s' % '---b/s')

    def test_format_retries(self):
        self.assertEqual(FileDownloader.format_retries(10), '10')
        self.assertEqual(FileDownloader.format_retries(float('inf')), 'inf')

if __name__ == '__main__':
    unittest.main()