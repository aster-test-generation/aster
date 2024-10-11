import unittest
from youtube_dl.downloader.common import FileDownloader

class TestFileDownloader(unittest.TestCase):
    def test_format_seconds(self):
        self.assertEqual(FileDownloader.format_seconds(0), '00:00')
        self.assertEqual(FileDownloader.format_seconds(1), '00:01')
        self.assertEqual(FileDownloader.format_seconds(60), '01:00')
        self.assertEqual(FileDownloader.format_seconds(3600), '01:00:00')
        self.assertEqual(FileDownloader.format_seconds(86400), '100:00:00')

    def test_calc_percent(self):
        self.assertIsNone(FileDownloader.calc_percent(0, None))
        self.assertIsNone(FileDownloader.calc_percent(0, 0))
        self.assertIsNone(FileDownloader.calc_percent(0, -1))
        self.assertEqual(FileDownloader.calc_percent(10, 100), 10.0)
        self.assertEqual(FileDownloader.calc_percent(100, 100), 100.0)

    def test_format_percent(self):
        self.assertEqual(FileDownloader.format_percent(None), '---.-%')
        self.assertEqual(FileDownloader.format_percent(0.0), '00.0%')
        self.assertEqual(FileDownloader.format_percent(0.1), '00.1%')
        self.assertEqual(FileDownloader.format_percent(0.5), '00.5%')
        self.assertEqual(FileDownloader.format_percent(1.0), '01.0%')
        self.assertEqual(FileDownloader.format_percent(100.0), '100.0%')

    def test_calc_eta(self):
        self.assertIsNone(FileDownloader.calc_eta(0, 0, 0))
        self.assertIsNone(FileDownloader.calc_eta(0, 0, -1))
        self.assertIsNone(FileDownloader.calc_eta(0, -1, 0))
        self.assertIsNone(FileDownloader.calc_eta(-1, 0, 0))
        self.assertEqual(FileDownloader.calc_eta(0, 100, 100), 0)
        self.assertEqual(FileDownloader.calc_eta(0, 100, 50), 50)
        self.assertEqual(FileDownloader.calc_eta(0, 100, 0), 100)
        self.assertEqual(FileDownloader.calc_eta(0, 100, 1), 99)
        self.assertEqual(FileDownloader.calc_eta(0, 100, 2), 98)
        self.assertEqual(FileDownloader.calc_eta(0, 100, 99), 1)
        self.assertEqual(FileDownloader.calc_eta(0, 100, 100), 0)
        self.assertEqual(FileDownloader.calc_eta(0, 100, 101), -1)

if __name__ == '__main__':
    unittest.main()