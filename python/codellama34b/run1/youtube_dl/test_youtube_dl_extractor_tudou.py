import unittest
from youtube_dl.extractor.tudou import *



class TestTudouPlaylistIE(unittest.TestCase):
    def test_real_extract(self):
        instance = TudouPlaylistIE()
        result = instance._real_extract("http://www.tudou.com/listplay/zzdE77v6Mmo.html")
        self.assertEqual(result, None)

    def test_IE_NAME(self):
        instance = TudouPlaylistIE()
        result = instance.IE_NAME
        self.assertEqual(result, "tudou:playlist")

    def test_playlist_mincount(self):
        instance = TudouPlaylistIE()
        result = instance.playlist_mincount
        self.assertEqual(result, 209)

    def test_url(self):
        instance = TudouPlaylistIE()
        result = instance.url
        self.assertEqual(result, "http://www.tudou.com/listplay/zzdE77v6Mmo.html")

    def test_info_dict(self):
        instance = TudouPlaylistIE()
        result = instance.info_dict
        self.assertEqual(result, "zzdE77v6Mmo")

    def test_playlist_result(self):
        instance = TudouPlaylistIE()
        result = instance.playlist_result
        self.assertEqual(result, None)

    def test_url_result(self):
        instance = TudouPlaylistIE()
        result = instance.url_result
        self.assertEqual(result, None)

    def test_playlist_data(self):
        instance = TudouPlaylistIE()
        result = instance.playlist_data
        self.assertEqual(result, None)

    def test_items(self):
        instance = TudouPlaylistIE()
        result = instance.items
        self.assertEqual(result, None)

    def test_icode(self):
        instance = TudouPlaylistIE()
        result = instance.icode
        self.assertEqual(result, None)

    def test_kw(self):
        instance = TudouPlaylistIE()
        result = instance.kw
        self.assertEqual(result, None)

    def test_playlist_id(self):
        instance = TudouPlaylistIE()
        result = instance.playlist_id
        self.assertEqual(result, None)

    def test_match_id(self):
        instance = TudouPlaylistIE()
        result = instance.match_id
        self.assertEqual(result, None)

    def test_download_json(self):
        instance = TudouPlaylistIE()
        result = instance.download_json
        self.assertEqual(result, None)

    def test_valid_url(self):
        instance = TudouPlaylistIE()
        result = instance.valid_url
        self.assertEqual(result, None)

    def test_tests(self):
        instance = TudouPlaylistIE()
        result = instance.tests
        self.assertEqual(result, None)

    def test_info_extractor(self):
        instance = TudouPlaylistIE()
        result = instance.info_extractor
        self.assertEqual(result, None)

    def test_common(self):
        instance = TudouPlaylistIE()
        result = instance.common
        self.assertEqual(result, None)

    def test_tudou(self):
        instance = TudouPlaylistIE()
        result = instance.tudou
        self.assertEqual(result, None)

    def test_extractor(self):
        instance = TudouPlaylistIE()
        result = instance.extractor
        self.assertEqual(result, None)

    def test_youtube_dl(self):
        instance = TudouPlaylistIE()
        result = instance.youtube_dl
        self.assertEqual(result, None)



class TestTudouPlaylistIE(unittest.TestCase):
    def test_real_extract(self):
        instance = TudouPlaylistIE()
        result = instance._real_extract("http://www.tudou.com/listplay/zzdE77v6Mmo.html")
        self.assertEqual(result, "zzdE77v6Mmo")

    def test_match_id(self):
        instance = TudouPlaylistIE()
        result = instance._match_id("http://www.tudou.com/listplay/zzdE77v6Mmo.html")
        self.assertEqual(result, "zzdE77v6Mmo")

    def test_download_json(self):
        instance = TudouPlaylistIE()
        result = instance._download_json("http://www.tudou.com/tvp/plist.action?lcode=zzdE77v6Mmo", "zzdE77v6Mmo")
        self.assertEqual(result, "zzdE77v6Mmo")

    def test_url_result(self):
        instance = TudouPlaylistIE()
        result = instance.url_result("http://www.tudou.com/programs/view/zzdE77v6Mmo", "Tudou", "zzdE77v6Mmo", "zzdE77v6Mmo")
        self.assertEqual(result, "zzdE77v6Mmo")

    def test_playlist_result(self):
        instance = TudouPlaylistIE()
        result = instance.playlist_result("zzdE77v6Mmo", "zzdE77v6Mmo")
        self.assertEqual(result, "zzdE77v6Mmo")

class TestTudouAlbumIE(unittest.TestCase):
    def test_real_extract(self):
        instance = TudouAlbumIE()
        result = instance._real_extract("http://www.tudou.com/albumplay/v5qckFJvNJg.html")
        self.assertEqual(result, "v5qckFJvNJg")

    def test_match_id(self):
        instance = TudouAlbumIE()
        result = instance._match_id("http://www.tudou.com/albumplay/v5qckFJvNJg.html")
        self.assertEqual(result, "v5qckFJvNJg")

    def test_download_json(self):
        instance = TudouAlbumIE()
        result = instance._download_json("http://www.tudou.com/tvp/alist.action?acode=v5qckFJvNJg", "v5qckFJvNJg")
        self.assertEqual(result, "v5qckFJvNJg")

    def test_url_result(self):
        instance = TudouAlbumIE()
        result = instance.url_result("http://www.tudou.com/programs/view/v5qckFJvNJg", "Tudou", "v5qckFJvNJg", "v5qckFJvNJg")
        self.assertEqual(result, "v5qckFJvNJg")

    def test_playlist_result(self):
        instance = TudouAlbumIE()
        result = instance.playlist_result("v5qckFJvNJg", "v5qckFJvNJg")
        self.assertEqual(result, "v5qckFJvNJg")

if __name__ == '__main__':
    unittest.main()