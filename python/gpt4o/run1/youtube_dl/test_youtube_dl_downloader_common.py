import unittest
from unittest.mock import Mock, patch
from youtube_dl.downloader.common import FileDownloader


class TestFileDownloader(unittest.TestCase):
    def setUp(self):
        self.ydl = Mock()
        self.params = {
            'nooverwrites': False,
            'continuedl': True,
            'nopart': False,
            'sleep_interval': 1,
            'max_sleep_interval': 2,
            'verbose': True
        }
        self.downloader = FileDownloader(self.ydl, self.params)

    def test_init(self):
        self.assertEqual(self.downloader.ydl, self.ydl)
        self.assertEqual(self.downloader.params, self.params)
        self.assertEqual(len(self.downloader._progress_hooks), 1)

    def test_report_resuming_byte(self):
        with patch.object(self.downloader, 'to_screen') as mock_to_screen:
            self.downloader.report_resuming_byte(100)
            mock_to_screen.assert_called_with('[download] Resuming download at byte 100')

    def test_report_retry(self):
        with patch.object(self.downloader, 'to_screen') as mock_to_screen:
            err = Exception('HTTP Error')
            self.downloader.report_retry(err, 1, 3)
            mock_to_screen.assert_called_with('[download] Got server HTTP error: HTTP Error. Retrying (attempt 1 of 3)...')

    def test_report_file_already_downloaded(self):
        with patch.object(self.downloader, 'to_screen') as mock_to_screen:
            self.downloader.report_file_already_downloaded('testfile')
            mock_to_screen.assert_called_with('[download] testfile has already been downloaded')

    def test_report_file_already_downloaded_unicode_error(self):
        with patch.object(self.downloader, 'to_screen') as mock_to_screen:
            mock_to_screen.side_effect = [UnicodeEncodeError('codec', 'object', 0, 1, 'reason'), None]
            self.downloader.report_file_already_downloaded('testfile')
            mock_to_screen.assert_called_with('[download] The file has already been downloaded')

    def test_report_unable_to_resume(self):
        with patch.object(self.downloader, 'to_screen') as mock_to_screen:
            self.downloader.report_unable_to_resume()
            mock_to_screen.assert_called_with('[download] Unable to resume')

    def test_download_nooverwrites_and_exists(self):
        with patch('os.path.exists', return_value=True), \
             patch.object(self.downloader, 'report_file_already_downloaded') as mock_report_file_already_downloaded, \
             patch.object(self.downloader, '_hook_progress') as mock_hook_progress:
            self.params['nooverwrites'] = True
            result = self.downloader.download('testfile', {})
            mock_report_file_already_downloaded.assert_called_with('testfile')
            mock_hook_progress.assert_called()
            self.assertTrue(result)

    def test_download_sleep_interval(self):
        with patch('time.sleep') as mock_sleep, \
             patch.object(self.downloader, 'to_screen') as mock_to_screen, \
             patch.object(self.downloader, 'real_download', return_value=True) as mock_real_download:
            result = self.downloader.download('testfile', {})
            mock_to_screen.assert_called()
            mock_sleep.assert_called()
            mock_real_download.assert_called_with('testfile', {})
            self.assertTrue(result)

    def test_real_download(self):
        with self.assertRaises(NotImplementedError):
            self.downloader.real_download('testfile', {})

    def test_hook_progress(self):
        mock_hook = Mock()
        self.downloader.add_progress_hook(mock_hook)
        status = {'status': 'downloading'}
        self.downloader._hook_progress(status)
        mock_hook.assert_called_with(status)

    def test_add_progress_hook(self):
        mock_hook = Mock()
        self.downloader.add_progress_hook(mock_hook)
        self.assertIn(mock_hook, self.downloader._progress_hooks)

    def test_debug_cmd(self):
        with patch.object(self.downloader, 'to_screen') as mock_to_screen:
            self.downloader._debug_cmd(['arg1', 'arg2'], 'exe')
            mock_to_screen.assert_called_with('[debug] exe command line: arg1 arg2')

if __name__ == '__main__':
    unittest.main()