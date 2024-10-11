import unittest
from youtube_dl.downloader.common import FileDownloader


class TestFileDownloader(unittest.TestCase):
    def test_init(self):
        ydl = object()
        params = {}
        fd = FileDownloader(ydl, params)
        self.assertEqual(fd.ydl, ydl)
        self.assertEqual(fd.params, params)
        self.assertEqual(fd._progress_hooks, [])

    def test_report_resuming_byte(self):
        fd = FileDownloader(object(), {})
        fd.report_resuming_byte(123)
        self.assertEqual(fd.to_screen.call_count, 1)
        self.assertEqual(fd.to_screen.call_args[0][0], '[download] Resuming download at byte 123')

    def test_report_retry(self):
        fd = FileDownloader(object(), {})
        fd.report_retry(Exception('error'), 1, 3)
        self.assertEqual(fd.to_screen.call_count, 1)
        self.assertEqual(fd.to_screen.call_args[0][0], '[download] Got server HTTP error: error. Retrying (attempt 1 of 3)...')

    def test_report_file_already_downloaded(self):
        fd = FileDownloader(object(), {})
        fd.report_file_already_downloaded('file_name')
        self.assertEqual(fd.to_screen.call_count, 1)
        self.assertEqual(fd.to_screen.call_args[0][0], '[download] file_name has already been downloaded')

    def test_report_unable_to_resume(self):
        fd = FileDownloader(object(), {})
        fd.report_unable_to_resume()
        self.assertEqual(fd.to_screen.call_count, 1)
        self.assertEqual(fd.to_screen.call_args[0][0], '[download] Unable to resume')

    def test_download(self):
        fd = FileDownloader(object(), {})
        filename = 'filename'
        info_dict = {}
        self.assertTrue(fd.download(filename, info_dict))
        self.assertEqual(fd._hook_progress.call_count, 1)

    def test_real_download(self):
        fd = FileDownloader(object(), {})
        with self.assertRaises(NotImplementedError):
            fd.real_download('filename', {})

    def test_hook_progress(self):
        fd = FileDownloader(object(), {})
        status = {'filename': 'filename', 'status': 'finished', 'total_bytes': 123}
        ph = lambda x: None
        fd._hook_progress(status)
        ph(status)

    def test_add_progress_hook(self):
        fd = FileDownloader(object(), {})
        ph = lambda x: None
        fd.add_progress_hook(ph)
        self.assertIn(ph, fd._progress_hooks)

    def test_debug_cmd(self):
        fd = FileDownloader(object(), {})
        args = ['arg1', 'arg2']
        exe = 'exe'
        fd._debug_cmd(args, exe)
        self.assertEqual(fd.to_screen.call_count, 1)
        self.assertEqual(fd.to_screen.call_args[0][0], '[debug] exe command line: arg1 arg2')

    def test_str(self):
        fd = FileDownloader(object(), {})
        self.assertEqual(str(fd), 'FileDownloader')

    def test_repr(self):
        fd = FileDownloader(object(), {})
        self.assertEqual(repr(fd), 'FileDownloader({})')

    def test_eq(self):
        fd1 = FileDownloader(object(), {})
        fd2 = FileDownloader(object(), {})
        self.assertTrue(fd1 == fd2)

if __name__ == '__main__':
    unittest.main()