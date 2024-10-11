import unittest
from unittest.mock import patch, MagicMock
from youtube_dl.downloader.dash import DashSegmentsFD
from youtube_dl.utils import DownloadError
from youtube_dl.compat import compat_urllib_error

class TestDashSegmentsFD(unittest.TestCase):
    def setUp(self):
        self.instance = DashSegmentsFD(None, None)
        self.instance.params = {
            'test': False,
            'fragment_retries': 0,
            'skip_unavailable_fragments': True
        }

    @patch('youtube_dl.downloader.dash.DashSegmentsFD._prepare_and_start_frag_download')
    @patch('youtube_dl.downloader.dash.DashSegmentsFD._finish_frag_download')
    @patch('youtube_dl.downloader.dash.DashSegmentsFD._download_fragment', return_value=(True, b'content'))
    @patch('youtube_dl.downloader.dash.DashSegmentsFD._append_fragment')
    def test_real_download_success(self, mock_append, mock_download, mock_finish, mock_prepare):
        info_dict = {
            'fragment_base_url': 'http://example.com/',
            'fragments': [{'path': 'frag1'}, {'path': 'frag2'}]
        }
        result = self.instance.real_download('filename', info_dict)
        self.assertTrue(result)

    @patch('youtube_dl.downloader.dash.DashSegmentsFD._prepare_and_start_frag_download')
    @patch('youtube_dl.downloader.dash.DashSegmentsFD._finish_frag_download')
    @patch('youtube_dl.downloader.dash.DashSegmentsFD._download_fragment', return_value=(False, None))
    def test_real_download_failure(self, mock_download, mock_finish, mock_prepare):
        info_dict = {
            'fragment_base_url': 'http://example.com/',
            'fragments': [{'path': 'frag1'}, {'path': 'frag2'}]
        }
        result = self.instance.real_download('filename', info_dict)
        self.assertFalse(result)

    @patch('youtube_dl.downloader.dash.DashSegmentsFD._prepare_and_start_frag_download')
    @patch('youtube_dl.downloader.dash.DashSegmentsFD._finish_frag_download')
    @patch('youtube_dl.downloader.dash.DashSegmentsFD._download_fragment', side_effect=compat_urllib_error.HTTPError(None, None, None, None, None))
    @patch('youtube_dl.downloader.dash.DashSegmentsFD.report_retry_fragment')
    def test_real_download_retry(self, mock_report_retry, mock_download, mock_finish, mock_prepare):
        self.instance.params['fragment_retries'] = 1
        info_dict = {
            'fragment_base_url': 'http://example.com/',
            'fragments': [{'path': 'frag1'}, {'path': 'frag2'}]
        }
        result = self.instance.real_download('filename', info_dict)
        self.assertFalse(result)
        mock_report_retry.assert_called()

    @patch('youtube_dl.downloader.dash.DashSegmentsFD._prepare_and_start_frag_download')
    @patch('youtube_dl.downloader.dash.DashSegmentsFD._finish_frag_download')
    @patch('youtube_dl.downloader.dash.DashSegmentsFD._download_fragment', side_effect=DownloadError)
    @patch('youtube_dl.downloader.dash.DashSegmentsFD.report_skip_fragment')
    def test_real_download_skip_fragment(self, mock_report_skip, mock_download, mock_finish, mock_prepare):
        info_dict = {
            'fragment_base_url': 'http://example.com/',
            'fragments': [{'path': 'frag1'}, {'path': 'frag2'}]
        }
        result = self.instance.real_download('filename', info_dict)
        self.assertTrue(result)
        mock_report_skip.assert_called()

    @patch('youtube_dl.downloader.dash.DashSegmentsFD._prepare_and_start_frag_download')
    @patch('youtube_dl.downloader.dash.DashSegmentsFD._finish_frag_download')
    @patch('youtube_dl.downloader.dash.DashSegmentsFD._download_fragment', side_effect=DownloadError)
    @patch('youtube_dl.downloader.dash.DashSegmentsFD.report_error')
    def test_real_download_fatal_error(self, mock_report_error, mock_download, mock_finish, mock_prepare):
        self.instance.params['skip_unavailable_fragments'] = False
        info_dict = {
            'fragment_base_url': 'http://example.com/',
            'fragments': [{'path': 'frag1'}, {'path': 'frag2'}]
        }
        with self.assertRaises(DownloadError):
            self.instance.real_download('filename', info_dict)
        mock_report_error.assert_called()

    def test_protected_methods(self):
        ctx = {'fragment_index': 0}
        self.instance._prepare_and_start_frag_download(ctx)
        self.assertEqual(ctx['fragment_index'], 0)

        self.instance._finish_frag_download(ctx)
        self.assertEqual(ctx['fragment_index'], 0)

    def test_private_methods(self):
        ctx = {'fragment_index': 0}
        fragment_url = 'http://example.com/frag1'
        info_dict = {}
        with patch('youtube_dl.downloader.dash.DashSegmentsFD._download_fragment', return_value=(True, b'content')) as mock_download:
            success, frag_content = self.instance._download_fragment(ctx, fragment_url, info_dict)
            self.assertTrue(success)
            self.assertEqual(frag_content, b'content')

        with patch('youtube_dl.downloader.dash.DashSegmentsFD._append_fragment') as mock_append:
            self.instance._append_fragment(ctx, b'content')
            mock_append.assert_called_with(ctx, b'content')

if __name__ == '__main__':
    unittest.main()