import unittest
from unittest.mock import patch, call
from youtube_dl.downloader.dash import DashSegmentsFD
from youtube_dl.utils import DownloadError

class TestDashSegmentsFD(unittest.TestCase):
    def setUp(self):
        self.fd = DashSegmentsFD(ydl=None, params={})
        self.fd.report_error = lambda msg: None
        self.fd.report_retry_fragment = lambda err, frag_index, count, fragment_retries: None
        self.fd.report_skip_fragment = lambda frag_index: None
        self.info_dict = {
            'fragment_base_url': 'https://example.com/base_url',
            'fragments': [
                {'url': 'https://example.com/fragment1', 'duration': 10},
                {'url': 'https://example.com/fragment2', 'duration': 10},
                {'url': 'https://example.com/fragment3', 'duration': 10},
            ],
        }

    def test_real_download(self):
        with patch.object(self.fd, '_prepare_and_start_frag_download') as mock_prepare, \
             patch.object(self.fd, '_download_fragment') as mock_download, \
             patch.object(self.fd, '_append_fragment') as mock_append, \
             patch.object(self.fd, '_finish_frag_download') as mock_finish:
            mock_download.return_value = (True, b'fragment_content')
            self.assertTrue(self.fd.real_download('filename', self.info_dict))
            mock_prepare.assert_called_once_with({'filename': 'filename', 'total_frags': 3})
            self.assertEqual(mock_download.call_count, 3)
            mock_append.assert_has_calls([
                call({'filename': 'filename', 'total_frags': 3}, b'fragment_content'),
                call({'filename': 'filename', 'total_frags': 3}, b'fragment_content'),
                call({'filename': 'filename', 'total_frags': 3}, b'fragment_content'),
            ])
            mock_finish.assert_called_once_with({'filename': 'filename', 'total_frags': 3})

if __name__ == '__main__':
    unittest.main()