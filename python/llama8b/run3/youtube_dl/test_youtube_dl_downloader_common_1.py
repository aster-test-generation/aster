import unittest
from youtube_dl.downloader.common import FileDownloader


class TestFileDownloader(unittest.TestCase):
    def test_format_seconds(self):
        self.assertEqual(FileDownloader.format_seconds(0), '--:--')
        self.assertEqual(FileDownloader.format_seconds(60), '01:00')
        self.assertEqual(FileDownloader.format_seconds(3600), '01:00:00')

    def test_calc_percent(self):
        self.assertEqual(FileDownloader.calc_percent(0, 100), 0.0)
        self.assertEqual(FileDownloader.calc_percent(50, 100), 50.0)
        self.assertEqual(FileDownloader.calc_percent(100, 100), 100.0)

    def test_format_percent(self):
        self.assertEqual(FileDownloader.format_percent(0), '---.-%')
        self.assertEqual(FileDownloader.format_percent(50), '50.0%')
        self.assertEqual(FileDownloader.format_percent(100), '100.0%')

    def test_calc_eta(self):
        self.assertEqual(FileDownloader.calc_eta(0, 1, 100, 0), None)
        self.assertEqual(FileDownloader.calc_eta(0, 1, 100, 50), 0)
        self.assertEqual(FileDownloader.calc_eta(0, 1, 100, 100), 0)

    def test_format_eta(self):
        self.assertEqual(FileDownloader.format_eta(None), '--:--')
        self.assertEqual(FileDownloader.format_eta(0), '--:--')
        self.assertEqual(FileDownloader.format_eta(60), '01:00')

    def test_calc_speed(self):
        self.assertEqual(FileDownloader.calc_speed(0, 1, 0), None)
        self.assertEqual(FileDownloader.calc_speed(0, 1, 100), 100.0)
        self.assertEqual(FileDownloader.calc_speed(0, 1, 1000), 1000.0)

    def test_format_speed(self):
        self.assertEqual(FileDownloader.format_speed(None), '---b/s')
        self.assertEqual(FileDownloader.format_speed(100), '100.0B/s')
        self.assertEqual(FileDownloader.format_speed(1000), '1.0KB/s')

    def test_best_block_size(self):
        self.assertEqual(FileDownloader.best_block_size(0, 1000), 1)
        self.assertEqual(FileDownloader.best_block_size(1, 1000), 2)
        self.assertEqual(FileDownloader.best_block_size(1000, 1000), 4194304)

    def test_parse_bytes(self):
        self.assertEqual(FileDownloader.parse_bytes('1'), 1)
        self.assertEqual(FileDownloader.parse_bytes('1k'), 1024)
        self.assertEqual(FileDownloader.parse_bytes('1M'), 1048576)
        self.assertEqual(FileDownloader.parse_bytes('1G'), 1073741824)
        self.assertEqual(FileDownloader.parse_bytes('1T'), 1099511627776)

    def test_to_screen(self):
        downloader = FileDownloader(None, {})
        downloader.to_screen('Test message')
        self.fail('Expected to_screen method to raise an error')

    def test_to_stderr(self):
        downloader = FileDownloader(None, {})
        downloader.to_stderr('Test message')
        self.fail('Expected to_stderr method to raise an error')

    def test_to_console_title(self):
        downloader = FileDownloader(None, {})
        downloader.to_console_title('Test title')
        self.fail('Expected to_console_title method to raise an error')

    def test_trouble(self):
        downloader = FileDownloader(None, {})
        downloader.trouble('Test message')
        self.fail('Expected trouble method to raise an error')

    def test_report_warning(self):
        downloader = FileDownloader(None, {})
        downloader.report_warning('Test message')
        self.fail('Expected report_warning method to raise an error')

    def test_report_error(self):
        downloader = FileDownloader(None, {})
        downloader.report_error('Test message')
        self.fail('Expected report_error method to raise an error')

    def test_slow_down(self):
        downloader = FileDownloader(None, {})
        downloader.slow_down(0, 1, 100)
        self.fail('Expected slow_down method to raise an error')

    def test_temp_name(self):
        downloader = FileDownloader(None, {})
        self.assertEqual(downloader.temp_name('test.mp4'), 'test.mp4')
        self.assertEqual(downloader.temp_name('test.mp4.part'), 'test.mp4.part')
        self.assertEqual(downloader.temp_name('test.mp4.part.part'), 'test.mp4.part.part')

    def test_undo_temp_name(self):
        downloader = FileDownloader(None, {})
        self.assertEqual(downloader.undo_temp_name('test.mp4'), 'test.mp4')
        self.assertEqual(downloader.undo_temp_name('test.mp4.part'), 'test.mp4')
        self.assertEqual(downloader.undo_temp_name('test.mp4.part.part'), 'test.mp4.part')

class TestFileDownloader(unittest.TestCase):
    def test_format_seconds(self):
        self.assertEqual(FileDownloader.format_seconds(60), '01:00')
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
        self.assertEqual(FileDownloader.calc_eta(0, 10, 0, 50), None)

    def test_format_eta(self):
        self.assertEqual(FileDownloader.format_eta(10), '00:10')
        self.assertEqual(FileDownloader.format_eta(60), '01:00')
        self.assertEqual(FileDownloader.format_eta(3600), '01:00:00')

    def test_calc_speed(self):
        self.assertEqual(FileDownloader.calc_speed(0, 10, 50), 5.0)
        self.assertEqual(FileDownloader.calc_speed(0, 10, 0), None)
        self.assertEqual(FileDownloader.calc_speed(10, 20, 50), 2.5)

    def test_format_speed(self):
        self.assertEqual(FileDownloader.format_speed(5.0), '5.00 B/s')
        self.assertEqual(FileDownloader.format_speed(2.5), '2.50 B/s')
        self.assertEqual(FileDownloader.format_speed(None), '--- B/s')

    def test_best_block_size(self):
        self.assertEqual(FileDownloader.best_block_size(0.001, 1000), 1024)
        self.assertEqual(FileDownloader.best_block_size(0.1, 1000), 512)
        self.assertEqual(FileDownloader.best_block_size(1.0, 1000), 256)

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
        file_downloader.to_screen('Test message')
        self.fail('Expected to_screen method to raise an exception')

    def test_to_stderr(self):
        file_downloader = FileDownloader(None, None)
        file_downloader.to_stderr('Test message')
        self.fail('Expected to_stderr method to raise an exception')

    def test_to_console_title(self):
        file_downloader = FileDownloader(None, None)
        file_downloader.to_console_title('Test title')
        self.fail('Expected to_console_title method to raise an exception')

    def test_trouble(self):
        file_downloader = FileDownloader(None, None)
        file_downloader.trouble('Test message')
        self.fail('Expected trouble method to raise an exception')

    def test_report_warning(self):
        file_downloader = FileDownloader(None, None)
        file_downloader.report_warning('Test message')
        self.fail('Expected report_warning method to raise an exception')

    def test_report_error(self):
        file_downloader = FileDownloader(None, None)
        file_downloader.report_error('Test message')
        self.fail('Expected report_error method to raise an exception')

    def test_slow_down(self):
        file_downloader = FileDownloader(None, None)
        file_downloader.slow_down(0, 10, 50)
        self.fail('Expected slow_down method to raise an exception')

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
        self.assertEqual(FileDownloader.calc_eta(0, 1, 100, 50), 120)
        self.assertEqual(FileDownloader.calc_eta(0, 1, 100, 100), 0)
        self.assertEqual(FileDownloader.calc_eta(0, None, 100, 50), None)

    def test_format_eta(self):
        self.assertEqual(FileDownloader.format_eta(None), '--:--')
        self.assertEqual(FileDownloader.format_eta(0), '--:--')
        self.assertEqual(FileDownloader.format_eta(60), '01:00')
        self.assertEqual(FileDownloader.format_eta(120), '02:00')
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
        self.assertEqual(FileDownloader.best_block_size(0.5, 100), 2)
        self.assertEqual(FileDownloader.best_block_size(1, 100), 2)
        self.assertEqual(FileDownloader.best_block_size(2, 100), 4)
        self.assertEqual(FileDownloader.best_block_size(4194304, 100), 4194304)

    def test_parse_bytes(self):
        self.assertEqual(FileDownloader.parse_bytes('100'), 100)
        self.assertEqual(FileDownloader.parse_bytes('100B'), 100)
        self.assertEqual(FileDownloader.parse_bytes('100KB'), 102400)
        self.assertEqual(FileDownloader.parse_bytes('100MB'), 104857600)
        self.assertEqual(FileDownloader.parse_bytes('100GB'), 107374182400)
        self.assertEqual(FileDownloader.parse_bytes('100TB'), 109951162777600)
        self.assertEqual(FileDownloader.parse_bytes('100PB'), 1125899906842624)
        self.assertEqual(FileDownloader.parse_bytes('100EB'), 1152921504606846976)
        self.assertEqual(FileDownloader.parse_bytes('100ZB'), 1180591620717411303424)
        self.assertEqual(FileDownloader.parse_bytes('100YB'), 1208925819619266304028)
        self.assertEqual(FileDownloader.parse_bytes('abc'), None)

    def test_to_screen(self):
        downloader = FileDownloader(None, {})
        downloader.to_screen('Test message')
        self.assertEqual(sys.stdout.getvalue(), 'Test message\n')

    def test_to_stderr(self):
        downloader = FileDownloader(None, {})
        downloader.to_stderr('Test message')
        self.assertEqual(sys.stderr.getvalue(), 'Test message\n')

    def test_to_console_title(self):
        downloader = FileDownloader(None, {})
        downloader.to_console_title('Test title')
        self.assertEqual(sys.stdout.getvalue(), 'Test title\n')

if __name__ == '__main__':
    unittest.main()