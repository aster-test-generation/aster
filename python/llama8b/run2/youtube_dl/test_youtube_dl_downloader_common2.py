import unittest
from youtube_dl.downloader.common import FileDownloader

class TestFileDownloader(unittest.TestCase):
    def test_format_seconds(self):
        self.assertEqual(FileDownloader.format_seconds(0), '--:--')
        self.assertEqual(FileDownloader.format_seconds(60), '01:00')
        self.assertEqual(FileDownloader.format_seconds(120), '02:00')
        self.assertEqual(FileDownloader.format_seconds(3600), '01:00:00')

    def test_calc_percent(self):
        self.assertEqual(FileDownloader.calc_percent(0, 100), 0)
        self.assertEqual(FileDownloader.calc_percent(50, 100), 50)
        self.assertEqual(FileDownloader.calc_percent(100, 100), 100)
        self.assertEqual(FileDownloader.calc_percent(0, None), None)

    def test_format_percent(self):
        self.assertEqual(FileDownloader.format_percent(0), '---.-%')
        self.assertEqual(FileDownloader.format_percent(50), '50.0%')
        self.assertEqual(FileDownloader.format_percent(100), '100.0%')
        self.assertEqual(FileDownloader.format_percent(None), '---.-%')

    def test_calc_eta(self):
        self.assertEqual(FileDownloader.calc_eta(0, 1, 100, 0), None)
        self.assertEqual(FileDownloader.calc_eta(0, 1, 100, 50), 100)
        self.assertEqual(FileDownloader.calc_eta(0, 1, 100, 100), 0)
        self.assertEqual(FileDownloader.calc_eta(0, None, 100, 0), None)

    def test_format_eta(self):
        self.assertEqual(FileDownloader.format_eta(None), '--:--')
        self.assertEqual(FileDownloader.format_eta(0), '--:--')
        self.assertEqual(FileDownloader.format_eta(60), '01:00')
        self.assertEqual(FileDownloader.format_eta(3600), '01:00:00')

    def test_calc_speed(self):
        self.assertEqual(FileDownloader.calc_speed(0, 1, 0), None)
        self.assertEqual(FileDownloader.calc_speed(0, 1, 100), 100)
        self.assertEqual(FileDownloader.calc_speed(0, 1, 1000), 1000)
        self.assertEqual(FileDownloader.calc_speed(0, None, 100), None)

    def test_format_speed(self):
        self.assertEqual(FileDownloader.format_speed(None), '---b/s')
        self.assertEqual(FileDownloader.format_speed(0), '---b/s')
        self.assertEqual(FileDownloader.format_speed(100), '100.0B/s')
        self.assertEqual(FileDownloader.format_speed(1000), '1.0KB/s')

    def test_best_block_size(self):
        self.assertEqual(FileDownloader.best_block_size(0, 100), 1)
        self.assertEqual(FileDownloader.best_block_size(0.001, 100), 1)
        self.assertEqual(FileDownloader.best_block_size(0.1, 100), 2)
        self.assertEqual(FileDownloader.best_block_size(1, 100), 4)

    def test_parse_bytes(self):
        self.assertEqual(FileDownloader.parse_bytes('100'), 100)
        self.assertEqual(FileDownloader.parse_bytes('100K'), 100000)
        self.assertEqual(FileDownloader.parse_bytes('100M'), 100000000)
        self.assertEqual(FileDownloader.parse_bytes('100G'), 100000000000)
        self.assertEqual(FileDownloader.parse_bytes('100T'), 1000000000000000)
        self.assertEqual(FileDownloader.parse_bytes('100P'), 1000000000000000)
        self.assertEqual(FileDownloader.parse_bytes('100E'), 1000000000000000)
        self.assertEqual(FileDownloader.parse_bytes('100Z'), 1000000000000000)
        self.assertEqual(FileDownloader.parse_bytes('100'), None)
        self.assertEqual(FileDownloader.parse_bytes('100a'), None)

    def test_to_screen(self):
        downloader = FileDownloader(None, None)
        downloader.to_screen('Test message')
        self.fail('Expected an exception')

    def test_to_stderr(self):
        downloader = FileDownloader(None, None)
        downloader.to_stderr('Test message')
        self.fail('Expected an exception')

    def test_to_console_title(self):
        downloader = FileDownloader(None, None)
        downloader.to_console_title('Test message')
        self.fail('Expected an exception')

    def test_trouble(self):
        downloader = FileDownloader(None, None)
        downloader.trouble('Test message')
        self.fail('Expected an exception')

    def test_report_warning(self):
        downloader = FileDownloader(None, None)
        downloader.report_warning('Test message')
        self.fail('Expected an exception')

    def test_report_error(self):
        downloader = FileDownloader(None, None)
        downloader.report_error('Test message')
        self.fail('Expected an exception')

if __name__ == '__main__':
    unittest.main()