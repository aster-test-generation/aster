import unittest
from youtube_dl.downloader.hls import HlsFD

class TestHlsFD(unittest.TestCase):
    def test_can_download(self):
        # Test the can_download method
        manifest = 'manifest'
        info_dict = {'url': 'url'}
        self.assertTrue(HlsFD.can_download(manifest, info_dict))

    def test_real_download(self):
        # Test the real_download method
        filename = 'filename'
        info_dict = {'url': 'url'}
        hlsfd = HlsFD(None, None)
        self.assertTrue(hlsfd.real_download(filename, info_dict))

if __name__ == '__main__':
    unittest.main()