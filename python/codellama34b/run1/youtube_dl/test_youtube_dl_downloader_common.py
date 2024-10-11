import unittest
from youtube_dl.downloader.common import *


class TestFileDownloader(unittest.TestCase):
    def test_report_resuming_byte(self):
        instance = FileDownloader(None, None)
        instance._report_resuming_byte(1)

    def test_report_retry(self):
        instance = FileDownloader(None, None)
        instance._report_retry(None, 1, 1)

    def test_report_file_already_downloaded(self):
        instance = FileDownloader(None, None)
        instance._report_file_already_downloaded('file_name')

    def test_report_unable_to_resume(self):
        instance = FileDownloader(None, None)
        instance._report_unable_to_resume()

    def test_download(self):
        instance = FileDownloader(None, None)
        instance.download('filename', None)

    def test_real_download(self):
        instance = FileDownloader(None, None)
        instance._real_download('filename', None)

    def test_hook_progress(self):
        instance = FileDownloader(None, None)
        instance._hook_progress(None)

    def test_add_progress_hook(self):
        instance = FileDownloader(None, None)
        instance._add_progress_hook(None)

    def test_debug_cmd(self):
        instance = FileDownloader(None, None)
        instance._debug_cmd(None)

if __name__ == '__main__':
    unittest.main()