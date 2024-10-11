import unittest
from youtube_dl.downloader.common import FileDownloader

class TestFileDownloader(unittest.TestCase):
    def test_format_seconds(self):
        self.assertEqual(FileDownloader.format_seconds(10), '00:10')
        self.assertEqual(FileDownloader.format_seconds(60), '01:00')
        self.assertEqual(FileDownloader.format_seconds(3600), '01:00:00')

    def test_calc_percent(self):
        self.assertEqual(FileDownloader.calc_percent(10, 100), 10.0)
        self.assertEqual(FileDownloader.calc_percent(50, 100), 50.0)
        self.assertEqual(FileDownloader.calc_percent(100, 100), 100.0)

    def test_format_percent(self):
        self.assertEqual(FileDownloader.format_percent(10), '  10%')
        self.assertEqual(FileDownloader.format_percent(50), ' 50%')
        self.assertEqual(FileDownloader.format_percent(100), '100%')

    def test_calc_eta(self):
        self.assertEqual(FileDownloader.calc_eta(10, 10, 100, 10), 0)
        self.assertEqual(FileDownloader.calc_eta(10, 10, 100, 50), 50)
        self.assertEqual(FileDownloader.calc_eta(10, 10, 100, 100), 100)

    def test_format_eta(self):
        self.assertEqual(FileDownloader.format_eta(0), '--:--')
        self.assertEqual(FileDownloader.format_eta(10), '00:10')
        self.assertEqual(FileDownloader.format_eta(60), '01:00')
        self.assertEqual(FileDownloader.format_eta(3600), '01:00:00')

    def test_calc_speed(self):
        self.assertEqual(FileDownloader.calc_speed(10, 10, 10), 1.0)
        self.assertEqual(FileDownloader.calc_speed(10, 10, 50), 2.0)
        self.assertEqual(FileDownloader.calc_speed(10, 10, 100), 10.0)

    def test_format_speed(self):
        self.assertEqual(FileDownloader.format_speed(1), '    1b/s')
        self.assertEqual(FileDownloader.format_speed(10), '   10b/s')
        self.assertEqual(FileDownloader.format_speed(100), '  100b/s')
        self.assertEqual(FileDownloader.format_speed(1000), ' 1000b/s')
        self.assertEqual(FileDownloader.format_speed(10000), '10000b/s')

if __name__ == '__main__':
    unittest.main()