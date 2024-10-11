import unittest
from youtube_dl.downloader.common import FileDownloader
from unittest.mock import Mock, patch
import time
import os


class TestFileDownloader(unittest.TestCase):
    def setUp(self):
        self.ydl = Mock()
        self.params = {}
        self.downloader = FileDownloader(self.ydl, self.params)

    def test_init(self):
        self.assertEqual(self.downloader.ydl, self.ydl)
        self.assertEqual(self.downloader.params, self.params)
        self.assertEqual(len(self.downloader._progress_hooks), 1)

    def test_format_seconds(self):
        self.assertEqual(FileDownloader.format_seconds(3661), '01:01:01')
        self.assertEqual(FileDownloader.format_seconds(61), '01:01')
        self.assertEqual(FileDownloader.format_seconds(360000), '--:--:--')

    def test_calc_percent(self):
        self.assertEqual(FileDownloader.calc_percent(50, 100), 50.0)
        self.assertIsNone(FileDownloader.calc_percent(50, None))

    def test_format_percent(self):
        self.assertEqual(FileDownloader.format_percent(50.0), ' 50.0%')
        self.assertEqual(FileDownloader.format_percent(None), '---.-%')

    def test_calc_eta(self):
        self.assertEqual(FileDownloader.calc_eta(0, 10, 100, 10), 90)
        self.assertIsNone(FileDownloader.calc_eta(0, 10, None, 10))
        self.assertIsNone(FileDownloader.calc_eta(0, 10, 100, 0))

    def test_format_eta(self):
        self.assertEqual(FileDownloader.format_eta(3661), '01:01:01')
        self.assertEqual(FileDownloader.format_eta(None), '--:--')

    def test_calc_speed(self):
        self.assertEqual(FileDownloader.calc_speed(0, 10, 100), 10.0)
        self.assertIsNone(FileDownloader.calc_speed(0, 10, 0))

    def test_format_speed(self):
        self.assertEqual(FileDownloader.format_speed(1000), '   1.0KiB/s')
        self.assertEqual(FileDownloader.format_speed(None), '     ---b/s')

    def test_format_retries(self):
        self.assertEqual(FileDownloader.format_retries(float('inf')), 'inf')
        self.assertEqual(FileDownloader.format_retries(3), '3')

    def test_best_block_size(self):
        self.assertEqual(FileDownloader.best_block_size(1, 1000), 1000)
        self.assertEqual(FileDownloader.best_block_size(0.0001, 1000), 4194304)

    def test_parse_bytes(self):
        self.assertEqual(FileDownloader.parse_bytes('1K'), 1024)
        self.assertIsNone(FileDownloader.parse_bytes('invalid'))

    def test_to_screen(self):
        self.downloader.to_screen('message')
        self.ydl.to_screen.assert_called_with('message')

    def test_to_stderr(self):
        self.downloader.to_stderr('message')
        self.ydl.to_screen.assert_called_with('message')

    def test_to_console_title(self):
        self.downloader.to_console_title('message')
        self.ydl.to_console_title.assert_called_with('message')

    def test_trouble(self):
        self.downloader.trouble('message')
        self.ydl.trouble.assert_called_with('message')

    def test_report_warning(self):
        self.downloader.report_warning('message')
        self.ydl.report_warning.assert_called_with('message')

    def test_report_error(self):
        self.downloader.report_error('message')
        self.ydl.report_error.assert_called_with('message')

    @patch('time.sleep', return_value=None)
    def test_slow_down(self, mock_sleep):
        self.params['ratelimit'] = 100
        self.downloader.slow_down(0, 10, 1000)
        mock_sleep.assert_called()

    def test_temp_name(self):
        self.assertEqual(self.downloader.temp_name('file'), 'file.part')
        self.params['nopart'] = True
        self.assertEqual(self.downloader.temp_name('file'), 'file')

    def test_undo_temp_name(self):
        self.assertEqual(self.downloader.undo_temp_name('file.part'), 'file')
        self.assertEqual(self.downloader.undo_temp_name('file'), 'file')

    def test_ytdl_filename(self):
        self.assertEqual(self.downloader.ytdl_filename('file'), 'file.ytdl')

    @patch('os.rename')
    def test_try_rename(self, mock_rename):
        self.downloader.try_rename('old', 'new')
        mock_rename.assert_called_with('old', 'new')

    @patch('os.utime')
    @patch('os.path.isfile', return_value=True)
    @patch('youtube_dl.utils.timeconvert', return_value=1000)
    def test_try_utime(self, mock_timeconvert, mock_isfile, mock_utime):
        self.downloader.try_utime('file', 'header')
        mock_utime.assert_called()

    def test_report_destination(self):
        self.downloader.report_destination('file')
        self.ydl.to_screen.assert_called_with('[download] Destination: file')

    def test_report_progress_status(self):
        self.downloader._report_progress_status('message')
        self.ydl.to_screen.assert_called()

    def test_report_progress(self):
        s = {'status': 'finished', 'total_bytes': 1000, 'elapsed': 10}
        self.downloader.report_progress(s)
        self.ydl.to_screen.assert_called()

if __name__ == '__main__':
    unittest.main()