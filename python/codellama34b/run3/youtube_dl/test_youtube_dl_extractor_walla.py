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
        self.assertRegex(result['thumbnail'], r're:^https?://.*\.jpg')
        self.assertEqual(result['duration'], 3600)

    def test_subtitle_langs(self):
        instance = WallaIE()
        result = instance._SUBTITLE_LANGS
        self.assertEqual(result['עברית'], 'heb')

    def test_valid_url(self):
        instance = WallaIE()
        result = instance._VALID_URL
        self.assertRegex(result, r'https?://vod\.walla\.co\.il/[^/]+/(?P<id>\d+)/(?P<display_id>.+)')

    def test_test(self):
        instance = WallaIE()
        result = instance._TEST
        self.assertEqual(result['url'], 'http://vod.walla.co.il/movie/2642630/one-direction-all-for-one')
        self.assertEqual(result['info_dict']['id'], '2642630')
        self.assertEqual(result['info_dict']['display_id'], 'one-direction-all-for-one')
        self.assertEqual(result['info_dict']['ext'], 'flv')
        self.assertEqual(result['info_dict']['title'], 'וואן דיירקשן: ההיסטריה')
        self.assertEqual(result['info_dict']['description'], 'md5:de9e2512a92442574cdb0913c49bc4d8')
        self.assertRegex(result['info_dict']['thumbnail'], r'^https?://.*\.jpg')
        self.assertEqual(result['info_dict']['duration'], 3600)
        self.assertEqual(result['params']['skip_download'], True)

if __name__ == '__main__':
    unittest.main()