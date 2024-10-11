import unittest
from youtube_dl.downloader.common import FileDownloader


class TestFileDownloader(unittest.TestCase):
    def test_report_resuming_byte(self):
        fd = FileDownloader(None, {})
        fd.report_resuming_byte(100)
        self.assertEqual(fd._last_resuming_byte, 100)

    def test_report_retry(self):
        fd = FileDownloader(None, {})
        fd.report_retry(Exception(), 1, 3)
        self.assertEqual(fd._last_retry, {'err': Exception(), 'count': 1, 'retries': 3})

    def test_report_file_already_downloaded(self):
        fd = FileDownloader(None, {})
        fd.report_file_already_downloaded('test.mp4')
        self.assertEqual(fd._last_file_already_downloaded, 'test.mp4')

    def test_report_unable_to_resume(self):
        fd = FileDownloader(None, {})
        fd.report_unable_to_resume()
        self.assertEqual(fd._last_unable_to_resume, True)

    def test_download(self):
        fd = FileDownloader(None, {})
        self.assertTrue(fd.download('test.mp4', {}))

    def test_real_download(self):
        fd = FileDownloader(None, {})
        with self.assertRaises(NotImplementedError):
            fd.real_download('test.mp4', {})

if __name__ == '__main__':
    unittest.main()