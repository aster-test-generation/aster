import unittest
from youtube_dl.downloader.common import FileDownloader


class TestFileDownloader(unittest.TestCase):
    def test_format_seconds(self):
        self.assertEqual(FileDownloader.format_seconds(0), '00:00')
        self.assertEqual(FileDownloader.format_seconds(1), '00:01')
        self.assertEqual(FileDownloader.format_seconds(59), '00:59')
        self.assertEqual(FileDownloader.format_seconds(60), '01:00')
        self.assertEqual(FileDownloader.format_seconds(3600), '01:00:00')
        self.assertEqual(FileDownloader.format_seconds(3601), '01:00:01')

    def test_calc_percent(self):
        self.assertEqual(FileDownloader.calc_percent(0, 100), 0.0)
        self.assertEqual(FileDownloader.calc_percent(50, 100), 50.0)
        self.assertEqual(FileDownloader.calc_percent(100, 100), 100.0)
        self.assertEqual(FileDownloader.calc_percent(101, 100), 101.0)

    def test_format_percent(self):
        self.assertEqual(FileDownloader.format_percent(0.0), '  0.0%')
        self.assertEqual(FileDownloader.format_percent(50.0), '50.0%')
        self.assertEqual(FileDownloader.format_percent(100.0), '100.0%')
        self.assertEqual(FileDownloader.format_percent(101.0), '101.0%')

class TestFileDownloader(unittest.TestCase):
    def test_format_seconds(self):
        self.assertEqual(FileDownloader.format_seconds(10), '00:10')
        self.assertEqual(FileDownloader.format_seconds(60), '01:00')
        self.assertEqual(FileDownloader.format_seconds(3600), '01:00:00')
        self.assertEqual(FileDownloader.format_seconds(86400), '1 day, 00:00:00')

    def test_calc_percent(self):
        self.assertEqual(FileDownloader.calc_percent(0, 100), 0)
        self.assertEqual(FileDownloader.calc_percent(50, 100), 50)
        self.assertEqual(FileDownloader.calc_percent(100, 100), 100)
        self.assertEqual(FileDownloader.calc_percent(100, 0), None)

    def test_format_percent(self):
        self.assertEqual(FileDownloader.format_percent(0), '---.-%')
        self.assertEqual(FileDownloader.format_percent(50), '50.0%')
        self.assertEqual(FileDownloader.format_percent(100), '100.0%')

    def test_calc_eta(self):
        self.assertEqual(FileDownloader.calc_eta(0, 0, 100), None)
        self.assertEqual(FileDownloader.calc_eta(0, 1, 100), 99)
        self.assertEqual(FileDownloader.calc_eta(1, 1, 100), 0)
        self.assertEqual(FileDownloader.calc_eta(1, 2, 100), 1)

    def test_format_eta(self):
        self.assertEqual(FileDownloader.format_eta(None), '--:--')
        self.assertEqual(FileDownloader.format_eta(0), '00:00')
        self.assertEqual(FileDownloader.format_eta(1), '00:01')
        self.assertEqual(FileDownloader.format_eta(60), '01:00')
        self.assertEqual(FileDownloader.format_eta(3600), '01:00:00')

    def test_calc_speed(self):
        self.assertEqual(FileDownloader.calc_speed(0, 0, 100), None)
        self.assertEqual(FileDownloader.calc_speed(1, 1, 100), 100)
        self.assertEqual(FileDownloader.calc_speed(1, 2, 100), 50)

    def test_format_speed(self):
        self.assertEqual(FileDownloader.format_speed(None), '%10s' % '---b/s')
        self.assertEqual(FileDownloader.format_speed(100), '%10s' % '100.0b/s')
        self.assertEqual(FileDownloader.format_speed(1000000), '%10s' % '1.0MB/s')

class TestFileDownloader(unittest.TestCase):
    def setUp(self):
        self.ydl = None
        self.params = {}
        self.fd = FileDownloader(self.ydl, self.params)

    def test_format_seconds(self):
        self.assertEqual(self.fd.format_seconds(0), '00:00')
        self.assertEqual(self.fd.format_seconds(1), '00:01')
        self.assertEqual(self.fd.format_seconds(60), '01:00')
        self.assertEqual(self.fd.format_seconds(3600), '01:00:00')

    def test_calc_percent(self):
        self.assertEqual(self.fd.calc_percent(0, 100), 0.0)
        self.assertEqual(self.fd.calc_percent(50, 100), 50.0)
        self.assertEqual(self.fd.calc_percent(100, 100), 100.0)
        self.assertEqual(self.fd.calc_percent(100, 0), None)

    def test_format_percent(self):
        self.assertEqual(self.fd.format_percent(0.0), '00.0%')
        self.assertEqual(self.fd.format_percent(50.0), '50.0%')
        self.assertEqual(self.fd.format_percent(100.0), '100.0%')
        self.assertEqual(self.fd.format_percent(None), '---.-%')

class TestFileDownloader(unittest.TestCase):
    def test_format_seconds(self):
        self.assertEqual(FileDownloader.format_seconds(10), '00:10')
        self.assertEqual(FileDownloader.format_seconds(60), '01:00')
        self.assertEqual(FileDownloader.format_seconds(3600), '01:00:00')

    def test_calc_percent(self):
        self.assertEqual(FileDownloader.calc_percent(10, 100), 10.0)
        self.assertEqual(FileDownloader.calc_percent(50, 100), 50.0)
        self.assertEqual(FileDownloader.calc_percent(100, 100), 100.0)

    def test_format_percent(self):
        self.assertEqual(FileDownloader.format_percent(10), '  10%')
        self.assertEqual(FileDownloader.format_percent(50), ' 50%')
        self.assertEqual(FileDownloader.format_percent(100), '100%')

    def test_calc_eta(self):
        self.assertEqual(FileDownloader.calc_eta(10, 10, 100, 10), 0)
        self.assertEqual(FileDownloader.calc_eta(10, 10, 100, 50), 50)
        self.assertEqual(FileDownloader.calc_eta(10, 10, 100, 100), 100)

    def test_format_eta(self):
        self.assertEqual(FileDownloader.format_eta(0), '--:--')
        self.assertEqual(FileDownloader.format_eta(10), '00:10')
        self.assertEqual(FileDownloader.format_eta(60), '01:00')
        self.assertEqual(FileDownloader.format_eta(3600), '01:00:00')

    def test_calc_speed(self):
        self.assertEqual(FileDownloader.calc_speed(10, 10, 10), 1.0)
        self.assertEqual(FileDownloader.calc_speed(10, 10, 50), 2.0)
        self.assertEqual(FileDownloader.calc_speed(10, 10, 100), 10.0)

    def test_format_speed(self):
        self.assertEqual(FileDownloader.format_speed(1), '    1b/s')
        self.assertEqual(FileDownloader.format_speed(10), '   10b/s')
        self.assertEqual(FileDownloader.format_speed(100), '  100b/s')
        self.assertEqual(FileDownloader.format_speed(1000), ' 1000b/s')
        self.assertEqual(FileDownloader.format_speed(10000), '10000b/s')

class TestFileDownloader(unittest.TestCase):
    def test_format_seconds(self):
        self.assertEqual(FileDownloader.format_seconds(0), '00:00')
        self.assertEqual(FileDownloader.format_seconds(1), '00:01')
        self.assertEqual(FileDownloader.format_seconds(60), '01:00')
        self.assertEqual(FileDownloader.format_seconds(3600), '01:00:00')
        self.assertEqual(FileDownloader.format_seconds(86400), '24:00:00')

    def test_calc_percent(self):
        self.assertEqual(FileDownloader.calc_percent(0, 100), 0.0)
        self.assertEqual(FileDownloader.calc_percent(50, 100), 50.0)
        self.assertEqual(FileDownloader.calc_percent(100, 100), 100.0)
        self.assertEqual(FileDownloader.calc_percent(100, 0), None)

    def test_format_percent(self):
        self.assertEqual(FileDownloader.format_percent(0.0), '00.0%')
        self.assertEqual(FileDownloader.format_percent(0.5), '00.5%')
        self.assertEqual(FileDownloader.format_percent(1.0), '01.0%')
        self.assertEqual(FileDownloader.format_percent(None), '---.-%')

    def test_calc_eta(self):
        self.assertEqual(FileDownloader.calc_eta(0, 0, 100, 0), None)
        self.assertEqual(FileDownloader.calc_eta(0, 1, 100, 0), None)
        self.assertEqual(FileDownloader.calc_eta(0, 1, 100, 10), 90)
        self.assertEqual(FileDownloader.calc_eta(0, 1, 100, 100), 0)
        self.assertEqual(FileDownloader.calc_eta(0, 1, 0, 0), None)

    def test_format_eta(self):
        self.assertEqual(FileDownloader.format_eta(None), '--:--')
        self.assertEqual(FileDownloader.format_eta(0), '--:--')
        self.assertEqual(FileDownloader.format_eta(1), '00:01')
        self.assertEqual(FileDownloader.format_eta(60), '01:00')
        self.assertEqual(FileDownloader.format_eta(3600), '01:00:00')
        self.assertEqual(FileDownloader.format_eta(86400), '24:00:00')

class TestFileDownloader(unittest.TestCase):
    def test_format_seconds(self):
        self.assertEqual(FileDownloader.format_seconds(100), '01:40')
        self.assertEqual(FileDownloader.format_seconds(60), '01:00')
        self.assertEqual(FileDownloader.format_seconds(61), '01:01')
        self.assertEqual(FileDownloader.format_seconds(3600), '1:00:00')
        self.assertEqual(FileDownloader.format_seconds(3661), '1:01:01')

    def test_calc_percent(self):
        self.assertEqual(FileDownloader.calc_percent(100, 200), 50.0)
        self.assertEqual(FileDownloader.calc_percent(0, 200), 0.0)
        self.assertEqual(FileDownloader.calc_percent(100, 0), None)

    def test_format_percent(self):
        self.assertEqual(FileDownloader.format_percent(0.5), '50.0%')
        self.assertEqual(FileDownloader.format_percent(0.0), '0.0%')
        self.assertEqual(FileDownloader.format_percent(None), '---.-%')

    def test_calc_eta(self):
        self.assertEqual(FileDownloader.calc_eta(10, 20, 100, 10), 10)
        self.assertEqual(FileDownloader.calc_eta(10, 20, 100, 20), 20)
        self.assertEqual(FileDownloader.calc_eta(10, 20, 100, 0), None)

    def test_format_eta(self):
        self.assertEqual(FileDownloader.format_eta(10), '00:10')
        self.assertEqual(FileDownloader.format_eta(60), '01:00')
        self.assertEqual(FileDownloader.format_eta(3600), '1:00:00')
        self.assertEqual(FileDownloader.format_eta(None), '--:--')

    def test_calc_speed(self):
        self.assertEqual(FileDownloader.calc_speed(10, 20, 100), 100.0)
        self.assertEqual(FileDownloader.calc_speed(10, 20, 0), None)

    def test_format_speed(self):
        self.assertEqual(FileDownloader.format_speed(100), '100b/s')
        self.assertEqual(FileDownloader.format_speed(1024), '1.00Kb/s')
        self.assertEqual(FileDownloader.format_speed(1024 * 1024), '1.00Mb/s')
        self.assertEqual(FileDownloader.format_speed(1024 * 1024 * 1024), '1.00Gb/s')
        self.assertEqual(FileDownloader.format_speed(None), '%10s' % '---b/s')

    def test_format_retries(self):
        self.assertEqual(FileDownloader.format_retries(10), '10')
        self.assertEqual(FileDownloader.format_retries(float('inf')), 'inf')

if __name__ == '__main__':
    unittest.main()