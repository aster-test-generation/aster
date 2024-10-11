import unittest
from youtube_dl.extractors.tudou import TudouPlaylistIE, TudouAlbumI
from youtube_dl.extractor.common import InfoExtractor


class TestTudouPlaylistIE(unittest.TestCase):
    def test_valid_url(self):
        ie = TudouPlaylistIE()
        url = 'http://www.tudou.com/listplay/zzdE77v6Mmo.html'
        playlist_id = ie._match_id(url)
        self.assertEqual(playlist_id, 'zzdE77v6Mmo')

    def test_download_json(self):
        ie = TudouPlaylistIE()
        playlist_id = 'zzdE77v6Mmo'
        playlist_data = ie._download_json(
            'http://www.tudou.com/tvp/plist.action?lcode=%s' % playlist_id, playlist_id)
        self.assertIsNotNone(playlist_data)

    def test_playlist_result(self):
        ie = TudouPlaylistIE()
        entries = ['http://www.tudou.com/programs/view/%s' % item for item in ['icode1', 'icode2']]
        playlist_id = 'zzdE77v6Mmo'
        result = ie.playlist_result(entries, playlist_id)
        self.assertIsNotNone(result)

    def test_real_extract(self):
        ie = TudouPlaylistIE()
        url = 'http://www.tudou.com/listplay/zzdE77v6Mmo.html'
        result = ie._real_extract(url)
        self.assertIsNotNone(result)

class TestTudouAlbumIE(unittest.TestCase):
    def test_valid_url(self):
        ie = TudouAlbumIE()
        url = 'http://www.tudou.com/albumplay/v5qckFJvNJg.html'
        album_id = ie._match_id(url)
        self.assertEqual(album_id, 'v5qckFJvNJg')

    def test_download_json(self):
        ie = TudouAlbumIE()
        album_id = 'v5qckFJvNJg'
        album_data = ie._download_json(
            'http://www.tudou.com/tvp/alist.action?acode=%s' % album_id, album_id)
        self.assertIsNotNone(album_data)

    def test_playlist_result(self):
        ie = TudouAlbumIE()
        entries = ['http://www.tudou.com/programs/view/%s' % item for item in ['icode1', 'icode2']]
        album_id = 'v5qckFJvNJg'
        result = ie.playlist_result(entries, album_id)
        self.assertIsNotNone(result)

    def test_real_extract(self):
        ie = TudouAlbumIE()
        url = 'http://www.tudou.com/albumplay/v5qckFJvNJg.html'
        result = ie._real_extract(url)
        self.assertIsNotNone(result)

if __name__ == '__main__':
    unittest.main()