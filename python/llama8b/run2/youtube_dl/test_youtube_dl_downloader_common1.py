import unittest
from youtube_dl.downloader.common import FileDownloader

class TestFileDownloader(unittest.TestCase):
    def test_format_seconds(self):
        self.assertEqual(FileDownloader.format_seconds(0), '--:--')
        self.assertEqual(FileDownloader.format_seconds(60), '00:01')
        self.assertEqual(FileDownloader.format_seconds(61), '00:01')
        self.assertEqual(FileDownloader.format_seconds(120), '00:02')
        self.assertEqual(FileDownloader.format_seconds(121), '00:02')
        self.assertEqual(FileDownloader.format_seconds(3600), '01:00')
        self.assertEqual(FileDownloader.format_seconds(3601), '01:00')
        self.assertEqual(FileDownloader.format_seconds(7200), '02:00')
        self.assertEqual(FileDownloader.format_seconds(7201), '02:00')

    def test_calc_percent(self):
        self.assertIsNone(FileDownloader.calc_percent(0, None))
        self.assertEqual(FileDownloader.calc_percent(100, 100), 100.0)
        self.assertEqual(FileDownloader.calc_percent(50, 100), 50.0)
        self.assertEqual(FileDownloader.calc_percent(0, 100), 0.0)

    def test_format_percent(self):
        self.assertEqual(FileDownloader.format_percent(None), '---.-%')
        self.assertEqual(FileDownloader.format_percent(0), '0.0%')
        self.assertEqual(FileDownloader.format_percent(100), '100.0%')
        self.assertEqual(FileDownloader.format_percent(50), '50.0%')

    def test_calc_eta(self):
        self.assertIsNone(FileDownloader.calc_eta(None, None, 100, 0))
        self.assertEqual(FileDownloader.calc_eta(0, 1, 100, 50), 0)
        self.assertEqual(FileDownloader.calc_eta(0, 1, 100, 100), 0)
        self.assertEqual(FileDownloader.calc_eta(0, 1, 100, 50), 0)
        self.assertEqual(FileDownloader.calc_eta(0, 1, 100, 0), None)

    def test_format_eta(self):
        self.assertEqual(FileDownloader.format_eta(None), '--:--')
        self.assertEqual(FileDownloader.format_eta(0), '--:--')
        self.assertEqual(FileDownloader.format_eta(60), '00:01')
        self.assertEqual(FileDownloader.format_eta(61), '00:01')
        self.assertEqual(FileDownloader.format_eta(120), '00:02')
        self.assertEqual(FileDownloader.format_eta(121), '00:02')
        self.assertEqual(FileDownloader.format_eta(3600), '01:00')
        self.assertEqual(FileDownloader.format_eta(3601), '01:00')
        self.assertEqual(FileDownloader.format_eta(7200), '02:00')
        self.assertEqual(FileDownloader.format_eta(7201), '02:00')

    def test_calc_speed(self):
        self.assertIsNone(FileDownloader.calc_speed(None, None, 0))
        self.assertEqual(FileDownloader.calc_speed(0, 1, 100), 100)
        self.assertEqual(FileDownloader.calc_speed(0, 1, 100), 100)
        self.assertEqual(FileDownloader.calc_speed(0, 1, 50), 50)
        self.assertEqual(FileDownloader.calc_speed(0, 1, 0), None)

    def test_format_speed(self):
        self.assertEqual(FileDownloader.format_speed(None), '---b/s')
        self.assertEqual(FileDownloader.format_speed(0), '0b/s')
        self.assertEqual(FileDownloader.format_speed(100), '100b/s')
        self.assertEqual(FileDownloader.format_speed(50), '50b/s')

if __name__ == '__main__':
    unittest.main()