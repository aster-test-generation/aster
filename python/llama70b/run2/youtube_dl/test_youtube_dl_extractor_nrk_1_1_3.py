import unittest
from youtube_dl.extractor.nrk import NRKPlaylistBaseI


class TestNRKPlaylistBaseIE(unittest.TestCase):
    def test_init(self):
        instance = NRKPlaylistBaseIE()
        self.assertIsInstance(instance, InfoExtractor)

    def test_match_id(self):
        instance = NRKPlaylistBaseIE()
        url = 'https://example.com/playlist/123'
        result = instance._match_id(url)
        self.assertEqual(result, '123')

    def test_download_webpage(self):
        instance = NRKPlaylistBaseIE()
        url = 'https://example.com/playlist/123'
        webpage = instance._download_webpage(url, '123')
        self.assertIsNotNone(webpage)

    def test_extract_title(self):
        instance = NRKPlaylistBaseIE()
        webpage = '<title>Example Playlist</title>'
        result = instance._extract_title(webpage)
        self.assertEqual(result, 'Example Playlist')

    def test_extract_description(self):
        instance = NRKPlaylistBaseIE()
        webpage = '<meta name="description" content="Example description">'
        result = instance._extract_description(webpage)
        self.assertEqual(result, 'Example description')

    def test_real_extract(self):
        instance = NRKPlaylistBaseIE()
        url = 'https://example.com/playlist/123'
        result = instance._real_extract(url)
        self.assertIsNotNone(result)

    def test_private__ITEM_RE(self):
        instance = NRKPlaylistBaseIE()
        result = instance._NRKPlaylistBaseIE__ITEM_RE
        self.assertIsNotNone(result)

    def test_str_method(self):
        instance = NRKPlaylistBaseIE()
        result = instance.__str__()
        self.assertEqual(result, 'NRKPlaylistBaseIE')

    def test_repr_method(self):
        instance = NRKPlaylistBaseIE()
        result = instance.__repr__()
        self.assertEqual(result, 'NRKPlaylistBaseIE()')

    def test_eq_method(self):
        instance1 = NRKPlaylistBaseIE()
        instance2 = NRKPlaylistBaseIE()
        self.assertEqual(instance1, instance2)

if __name__ == '__main__':
    unittest.main()