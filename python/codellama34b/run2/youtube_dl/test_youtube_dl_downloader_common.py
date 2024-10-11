import unittest
from youtube_dl.downloader.common import *


class TestFileDownloader(unittest.TestCase):
    def test_report_resuming_byte(self):
        instance = FileDownloader(None, None)
        instance.report_resuming_byte(100)

    def test_report_retry(self):
        instance = FileDownloader(None, None)
        instance.report_retry(None, 1, 1)

    def test_report_file_already_downloaded(self):
        instance = FileDownloader(None, None)
        instance.report_file_already_downloaded('test')

    def test_report_unable_to_resume(self):
        instance = FileDownloader(None, None)
        instance.report_unable_to_resume()

    def test_download(self):
        instance = FileDownloader(None, None)
        instance.download('test', None)

    def test_real_download(self):
        instance = FileDownloader(None, None)
        instance.real_download('test', None)

    def test__hook_progress(self):
        instance = FileDownloader(None, None)
        instance._hook_progress({'filename': 'test', 'status': 'finished', 'total_bytes': 100})

    def test_add_progress_hook(self):
        instance = FileDownloader(None, None)
        instance.add_progress_hook(None)

    def test__debug_cmd(self):
        instance = FileDownloader(None, None)
        instance._debug_cmd(['test'], 'test')

if __name__ == '__main__':
    unittest.main()