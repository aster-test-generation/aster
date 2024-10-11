import unittest
from youtube_dl.downloader.common import FileDownloader


class TestFileDownloader(unittest.TestCase):
    def test_report_resuming_byte(self):
        downloader = FileDownloader(None, {})
        downloader.to_screen = lambda msg: None
        downloader.report_resuming_byte(100)

    def test_report_retry(self):
        downloader = FileDownloader(None, {})
        downloader.to_screen = lambda msg: None
        downloader.report_retry("error", 1, 3)

    def test_report_file_already_downloaded(self):
        downloader = FileDownloader(None, {})
        downloader.to_screen = lambda msg: None
        downloader.report_file_already_downloaded("file.mp4")

    def test_report_unable_to_resume(self):
        downloader = FileDownloader(None, {})
        downloader.to_screen = lambda msg: None
        downloader.report_unable_to_resume()

    def test_download(self):
        downloader = FileDownloader(None, {})
        downloader.to_screen = lambda msg: None
        downloader.real_download = lambda filename, info_dict: True
        downloader.download("file.mp4", {})

    def test__hook_progress(self):
        downloader = FileDownloader(None, {})
        downloader._progress_hooks = [lambda status: None]
        downloader._hook_progress({})

    def test_add_progress_hook(self):
        downloader = FileDownloader(None, {})
        downloader.add_progress_hook(lambda status: None)

    def test__debug_cmd(self):
        downloader = FileDownloader(None, {})
        downloader.to_screen = lambda msg: None
        downloader._debug_cmd(["cmd", "arg1", "arg2"])

if __name__ == '__main__':
    unittest.main()