import unittest
from youtube_dl.downloader.common import FileDownloader


class TestFileDownloader(unittest.TestCase):
    def test_format_seconds(self):
        self.assertEqual(FileDownloader.format_seconds(60), '01:00')
        self.assertEqual(FileDownloader.format_seconds(3600), '01:00:00')
        self.assertEqual(FileDownloader.format_seconds(1234), '20:34')

    def test_calc_percent(self):
        self.assertEqual(FileDownloader.calc_percent(10, 20), 50.0)
        self.assertEqual(FileDownloader.calc_percent(10, None), None)

    def test_format_percent(self):
        self.assertEqual(FileDownloader.format_percent(50.0), ' 50.0%')
        self.assertEqual(FileDownloader.format_percent(None), '   ---.-%')

    def test_calc_eta(self):
        self.assertEqual(FileDownloader.calc_eta(100, 200, 1000, 500), 100)
        self.assertEqual(FileDownloader.calc_eta(100, 200, None, 500), None)

    def test_format_eta(self):
        self.assertEqual(FileDownloader.format_eta(60), '01:00')
        self.assertEqual(FileDownloader.format_eta(None), '--:--')

    def test_calc_speed(self):
        self.assertEqual(FileDownloader.calc_speed(100, 200, 1000), 10.0)
        self.assertEqual(FileDownloader.calc_speed(100, 200, 0), None)

    def test_format_speed(self):
        self.assertEqual(FileDownloader.format_speed(1000), '1000.00B/s')
        self.assertEqual(FileDownloader.format_speed(None), '      ---b/s')

    def test_format_retries(self):
        self.assertEqual(FileDownloader.format_retries(float('inf')), 'inf')
        self.assertEqual(FileDownloader.format_retries(10), '10')

    def test_best_block_size(self):
        self.assertEqual(FileDownloader.best_block_size(100, 1000), 500)
        self.assertEqual(FileDownloader.best_block_size(0, 1000), 2000)

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
        start_time = time.time()
        time.sleep(0.1)
        now = time.time()
        self.assertTrue(FileDownloader.calc_eta(start_time, now, 100, 10) > 0)
        self.assertEqual(FileDownloader.calc_eta(start_time, now, None, 10), None)
        self.assertEqual(FileDownloader.calc_eta(start_time, now, 100, 0), None)

    def test_format_eta(self):
        self.assertEqual(FileDownloader.format_eta(60), '01:00')
        self.assertEqual(FileDownloader.format_eta(None), '--:--')

    def test_calc_speed(self):
        start_time = time.time()
        time.sleep(0.1)
        now = time.time()
        self.assertTrue(FileDownloader.calc_speed(start_time, now, 100) > 0)
        self.assertEqual(FileDownloader.calc_speed(start_time, now, 0), None)

    def test_format_speed(self):
        self.assertEqual(FileDownloader.format_speed(1024), '1.0K/s')
        self.assertEqual(FileDownloader.format_speed(None), '     ---b/s')

    def test_format_retries(self):
        self.assertEqual(FileDownloader.format_retries(float('inf')), 'inf')
        self.assertEqual(FileDownloader.format_retries(10), '10.0')

    def test_best_block_size(self):
        self.assertTrue(FileDownloader.best_block_size(0.1, 100) > 0)
        self.assertEqual(FileDownloader.best_block_size(0.1, 0), 1)

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
        self.assertEqual(FileDownloader.calc_eta(0, 10, 20, 10), 10)
        self.assertEqual(FileDownloader.calc_eta(0, 10, None, 10), None)

    def test_format_eta(self):
        self.assertEqual(FileDownloader.format_eta(60), '01:00')
        self.assertEqual(FileDownloader.format_eta(None), '--:--')

    def test_calc_speed(self):
        self.assertEqual(FileDownloader.calc_speed(0, 10, 10), 1.0)
        self.assertEqual(FileDownloader.calc_speed(0, 10, 0), None)

    def test_format_speed(self):
        self.assertEqual(FileDownloader.format_speed(1024), '1.0K/s')
        self.assertEqual(FileDownloader.format_speed(None), '---b/s')

    def test_format_retries(self):
        self.assertEqual(FileDownloader.format_retries(float('inf')), 'inf')
        self.assertEqual(FileDownloader.format_retries(10), '10.0')

    def test_best_block_size(self):
        self.assertEqual(FileDownloader.best_block_size(1, 1024), 512)
        self.assertEqual(FileDownloader.best_block_size(1, 1024 * 1024), 4194304)

    def test_parse_bytes(self):
        self.assertEqual(FileDownloader.parse_bytes('1024'), 1024)
        self.assertEqual(FileDownloader.parse_bytes('1M'), 1048576)
        self.assertEqual(FileDownloader.parse_bytes('1G'), 1073741824)

    def test_to_screen(self):
        # This method prints to the console, so we can't easily test it
        pass

    def test_to_stderr(self):
        # This method prints to the console, so we can't easily test it
        pass

    def test_to_console_title(self):
        # This method sets the console title, so we can't easily test it
        pass

    def test_trouble(self):
        # This method calls ydl.trouble, which is difficult to test
        pass

    def test_report_warning(self):
        # This method calls ydl.report_warning, which is difficult to test
        pass

    def test_report_error(self):
        # This method calls ydl.report_error, which is difficult to test
        pass

    def test_slow_down(self):
        # This method calls time.sleep, which is difficult to test
        pass

    def test_temp_name(self):
        self.assertEqual(FileDownloader.temp_name('file.mp4'), 'file.mp4.part')
        self.assertEqual(FileDownloader.temp_name('file.mp4.part'), 'file.mp4.part')

    def test_undo_temp_name(self):
        self.assertEqual(FileDownloader.undo_temp_name('file.mp4.part'), 'file.mp4')
        self.assertEqual(FileDownloader.undo_temp_name('file.mp4'), 'file.mp4')

if __name__ == '__main__':
    unittest.main()