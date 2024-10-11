import unittest
from youtube_dl.downloader.common import FileDownloader


class TestFileDownloader(unittest.TestCase):
    def test_format_seconds(self):
        self.assertEqual(FileDownloader.format_seconds(0), '00:00')
        self.assertEqual(FileDownloader.format_seconds(60), '00:01')
        self.assertEqual(FileDownloader.format_seconds(3600), '01:00')
        self.assertEqual(FileDownloader.format_seconds(3600 * 24), '24:00')

    def test_calc_percent(self):
        self.assertEqual(FileDownloader.calc_percent(0, 100), 0.0)
        self.assertEqual(FileDownloader.calc_percent(50, 100), 50.0)
        self.assertEqual(FileDownloader.calc_percent(100, 100), 100.0)
        self.assertEqual(FileDownloader.calc_percent(0, None), None)

    def test_format_percent(self):
        self.assertEqual(FileDownloader.format_percent(0.0), '---.-%')
        self.assertEqual(FileDownloader.format_percent(50.0), '50.0%')
        self.assertEqual(FileDownloader.format_percent(100.0), '100.0%')
        self.assertEqual(FileDownloader.format_percent(None), '---.-%')

    def test_calc_eta(self):
        self.assertEqual(FileDownloader.calc_eta(0, 0, 100, 0), None)
        self.assertEqual(FileDownloader.calc_eta(0, 1, 100, 50), 1)
        self.assertEqual(FileDownloader.calc_eta(0, 2, 100, 100), 2)
        self.assertEqual(FileDownloader.calc_eta(0, None, 100, 0), None)

    def test_format_eta(self):
        self.assertEqual(FileDownloader.format_eta(None), '--:--')
        self.assertEqual(FileDownloader.format_eta(1), '00:01')
        self.assertEqual(FileDownloader.format_eta(60), '01:00')
        self.assertEqual(FileDownloader.format_eta(3600), '01:00:00')

    def test_calc_speed(self):
        self.assertEqual(FileDownloader.calc_speed(0, 0, 0), None)
        self.assertEqual(FileDownloader.calc_speed(0, 1, 50), 50.0)
        self.assertEqual(FileDownloader.calc_speed(0, 2, 100), 50.0)
        self.assertEqual(FileDownloader.calc_speed(0, None, 0), None)

    def test_format_speed(self):
        self.assertEqual(FileDownloader.format_speed(None), '---b/s')
        self.assertEqual(FileDownloader.format_speed(50.0), '50.0B/s')
        self.assertEqual(FileDownloader.format_speed(100.0), '100.0B/s')
        self.assertEqual(FileDownloader.format_speed(1024.0), '1.0KB/s')
        self.assertEqual(FileDownloader.format_speed(1024 * 1024.0), '1.0MB/s')
        self.assertEqual(FileDownloader.format_speed(1024 * 1024 * 1024.0), '1.0GB/s')

    def test_best_block_size(self):
        self.assertEqual(FileDownloader.best_block_size(0, 0), 1)
        self.assertEqual(FileDownloader.best_block_size(0.001, 50), 50)
        self.assertEqual(FileDownloader.best_block_size(0.001, 100), 100)
        self.assertEqual(FileDownloader.best_block_size(0.001, 4194304), 4194304)

    def test_parse_bytes(self):
        self.assertEqual(FileDownloader.parse_bytes('1'), 1)
        self.assertEqual(FileDownloader.parse_bytes('1k'), 1024)
        self.assertEqual(FileDownloader.parse_bytes('1M'), 1048576)
        self.assertEqual(FileDownloader.parse_bytes('1G'), 1073741824)
        self.assertEqual(FileDownloader.parse_bytes('1T'), 1099511627776)
        self.assertEqual(FileDownloader.parse_bytes('1P'), 1125899906842624)
        self.assertEqual(FileDownloader.parse_bytes('1E'), 1152921504606846976)
        self.assertEqual(FileDownloader.parse_bytes('1Z'), 1180591620717411303424)
        self.assertEqual(FileDownloader.parse_bytes('abc'), None)
        self.assertEqual(FileDownloader.parse_bytes('1'), 1)

    def test_to_screen(self):
        downloader = FileDownloader(None, None)
        downloader.to_screen('Test message')
        self.assertTrue(True)

    def test_to_stderr(self):
        downloader = FileDownloader(None, None)
        downloader.to_stderr('Test message')
        self.assertTrue(True)

    def test_to_console_title(self):
        downloader = FileDownloader(None, None)
        downloader.to_console_title('Test title')
        self.assertTrue(True)

    def test_trouble(self):
        downloader = FileDownloader(None, None)
        downloader.trouble('Test message')
        self.assertTrue(True)

class TestFileDownloader(unittest.TestCase):
    def test_format_seconds(self):
        self.assertEqual(FileDownloader.format_seconds(0), '--:--')
        self.assertEqual(FileDownloader.format_seconds(60), '01:00')
        self.assertEqual(FileDownloader.format_seconds(3600), '01:00:00')

    def test_calc_percent(self):
        self.assertEqual(FileDownloader.calc_percent(0, 100), None)
        self.assertEqual(FileDownloader.calc_percent(50, 100), 50.0)
        self.assertEqual(FileDownloader.calc_percent(100, 100), 100.0)

    def test_format_percent(self):
        self.assertEqual(FileDownloader.format_percent(None), '---.-%')
        self.assertEqual(FileDownloader.format_percent(50.0), '50.0%')
        self.assertEqual(FileDownloader.format_percent(100.0), '100.0%')

    def test_calc_eta(self):
        self.assertEqual(FileDownloader.calc_eta(None, None, 100, 0), None)
        self.assertEqual(FileDownloader.calc_eta(0, 1, 100, 50), 59)
        self.assertEqual(FileDownloader.calc_eta(0, 1, 100, 100), 0)

    def test_format_eta(self):
        self.assertEqual(FileDownloader.format_eta(None), '--:--')
        self.assertEqual(FileDownloader.format_eta(59), '00:59')
        self.assertEqual(FileDownloader.format_eta(0), '00:00')

    def test_calc_speed(self):
        self.assertEqual(FileDownloader.calc_speed(None, None, 0), None)
        self.assertEqual(FileDownloader.calc_speed(0, 1, 50), 50.0)
        self.assertEqual(FileDownloader.calc_speed(0, 1, 100), 100.0)

    def test_format_speed(self):
        self.assertEqual(FileDownloader.format_speed(None), '---b/s')
        self.assertEqual(FileDownloader.format_speed(50.0), '50.0B/s')
        self.assertEqual(FileDownloader.format_speed(100.0), '100.0B/s')

    def test_best_block_size(self):
        self.assertEqual(FileDownloader.best_block_size(0, 100), 1)
        self.assertEqual(FileDownloader.best_block_size(1, 100), 2)
        self.assertEqual(FileDownloader.best_block_size(100, 100), 4194304)

    def test_parse_bytes(self):
        self.assertEqual(FileDownloader.parse_bytes('100'), 100)
        self.assertEqual(FileDownloader.parse_bytes('100K'), 102400)
        self.assertEqual(FileDownloader.parse_bytes('100M'), 104857600)

    def test_to_screen(self):
        downloader = FileDownloader(None, {})
        downloader.to_screen('test message')
        self.assertEqual(sys.stdout.getvalue(), 'test message\n')

    def test_to_stderr(self):
        downloader = FileDownloader(None, {})
        downloader.to_stderr('test message')
        self.assertEqual(sys.stderr.getvalue(), 'test message\n')

    def test_to_console_title(self):
        downloader = FileDownloader(None, {})
        downloader.to_console_title('test title')
        self.assertEqual(sys.stdout.getvalue(), 'test title\n')

    def test_trouble(self):
        downloader = FileDownloader(None, {})
        downloader.trouble('test message')
        self.assertEqual(sys.stderr.getvalue(), 'test message\n')

    def test_report_warning(self):
        downloader = FileDownloader(None, {})
        downloader.report_warning('test message')
        self.assertEqual(sys.stderr.getvalue(), 'test message\n')

    def test_report_error(self):
        downloader = FileDownloader(None, {})
        downloader.report_error('test message')
        self.assertEqual(sys.stderr.getvalue(), 'test message\n')

    def test_slow_down(self):
        downloader = FileDownloader(None, {'ratelimit': 50})
        downloader.slow_down(0, 1, 50)
        self.assertEqual(time.sleep.call_count, 1)

    def test_temp_name(self):
        downloader = FileDownloader(None, {})
        self.assertEqual(downloader.temp_name('test'), 'test.part')
        self.assertEqual(downloader.temp_name('-'), '-')
        self.assertEqual(downloader.temp_name('test.mp3'), 'test.mp3')

    def test_undo_temp_name(self):
        downloader = FileDownloader(None, {})
        self.assertEqual(downloader.undo_temp_name('test.part'), 'test')
        self.assertEqual(downloader.undo_temp_name('-'), '-')

    def test_ytdl_filename(self):
        downloader = FileDownloader(None, {})
        self.assertEqual(downloader.ytdl_filename('test'), 'test.ytdl')

    def test_try_rename(self):
        downloader = FileDownloader(None, {})
        downloader.try_rename('old', 'new')
        self.assertEqual(os.rename.call_count, 1)

if __name__ == '__main__':
    unittest.main()