import unittest
from youtube_dl.downloader.hls import HlsFD
from youtube_dl.utils import DownloadError
from unittest.mock import patch, MagicMock


class TestHlsFD(unittest.TestCase):
    def setUp(self):
        self.hls_fd = HlsFD(MagicMock(), {})

    def test_can_download(self):
        manifest = "#EXTM3U\n#EXT-X-STREAM-INF:BANDWIDTH=1280000\nhttp://example.com/low.m3u8"
        info_dict = {'is_live': False}
        result = HlsFD.can_download(manifest, info_dict)
        self.assertTrue(result)

    def test_real_download(self):
        info_dict = {
            'url': 'http://example.com/playlist.m3u8',
            'is_live': False
        }
        self.hls_fd.ydl.urlopen = MagicMock()
        self.hls_fd.ydl.urlopen().read.return_value = "#EXTM3U\n#EXT-X-STREAM-INF:BANDWIDTH=1280000\nhttp://example.com/low.m3u8"
        self.hls_fd.can_download = MagicMock(return_value=True)
        self.hls_fd._prepare_and_start_frag_download = MagicMock()
        self.hls_fd._download_fragment = MagicMock(return_value=(True, b'content'))
        self.hls_fd._append_fragment = MagicMock()
        self.hls_fd._finish_frag_download = MagicMock()

        result = self.hls_fd.real_download('filename', info_dict)
        self.assertTrue(result)

    def test_real_download_delegates_to_ffmpeg(self):
        info_dict = {
            'url': 'http://example.com/playlist.m3u8',
            'is_live': False,
            'extra_param_to_segment_url': 'param=value'
        }
        self.hls_fd.ydl.urlopen = MagicMock()
        self.hls_fd.ydl.urlopen().read.return_value = "#EXTM3U\n#EXT-X-STREAM-INF:BANDWIDTH=1280000\nhttp://example.com/low.m3u8"
        self.hls_fd.can_download = MagicMock(return_value=False)
        self.hls_fd.report_warning = MagicMock()
        self.hls_fd._progress_hooks = []
        with patch('youtube_dl.downloader.hls.FFmpegFD') as MockFFmpegFD:
            mock_ffmpeg_fd = MockFFmpegFD.return_value
            mock_ffmpeg_fd.real_download.return_value = True
            result = self.hls_fd.real_download('filename', info_dict)
            self.assertTrue(result)

    def test_is_ad_fragment_start(self):
        result = self.hls_fd._HlsFD__is_ad_fragment_start('#EXT-X-CUE-OUT')
        self.assertTrue(result)

    def test_is_ad_fragment_end(self):
        result = self.hls_fd._HlsFD__is_ad_fragment_end('#EXT-X-CUE-IN')
        self.assertTrue(result)

    def test_prepare_url(self):
        info_dict = {'url': 'http://example.com/playlist.m3u8'}
        result = self.hls_fd._prepare_url(info_dict, 'http://example.com/segment.ts')
        self.assertEqual(result, 'http://example.com/segment.ts')

    def test_prepare_and_start_frag_download(self):
        ctx = {'filename': 'filename', 'total_frags': 1, 'ad_frags': 0}
        self.hls_fd._prepare_and_start_frag_download(ctx)
        self.assertEqual(ctx['fragment_index'], 0)

    def test_append_fragment(self):
        ctx = {'filename': 'filename', 'total_frags': 1, 'ad_frags': 0, 'fragment_index': 0}
        self.hls_fd._append_fragment(ctx, b'content')
        self.assertEqual(ctx['fragment_index'], 1)

    def test_finish_frag_download(self):
        ctx = {'filename': 'filename', 'total_frags': 1, 'ad_frags': 0, 'fragment_index': 1}
        self.hls_fd._finish_frag_download(ctx)
        self.assertEqual(ctx['fragment_index'], 1)

    def test_report_error(self):
        with self.assertRaises(DownloadError):
            self.hls_fd.report_error('error message')

    def test_report_warning(self):
        self.hls_fd.report_warning('warning message')
        self.assertTrue(True)  # Just to ensure the method runs without error

    def test_report_retry_fragment(self):
        self.hls_fd.report_retry_fragment(Exception('error'), 1, 1, 3)
        self.assertTrue(True)  # Just to ensure the method runs without error

    def test_report_skip_fragment(self):
        self.hls_fd.report_skip_fragment(1)
        self.assertTrue(True)  # Just to ensure the method runs without error

class TestHlsFD(unittest.TestCase):
    def setUp(self):
        self.instance = HlsFD(MagicMock(), {})

    @patch('youtube_dl.downloader.hls.can_decrypt_frag', True)
    def test_can_download(self):
        manifest = "#EXTM3U\n#EXT-X-KEY:METHOD=AES-128,URI=\"https://example.com/key\"\n#EXTINF:10,\nhttps://example.com/segment1.ts"
        info_dict = {'is_live': False}
        result = HlsFD.can_download(manifest, info_dict)
        self.assertTrue(result)

    @patch('youtube_dl.downloader.hls.can_decrypt_frag', False)
    def test_can_download_no_decrypt(self):
        manifest = "#EXTM3U\n#EXT-X-KEY:METHOD=AES-128,URI=\"https://example.com/key\"\n#EXTINF:10,\nhttps://example.com/segment1.ts"
        info_dict = {'is_live': False}
        result = HlsFD.can_download(manifest, info_dict)
        self.assertFalse(result)

    @patch('youtube_dl.downloader.hls.FFmpegFD')
    @patch('youtube_dl.downloader.hls.HlsFD.can_download', return_value=False)
    def test_real_download_delegate_to_ffmpeg(self, mock_can_download, mock_ffmpeg_fd):
        info_dict = {'url': 'https://example.com/playlist.m3u8'}
        mock_ffmpeg_instance = mock_ffmpeg_fd.return_value
        mock_ffmpeg_instance.real_download.return_value = True
        result = self.instance.real_download('testfile', info_dict)
        self.assertTrue(result)

    @patch('youtube_dl.downloader.hls.HlsFD.can_download', return_value=True)
    @patch('youtube_dl.downloader.hls.HlsFD._prepare_and_start_frag_download')
    @patch('youtube_dl.downloader.hls.HlsFD._download_fragment', return_value=(True, b'data'))
    @patch('youtube_dl.downloader.hls.HlsFD._append_fragment')
    @patch('youtube_dl.downloader.hls.HlsFD._finish_frag_download')
    def test_real_download_success(self, mock_finish, mock_append, mock_download, mock_prepare, mock_can_download):
        info_dict = {'url': 'https://example.com/playlist.m3u8'}
        self.instance.ydl.urlopen = MagicMock()
        self.instance.ydl.urlopen.return_value.read.return_value = b"#EXTM3U\n#EXTINF:10,\nhttps://example.com/segment1.ts"
        result = self.instance.real_download('testfile', info_dict)
        self.assertTrue(result)

    def test_is_ad_fragment_start(self):
        result = self.instance._HlsFD__is_ad_fragment_start('#EXT-X-CUE-OUT')
        self.assertTrue(result)

    def test_is_ad_fragment_end(self):
        result = self.instance._HlsFD__is_ad_fragment_end('#EXT-X-CUE-IN')
        self.assertTrue(result)

    @patch('youtube_dl.downloader.hls.HlsFD.report_error')
    def test_real_download_no_pycrypto(self, mock_report_error):
        info_dict = {'url': 'https://example.com/playlist.m3u8', 'extra_param_to_segment_url': 'param', '_decryption_key_url': 'key_url'}
        self.instance.ydl.urlopen = MagicMock()
        self.instance.ydl.urlopen.return_value.read.return_value = b"#EXTM3U\n#EXT-X-KEY:METHOD=AES-128,URI=\"https://example.com/key\"\n#EXTINF:10,\nhttps://example.com/segment1.ts"
        result = self.instance.real_download('testfile', info_dict)
        self.assertFalse(result)
        mock_report_error.assert_called_once_with('pycrypto not found. Please install it.')

    @patch('youtube_dl.downloader.hls.HlsFD.report_warning')
    @patch('youtube_dl.downloader.hls.FFmpegFD')
    def test_real_download_delegate_to_ffmpeg_with_warning(self, mock_ffmpeg_fd, mock_report_warning):
        info_dict = {'url': 'https://example.com/playlist.m3u8'}
        self.instance.ydl.urlopen = MagicMock()
        self.instance.ydl.urlopen.return_value.read.return_value = b"#EXTM3U\n#EXT-X-KEY:METHOD=AES-128,URI=\"https://example.com/key\"\n#EXTINF:10,\nhttps://example.com/segment1.ts"
        result = self.instance.real_download('testfile', info_dict)
        self.assertTrue(result)
        mock_report_warning.assert_called_once_with('hlsnative has detected features it does not support, extraction will be delegated to ffmpeg')

class TestHlsFD(unittest.TestCase):
    def setUp(self):
        self.instance = HlsFD(MagicMock(), {})

    @patch('youtube_dl.downloader.hls.re.search')
    def test_can_download(self, mock_search):
        mock_search.return_value = False
        manifest = "test_manifest"
        info_dict = {'is_live': False}
        result = HlsFD.can_download(manifest, info_dict)
        self.assertTrue(result)

    @patch('youtube_dl.downloader.hls.re.search')
    def test_can_download_unsupported_feature(self, mock_search):
        mock_search.return_value = True
        manifest = "test_manifest"
        info_dict = {'is_live': False}
        result = HlsFD.can_download(manifest, info_dict)
        self.assertFalse(result)

    @patch('youtube_dl.downloader.hls.HlsFD.can_download')
    @patch('youtube_dl.downloader.hls.FFmpegFD.real_download')
    def test_real_download_delegate_to_ffmpeg(self, mock_ffmpeg_download, mock_can_download):
        mock_can_download.return_value = False
        info_dict = {'url': 'http://example.com', 'extra_param_to_segment_url': None, '_decryption_key_url': None}
        self.instance.ydl.urlopen = MagicMock()
        self.instance.ydl.urlopen().read.return_value = b''
        self.instance.ydl.urlopen().geturl.return_value = 'http://example.com'
        self.instance.report_warning = MagicMock()
        self.instance.report_error = MagicMock()
        self.instance._progress_hooks = []
        self.instance.params = {}
        result = self.instance.real_download('filename', info_dict)
        self.assertTrue(mock_ffmpeg_download.called)
        self.assertFalse(result)

    @patch('youtube_dl.downloader.hls.HlsFD.can_download')
    @patch('youtube_dl.downloader.hls.FFmpegFD.real_download')
    def test_real_download_pycrypto_not_found(self, mock_ffmpeg_download, mock_can_download):
        mock_can_download.return_value = False
        info_dict = {'url': 'http://example.com', 'extra_param_to_segment_url': 'param', '_decryption_key_url': 'key_url'}
        self.instance.ydl.urlopen = MagicMock()
        self.instance.ydl.urlopen().read.return_value = b''
        self.instance.ydl.urlopen().geturl.return_value = 'http://example.com'
        self.instance.report_warning = MagicMock()
        self.instance.report_error = MagicMock()
        self.instance._progress_hooks = []
        self.instance.params = {}
        result = self.instance.real_download('filename', info_dict)
        self.assertTrue(self.instance.report_error.called)
        self.assertFalse(result)

    def test_is_ad_fragment_start(self):
        result = self.instance._HlsFD__is_ad_fragment_start('#EXT-X-DISCONTINUITY')
        self.assertTrue(result)

    def test_is_ad_fragment_end(self):
        result = self.instance._HlsFD__is_ad_fragment_end('#EXT-X-ENDLIST')
        self.assertTrue(result)

    @patch('youtube_dl.downloader.hls.HlsFD._prepare_and_start_frag_download')
    @patch('youtube_dl.downloader.hls.HlsFD._finish_frag_download')
    @patch('youtube_dl.downloader.hls.HlsFD._download_fragment')
    @patch('youtube_dl.downloader.hls.HlsFD._append_fragment')
    def test_real_download_success(self, mock_append_fragment, mock_download_fragment, mock_finish_frag_download, mock_prepare_and_start_frag_download):
        mock_download_fragment.return_value = (True, b'content')
        info_dict = {'url': 'http://example.com'}
        self.instance.ydl.urlopen = MagicMock()
        self.instance.ydl.urlopen().read.return_value = b'#EXTM3U\n#EXT-X-MEDIA-SEQUENCE:0\nhttp://example.com/frag1\n'
        self.instance.ydl.urlopen().geturl.return_value = 'http://example.com'
        self.instance.params = {'fragment_retries': 0, 'skip_unavailable_fragments': True, 'test': False}
        result = self.instance.real_download('filename', info_dict)
        self.assertTrue(result)

    @patch('youtube_dl.downloader.hls.HlsFD._prepare_and_start_frag_download')
    @patch('youtube_dl.downloader.hls.HlsFD._finish_frag_download')
    @patch('youtube_dl.downloader.hls.HlsFD._download_fragment')
    @patch('youtube_dl.downloader.hls.HlsFD._append_fragment')
    def test_real_download_failure(self, mock_append_fragment, mock_download_fragment, mock_finish_frag_download, mock_prepare_and_start_frag_download):
        mock_download_fragment.return_value = (False, b'')
        info_dict = {'url': 'http://example.com'}
        self.instance.ydl.urlopen = MagicMock()
        self.instance.ydl.urlopen().read.return_value = b'#EXTM3U\n#EXT-X-MEDIA-SEQUENCE:0\nhttp://example.com/frag1\n'
        self.instance.ydl.urlopen().geturl.return_value = 'http://example.com'
        self.instance.params = {'fragment_retries': 0, 'skip_unavailable_fragments': True, 'test': False}
        result = self.instance.real_download('filename', info_dict)
        self.assertFalse(result)

if __name__ == '__main__':
    unittest.main()