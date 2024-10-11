import unittest
from youtube_dl.downloader.common import FileDownloader

class TestFileDownloader(unittest.TestCase):
    def test_format_seconds(self):
        self.assertEqual(FileDownloader.format_seconds(60), '00:01')
        self.assertEqual(FileDownloader.format_seconds(120), '02:00')
        self.assertEqual(FileDownloader.format_seconds(3600), '01:00:00')

    def test_calc_percent(self):
        self.assertEqual(FileDownloader.calc_percent(100, 1000), 10.0)
        self.assertEqual(FileDownloader.calc_percent(500, 1000), 50.0)
        self.assertEqual(FileDownloader.calc_percent(0, 1000), 0.0)

    def test_format_percent(self):
        self.assertEqual(FileDownloader.format_percent(10.0), '10.0%')
        self.assertEqual(FileDownloader.format_percent(50.0), '50.0%')
        self.assertEqual(FileDownloader.format_percent(0.0), '0.0%')

    def test_calc_eta(self):
        self.assertEqual(FileDownloader.calc_eta(0, 10, 100, 0), None)
        self.assertEqual(FileDownloader.calc_eta(0, 10, 100, 50), 10)
        self.assertEqual(FileDownloader.calc_eta(0, 10, 100, 100), 0)

    def test_format_eta(self):
        self.assertEqual(FileDownloader.format_eta(10), '00:10')
        self.assertEqual(FileDownloader.format_eta(60), '01:00')
        self.assertEqual(FileDownloader.format_eta(3600), '01:00:00')

    def test_calc_speed(self):
        self.assertEqual(FileDownloader.calc_speed(0, 10, 100), 10.0)
        self.assertEqual(FileDownloader.calc_speed(0, 10, 50), 5.0)
        self.assertEqual(FileDownloader.calc_speed(0, 10, 0), None)

    def test_format_speed(self):
        self.assertEqual(FileDownloader.format_speed(10.0), '10.0/s')
        self.assertEqual(FileDownloader.format_speed(50.0), '50.0/s')
        self.assertEqual(FileDownloader.format_speed(0.0), '0.0/s')

    def test_best_block_size(self):
        self.assertEqual(FileDownloader.best_block_size(0.001, 1000), 1)
        self.assertEqual(FileDownloader.best_block_size(0.01, 1000), 100)
        self.assertEqual(FileDownloader.best_block_size(0.1, 1000), 1000)

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

    def test_to_screen(self):
        file_downloader = FileDownloader(None, None)
        file_downloader.to_screen('test message')

    def test_to_stderr(self):
        file_downloader = FileDownloader(None, None)
        file_downloader.to_stderr('test message')

    def test_to_console_title(self):
        file_downloader = FileDownloader(None, None)
        file_downloader.to_console_title('test message')

    def test_trouble(self):
        file_downloader = FileDownloader(None, None)
        file_downloader.trouble('test message')

    def test_report_warning(self):
        file_downloader = FileDownloader(None, None)
        file_downloader.report_warning('test message')

    def test_report_error(self):
        file_downloader = FileDownloader(None, None)
        file_downloader.report_error('test message')

    def test_slow_down(self):
        file_downloader = FileDownloader(None, None)
        file_downloader.slow_down(0, 10, 100)

    def test_temp_name(self):
        file_downloader = FileDownloader(None, None)
        self.assertEqual(file_downloader.temp_name('test'), 'test.part')
        self.assertEqual(file_downloader.temp_name('-'), '-')
        self.assertEqual(file_downloader.temp_name('test'), 'test')

    def test_undo_temp_name(self):
        file_downloader = FileDownloader(None, None)
        self.assertEqual(file_downloader.undo_temp_name('test.part'), 'test')
        self.assertEqual(file_downloader.undo_temp_name('test'), 'test')

if __name__ == '__main__':
    unittest.main()