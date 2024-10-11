import unittest
from youtube_dl.downloader.common import FileDownloader


class TestFileDownloader(unittest.TestCase):
    def test_init(self):
        ydl = object()
        params = object()
        file_downloader = FileDownloader(ydl, params)
        self.assertEqual(file_downloader.ydl, ydl)
        self.assertEqual(file_downloader.params, params)
        self.assertEqual(file_downloader._progress_hooks, [])

    def test_report_resuming_byte(self):
        file_downloader = FileDownloader(object(), object())
        file_downloader.report_resuming_byte(123)
        self.assertEqual(file_downloader.to_screen.call_count, 1)
        file_downloader.to_screen.reset_mock()

    def test_report_retry(self):
        file_downloader = FileDownloader(object(), object())
        file_downloader.report_retry(Exception(), 1, 3)
        self.assertEqual(file_downloader.to_screen.call_count, 1)
        file_downloader.to_screen.reset_mock()

    def test_report_file_already_downloaded(self):
        file_downloader = FileDownloader(object(), object())
        file_downloader.report_file_already_downloaded('file_name')
        self.assertEqual(file_downloader.to_screen.call_count, 1)
        file_downloader.to_screen.reset_mock()

    def test_report_unable_to_resume(self):
        file_downloader = FileDownloader(object(), object())
        file_downloader.report_unable_to_resume()
        self.assertEqual(file_downloader.to_screen.call_count, 1)
        file_downloader.to_screen.reset_mock()

    def test_download(self):
        file_downloader = FileDownloader(object(), object())
        filename = 'filename'
        info_dict = object()
        result = file_downloader.download(filename, info_dict)
        self.assertEqual(result, True)

    def test_real_download(self):
        file_downloader = FileDownloader(object(), object())
        with self.assertRaises(NotImplementedError):
            file_downloader.real_download('filename', object())

    def test_hook_progress(self):
        file_downloader = FileDownloader(object(), object())
        status = object()
        file_downloader._hook_progress(status)
        self.assertEqual(file_downloader.to_screen.call_count, 1)
        file_downloader.to_screen.reset_mock()

    def test_add_progress_hook(self):
        file_downloader = FileDownloader(object(), object())
        ph = object()
        file_downloader.add_progress_hook(ph)
        self.assertIn(ph, file_downloader._progress_hooks)

    def test_debug_cmd(self):
        file_downloader = FileDownloader(object(), object())
        args = ['arg1', 'arg2']
        file_downloader._debug_cmd(args)
        self.assertEqual(file_downloader.to_screen.call_count, 1)
        file_downloader.to_screen.reset_mock()

    def test_str(self):
        file_downloader = FileDownloader(object(), object())
        self.assertEqual(str(file_downloader), 'FileDownloader')

    def test_repr(self):
        file_downloader = FileDownloader(object(), object())
        self.assertEqual(repr(file_downloader), 'FileDownloader(<__main__.FileDownloader object at 0x...>)')

    def test_eq(self):
        file_downloader1 = FileDownloader(object(), object())
        file_downloader2 = FileDownloader(object(), object())
        self.assertEqual(file_downloader1, file_downloader2)

if __name__ == '__main__':
    unittest.main()