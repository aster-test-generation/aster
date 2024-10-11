import unittest
from youtube_dl.downloader.common import FileDownloader


class TestFileDownloader(unittest.TestCase):
    def test_format_seconds(self):
        self.assertEqual(FileDownloader.format_seconds(60), '01:00')
        self.assertEqual(FileDownloader.format_seconds(3600), '01:00:00')
        self.assertEqual(FileDownloader.format_seconds(123456), '34:17:36')

    def test_calc_percent(self):
        self.assertEqual(FileDownloader.calc_percent(10, 20), 50.0)
        self.assertEqual(FileDownloader.calc_percent(10, None), None)

    def test_format_percent(self):
        self.assertEqual(FileDownloader.format_percent(50.0), ' 50.0%')
        self.assertEqual(FileDownloader.format_percent(None), '   ---.-%')

    def test_calc_eta(self):
        self.assertEqual(FileDownloader.calc_eta(0, 10, 20, 10), 10)
        self.assertEqual(FileDownloader.calc_eta(0, 10, None, 10), None)
        self.assertEqual(FileDownloader.calc_eta(0, None, 20, 10), 1722071070)

    def test_format_eta(self):
        self.assertEqual(FileDownloader.format_eta(60), '01:00')
        self.assertEqual(FileDownloader.format_eta(3600), '01:00:00')
        self.assertEqual(FileDownloader.format_eta(None), '--:--')

    def test_calc_speed(self):
        self.assertEqual(FileDownloader.calc_speed(0, 10, 10), 1.0)
        self.assertEqual(FileDownloader.calc_speed(0, 10, 0), None)
        self.assertEqual(FileDownloader.calc_speed(0, 0, 10), None)

    def test_format_speed(self):
        self.assertEqual(FileDownloader.format_speed(1024), '1.00KiB/s')
        self.assertEqual(FileDownloader.format_speed(1024**2), '1.0M/s')
        self.assertEqual(FileDownloader.format_speed(None), '      ---b/s')

    def test_format_retries(self):
        self.assertEqual(FileDownloader.format_retries(float('inf')), 'inf')
        self.assertEqual(FileDownloader.format_retries(10), '10')

    def test_best_block_size(self):
        self.assertEqual(FileDownloader.best_block_size(1, 1024), 1024)
        self.assertEqual(FileDownloader.best_block_size(1, 1024**2), 1024)
        self.assertEqual(FileDownloader.best_block_size(1, 1024**3), 4096)

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
        self.assertEqual(FileDownloader.format_percent(None), '---.-%')

    def test_calc_eta(self):
        start_time = time.time()
        time.sleep(0.1)
        now = time.time()
        self.assertTrue(FileDownloader.calc_eta(start_time, now, 100, 10) > 0)
        self.assertEqual(FileDownloader.calc_eta(start_time, now, None, 10), None)
        self.assertEqual(FileDownloader.calc_eta(start_time, now, 100, 0), None)

    def test_format_eta(self):
        self.assertEqual(FileDownloader.format_eta(60), '01:00')
        self.assertEqual(FileDownloader.format_eta(3600), '01:00:00')
        self.assertEqual(FileDownloader.format_eta(None), '--:--')

    def test_calc_speed(self):
        start_time = time.time()
        time.sleep(0.1)
        now = time.time()
        self.assertTrue(FileDownloader.calc_speed(start_time, now, 100) > 0)
        self.assertEqual(FileDownloader.calc_speed(start_time, now, 0), None)

    def test_format_speed(self):
        self.assertEqual(FileDownloader.format_speed(1024), '1.0K/s')
        self.assertEqual(FileDownloader.format_speed(None), '---b/s')

    def test_format_retries(self):
        self.assertEqual(FileDownloader.format_retries(float('inf')), 'inf')
        self.assertEqual(FileDownloader.format_retries(10), '10.0')

    def test_best_block_size(self):
        self.assertTrue(FileDownloader.best_block_size(0.1, 100) > 0)
        self.assertEqual(FileDownloader.best_block_size(0.1, 0), 1)

if __name__ == '__main__':
    unittest.main()