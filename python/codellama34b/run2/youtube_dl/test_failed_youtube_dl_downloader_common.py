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
        result = FileDownloader.format_percent(100)
        self.assertEqual(result, '100.0%')

    def test_calc_eta(self):
        result = FileDownloader.calc_eta(100, 100, 100, 100)
        self.assertEqual(result, None)

    def test_format_eta(self):
        result = FileDownloader.format_eta(100)
        self.assertEqual(result, '01:40')

    def test_calc_speed(self):
        result = FileDownloader.calc_speed(100, 100, 100)
        self.assertEqual(result, None)

    def test_format_speed(self):
        result = FileDownloader.format_speed(100)
        self.assertEqual(result, ' 100.00B/s')

    def test_format_retries(self):
        result = FileDownloader.format_retries(100)
        self.assertEqual(result, '100')

    def test_best_block_size(self):
        result = FileDownloader.best_block_size(100, 100)
        self.assertEqual(result, 50)

    def test_parse_bytes(self):
        result = FileDownloader.parse_bytes('100')
        self.assertEqual(result, 100)

    def test_to_screen(self):
        pass

    def test_to_stderr(self):
        pass

    def test_to_console_title(self):
        pass

    def test_trouble(self):
        pass

    def test_report_warning(self):
        pass

    def test_report_error(self):
        pass

    def test_slow_down(self):
        pass

    def test_temp_name(self):
        pass

    def test_undo_temp_name(self):
        pass

    def test_ytdl_filename(self):
        pass

    def test_try_rename(self):
        pass

    def test_try_utime(self):
        pass

    def test_report_destination(self):
        pass

    def test__report_progress_status(self):
        pass

    def test_report_progress(self):
        pass

if __name__ == '__main__':
    unittest.main()