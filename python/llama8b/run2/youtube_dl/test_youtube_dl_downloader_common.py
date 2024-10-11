import unittest
from youtube_dl.downloader.common import FileDownloader


class TestFileDownloader(unittest.TestCase):
    def test_init(self):
        ydl = object()
        params = object()
        fd = FileDownloader(ydl, params)
        self.assertEqual(fd.ydl, ydl)
        self.assertEqual(fd.params, params)
        self.assertEqual(fd._progress_hooks, [])

    def test_report_resuming_byte(self):
        fd = FileDownloader(object(), object())
        fd.report_resuming_byte(123)
        self.assertEqual(fd.to_screen.call_count, 1)
        self.assertEqual(fd.to_screen.call_args[0][0], '[download] Resuming download at byte 123')

    def test_report_retry(self):
        fd = FileDownloader(object(), object())
        fd.report_retry(Exception('error'), 1, 3)
        self.assertEqual(fd.to_screen.call_count, 1)
        self.assertEqual(fd.to_screen.call_args[0][0], '[download] Got server HTTP error: error. Retrying (attempt 1 of 3)...')

    def test_report_file_already_downloaded(self):
        fd = FileDownloader(object(), object())
        fd.report_file_already_downloaded('file_name')
        self.assertEqual(fd.to_screen.call_count, 1)
        self.assertEqual(fd.to_screen.call_args[0][0], '[download] file_name has already been downloaded')

    def test_report_unable_to_resume(self):
        fd = FileDownloader(object(), object())
        fd.report_unable_to_resume()
        self.assertEqual(fd.to_screen.call_count, 1)
        self.assertEqual(fd.to_screen.call_args[0][0], '[download] Unable to resume')

    def test_download(self):
        fd = FileDownloader(object(), object())
        filename = 'filename'
        info_dict = object()
        result = fd.download(filename, info_dict)
        self.assertEqual(result, True)

    def test_real_download(self):
        fd = FileDownloader(object(), object())
        with self.assertRaises(NotImplementedError):
            fd.real_download('filename', object())

    def test_hook_progress(self):
        fd = FileDownloader(object(), object())
        status = {'filename': 'filename', 'status': 'finished', 'total_bytes': 123}
        ph = lambda x: None
        fd._hook_progress(status)
        self.assertEqual(ph.call_count, 1)
        self.assertEqual(ph.call_args[0][0], status)

    def test_add_progress_hook(self):
        fd = FileDownloader(object(), object())
        ph = lambda x: None
        fd.add_progress_hook(ph)
        self.assertEqual(fd._progress_hooks, [ph])

    def test_debug_cmd(self):
        fd = FileDownloader(object(), object())
        args = ['arg1', 'arg2']
        exe = 'exe'
        fd._debug_cmd(args, exe)
        self.assertEqual(fd.to_screen.call_count, 1)
        self.assertEqual(fd.to_screen.call_args[0][0], '[debug] exe command line: arg1 arg2')

    def test_str(self):
        fd = FileDownloader(object(), object())
        self.assertEqual(str(fd), 'FileDownloader')

    def test_repr(self):
        fd = FileDownloader(object(), object())
        self.assertEqual(repr(fd), 'FileDownloader({})'.format(fd.ydl))

    def test_eq(self):
        fd1 = FileDownloader(object(), object())
        fd2 = FileDownloader(object(), object())
        self.assertEqual(fd1, fd2)

if __name__ == '__main__':
    unittest.main()