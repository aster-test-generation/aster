import unittest
from youtube_dl.extractor.nrk import NRKIE


class TestNRKPlaylistBaseIE(unittest.TestCase):
    def test_extract_description(self):
        instance = NRKPlaylistBaseIE()
        result = instance._extract_description("webpage")
        self.assertEqual(result, None)

    def test_real_extract(self):
        instance = NRKPlaylistBaseIE()
        result = instance._real_extract("url")
        self.assertEqual(result, None)

    def test_init(self):
        instance = NRKPlaylistBaseIE()
        self.assertEqual(instance.__class__, NRKPlaylistBaseIE)

    def test_extract_title(self):
        instance = NRKPlaylistBaseIE()
        result = instance._extract_title("webpage")
        self.assertEqual(result, None)

    def test_match_id(self):
        instance = NRKPlaylistBaseIE()
        result = instance._match_id("url")
        self.assertEqual(result, None)

    def test_download_webpage(self):
        instance = NRKPlaylistBaseIE()
        result = instance._download_webpage("url", "playlist_id")
        self.assertEqual(result, None)

    def test_url_result(self):
        instance = NRKPlaylistBaseIE()
        result = instance.url_result("nrk:video_id", "NRKIE.ie_key()")
        self.assertEqual(result, None)

    def test_playlist_result(self):
        instance = NRKPlaylistBaseIE()
        result = instance.playlist_result("entries", "playlist_id", "playlist_title", "playlist_description")
        self.assertEqual(result, None)

if __name__ == '__main__':
    unittest.main()