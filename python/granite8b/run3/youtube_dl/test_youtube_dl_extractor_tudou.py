import unittest
from youtube_dl.extractor.tudou import TudouPlaylistIE, TudouAlbumIE


class TestTudouPlaylistIE(unittest.TestCase):
    def test_real_extract(self):
        ie = TudouPlaylistIE()
        url = 'http://www.tudou.com/listplay/zzdE77v6Mmo.html'
        info_dict = ie._real_extract(url)
        self.assertEqual(info_dict['id'], 'zzdE77v6Mmo')
        self.assertGreaterEqual(len(info_dict['entries']), 209)

class TestTudouAlbumIE(unittest.TestCase):
    def test_real_extract(self):
        ie = TudouAlbumIE()
        url = 'http://www.tudou.com/albumplay/v5qckFJvNJg.html'
        info_dict = ie._real_extract(url)
        self.assertEqual(info_dict['id'], 'v5qckFJvNJg')
        self.assertGreaterEqual(len(info_dict['entries']), 45)

if __name__ == '__main__':
    unittest.main()