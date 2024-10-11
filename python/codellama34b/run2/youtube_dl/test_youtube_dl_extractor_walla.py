import unittest
from youtube_dl.extractor.walla import WallaIE


class TestWallaIE(unittest.TestCase):
    def test_real_extract(self):
        instance = WallaIE()
        result = instance._real_extract("http://vod.walla.co.il/movie/2642630/one-direction-all-for-one")
        self.assertEqual(result['id'], '2642630')
        self.assertEqual(result['display_id'], 'one-direction-all-for-one')
        self.assertEqual(result['ext'], 'flv')
        self.assertEqual(result['title'], 'וואן דיירקשן: ההיסטריה')
        self.assertEqual(result['description'], 'md5:de9e2512a92442574cdb0913c49bc4d8')
        self.assertEqual(result['thumbnail'], 're:^https?://.*\.jpg')
        self.assertEqual(result['duration'], 3600)

    def test_SUBTITLE_LANGS(self):
        instance = WallaIE()
        result = instance._SUBTITLE_LANGS
        self.assertEqual(result, {'עברית': 'heb'})

    def test__VALID_URL(self):
        instance = WallaIE()
        result = instance._VALID_URL
        self.assertEqual(result, 'https?://vod\.walla\.co\.il/[^/]+/(?P<id>\d+)/(?P<display_id>.+)')

    def test__TEST(self):
        instance = WallaIE()
        result = instance._TEST
        self.assertEqual(result, {'url': 'http://vod.walla.co.il/movie/2642630/one-direction-all-for-one', 'info_dict': {'id': '2642630', 'display_id': 'one-direction-all-for-one', 'ext': 'flv', 'title': 'וואן דיירקשן: ההיסטריה', 'description': 'md5:de9e2512a92442574cdb0913c49bc4d8', 'thumbnail': 're:^https?://.*\.jpg', 'duration': 3600}, 'params': {'skip_download': True}})

if __name__ == '__main__':
    unittest.main()