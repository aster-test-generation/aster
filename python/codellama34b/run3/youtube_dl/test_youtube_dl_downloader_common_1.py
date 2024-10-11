import unittest
from youtube_dl.downloader.common import *


class TestFileDownloader(unittest.TestCase):
    def test_format_seconds(self):
        result = FileDownloader.format_seconds(100)
        self.assertEqual(result, "01:40")

    def test_calc_percent(self):
        result = FileDownloader.calc_percent(100, 200)
        self.assertEqual(result, 50.0)

    def test_format_percent(self):
        result = FileDownloader.format_percent(50.0)
        self.assertEqual(result, " 50.0%")

    def test_calc_eta(self):
        result = FileDownloader.calc_eta(100, 200, 300, 400)
        self.assertEqual(result, -25)

    def test_format_eta(self):
        result = FileDownloader.format_eta(100)
        self.assertEqual(result, "01:40")

    def test_calc_speed(self):
        result = FileDownloader.calc_speed(100, 200, 300)
        self.assertEqual(result, 3.0)

    def test_format_speed(self):
        result = FileDownloader.format_speed(300.0)
        self.assertEqual(result, " 300.00B/s")

    def test_calc_retries(self):
        result = FileDownloader.format_retries(float("inf"))
        self.assertEqual(result, "inf")

    def test_best_block_size(self):
        result = FileDownloader.best_block_size(100, 200)
        self.assertEqual(result, 100)

    def test_parse_bytes(self):
        result = FileDownloader.parse_bytes("100k")
        self.assertEqual(result, 102400)

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
        result = FileDownloader.temp_name("test")
        self.assertEqual(result, "test.part")

    def test_undo_temp_name(self):
        result = FileDownloader.undo_temp_name("test.part")
        self.assertEqual(result, "test")

    def test_ytdl_filename(self):
        result = FileDownloader.ytdl_filename("test")
        self.assertEqual(result, "test.ytdl")

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