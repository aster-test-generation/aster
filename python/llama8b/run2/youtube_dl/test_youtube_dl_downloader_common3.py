import unittest
from youtube_dl.downloader.common import FileDownloader

class TestFileDownloader(unittest.TestCase):
    def test_format_seconds(self):
        self.assertEqual(FileDownloader.format_seconds(60), '00:01')
        self.assertEqual(FileDownloader.format_seconds(120), '02:00')
        self.assertEqual(FileDownloader.format_seconds(3600), '01:00:00')

    def test_calc_percent(self):
        self.assertEqual(FileDownloader.calc_percent(10, 100), 10.0)
        self.assertEqual(FileDownloader.calc_percent(0, 100), 0.0)
        self.assertEqual(FileDownloader.calc_percent(100, 100), 100.0)
        self.assertEqual(FileDownloader.calc_percent(0, 0), None)

    def test_format_percent(self):
        self.assertEqual(FileDownloader.format_percent(10.0), '10.0%')
        self.assertEqual(FileDownloader.format_percent(0.0), '0.0%')
        self.assertEqual(FileDownloader.format_percent(100.0), '100.0%')
        self.assertEqual(FileDownloader.format_percent(None), '---.-%')

    def test_calc_eta(self):
        self.assertEqual(FileDownloader.calc_eta(0, 10, 100, 10), 90)
        self.assertEqual(FileDownloader.calc_eta(0, 10, 100, 0), None)
        self.assertEqual(FileDownloader.calc_eta(0, 10, 0, 10), None)
        self.assertEqual(FileDownloader.calc_eta(0, 10, 100, 100), None)

    def test_format_eta(self):
        self.assertEqual(FileDownloader.format_eta(90), '01:30')
        self.assertEqual(FileDownloader.format_eta(None), '--:--')

    def test_calc_speed(self):
        self.assertEqual(FileDownloader.calc_speed(0, 10, 10), 1.0)
        self.assertEqual(FileDownloader.calc_speed(0, 10, 0), None)
        self.assertEqual(FileDownloader.calc_speed(10, 20, 20), 1.0)
        self.assertEqual(FileDownloader.calc_speed(10, 20, 0), None)

    def test_format_speed(self):
        self.assertEqual(FileDownloader.format_speed(1.0), '1.0/s')
        self.assertEqual(FileDownloader.format_speed(None), '---b/s')

    def test_best_block_size(self):
        self.assertEqual(FileDownloader.best_block_size(0.001, 10), 1)
        self.assertEqual(FileDownloader.best_block_size(0.1, 10), 10)
        self.assertEqual(FileDownloader.best_block_size(1, 10), 10)
        self.assertEqual(FileDownloader.best_block_size(100, 10), 1024)

    def test_parse_bytes(self):
        self.assertEqual(FileDownloader.parse_bytes('10'), 10)
        self.assertEqual(FileDownloader.parse_bytes('10k'), 10240)
        self.assertEqual(FileDownloader.parse_bytes('10M'), 10485760)
        self.assertEqual(FileDownloader.parse_bytes('10G'), 10737418240)
        self.assertEqual(FileDownloader.parse_bytes('10T'), 10995116277760)
        self.assertEqual(FileDownloader.parse_bytes('10P'), 1125899906842624)
        self.assertEqual(FileDownloader.parse_bytes('10E'), 1152921504606846976)
        self.assertEqual(FileDownloader.parse_bytes('10Z'), 1180591620717411303424)
        self.assertEqual(FileDownloader.parse_bytes('10Y'), 1208925819619266304)
        self.assertEqual(FileDownloader.parse_bytes('10b'), 10)
        self.assertEqual(FileDownloader.parse_bytes('10'), 10)
        self.assertEqual(FileDownloader.parse_bytes(None), None)

    def test_to_screen(self):
        downloader = FileDownloader(None, {})
        downloader.to_screen('test message')
        self.fail('Expected to_screen method to raise an exception')

    def test_to_stderr(self):
        downloader = FileDownloader(None, {})
        downloader.to_stderr('test message')
        self.fail('Expected to_stderr method to raise an exception')

    def test_to_console_title(self):
        downloader = FileDownloader(None, {})
        downloader.to_console_title('test message')
        self.fail('Expected to_console_title method to raise an exception')

    def test_trouble(self):
        downloader = FileDownloader(None, {})
        downloader.trouble('test message')
        self.fail('Expected trouble method to raise an exception')

    def test_report_warning(self):
        downloader = FileDownloader(None, {})
        downloader.report_warning('test message')
        self.fail('Expected report_warning method to raise an exception')

    def test_report_error(self):
        downloader = FileDownloader(None, {})
        downloader.report_error('test message')
        self.fail('Expected report_error method to raise an exception')

if __name__ == '__main__':
    unittest.main()