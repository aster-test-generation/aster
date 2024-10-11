import unittest
from youtube_dl.downloader.hls import HlsFD


class TestHlsFD(unittest.TestCase):
    def test_can_download(self):
        instance = HlsFD(ydl, params)
        result = instance.can_download("", {})
        self.assertEqual(result, True)

    def test_real_download(self):
        instance = HlsFD(ydl, params)
        result = instance.real_download("", {})
        self.assertEqual(result, True)

if __name__ == '__main__':
    unittest.main()