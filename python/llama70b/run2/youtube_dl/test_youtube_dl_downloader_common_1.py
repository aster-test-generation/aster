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
        self.assertEqual(FileDownloader.calc_percent(50, 100), 50.0)
        self.assertEqual(FileDownloader.calc_percent(0, 100), 0.0)
        self.assertIsNone(FileDownloader.calc_percent(50, None))

    def test_format_percent(self):
        self.assertEqual(FileDownloader.format_percent(50.0), ' 50.0%')
        self.assertEqual(FileDownloader.format_percent(None), '---.%')

    def test_calc_eta(self):
        self.assertEqual(FileDownloader.calc_eta(0, 10, 100, 50), 10)
        self.assertIsNone(FileDownloader.calc_eta(0, 10, None, 50))
        self.assertIsNone(FileDownloader.calc_eta(0, None, 100, 50))

    def test_format_eta(self):
        self.assertEqual(FileDownloader.format_eta(60), '00:01:00')
        self.assertEqual(FileDownloader.format_eta(None), '--:--')

    def test_calc_speed(self):
        self.assertEqual(FileDownloader.calc_speed(0, 10, 50), 5.0)
        self.assertIsNone(FileDownloader.calc_speed(0, 10, 0))
        self.assertIsNone(FileDownloader.calc_speed(0, None, 50))

    def test_format_speed(self):
        self.assertEqual(FileDownloader.format_speed(5.0), '     5B/s')
        self.assertEqual(FileDownloader.format_speed(None), '%10s' % '---b/s')

    def test_format_retries(self):
        self.assertEqual(FileDownloader.format_retries(float('inf')), 'inf')
        self.assertEqual(FileDownloader.format_retries(5), '5')

    def test_best_block_size(self):
        self.assertEqual(FileDownloader.best_block_size(1, 50), 50)
        self.assertEqual(FileDownloader.best_block_size(0, 50), 4194304)

    def test_parse_bytes(self):
        self.assertEqual(FileDownloader.parse_bytes('50'), 50)
        self.assertEqual(FileDownloader.parse_bytes('50K'), 51200)
        self.assertIsNone(FileDownloader.parse_bytes('invalid'))

    def test_to_screen(self):
        ydl = object()
        instance = FileDownloader(ydl, {})
        instance.to_screen('message')

    def test_to_stderr(self):
        ydl = object()
        instance = FileDownloader(ydl, {})
        instance.to_stderr('message')

    def test_to_console_title(self):
        ydl = object()
        instance = FileDownloader(ydl, {})
        instance.to_console_title('message')

    def test_trouble(self):
        ydl = object()
        instance = FileDownloader(ydl, {})
        instance.trouble('message')

    def test_report_warning(self):
        ydl = object()
        instance = FileDownloader(ydl, {})
        instance.report_warning('message')

    def test_report_error(self):
        ydl = object()
        instance = FileDownloader(ydl, {})
        instance.report_error('message')

    def test_slow_down(self):
        ydl = object()
        instance = FileDownloader(ydl, {'ratelimit': 50})
        instance.slow_down(0, 10, 50)

    def test_temp_name(self):
        instance = FileDownloader(object(), {})
        self.assertEqual(instance.temp_name('filename'), 'filename.part')
        self.assertEqual(instance.temp_name('-'), '-')

    def test_undo_temp_name(self):
        instance = FileDownloader(object(), {})
        self.assertEqual(instance.undo_temp_name('filename.part'), 'filename')
        self.assertEqual(instance.undo_temp_name('filename'), 'filename')

    def test_ytdl_filename(self):
        instance = FileDownloader(object(), {})
        self.assertEqual(instance.ytdl_filename('filename'), 'filename.ytdl')

    def test_try_rename(self):
        instance = FileDownloader(object(), {})
        instance.try_rename('old_filename', 'new_filename')

    def test_try_utime(self):
        instance = FileDownloader(object(), {})
        instance.try_utime('filename', 'last_modified_hdr')

    def test_report_destination(self):
        instance = FileDownloader(object(), {})
        instance.report_destination('filename')

    def test_report_progress(self):
        instance = FileDownloader(object(), {})
        instance.report_progress({'status': 'finished'})

if __name__ == '__main__':
    unittest.main()