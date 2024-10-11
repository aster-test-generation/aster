import unittest
from youtube_dl.downloader.hls import HlsFD


class TestHlsFD(unittest.TestCase):
    def test_can_download(self):
        manifest = "unsupported feature"
        info_dict = {}
        self.assertFalse(HlsFD.can_download(manifest, info_dict))

    def test_real_download(self):
        filename = "filename"
        info_dict = {
            'url': "http://example.com/manifest.m3u8",
            'http_headers': {'Range': 'bytes=0-1023'},
            'is_live': False,
        }
        hls_fd = HlsFD(self.ydl, self.params)
        self.assertTrue(hls_fd.real_download(filename, info_dict))

if __name__ == '__main__':
    unittest.main()