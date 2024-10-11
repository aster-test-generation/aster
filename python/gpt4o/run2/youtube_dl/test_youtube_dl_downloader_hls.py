import unittest
from youtube_dl.downloader.hls import HlsFD
from youtube_dl.utils import DownloadError
from unittest.mock import patch, MagicMock
from youtube_dl.downloader.external import FFmpegFD


class TestHlsFD(unittest.TestCase):
    def setUp(self):
        self.instance = HlsFD(MagicMock(), {})

    @patch('youtube_dl.downloader.hls.re.search')
    def test_can_download(self, mock_search):
        mock_search.side_effect = [False, False, False, False]
        manifest = "test_manifest"
        info_dict = {'is_live': False}
        result = HlsFD.can_download(manifest, info_dict)
        self.assertTrue(result)

    @patch('youtube_dl.downloader.hls.re.search')
    def test_can_download_unsupported_feature(self, mock_search):
        mock_search.side_effect = [True, False, False, False]
        manifest = "test_manifest"
        info_dict = {'is_live': False}
        result = HlsFD.can_download(manifest, info_dict)
        self.assertFalse(result)

    @patch('youtube_dl.downloader.hls.re.search')
    def test_can_download_live_stream(self, mock_search):
        mock_search.side_effect = [False, False, False, False]
        manifest = "test_manifest"
        info_dict = {'is_live': True}
        result = HlsFD.can_download(manifest, info_dict)
        self.assertFalse(result)

    @patch('youtube_dl.downloader.hls.HlsFD.can_download')
    @patch('youtube_dl.downloader.hls.FFmpegFD')
    @patch('youtube_dl.downloader.hls.HlsFD._prepare_url')
    @patch('youtube_dl.downloader.hls.HlsFD.ydl.urlopen')
    def test_real_download_delegate_to_ffmpeg(self, mock_urlopen, mock_prepare_url, mock_ffmpegfd, mock_can_download):
        mock_can_download.return_value = False
        mock_urlopen.return_value.read.return_value.decode.return_value = "test_manifest"
        mock_urlopen.return_value.geturl.return_value = "test_url"
        info_dict = {'url': 'test_url'}
        result = self.instance.real_download('test_filename', info_dict)
        self.assertFalse(result)

    @patch('youtube_dl.downloader.hls.HlsFD.can_download')
    @patch('youtube_dl.downloader.hls.FFmpegFD')
    @patch('youtube_dl.downloader.hls.HlsFD._prepare_url')
    @patch('youtube_dl.downloader.hls.HlsFD.ydl.urlopen')
    def test_real_download_success(self, mock_urlopen, mock_prepare_url, mock_ffmpegfd, mock_can_download):
        mock_can_download.return_value = True
        mock_urlopen.return_value.read.return_value.decode.return_value = "#EXTM3U\n#EXTINF:10,\nhttp://test.com/frag1.ts"
        mock_urlopen.return_value.geturl.return_value = "test_url"
        info_dict = {'url': 'test_url'}
        result = self.instance.real_download('test_filename', info_dict)
        self.assertTrue(result)

    def test_is_ad_fragment_start(self):
        result = self.instance._HlsFD__is_ad_fragment_start('#EXT-X-CUE-OUT')
        self.assertTrue(result)

    def test_is_ad_fragment_end(self):
        result = self.instance._HlsFD__is_ad_fragment_end('#EXT-X-CUE-IN')
        self.assertTrue(result)

    @patch('youtube_dl.downloader.hls.HlsFD._prepare_and_start_frag_download')
    @patch('youtube_dl.downloader.hls.HlsFD._download_fragment')
    @patch('youtube_dl.downloader.hls.HlsFD._append_fragment')
    @patch('youtube_dl.downloader.hls.HlsFD._finish_frag_download')
    def test_real_download_fragments(self, mock_finish_frag_download, mock_append_fragment, mock_download_fragment, mock_prepare_and_start_frag_download):
        mock_download_fragment.return_value = (True, b'test_content')
        manifest = "#EXTM3U\n#EXTINF:10,\nhttp://test.com/frag1.ts"
        info_dict = {'url': 'test_url'}
        self.instance.real_download('test_filename', info_dict)
        self.assertTrue(mock_prepare_and_start_frag_download.called)
        self.assertTrue(mock_download_fragment.called)
        self.assertTrue(mock_append_fragment.called)
        self.assertTrue(mock_finish_frag_download.called)

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
        self.hls_fd.ydl.urlopen().read.return_value = b"#EXTM3U\n#EXT-X-STREAM-INF:BANDWIDTH=1280000\nhttp://example.com/low.m3u8"
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
        self.hls_fd.ydl.urlopen().read.return_value = b"#EXTM3U\n#EXT-X-STREAM-INF:BANDWIDTH=1280000\nhttp://example.com/low.m3u8"
        self.hls_fd.can_download = MagicMock(return_value=False)
        self.hls_fd.report_warning = MagicMock()
        self.hls_fd._progress_hooks = []

        with patch('youtube_dl.downloader.hls.FFmpegFD') as MockFFmpegFD:
            mock_ffmpeg_fd = MockFFmpegFD.return_value
            mock_ffmpeg_fd.real_download.return_value = True
            result = self.hls_fd.real_download('filename', info_dict)
            self.assertTrue(result)
            mock_ffmpeg_fd.real_download.assert_called_once_with('filename', info_dict)

    def test_is_ad_fragment_start(self):
        result = self.hls_fd._HlsFD__is_ad_fragment_start('#EXT-X-CUE-OUT')
        self.assertTrue(result)

    def test_is_ad_fragment_end(self):
        result = self.hls_fd._HlsFD__is_ad_fragment_end('#EXT-X-CUE-IN')
        self.assertTrue(result)

    def test_prepare_and_start_frag_download(self):
        ctx = {'filename': 'test', 'total_frags': 1, 'ad_frags': 0}
        self.hls_fd._prepare_and_start_frag_download(ctx)
        self.assertEqual(ctx['fragment_index'], 0)

    def test_finish_frag_download(self):
        ctx = {'filename': 'test', 'total_frags': 1, 'ad_frags': 0}
        self.hls_fd._finish_frag_download(ctx)
        self.assertTrue(ctx['finished'])

    def test_download_fragment(self):
        ctx = {'filename': 'test', 'total_frags': 1, 'ad_frags': 0}
        frag_url = 'http://example.com/fragment.ts'
        info_dict = {}
        headers = {}
        self.hls_fd.ydl.urlopen = MagicMock()
        self.hls_fd.ydl.urlopen().read.return_value = b'fragment content'
        success, content = self.hls_fd._download_fragment(ctx, frag_url, info_dict, headers)
        self.assertTrue(success)
        self.assertEqual(content, b'fragment content')

    def test_append_fragment(self):
        ctx = {'filename': 'test', 'total_frags': 1, 'ad_frags': 0, 'fragment_index': 0}
        frag_content = b'fragment content'
        self.hls_fd._append_fragment(ctx, frag_content)
        self.assertEqual(ctx['fragment_index'], 1)

    def test_report_retry_fragment(self):
        err = DownloadError('HTTP Error 404: Not Found')
        frag_index = 1
        count = 1
        fragment_retries = 3
        self.hls_fd.report_retry_fragment = MagicMock()
        self.hls_fd.report_retry_fragment(err, frag_index, count, fragment_retries)
        self.hls_fd.report_retry_fragment.assert_called_once_with(err, frag_index, count, fragment_retries)

    def test_report_skip_fragment(self):
        frag_index = 1
        self.hls_fd.report_skip_fragment = MagicMock()
        self.hls_fd.report_skip_fragment(frag_index)
        self.hls_fd.report_skip_fragment.assert_called_once_with(frag_index)

    def test_report_error(self):
        with self.assertRaises(DownloadError):
            self.hls_fd.report_error('Error message')

    def test_report_warning(self):
        self.hls_fd.report_warning = MagicMock()
        self.hls_fd.report_warning('Warning message')
        self.hls_fd.report_warning.assert_called_once_with('Warning message')

if __name__ == '__main__':
    unittest.main()