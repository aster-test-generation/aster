import unittest
from youtube_dl.downloader.common import FileDownloader


class TestFileDownloader(unittest.TestCase):
    def test_init(self):
        ydl = object()
        params = {}
        instance = FileDownloader(ydl, params)
        self.assertEqual(instance.ydl, ydl)
        self.assertEqual(instance.params, params)
        self.assertEqual(instance._progress_hooks, [instance.report_progress])

    def test_format_seconds(self):
        self.assertEqual(FileDownloader.format_seconds(60), '00:01:00')
        self.assertEqual(FileDownloader.format_seconds(3661), '01:01:01')
        self.assertEqual(FileDownloader.format_seconds(99999), '--:--:--')

    def test_calc_percent(self):
        self.assertEqual(FileDownloader.calc_percent(10, 100), 10.0)
        self.assertEqual(FileDownloader.calc_percent(0, 100), 0.0)
        self.assertIsNone(FileDownloader.calc_percent(10, None))

    def test_format_percent(self):
        self.assertEqual(FileDownloader.format_percent(10.0), ' 10.0%')
        self.assertEqual(FileDownloader.format_percent(None), '---.%')

    def test_calc_eta(self):
        self.assertEqual(FileDownloader.calc_eta(0, 10, 100, 50), 10)
        self.assertIsNone(FileDownloader.calc_eta(0, None, 100, 50))
        self.assertIsNone(FileDownloader.calc_eta(0, 10, None, 50))

    def test_format_eta(self):
        self.assertEqual(FileDownloader.format_eta(60), '00:01:00')
        self.assertEqual(FileDownloader.format_eta(None), '--:--')

    def test_calc_speed(self):
        self.assertEqual(FileDownloader.calc_speed(0, 10, 100), 10.0)
        self.assertIsNone(FileDownloader.calc_speed(0, None, 100))
        self.assertIsNone(FileDownloader.calc_speed(0, 10, 0))

    def test_format_speed(self):
        self.assertEqual(FileDownloader.format_speed(1024), '   1.0KiB/s')
        self.assertEqual(FileDownloader.format_speed(None), '%10s' % '---b/s')

    def test_format_retries(self):
        self.assertEqual(FileDownloader.format_retries(3), '3')
        self.assertEqual(FileDownloader.format_retries(float('inf')), 'inf')

    def test_best_block_size(self):
        self.assertEqual(FileDownloader.best_block_size(1, 1024), 1024)
        self.assertEqual(FileDownloader.best_block_size(0, 1024), 1024)

    def test_parse_bytes(self):
        self.assertEqual(FileDownloader.parse_bytes('1024'), 1024)
        self.assertEqual(FileDownloader.parse_bytes('1KiB'), 1024)
        self.assertIsNone(FileDownloader.parse_bytes('invalid'))

    def test_to_screen(self):
        ydl = object()
        params = {}
        instance = FileDownloader(ydl, params)
        instance.to_screen('Hello, world!')

    def test_to_stderr(self):
        ydl = object()
        params = {}
        instance = FileDownloader(ydl, params)
        instance.to_stderr('Error message')

    def test_to_console_title(self):
        ydl = object()
        params = {}
        instance = FileDownloader(ydl, params)
        instance.to_console_title('Title')

    def test_trouble(self):
        ydl = object()
        params = {}
        instance = FileDownloader(ydl, params)
        instance.trouble('Error message')

    def test_report_warning(self):
        ydl = object()
        params = {}
        instance = FileDownloader(ydl, params)
        instance.report_warning('Warning message')

    def test_report_error(self):
        ydl = object()
        params = {}
        instance = FileDownloader(ydl, params)
        instance.report_error('Error message')

    def test_slow_down(self):
        ydl = object()
        params = {'ratelimit': 1024}
        instance = FileDownloader(ydl, params)
        instance.slow_down(0, 10, 1024)

    def test_temp_name(self):
        ydl = object()
        params = {}
        instance = FileDownloader(ydl, params)
        self.assertEqual(instance.temp_name('file.txt'), 'file.txt.part')
        self.assertEqual(instance.temp_name('-'), '-')

    def test_undo_temp_name(self):
        ydl = object()
        params = {}
        instance = FileDownloader(ydl, params)
        self.assertEqual(instance.undo_temp_name('file.txt.part'), 'file.txt')
        self.assertEqual(instance.undo_temp_name('file.txt'), 'file.txt')

    def test_ytdl_filename(self):
        ydl = object()
        params = {}
        instance = FileDownloader(ydl, params)
        self.assertEqual(instance.ytdl_filename('file.txt'), 'file.txt.ytdl')

class TestFileDownloader(unittest.TestCase):
    def test_init(self):
        ydl = object()
        params = {}
        instance = FileDownloader(ydl, params)
        self.assertIsNotNone(instance.ydl)
        self.assertIsNotNone(instance._progress_hooks)
        self.assertIsNotNone(instance.params)

    def test_format_seconds(self):
        result = FileDownloader.format_seconds(60)
        self.assertEqual(result, '00:01:00')

    def test_calc_percent(self):
        result = FileDownloader.calc_percent(50, 100)
        self.assertEqual(result, 50.0)

    def test_format_percent(self):
        result = FileDownloader.format_percent(50.0)
        self.assertEqual(result, ' 50.0%')

    def test_calc_eta(self):
        result = FileDownloader.calc_eta(0, 10, 100, 50)
        self.assertEqual(result, 10)

    def test_format_eta(self):
        result = FileDownloader.format_eta(60)
        self.assertEqual(result, '00:01:00')

    def test_calc_speed(self):
        result = FileDownloader.calc_speed(0, 10, 50)
        self.assertEqual(result, 5.0)

    def test_format_speed(self):
        result = FileDownloader.format_speed(50.0)
        self.assertEqual(result, '     50b/s')

    def test_format_retries(self):
        result = FileDownloader.format_retries(5)
        self.assertEqual(result, '5')

    def test_best_block_size(self):
        result = FileDownloader.best_block_size(10, 50)
        self.assertEqual(result, 50)

    def test_parse_bytes(self):
        result = FileDownloader.parse_bytes('50K')
        self.assertEqual(result, 51200)

    def test_to_screen(self):
        ydl = object()
        params = {}
        instance = FileDownloader(ydl, params)
        instance.to_screen('test message')

    def test_to_stderr(self):
        ydl = object()
        params = {}
        instance = FileDownloader(ydl, params)
        instance.to_stderr('test message')

    def test_to_console_title(self):
        ydl = object()
        params = {}
        instance = FileDownloader(ydl, params)
        instance.to_console_title('test message')

    def test_trouble(self):
        ydl = object()
        params = {}
        instance = FileDownloader(ydl, params)
        instance.trouble('test message')

    def test_report_warning(self):
        ydl = object()
        params = {}
        instance = FileDownloader(ydl, params)
        instance.report_warning('test message')

    def test_report_error(self):
        ydl = object()
        params = {}
        instance = FileDownloader(ydl, params)
        instance.report_error('test message')

    def test_slow_down(self):
        ydl = object()
        params = {'ratelimit': 50}
        instance = FileDownloader(ydl, params)
        instance.slow_down(0, 10, 50)

    def test_temp_name(self):
        ydl = object()
        params = {}
        instance = FileDownloader(ydl, params)
        result = instance.temp_name('testfile')
        self.assertEqual(result, 'testfile.part')

    def test_undo_temp_name(self):
        ydl = object()
        params = {}
        instance = FileDownloader(ydl, params)
        result = instance.undo_temp_name('testfile.part')
        self.assertEqual(result, 'testfile')

    def test_ytdl_filename(self):
        ydl = object()
        params = {}
        instance = FileDownloader(ydl, params)
        result = instance.ytdl_filename('testfile')
        self.assertEqual(result, 'testfile.ytdl')

    def test_try_rename(self):
        ydl = object()
        params = {}
        instance = FileDownloader(ydl, params)
        instance.try_rename('oldfile', 'newfile')

    def test_try_utime(self):
        ydl = object()
        params = {}
        instance = FileDownloader(ydl, params)
        instance.try_utime('testfile', '2022-01-01 00:00:00')

    def test_report_destination(self):
        ydl = object()
        params = {}
        instance = FileDownloader(ydl, params)
        instance.report_destination('testfile')

    def test_report_progress(self):
        ydl = object()
        params = {}
        instance = FileDownloader(ydl, params)
        s = {'status': 'downloading', 'downloaded_bytes': 50, 'total_bytes': 100}
        instance.report_progress(s)

    def test__report_progress_status(self):
        ydl = object()
        params = {}
        instance = FileDownloader(ydl, params)
        instance._report_progress_status('test message')

if __name__ == '__main__':
    unittest.main()