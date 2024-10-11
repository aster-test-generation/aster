import unittest
from unittest.mock import patch, mock_open, MagicMock
from youtube_dl.downloader.fragment import FragmentFD, HttpQuietDownloader
from youtube_dl.utils import sanitized_Request, encodeFilename, sanitize_open
import json
import os
import time


class TestFragmentFD(unittest.TestCase):
    def setUp(self):
        self.fragment_fd = FragmentFD(MagicMock(), params={})
        self.ctx = {
            'filename': 'testfile',
            'tmpfilename': 'testfile.tmp',
            'fragment_index': 0,
            'total_frags': 5,
            'complete_frags_downloaded_bytes': 0,
            'live': False,
            'dl': MagicMock(),
            'dest_stream': MagicMock(),
        }

    def test_report_retry_fragment(self):
        with patch.object(self.fragment_fd, 'to_screen') as mock_to_screen:
            self.fragment_fd.report_retry_fragment('error', 1, 2, 3)
            mock_to_screen.assert_called_once()

    def test_report_skip_fragment(self):
        with patch.object(self.fragment_fd, 'to_screen') as mock_to_screen:
            self.fragment_fd.report_skip_fragment(1)
            mock_to_screen.assert_called_once()

    def test_prepare_url(self):
        info_dict = {'http_headers': {'User-Agent': 'test'}}
        url = 'http://example.com'
        result = self.fragment_fd._prepare_url(info_dict, url)
        self.assertIsInstance(result, sanitized_Request)

    def test_prepare_and_start_frag_download(self):
        with patch.object(self.fragment_fd, '_prepare_frag_download') as mock_prepare, \
             patch.object(self.fragment_fd, '_start_frag_download') as mock_start:
            self.fragment_fd._prepare_and_start_frag_download(self.ctx)
            mock_prepare.assert_called_once_with(self.ctx)
            mock_start.assert_called_once_with(self.ctx)

    def test_do_ytdl_file(self):
        self.ctx['live'] = False
        self.ctx['tmpfilename'] = 'testfile.tmp'
        result = FragmentFD._FragmentFD__do_ytdl_file(self.ctx)
        self.assertTrue(result)

    def test_read_ytdl_file(self):
        with patch('builtins.open', mock_open(read_data=json.dumps({'downloader': {'current_fragment': {'index': 1}}}))):
            self.fragment_fd._read_ytdl_file(self.ctx)
            self.assertEqual(self.ctx['fragment_index'], 1)

    def test_write_ytdl_file(self):
        with patch('builtins.open', mock_open()) as mock_file:
            self.fragment_fd._write_ytdl_file(self.ctx)
            mock_file().write.assert_called_once()

    def test_download_fragment(self):
        with patch('builtins.open', mock_open(read_data=b'testdata')) as mock_file:
            self.ctx['dl'].download.return_value = True
            result, content = self.fragment_fd._download_fragment(self.ctx, 'http://example.com', {})
            self.assertTrue(result)
            self.assertEqual(content, b'testdata')

    def test_append_fragment(self):
        with patch.object(self.fragment_fd, '_write_ytdl_file') as mock_write, \
             patch('os.remove') as mock_remove:
            self.fragment_fd._append_fragment(self.ctx, b'testdata')
            self.ctx['dest_stream'].write.assert_called_once_with(b'testdata')
            mock_write.assert_called_once_with(self.ctx)
            mock_remove.assert_called_once()

    def test_prepare_frag_download(self):
        with patch('os.path.isfile', return_value=False), \
             patch('builtins.open', mock_open()) as mock_file, \
             patch.object(self.fragment_fd, '_write_ytdl_file') as mock_write:
            self.fragment_fd._prepare_frag_download(self.ctx)
            mock_write.assert_called_once()

    def test_start_frag_download(self):
        with patch('time.time', return_value=0):
            start_time = self.fragment_fd._start_frag_download(self.ctx)
            self.assertEqual(start_time, 0)

    def test_finish_frag_download(self):
        with patch('os.path.getsize', return_value=100), \
             patch('os.remove') as mock_remove, \
             patch('time.time', return_value=0):
            self.fragment_fd._finish_frag_download(self.ctx)
            self.ctx['dest_stream'].close.assert_called_once()
            mock_remove.assert_called_once()

if __name__ == '__main__':
    unittest.main()