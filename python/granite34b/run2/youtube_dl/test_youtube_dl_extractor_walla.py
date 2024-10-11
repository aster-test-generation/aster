import unittest
from youtube_dl.extractor.walla import WallaIE


class TestWallaIE(unittest.TestCase):
    def test_real_extract(self):
        ie = WallaIE()
        video = ie._real_extract('http://vod.walla.co.il/movie/2642630/one-direction-all-for-one')
        self.assertEqual(video['id'], '2642630')
        self.assertEqual(video['display_id'], 'one-direction-all-for-one')
        self.assertEqual(video['ext'], 'flv')
        self.assertEqual(video['title'], 'וואן דיירקשן: ההיסטריה')
        self.assertEqual(video['description'], 'md5:de9e2512a92442574cdb0913c49bc4d8')
        self.assertRegex(video['thumbnail'], r'^https?://.*\.jpg')
        self.assertEqual(video['duration'], 3600)

if __name__ == '__main__':
    unittest.main()