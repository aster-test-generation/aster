import unittest
from youtube_dl.downloader.common import FileDownloader


class TestFileDownloader(unittest.TestCase):
    def test_init(self):
        ydl = object()
        params = {}
        instance = FileDownloader(ydl, params)
        self.assertEqual(instance.ydl, ydl)
        self.assertEqual(instance.params, params)
        self.assertEqual(instance._progress_hooks, [instance.report_progress])

    def test_report_resuming_byte(self):
        instance = FileDownloader(object(), {})
        instance.to_screen = lambda x: self.assertEqual(x, '[download] Resuming download at byte 123')
        instance.report_resuming_byte(123)

    def test_report_retry(self):
        instance = FileDownloader(object(), {})
        instance.to_screen = lambda x: self.assertEqual(x, '[download] Got server HTTP error: error. Retrying (attempt 1 of 3)...')
        instance.report_retry('error', 1, 3)

    def test_report_file_already_downloaded(self):
        instance = FileDownloader(object(), {})
        instance.to_screen = lambda x: self.assertEqual(x, '[download] file has already been downloaded')
        instance.report_file_already_downloaded('file')

    def test_report_unable_to_resume(self):
        instance = FileDownloader(object(), {})
        instance.to_screen = lambda x: self.assertEqual(x, '[download] Unable to resume')
        instance.report_unable_to_resume()

    def test_download(self):
        instance = FileDownloader(object(), {'nooverwrites': True})
        instance.real_download = lambda x, y: True
        instance._hook_progress = lambda x: self.assertEqual(x, {'filename': 'file', 'status': 'finished', 'total_bytes': 123})
        self.assertTrue(instance.download('file', {}))

    def test_real_download(self):
        instance = FileDownloader(object(), {})
        with self.assertRaises(NotImplementedError):
            instance.real_download('file', {})

    def test_hook_progress(self):
        instance = FileDownloader(object(), {})
        instance._progress_hooks = [lambda x: self.assertEqual(x, {'filename': 'file', 'status': 'finished', 'total_bytes': 123})]
        instance._hook_progress({'filename': 'file', 'status': 'finished', 'total_bytes': 123})

    def test_add_progress_hook(self):
        instance = FileDownloader(object(), {})
        ph = lambda x: None
        instance.add_progress_hook(ph)
        self.assertIn(ph, instance._progress_hooks)

    def test_debug_cmd(self):
        instance = FileDownloader(object(), {'verbose': True})
        instance.to_screen = lambda x: self.assertEqual(x, '[debug] command line: ["arg1", "arg2"]')
        instance._debug_cmd(['arg1', 'arg2'])

    def test_private_report_progress(self):
        instance = FileDownloader(object(), {})
        instance._FileDownloader__report_progress = lambda x: self.assertEqual(x, {'filename': 'file', 'status': 'finished', 'total_bytes': 123})
        instance._FileDownloader__report_progress({'filename': 'file', 'status': 'finished', 'total_bytes': 123})

    def test_str_method(self):
        instance = FileDownloader(object(), {})
        self.assertEqual(str(instance), 'FileDownloader')

    def test_repr_method(self):
        instance = FileDownloader(object(), {})
        self.assertEqual(repr(instance), 'FileDownloader')

if __name__ == '__main__':
    unittest.main()