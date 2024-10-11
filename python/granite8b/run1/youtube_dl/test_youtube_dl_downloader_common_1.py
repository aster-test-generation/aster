import unittest
from youtube_dl.downloader.common import FileDownloader


class TestFileDownloader(unittest.TestCase):
    def test_format_seconds(self):
        self.assertEqual(FileDownloader.format_seconds(0), '00:00')
        self.assertEqual(FileDownloader.format_seconds(1), '00:01')
        self.assertEqual(FileDownloader.format_seconds(60), '01:00')
        self.assertEqual(FileDownloader.format_seconds(3600), '01:00:00')
        self.assertEqual(FileDownloader.format_seconds(3600 * 24), '24:00:00')

    def test_calc_percent(self):
        self.assertEqual(FileDownloader.calc_percent(0, 100), 0.0)
        self.assertEqual(FileDownloader.calc_percent(50, 100), 50.0)
        self.assertEqual(FileDownloader.calc_percent(100, 100), 100.0)
        self.assertEqual(FileDownloader.calc_percent(101, 100), 101.0)

    def test_format_percent(self):
        self.assertEqual(FileDownloader.format_percent(0.0), '  0.0%')
        self.assertEqual(FileDownloader.format_percent(50.0), '50.0%')
        self.assertEqual(FileDownloader.format_percent(100.0), '100.0%')
        self.assertEqual(FileDownloader.format_percent(101.0), '101.0%')

class TestFileDownloader(unittest.TestCase):
    def test_format_seconds(self):
        self.assertEqual(FileDownloader.format_seconds(10), '00:00:10')
        self.assertEqual(FileDownloader.format_seconds(60), '00:01:00')
        self.assertEqual(FileDownloader.format_seconds(3600), '01:00:00')
        self.assertEqual(FileDownloader.format_seconds(86400), '100:00:00')
        self.assertEqual(FileDownloader.format_seconds(31557600), '10000:00:00')

    def test_calc_percent(self):
        self.assertEqual(FileDownloader.calc_percent(0, 100), 0.0)
        self.assertEqual(FileDownloader.calc_percent(50, 100), 50.0)
        self.assertEqual(FileDownloader.calc_percent(100, 100), 100.0)
        self.assertEqual(FileDownloader.calc_percent(100, 200), 50.0)
        self.assertEqual(FileDownloader.calc_percent(100, 0), None)

    def test_format_percent(self):
        self.assertEqual(FileDownloader.format_percent(0.0), '0.0%')
        self.assertEqual(FileDownloader.format_percent(0.5), '50.0%')
        self.assertEqual(FileDownloader.format_percent(1.0), '100.0%')
        self.assertEqual(FileDownloader.format_percent(None), '---.-%')

    def test_calc_eta(self):
        self.assertEqual(FileDownloader.calc_eta(0, 0, 100, 0), None)
        self.assertEqual(FileDownloader.calc_eta(0, 10, 100, 0), 90)
        self.assertEqual(FileDownloader.calc_eta(0, 10, 100, 50), 40)
        self.assertEqual(FileDownloader.calc_eta(0, 10, 0, 50), None)

    def test_format_eta(self):
        self.assertEqual(FileDownloader.format_eta(None), '--:--')
        self.assertEqual(FileDownloader.format_eta(10), '00:00:10')
        self.assertEqual(FileDownloader.format_eta(60), '00:01:00')
        self.assertEqual(FileDownloader.format_eta(3600), '01:00:00')
        self.assertEqual(FileDownloader.format_eta(86400), '100:00:00')
        self.assertEqual(FileDownloader.format_eta(31557600), '10000:00:00')

if __name__ == '__main__':
    unittest.main()