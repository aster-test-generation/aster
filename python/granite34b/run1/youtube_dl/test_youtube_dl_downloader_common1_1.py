import unittest
from youtube_dl.downloader.common import FileDownloader

class TestFileDownloader(unittest.TestCase):
    def test_format_seconds(self):
        self.assertEqual(FileDownloader.format_seconds(60), '01:00')
        self.assertEqual(FileDownloader.format_seconds(3600), '01:00:00')
        self.assertEqual(FileDownloader.format_seconds(1234), '02:05:44')

    def test_calc_percent(self):
        self.assertEqual(FileDownloader.calc_percent(10, 20), 50.0)
        self.assertEqual(FileDownloader.calc_percent(10, None), None)

    def test_format_percent(self):
        self.assertEqual(FileDownloader.format_percent(50.0), '  50.0%')
        self.assertEqual(FileDownloader.format_percent(None), '   ---.-%')

    def test_calc_eta(self):
        self.assertEqual(FileDownloader.calc_eta(100, 200, 1000, 200), 500)
        self.assertEqual(FileDownloader.calc_eta(100, 200, None, 200), None)

    def test_format_eta(self):
        self.assertEqual(FileDownloader.format_eta(60), '01:00')
        self.assertEqual(FileDownloader.format_eta(None), '--:--')

    def test_calc_speed(self):
        self.assertEqual(FileDownloader.calc_speed(100, 200, 1000), 500.0)
        self.assertEqual(FileDownloader.calc_speed(100, 200, 0), None)

    def test_format_speed(self):
        self.assertEqual(FileDownloader.format_speed(1000), '1000b/s')
        self.assertEqual(FileDownloader.format_speed(None), '    ---b/s')

    def test_format_retries(self):
        self.assertEqual(FileDownloader.format_retries(float('inf')), 'inf')
        self.assertEqual(FileDownloader.format_retries(10), '10.0')

    def test_best_block_size(self):
        self.assertEqual(FileDownloader.best_block_size(100, 1000), 500)
        self.assertEqual(FileDownloader.best_block_size(0, 1000), 1000)

    def test_parse_bytes(self):
        self.assertEqual(FileDownloader.parse_bytes('100k'), 102400)
        self.assertEqual(FileDownloader.parse_bytes('100M'), 104857600)
        self.assertEqual(FileDownloader.parse_bytes('100G'), 107374182400)
        self.assertEqual(FileDownloader.parse_bytes('100T'), 109951162777600)
        self.assertEqual(FileDownloader.parse_bytes('100P'), 112589990684262400)
        self.assertEqual(FileDownloader.parse_bytes('100E'), 115292150460684697600)
        self.assertEqual(FileDownloader.parse_bytes('100Z'), 118059162071741130342400)
        self.assertEqual(FileDownloader.parse_bytes('100Y'), 120892581961462917470617600)
        self.assertEqual(FileDownloader.parse_bytes('100'), None)
        self.assertEqual(FileDownloader.parse_bytes('100X'), None)

    def test_to_screen(self):
        pass  # TODO: Write test case for to_screen method

    def test_to_stderr(self):
        pass  # TODO: Write test case for to_stderr method

    def test_to_console_title(self):
        pass  # TODO: Write test case for to_console_title method

if __name__ == '__main__':
    unittest.main()