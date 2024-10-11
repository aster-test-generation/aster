import unittest
from youtube_dl.downloader.hls import HlsFD
from youtube_dl.utils import DownloadError
from unittest.mock import patch, MagicMock

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

if __name__ == '__main__':
    unittest.main()