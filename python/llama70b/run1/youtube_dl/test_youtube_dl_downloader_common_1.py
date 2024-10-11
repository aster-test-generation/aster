import unittest
from youtube_dl.downloader.common import FileDownloader


class TestFileDownloader(unittest.TestCase):
    def test_init(self):
        ydl = object()
        params = object()
        instance = FileDownloader(ydl, params)
        self.assertEqual(instance.ydl, ydl)
        self.assertEqual(instance.params, params)
        self.assertEqual(instance._progress_hooks, [instance.report_progress])

    def test_format_seconds(self):
        self.assertEqual(FileDownloader.format_seconds(0), '00:00:00')
        self.assertEqual(FileDownloader.format_seconds(60), '00:01:00')
        self.assertEqual(FileDownloader.format_seconds(3600), '01:00:00')
        self.assertEqual(FileDownloader.format_seconds(3600 * 100), '--:--:--')

    def test_calc_percent(self):
        self.assertIsNone(FileDownloader.calc_percent(0, None))
        self.assertEqual(FileDownloader.calc_percent(0, 100), 0.0)
        self.assertEqual(FileDownloader.calc_percent(50, 100), 50.0)
        self.assertEqual(FileDownloader.calc_percent(100, 100), 100.0)

    def test_format_percent(self):
        self.assertEqual(FileDownloader.format_percent(None), '---.%')
        self.assertEqual(FileDownloader.format_percent(0.0), '  0.0%')
        self.assertEqual(FileDownloader.format_percent(50.0), ' 50.0%')
        self.assertEqual(FileDownloader.format_percent(100.0), '100.0%')

    def test_calc_eta(self):
        self.assertIsNone(FileDownloader.calc_eta(0, 0, None, 0))
        self.assertIsNone(FileDownloader.calc_eta(0, 0, 100, 0))
        self.assertEqual(FileDownloader.calc_eta(0, 1, 100, 50), 1)
        self.assertEqual(FileDownloader.calc_eta(0, 1, 100, 100), 0)

    def test_format_eta(self):
        self.assertEqual(FileDownloader.format_eta(None), '--:--')
        self.assertEqual(FileDownloader.format_eta(0), '00:00:00')
        self.assertEqual(FileDownloader.format_eta(60), '00:01:00')
        self.assertEqual(FileDownloader.format_eta(3600), '01:00:00')

    def test_calc_speed(self):
        self.assertIsNone(FileDownloader.calc_speed(0, 0, 0))
        self.assertIsNone(FileDownloader.calc_speed(0, 0, 100))
        self.assertEqual(FileDownloader.calc_speed(0, 1, 100), 100.0)
        self.assertEqual(FileDownloader.calc_speed(0, 1, 200), 200.0)

    def test_format_speed(self):
        self.assertEqual(FileDownloader.format_speed(None), '%10s' % '---b/s')
        self.assertEqual(FileDownloader.format_speed(0), '%10s' % '  0.0B/s')
        self.assertEqual(FileDownloader.format_speed(100), '%10s' % '100.0B/s')
        self.assertEqual(FileDownloader.format_speed(1024), '%10s' % '  1.0KiB/s')

    def test_format_retries(self):
        self.assertEqual(FileDownloader.format_retries(float('inf')), 'inf')
        self.assertEqual(FileDownloader.format_retries(0), '0')
        self.assertEqual(FileDownloader.format_retries(1), '1')
        self.assertEqual(FileDownloader.format_retries(10), '10')

    def test_best_block_size(self):
        self.assertEqual(FileDownloader.best_block_size(0, 100), 4194304)
        self.assertEqual(FileDownloader.best_block_size(1, 100), 100)
        self.assertEqual(FileDownloader.best_block_size(1, 200), 200)

    def test_parse_bytes(self):
        self.assertIsNone(FileDownloader.parse_bytes(''))
        self.assertIsNone(FileDownloader.parse_bytes('abc'))
        self.assertEqual(FileDownloader.parse_bytes('100'), 100)
        self.assertEqual(FileDownloader.parse_bytes('100K'), 102400)
        self.assertEqual(FileDownloader.parse_bytes('100M'), 104857600)

    def test_to_screen(self):
        ydl = object()
        instance = FileDownloader(ydl, object())
        instance.ydl.to_screen = lambda *args, **kwargs: None
        instance.to_screen('message')

    def test_to_stderr(self):
        ydl = object()
        instance = FileDownloader(ydl, object())
        instance.ydl.to_screen = lambda *args, **kwargs: None
        instance.to_stderr('message')

    def test_to_console_title(self):
        ydl = object()
        instance = FileDownloader(ydl, object())
        instance.ydl.to_console_title = lambda *args, **kwargs: None
        instance.to_console_title('message')

class TestFileDownloader(unittest.TestCase):
    def test_init(self):
        ydl = object()
        params = object()
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
        self.assertEqual(FileDownloader.format_speed(10.0), '     10b/s')
        self.assertEqual(FileDownloader.format_speed(None), '       ---b/s')

    def test_format_retries(self):
        self.assertEqual(FileDownloader.format_retries(float('inf')), 'inf')
        self.assertEqual(FileDownloader.format_retries(5), '5')

    def test_best_block_size(self):
        self.assertEqual(FileDownloader.best_block_size(1, 100), 100)
        self.assertEqual(FileDownloader.best_block_size(0, 100), 1048576)

    def test_parse_bytes(self):
        self.assertEqual(FileDownloader.parse_bytes('100'), 100)
        self.assertEqual(FileDownloader.parse_bytes('100K'), 102400)
        self.assertIsNone(FileDownloader.parse_bytes('invalid'))

    def test_to_screen(self):
        ydl = object()
        instance = FileDownloader(ydl, object())
        instance.ydl.to_screen = lambda *args, **kwargs: None
        instance.to_screen('message')

    def test_to_stderr(self):
        ydl = object()
        instance = FileDownloader(ydl, object())
        instance.ydl.to_screen = lambda *args, **kwargs: None
        instance.to_stderr('message')

    def test_to_console_title(self):
        ydl = object()
        instance = FileDownloader(ydl, object())
        instance.ydl.to_console_title = lambda *args, **kwargs: None
        instance.to_console_title('message')

    def test_trouble(self):
        ydl = object()
        instance = FileDownloader(ydl, object())
        instance.ydl.trouble = lambda *args, **kwargs: None
        instance.trouble('message')

    def test_report_warning(self):
        ydl = object()
        instance = FileDownloader(ydl, object())
        instance.ydl.report_warning = lambda *args, **kwargs: None
        instance.report_warning('message')

    def test_report_error(self):
        ydl = object()
        instance = FileDownloader(ydl, object())
        instance.ydl.report_error = lambda *args, **kwargs: None
        instance.report_error('message')

    def test_slow_down(self):
        instance = FileDownloader(object(), {'ratelimit': 100})
        instance.slow_down(0, 10, 100)

    def test_temp_name(self):
        instance = FileDownloader(object(), {'nopart': True})
        self.assertEqual(instance.temp_name('filename'), 'filename')
        instance = FileDownloader(object(), {'nopart': False})
        self.assertEqual(instance.temp_name('filename'), 'filename.part')

    def test_undo_temp_name(self):
        instance = FileDownloader(object(), {})
        self.assertEqual(instance.undo_temp_name('filename.part'), 'filename')
        self.assertEqual(instance.undo_temp_name('filename'), 'filename')

if __name__ == '__main__':
    unittest.main()