import unittest
from unittest.mock import patch
from youtube_dl.extractor import NRKPlaylistBaseI


class TestNRKPlaylistBaseIE(unittest.TestCase):
    def test_init(self):
        ie = NRKPlaylistBaseIE()
        self.assertEqual(ie.ie_key(), 'NRK')

    @patch('youtube_dl.extractor.nrk.NRKPlaylistBaseIE._match_id')
    @patch('youtube_dl.extractor.nrk.NRKPlaylistBaseIE._download_webpage')
    def test_real_extract(self, mock_download_webpage, mock_match_id):
        ie = NRKPlaylistBaseIE()
        mock_match_id.return_value = 'playlist_id'
        mock_download_webpage.return_value = 'webpage'
        entries = ie._real_extract('url')
        self.assertEqual(entries, [])

    @patch('youtube_dl.extractor.nrk.NRKPlaylistBaseIE._ITEM_RE')
    def test_extract_description(self, mock_item_re):
        ie = NRKPlaylistBaseIE()
        webpage = 'webpage'
        description = ie._extract_description(webpage)
        self.assertEqual(description, '')

    @patch('youtube_dl.extractor.nrk.NRKPlaylistBaseIE._download_webpage')
    def test_playlist_result(self, mock_download_webpage):
        ie = NRKPlaylistBaseIE()
        entries = ['entry1', 'entry2']
        playlist_id = 'playlist_id'
        playlist_title = 'playlist_title'
        playlist_description = 'playlist_description'
        result = ie.playlist_result(entries, playlist_id, playlist_title, playlist_description)
        self.assertEqual(result, {'entries': entries, 'id': playlist_id, 'title': playlist_title, 'description': playlist_description})

if __name__ == '__main__':
    unittest.main()