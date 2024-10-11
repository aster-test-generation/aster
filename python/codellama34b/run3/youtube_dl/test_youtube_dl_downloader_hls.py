import unittest
from youtube_dl.downloader.hls import *


class TestHlsFD(unittest.TestCase):
    def test_can_download(self):
        instance = HlsFD(ydl, params)
        result = instance.can_download("", {})
        self.assertEqual(result, True)

    def test_real_download(self):
        instance = HlsFD(ydl, params)
        result = instance.real_download("", {})
        self.assertEqual(result, True)

    def test_is_ad_fragment_start(self):
        instance = HlsFD(ydl, params)
        result = instance.is_ad_fragment_start("")
        self.assertEqual(result, True)

    def test_is_ad_fragment_end(self):
        instance = HlsFD(ydl, params)
        result = instance.is_ad_fragment_end("")
        self.assertEqual(result, True)

    def test_prepare_and_start_frag_download(self):
        instance = HlsFD(ydl, params)
        result = instance._prepare_and_start_frag_download({})
        self.assertEqual(result, True)

    def test_download_fragment(self):
        instance = HlsFD(ydl, params)
        result = instance._download_fragment({}, "", {}, {})
        self.assertEqual(result, True)

    def test_append_fragment(self):
        instance = HlsFD(ydl, params)
        result = instance._append_fragment({}, "")
        self.assertEqual(result, True)

    def test_finish_frag_download(self):
        instance = HlsFD(ydl, params)
        result = instance._finish_frag_download({})
        self.assertEqual(result, True)

if __name__ == '__main__':
    unittest.main()