import unittest
from youtube_dl.extractor.tudou import TudouPlaylistIE, TudouAlbumIE


class TestTudouPlaylistIE(unittest.TestCase):
    def setUp(self):
        self.instance = TudouPlaylistIE()

    def test_ie_name(self):
        self.assertEqual(self.instance.IE_NAME, 'tudou:playlist')

    def test_valid_url(self):
        self.assertTrue(self.instance.suitable('http://www.tudou.com/listplay/zzdE77v6Mmo.html'))

    def test_real_extract(self):
        url = 'http://www.tudou.com/listplay/zzdE77v6Mmo.html'
        self.instance._download_json = lambda *args, **kwargs: {'items': [{'icode': '123', 'kw': 'test'}]}
        result = self.instance._real_extract(url)
        self.assertEqual(result['id'], 'zzdE77v6Mmo')

    def test_protected_match_id(self):
        url = 'http://www.tudou.com/listplay/zzdE77v6Mmo.html'
        result = self.instance._match_id(url)
        self.assertEqual(result, 'zzdE77v6Mmo')

class TestTudouAlbumIE(unittest.TestCase):
    def setUp(self):
        self.instance = TudouAlbumIE()

    def test_ie_name(self):
        self.assertEqual(self.instance.IE_NAME, 'tudou:album')

    def test_valid_url(self):
        self.assertTrue(self.instance.suitable('http://www.tudou.com/albumplay/v5qckFJvNJg.html'))

    def test_real_extract(self):
        url = 'http://www.tudou.com/albumplay/v5qckFJvNJg.html'
        self.instance._download_json = lambda *args, **kwargs: {'items': [{'icode': '456', 'kw': 'test'}]}
        result = self.instance._real_extract(url)
        self.assertEqual(result['id'], 'v5qckFJvNJg')

    def test_protected_match_id(self):
        url = 'http://www.tudou.com/albumplay/v5qckFJvNJg.html'
        result = self.instance._match_id(url)
        self.assertEqual(result, 'v5qckFJvNJg')

if __name__ == '__main__':
    unittest.main()