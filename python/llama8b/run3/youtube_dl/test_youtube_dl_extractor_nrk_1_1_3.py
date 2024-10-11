import unittest
from youtube_dl.extractor import NRKPlaylistBaseI


class TestNRKPlaylistBaseIE(unittest.TestCase):
    def test_init(self):
        ie = NRKPlaylistBaseIE()
        self.assertEqual(ie.ie_key(), 'NRK')

    def test_match_id(self):
        ie = NRKPlaylistBaseIE()
        url = 'https://www.nrk.no/program/p1/episode/123456'
        self.assertEqual(ie._match_id(url), '123456')

    def test_download_webpage(self):
        ie = NRKPlaylistBaseIE()
        url = 'https://www.nrk.no/program/p1/episode/123456'
        webpage = ie._download_webpage(url, 'playlist_id')
        self.assertIsNotNone(webpage)

    def test_extract_title(self):
        ie = NRKPlaylistBaseIE()
        webpage = '<title>NRK Program 1 Episode 123456</title>'
        self.assertEqual(ie._extract_title(webpage), 'NRK Program 1 Episode 123456')

    def test_extract_description(self):
        ie = NRKPlaylistBaseIE()
        webpage = '<p>This is the description of the episode.</p>'
        self.assertEqual(ie._extract_description(webpage), 'This is the description of the episode.')

    def test_real_extract(self):
        ie = NRKPlaylistBaseIE()
        url = 'https://www.nrk.no/program/p1/episode/123456'
        webpage = '<p>This is the description of the episode.</p><a href="https://www.nrk.no/program/p1/video/123456">Video 1</a><a href="https://www.nrk.no/program/p1/video/123457">Video 2</a>'
        entries = ie._real_extract(url)
        self.assertEqual(len(entries), 2)

    def test_playlist_result(self):
        ie = NRKPlaylistBaseIE()
        entries = [{'id': '123456', 'title': 'Video 1'}, {'id': '123457', 'title': 'Video 2'}]
        playlist_id = 'playlist_id'
        playlist_title = 'Playlist Title'
        playlist_description = 'Playlist Description'
        result = ie.playlist_result(entries, playlist_id, playlist_title, playlist_description)
        self.assertEqual(result['id'], playlist_id)
        self.assertEqual(result['title'], playlist_title)
        self.assertEqual(result['description'], playlist_description)
        self.assertEqual(len(result['entries']), 2)

if __name__ == '__main__':
    unittest.main()