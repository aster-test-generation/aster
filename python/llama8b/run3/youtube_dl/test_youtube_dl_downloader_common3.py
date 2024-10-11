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