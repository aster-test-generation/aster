import unittest
from youtube_dl.extractor.tudou import TudouPlaylistIE, TudouAlbumIE


class TestTudouPlaylistIE(unittest.TestCase):
    def test_IE_NAME(self):
        instance = TudouPlaylistIE()
        self.assertEqual(instance.IE_NAME, 'tudou:playlist')

    def test__VALID_URL(self):
        instance = TudouPlaylistIE()
        self.assertEqual(instance._VALID_URL, r'https?://(?:www\.)?tudou\.com/listplay/(?P<id>[\w-]{11})\.html')

    def test__TESTS(self):
        instance = TudouPlaylistIE()
        self.assertEqual(instance._TESTS, [{
            'url': 'http://www.tudou.com/listplay/zzdE77v6Mmo.html',
            'info_dict': {
                'id': 'zzdE77v6Mmo',
            },
            'playlist_mincount': 209,
        }])

    def test__real_extract(self):
        instance = TudouPlaylistIE()
        url = 'http://www.tudou.com/listplay/zzdE77v6Mmo.html'
        result = instance._real_extract(url)
        self.assertIsInstance(result, dict)

    def test__match_id(self):
        instance = TudouPlaylistIE()
        url = 'http://www.tudou.com/listplay/zzdE77v6Mmo.html'
        result = instance._match_id(url)
        self.assertEqual(result, 'zzdE77v6Mmo')

    def test__download_json(self):
        instance = TudouPlaylistIE()
        url = 'http://www.tudou.com/tvp/plist.action?lcode=zzdE77v6Mmo'
        result = instance._download_json(url, 'zzdE77v6Mmo')
        self.assertIsInstance(result, dict)

    def test_url_result(self):
        instance = TudouPlaylistIE()
        url = 'http://www.tudou.com/programs/view/icode'
        result = instance.url_result(url, 'Tudou', 'icode', 'kw')
        self.assertIsInstance(result, dict)

    def test_playlist_result(self):
        instance = TudouPlaylistIE()
        entries = [{'url': 'http://www.tudou.com/programs/view/icode'}]
        result = instance.playlist_result(entries, 'zzdE77v6Mmo')
        self.assertIsInstance(result, dict)

    def test___init__(self):
        instance = TudouPlaylistIE()
        self.assertIsInstance(instance, TudouPlaylistIE)

    def test___str__(self):
        instance = TudouPlaylistIE()
        result = instance.__str__()
        self.assertIsInstance(result, str)

    def test___repr__(self):
        instance = TudouPlaylistIE()
        result = instance.__repr__()
        self.assertIsInstance(result, str)

class TestTudouAlbumIE(unittest.TestCase):
    def test_IE_NAME(self):
        instance = TudouAlbumIE()
        self.assertEqual(instance.IE_NAME, 'tudou:album')

    def test__VALID_URL(self):
        instance = TudouAlbumIE()
        self.assertEqual(instance._VALID_URL, r'https?://(?:www\.)?tudou\.com/album(?:cover|play)/(?P<id>[\w-]{11})')

    def test__TESTS(self):
        instance = TudouAlbumIE()
        self.assertEqual(instance._TESTS, [{
            'url': 'http://www.tudou.com/albumplay/v5qckFJvNJg.html',
            'info_dict': {
                'id': 'v5qckFJvNJg',
            },
            'playlist_mincount': 45,
        }])

    def test__real_extract(self):
        instance = TudouAlbumIE()
        url = 'http://www.tudou.com/albumplay/v5qckFJvNJg.html'
        result = instance._real_extract(url)
        self.assertIsInstance(result, dict)

    def test__match_id(self):
        instance = TudouAlbumIE()
        url = 'http://www.tudou.com/albumplay/v5qckFJvNJg.html'
        result = instance._match_id(url)
        self.assertEqual(result, 'v5qckFJvNJg')

    def test__download_json(self):
        instance = TudouAlbumIE()
        url = 'http://www.tudou.com/tvp/alist.action?acode=v5qckFJvNJg'
        result = instance._download_json(url, 'v5qckFJvNJg')
        self.assertIsInstance(result, dict)

if __name__ == '__main__':
    unittest.main()