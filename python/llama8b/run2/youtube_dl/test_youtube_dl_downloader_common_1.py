import unittest
from youtube_dl.downloader.common import FileDownloader




class TestFileDownloader(unittest.TestCase):
    def test_format_seconds(self):
        self.assertEqual(FileDownloader.format_seconds(0), '--:--')
        self.assertEqual(FileDownloader.format_seconds(60), '00:01')
        self.assertEqual(FileDownloader.format_seconds(61), '00:01')
        self.assertEqual(FileDownloader.format_seconds(120), '00:02')
        self.assertEqual(FileDownloader.format_seconds(121), '00:02')
        self.assertEqual(FileDownloader.format_seconds(3600), '01:00')
        self.assertEqual(FileDownloader.format_seconds(3601), '01:00')
        self.assertEqual(FileDownloader.format_seconds(7200), '02:00')
        self.assertEqual(FileDownloader.format_seconds(7201), '02:00')

    def test_calc_percent(self):
        self.assertIsNone(FileDownloader.calc_percent(0, None))
        self.assertEqual(FileDownloader.calc_percent(100, 100), 100.0)
        self.assertEqual(FileDownloader.calc_percent(50, 100), 50.0)
        self.assertEqual(FileDownloader.calc_percent(0, 100), 0.0)

    def test_format_percent(self):
        self.assertEqual(FileDownloader.format_percent(None), '---.-%')
        self.assertEqual(FileDownloader.format_percent(0), '0.0%')
        self.assertEqual(FileDownloader.format_percent(100), '100.0%')
        self.assertEqual(FileDownloader.format_percent(50), '50.0%')

    def test_calc_eta(self):
        self.assertIsNone(FileDownloader.calc_eta(None, None, 100, 0))
        self.assertEqual(FileDownloader.calc_eta(0, 1, 100, 50), 0)
        self.assertEqual(FileDownloader.calc_eta(0, 1, 100, 100), 0)
        self.assertEqual(FileDownloader.calc_eta(0, 1, 100, 50), 0)
        self.assertEqual(FileDownloader.calc_eta(0, 1, 100, 0), None)

    def test_format_eta(self):
        self.assertEqual(FileDownloader.format_eta(None), '--:--')
        self.assertEqual(FileDownloader.format_eta(0), '--:--')
        self.assertEqual(FileDownloader.format_eta(60), '00:01')
        self.assertEqual(FileDownloader.format_eta(61), '00:01')
        self.assertEqual(FileDownloader.format_eta(120), '00:02')
        self.assertEqual(FileDownloader.format_eta(121), '00:02')
        self.assertEqual(FileDownloader.format_eta(3600), '01:00')
        self.assertEqual(FileDownloader.format_eta(3601), '01:00')
        self.assertEqual(FileDownloader.format_eta(7200), '02:00')
        self.assertEqual(FileDownloader.format_eta(7201), '02:00')

    def test_calc_speed(self):
        self.assertIsNone(FileDownloader.calc_speed(None, None, 0))
        self.assertEqual(FileDownloader.calc_speed(0, 1, 100), 100)
        self.assertEqual(FileDownloader.calc_speed(0, 1, 100), 100)
        self.assertEqual(FileDownloader.calc_speed(0, 1, 50), 50)
        self.assertEqual(FileDownloader.calc_speed(0, 1, 0), None)

    def test_format_speed(self):
        self.assertEqual(FileDownloader.format_speed(None), '---b/s')
        self.assertEqual(FileDownloader.format_speed(0), '0b/s')
        self.assertEqual(FileDownloader.format_speed(100), '100b/s')
        self.assertEqual(FileDownloader.format_speed(50), '50b/s')

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