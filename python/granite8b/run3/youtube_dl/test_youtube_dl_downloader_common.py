import unittest
from youtube_dl.downloader.common import FileDownloader


class TestFileDownloader(unittest.TestCase):
    def test_report_resuming_byte(self):
        fd = FileDownloader(None, {})
        fd.report_resuming_byte(100)
        self.assertEqual(fd.resuming_byte, 100)

    def test_report_retry(self):
        fd = FileDownloader(None, {})
        fd.report_retry(Exception(), 1, 3)
        self.assertEqual(fd.retries, 1)

    def test_report_file_already_downloaded(self):
        fd = FileDownloader(None, {})
        fd.report_file_already_downloaded('test.mp4')
        self.assertEqual(fd.file_already_downloaded, 'test.mp4')

    def test_report_unable_to_resume(self):
        fd = FileDownloader(None, {})
        fd.report_unable_to_resume()
        self.assertTrue(fd.unable_to_resume)

    def test_download(self):
        fd = FileDownloader(None, {})
        self.assertTrue(fd.download('test.mp4', {}))

    def test_real_download(self):
        fd = FileDownloader(None, {})
        with self.assertRaises(NotImplementedError):
            fd.real_download('test.mp4', {})

    def test_add_progress_hook(self):
        fd = FileDownloader(None, {})
        def hook(status):
            pass
        fd.add_progress_hook(hook)
        self.assertEqual(len(fd._progress_hooks), 1)

    def test__hook_progress(self):
        fd = FileDownloader(None, {})
        def hook(status):
            pass
        fd._progress_hooks.append(hook)
        fd._hook_progress({})
        self.assertEqual(len(fd._progress_hooks), 0)

if __name__ == '__main__':
    unittest.main()