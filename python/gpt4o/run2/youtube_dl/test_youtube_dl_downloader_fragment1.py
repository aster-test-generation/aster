import unittest
from unittest.mock import patch, mock_open, MagicMock
from youtube_dl.downloader.fragment import FragmentFD, HttpQuietDownloader
from youtube_dl.utils import sanitized_Request

class TestFragmentFD(unittest.TestCase):
    def setUp(self):
        self.fragment_fd = FragmentFD(MagicMock(), {})

    def test_report_retry_fragment(self):
        with patch.object(self.fragment_fd, 'to_screen') as mock_to_screen:
            self.fragment_fd.report_retry_fragment('error', 1, 2, 3)
            mock_to_screen.assert_called_once_with(
                '[download] Got server HTTP error: error. Retrying fragment 1 (attempt 2 of 3)...'
            )

    def test_report_skip_fragment(self):
        with patch.object(self.fragment_fd, 'to_screen') as mock_to_screen:
            self.fragment_fd.report_skip_fragment(1)
            mock_to_screen.assert_called_once_with('[download] Skipping fragment 1...')

    def test_prepare_url(self):
        info_dict = {'http_headers': {'User-Agent': 'test'}}
        url = 'http://example.com'
        result = self.fragment_fd._prepare_url(info_dict, url)
        self.assertIsInstance(result, sanitized_Request)

    def test_prepare_and_start_frag_download(self):
        with patch.object(self.fragment_fd, '_prepare_frag_download') as mock_prepare, \
             patch.object(self.fragment_fd, '_start_frag_download') as mock_start:
            ctx = {}
            self.fragment_fd._prepare_and_start_frag_download(ctx)
            mock_prepare.assert_called_once_with(ctx)
            mock_start.assert_called_once_with(ctx)

    def test_private_do_ytdl_file(self):
        ctx = {'live': False, 'tmpfilename': 'test'}
        result = self.fragment_fd._FragmentFD__do_ytdl_file(ctx)
        self.assertTrue(result)

    def test_read_ytdl_file(self):
        ctx = {'filename': 'test'}
        with patch('builtins.open', mock_open(read_data='{"downloader": {"current_fragment": {"index": 1}}}')):
            self.fragment_fd._read_ytdl_file(ctx)
            self.assertEqual(ctx['fragment_index'], 1)

    def test_write_ytdl_file(self):
        ctx = {'filename': 'test', 'fragment_index': 1}
        with patch('builtins.open', mock_open()) as mock_file:
            self.fragment_fd._write_ytdl_file(ctx)
            mock_file().write.assert_called_once_with('{"downloader": {"current_fragment": {"index": 1}}}')

    def test_download_fragment(self):
        ctx = {'tmpfilename': 'test', 'fragment_index': 1, 'dl': MagicMock()}
        ctx['dl'].download.return_value = True
        with patch('builtins.open', mock_open(read_data=b'test')) as mock_file:
            result, content = self.fragment_fd._download_fragment(ctx, 'http://example.com', {})
            self.assertTrue(result)
            self.assertEqual(content, b'test')

    def test_append_fragment(self):
        ctx = {'dest_stream': MagicMock(), 'fragment_filename_sanitized': 'test'}
        with patch('os.remove') as mock_remove:
            self.fragment_fd._append_fragment(ctx, b'test')
            ctx['dest_stream'].write.assert_called_once_with(b'test')
            mock_remove.assert_called_once_with('test')

    def test_prepare_frag_download(self):
        ctx = {'filename': 'test', 'total_frags': 1}
        with patch.object(self.fragment_fd, 'to_screen') as mock_to_screen, \
             patch.object(self.fragment_fd, 'report_destination') as mock_report, \
             patch('os.path.isfile', return_value=False), \
             patch('builtins.open', mock_open()) as mock_file:
            self.fragment_fd._prepare_frag_download(ctx)
            mock_to_screen.assert_called()
            mock_report.assert_called_once_with('test')

    def test_start_frag_download(self):
        ctx = {'complete_frags_downloaded_bytes': 0, 'total_frags': 1, 'filename': 'test', 'tmpfilename': 'test'}
        with patch('time.time', return_value=0):
            start = self.fragment_fd._start_frag_download(ctx)
            self.assertEqual(start, 0)

    def test_finish_frag_download(self):
        ctx = {'dest_stream': MagicMock(), 'tmpfilename': 'test', 'filename': 'test', 'complete_frags_downloaded_bytes': 0}
        with patch('os.path.isfile', return_value=True), \
             patch('os.remove') as mock_remove, \
             patch('os.path.getsize', return_value=0), \
             patch('time.time', return_value=0):
            self.fragment_fd._finish_frag_download(ctx)
            ctx['dest_stream'].close.assert_called_once()
            mock_remove.assert_called_once()

if __name__ == '__main__':
    unittest.main()