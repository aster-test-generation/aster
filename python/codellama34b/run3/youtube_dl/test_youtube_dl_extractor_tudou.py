import unittest
from youtube_dl.extractor.tudou import TudouPlaylistIE, TudouAlbumIE


class TestTudouPlaylistIE(unittest.TestCase):
    def test_real_extract(self):
        instance = TudouPlaylistIE()
        result = instance._real_extract('http://www.tudou.com/listplay/zzdE77v6Mmo.html')
        self.assertEqual(result, None)

    def test_match_id(self):
        instance = TudouPlaylistIE()
        result = instance._match_id('http://www.tudou.com/listplay/zzdE77v6Mmo.html')
        self.assertEqual(result, 'zzdE77v6Mmo')

    def test_download_json(self):
        instance = TudouPlaylistIE()
        result = instance._download_json('http://www.tudou.com/tvp/plist.action?lcode=zzdE77v6Mmo', 'zzdE77v6Mmo')
        self.assertEqual(result, None)

    def test_url_result(self):
        instance = TudouPlaylistIE()
        result = instance.url_result('http://www.tudou.com/programs/view/v5qckFJvNJg', 'Tudou', 'v5qckFJvNJg', 'kw')
        self.assertEqual(result, None)

    def test_playlist_result(self):
        instance = TudouPlaylistIE()
        result = instance.playlist_result([], 'zzdE77v6Mmo')
        self.assertEqual(result, None)

class TestTudouAlbumIE(unittest.TestCase):
    def test_real_extract(self):
        instance = TudouAlbumIE()
        result = instance._real_extract('http://www.tudou.com/albumplay/v5qckFJvNJg.html')
        self.assertEqual(result, None)

    def test_match_id(self):
        instance = TudouAlbumIE()
        result = instance._match_id('http://www.tudou.com/albumplay/v5qckFJvNJg.html')
        self.assertEqual(result, 'v5qckFJvNJg')

    def test_download_json(self):
        instance = TudouAlbumIE()
        result = instance._download_json('http://www.tudou.com/tvp/alist.action?acode=v5qckFJvNJg', 'v5qckFJvNJg')
        self.assertEqual(result, None)

    def test_url_result(self):
        instance = TudouAlbumIE()
        result = instance.url_result('http://www.tudou.com/programs/view/v5qckFJvNJg', 'Tudou', 'v5qckFJvNJg', 'kw')
        self.assertEqual(result, None)

    def test_playlist_result(self):
        instance = TudouAlbumIE()
        result = instance.playlist_result([], 'v5qckFJvNJg')
        self.assertEqual(result, None)

if __name__ == '__main__':
    unittest.main()