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
        self.assertEqual(FileDownloader.calc_eta(0, 10, 100, 50), 10)
        self.assertEqual(FileDownloader.calc_eta(0, 10, 100, 0), None)
        self.assertEqual(FileDownloader.calc_eta(10, 20, 100, 50), 10)

    def test_format_eta(self):
        self.assertEqual(FileDownloader.format_eta(10), '00:10')
        self.assertEqual(FileDownloader.format_eta(60), '01:00')
        self.assertEqual(FileDownloader.format_eta(None), '--:--')

    def test_calc_speed(self):
        self.assertEqual(FileDownloader.calc_speed(0, 10, 50), 5.0)
        self.assertEqual(FileDownloader.calc_speed(10, 20, 50), 1.25)
        self.assertEqual(FileDownloader.calc_speed(20, 30, 50), 0.5)

    def test_format_speed(self):
        self.assertEqual(FileDownloader.format_speed(5.0), '50.0/s')
        self.assertEqual(FileDownloader.format_speed(1.25), '1.25/s')
        self.assertEqual(FileDownloader.format_speed(None), '---b/s')

    def test_format_retries(self):
        self.assertEqual(FileDownloader.format_retries(1), '1')
        self.assertEqual(FileDownloader.format_retries(5), '5')
        self.assertEqual(FileDownloader.format_retries(float('inf')), 'inf')

    def test_best_block_size(self):
        self.assertEqual(FileDownloader.best_block_size(0.001, 1000), 1024)
        self.assertEqual(FileDownloader.best_block_size(0.01, 1000), 512)
        self.assertEqual(FileDownloader.best_block_size(0.1, 1000), 256)

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
        downloader = FileDownloader(None, None)
        downloader.to_screen('Test message')
        self.assertEqual(sys.stdout.getvalue(), 'Test message\n')

    def test_to_stderr(self):
        downloader = FileDownloader(None, None)
        downloader.to_stderr('Test message')
        self.assertEqual(sys.stderr.getvalue(), 'Test message\n')

    def test_to_console_title(self):
        downloader = FileDownloader(None, None)
        downloader.to_console_title('Test message')
        self.assertEqual(sys.stdout.getvalue(), 'Test message\n')

    def test_trouble(self):
        downloader = FileDownloader(None, None)
        downloader.trouble('Test message')
        self.assertEqual(sys.stderr.getvalue(), 'Test message\n')

    def test_report_warning(self):
        downloader = FileDownloader(None, None)
        downloader.report_warning('Test message')
        self.assertEqual(sys.stderr.getvalue(), 'Test message\n')

    def test_report_error(self):
        downloader = FileDownloader(None, None)
        downloader.report_error('Test message')
        self.assertEqual(sys.stderr.getvalue(), 'Test message\n')

    def test_slow_down(self):
        downloader = FileDownloader(None, None)
        downloader.slow_down(0, 10, 50)
        self.assertEqual(sys.stdout.getvalue(), '')

if __name__ == '__main__':
    unittest.main()