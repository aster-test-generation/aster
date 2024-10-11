import unittest
from youtube_dl.downloader.common import *



class TestFileDownloader(unittest.TestCase):
    def test_format_seconds(self):
        result = FileDownloader.format_seconds(100)
        self.assertEqual(result, '01:40')

    def test_calc_percent(self):
        result = FileDownloader.calc_percent(100, 200)
        self.assertEqual(result, 50.0)

    def test_format_percent(self):
        result = FileDownloader.format_percent(50.0)
        self.assertEqual(result, ' 50.0%')

    def test_calc_eta(self):
        result = FileDownloader.calc_eta(100, 200, 300, 400)
        self.assertEqual(result, -25)

    def test_format_eta(self):
        result = FileDownloader.format_eta(100)
        self.assertEqual(result, '01:40')

    def test_calc_speed(self):
        result = FileDownloader.calc_speed(100, 200, 300)
        self.assertEqual(result, 3.0)

    def test_format_speed(self):
        result = FileDownloader.format_speed(100.0)
        self.assertEqual(result, ' 100.00B/s')

    def test_format_retries(self):
        result = FileDownloader.format_retries(100.0)
        self.assertEqual(result, '100')

    def test_best_block_size(self):
        result = FileDownloader.best_block_size(100, 200)
        self.assertEqual(result, 100)

    def test_parse_bytes(self):
        result = FileDownloader.parse_bytes('100M')
        self.assertEqual(result, 104857600)

    def test_temp_name(self):
        result = FileDownloader.temp_name('filename')
        self.assertEqual(result, 'filename.part')

    def test_undo_temp_name(self):
        result = FileDownloader.undo_temp_name('filename.part')
        self.assertEqual(result, 'filename')

    def test_ytdl_filename(self):
        result = FileDownloader.ytdl_filename('filename')
        self.assertEqual(result, 'filename.ytdl')

    def test_try_rename(self):
        result = FileDownloader.try_rename('old_filename', 'new_filename')
        self.assertEqual(result, None)

    def test_try_utime(self):
        result = FileDownloader.try_utime('filename', 'last_modified_hdr', 'last_modified_hdr')
        self.assertEqual(result, None)

    def test_report_destination(self):
        result = FileDownloader.report_destination('filename')
        self.assertEqual(result, None)

    def test__report_progress_status(self):
        result = FileDownloader._report_progress_status(msg)
        self.assertEqual(result, None)


class TestFileDownloader(unittest.TestCase):
    def test_format_seconds(self):
        result = FileDownloader.format_seconds(100)
        self.assertEqual(result, '01:40')

    def test_calc_percent(self):
        result = FileDownloader.calc_percent(100, 1000)
        self.assertEqual(result, 10.0)

    def test_format_percent(self):
        result = FileDownloader.format_percent(10.0)
        self.assertEqual(result, '  10.0%')

    def test_calc_eta(self):
        result = FileDownloader.calc_eta(100, 100, 1000, 100)
        self.assertEqual(result, 900)

    def test_format_eta(self):
        result = FileDownloader.format_eta(100)
        self.assertEqual(result, '01:40')

    def test_calc_speed(self):
        result = FileDownloader.calc_speed(100, 100, 1000)
        self.assertEqual(result, 1000.0)

    def test_format_speed(self):
        result = FileDownloader.format_speed(1000.0)
        self.assertEqual(result, '1000.00B/s')

    def test_best_block_size(self):
        result = FileDownloader.best_block_size(100, 1000)
        self.assertEqual(result, 1000)

    def test_parse_bytes(self):
        result = FileDownloader.parse_bytes('1000')
        self.assertEqual(result, 1000)

    def test_temp_name(self):
        result = FileDownloader.temp_name('filename')
        self.assertEqual(result, 'filename.part')

    def test_undo_temp_name(self):
        result = FileDownloader.undo_temp_name('filename.part')
        self.assertEqual(result, 'filename')

    def test_ytdl_filename(self):
        result = FileDownloader.ytdl_filename('filename')
        self.assertEqual(result, 'filename.ytdl')

    def test_try_rename(self):
        result = FileDownloader.try_rename('old_filename', 'new_filename')
        self.assertEqual(result, None)

    def test_try_utime(self):
        result = FileDownloader.try_utime('filename', 'last_modified_hdr')
        self.assertEqual(result, None)

    def test_report_destination(self):
        result = FileDownloader.report_destination('filename')
        self.assertEqual(result, None)

    def test__report_progress_status(self):
        result = FileDownloader._report_progress_status('msg', True)
        self.assertEqual(result, None)

    def test_report_progress(self):
        result = FileDownloader.report_progress('s')
        self.assertEqual(result, None)

if __name__ == '__main__':
    unittest.main()