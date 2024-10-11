import unittest
from youtube_dl.downloader.hls import HlsFD
from youtube_dl.utils import DownloadError
from unittest.mock import patch, MagicMock


class TestHlsFD(unittest.TestCase):
    def setUp(self):
        self.instance = HlsFD(MagicMock(), {})

    def test_can_download(self):
        manifest = "#EXTM3U\n#EXT-X-VERSION:3\n#EXT-X-TARGETDURATION:10\n#EXT-X-MEDIA-SEQUENCE:0\n#EXTINF:10.0,\nhttp://media.example.com/first.ts\n#EXTINF:10.0,\nhttp://media.example.com/second.ts\n"
        info_dict = {'is_live': False}
        result = HlsFD.can_download(manifest, info_dict)
        self.assertTrue(result)

    def test_real_download(self):
        info_dict = {
            'url': 'http://media.example.com/playlist.m3u8',
            'is_live': False
        }
        self.instance.ydl.urlopen = MagicMock()
        self.instance.ydl.urlopen().read.return_value = "#EXTM3U\n#EXT-X-VERSION:3\n#EXT-X-TARGETDURATION:10\n#EXT-X-MEDIA-SEQUENCE:0\n#EXTINF:10.0,\nhttp://media.example.com/first.ts\n#EXTINF:10.0,\nhttp://media.example.com/second.ts\n"
        self.instance._prepare_url = MagicMock(return_value='http://media.example.com/playlist.m3u8')
        self.instance._prepare_and_start_frag_download = MagicMock()
        self.instance._download_fragment = MagicMock(return_value=(True, b'content'))
        self.instance._append_fragment = MagicMock()
        self.instance._finish_frag_download = MagicMock()

        result = self.instance.real_download('filename', info_dict)
        self.assertTrue(result)

    def test_real_download_with_unsupported_features(self):
        info_dict = {
            'url': 'http://media.example.com/playlist.m3u8',
            'is_live': False
        }
        self.instance.ydl.urlopen = MagicMock()
        self.instance.ydl.urlopen().read.return_value = "#EXTM3U\n#EXT-X-VERSION:3\n#EXT-X-TARGETDURATION:10\n#EXT-X-MEDIA-SEQUENCE:0\n#EXT-X-KEY:METHOD=AES-128,URI=\"http://media.example.com/key\"\n#EXTINF:10.0,\nhttp://media.example.com/first.ts\n#EXTINF:10.0,\nhttp://media.example.com/second.ts\n"
        self.instance._prepare_url = MagicMock(return_value='http://media.example.com/playlist.m3u8')
        self.instance.report_warning = MagicMock()
        self.instance.report_error = MagicMock()
        self.instance._prepare_and_start_frag_download = MagicMock()
        self.instance._download_fragment = MagicMock(return_value=(True, b'content'))
        self.instance._append_fragment = MagicMock()
        self.instance._finish_frag_download = MagicMock()

        with patch('youtube_dl.downloader.hls.FFmpegFD') as MockFFmpegFD:
            mock_ffmpeg_instance = MockFFmpegFD.return_value
            mock_ffmpeg_instance.real_download.return_value = True
            result = self.instance.real_download('filename', info_dict)
            self.assertTrue(result)

    def test_is_ad_fragment_start(self):
        result = self.instance._HlsFD__is_ad_fragment_start('#EXT-X-CUE-OUT')
        self.assertTrue(result)

    def test_is_ad_fragment_end(self):
        result = self.instance._HlsFD__is_ad_fragment_end('#EXT-X-CUE-IN')
        self.assertTrue(result)

    def test_prepare_url(self):
        info_dict = {'url': 'http://media.example.com/playlist.m3u8'}
        result = self.instance._prepare_url(info_dict, 'http://media.example.com/playlist.m3u8')
        self.assertEqual(result, 'http://media.example.com/playlist.m3u8')

    def test_prepare_and_start_frag_download(self):
        ctx = {'filename': 'filename', 'total_frags': 2, 'ad_frags': 0}
        self.instance._prepare_and_start_frag_download(ctx)
        self.assertEqual(ctx['fragment_index'], 0)

    def test_append_fragment(self):
        ctx = {'filename': 'filename', 'total_frags': 2, 'ad_frags': 0}
        self.instance._append_fragment(ctx, b'content')
        self.assertEqual(ctx['fragment_index'], 1)

    def test_finish_frag_download(self):
        ctx = {'filename': 'filename', 'total_frags': 2, 'ad_frags': 0}
        self.instance._finish_frag_download(ctx)
        self.assertEqual(ctx['fragment_index'], 2)

if __name__ == '__main__':
    unittest.main()