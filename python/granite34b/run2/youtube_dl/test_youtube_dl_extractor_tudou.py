import unittest
from youtube_dl.extractor.tudou import TudouPlaylistIE, TudouAlbumIE


class TestTudouPlaylistIE(unittest.TestCase):
    def test_real_extract(self):
        playlist_id = 'zzdE77v6Mmo'
        playlist_data = self._download_json(
            'http://www.tudou.com/tvp/plist.action?lcode=%s' % playlist_id, playlist_id)
        entries = [self.url_result(
            'http://www.tudou.com/programs/view/%s' % item['icode'],
            'Tudou', item['icode'],
            item['kw']) for item in playlist_data['items']]
        self.assertEqual(len(entries), 209)

class TestTudouAlbumIE(unittest.TestCase):
    def test_real_extract(self):
        album_id = 'v5qckFJvNJg'
        album_data = self._download_json(
            'http://www.tudou.com/tvp/alist.action?acode=%s' % album_id, album_id)
        entries = [self.url_result(
            'http://www.tudou.com/programs/view/%s' % item['icode'],
            'Tudou', item['icode'],
            item['kw']) for item in album_data['items']]
        self.assertEqual(len(entries), 45)

if __name__ == '__main__':
    unittest.main()