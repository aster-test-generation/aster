import unittest
from youtube_dl.downloader.common import *

class TestFileDownloader(unittest.TestCase):
    def test_format_seconds(self):
        result = FileDownloader.format_seconds(100)
        self.assertEqual(result, '01:40')

    def test_calc_percent(self):
        result = FileDownloader.calc_percent(100, 100)
        self.assertEqual(result, 100.0)

    def test_format_percent(self):
        result = FileDownloader.format_percent(100.0)
        self.assertEqual(result, '100.0%')

    def test_calc_eta(self):
        result = FileDownloader.calc_eta(100, 100, 100, 100)
        self.assertEqual(result, 100)

    def test_format_eta(self):
        result = FileDownloader.format_eta(100)
        self.assertEqual(result, '01:40')

    def test_calc_speed(self):
        result = FileDownloader.calc_speed(100, 100, 100)
        self.assertEqual(result, 100.0)

    def test_format_speed(self):
        result = FileDownloader.format_speed(100.0)
        self.assertEqual(result, '100.00B/s')

    def test_best_block_size(self):
        result = FileDownloader.best_block_size(100, 100)
        self.assertEqual(result, 100)

    def test_parse_bytes(self):
        result = FileDownloader.parse_bytes('100')
        self.assertEqual(result, 100)

    def test_temp_name(self):
        result = FileDownloader.temp_name('100')
        self.assertEqual(result, '100.part')

    def test_undo_temp_name(self):
        result = FileDownloader.undo_temp_name('100.part')
        self.assertEqual(result, '100')

    def test_ytdl_filename(self):
        result = FileDownloader.ytdl_filename('100')
        self.assertEqual(result, '100.ytdl')

    def test_try_rename(self):
        result = FileDownloader.try_rename('100', '100')
        self.assertEqual(result, None)

    def test_try_utime(self):
        result = FileDownloader.try_utime('100', '100')
        self.assertEqual(result, None)

    def test_report_destination(self):
        result = FileDownloader.report_destination('100')
        self.assertEqual(result, None)

    def test__report_progress_status(self):
        result = FileDownloader._report_progress_status('100')
        self.assertEqual(result, None)

    def test_report_progress(self):
        result = FileDownloader.report_progress('100')
        self.assertEqual(result, None)

if __name__ == '__main__':
    unittest.main()