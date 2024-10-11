import unittest
from youtube_dl.extractor.walla import WallaIE


class TestWallaIE(unittest.TestCase):
    def test_real_extract(self):
        ie = WallaIE()
        url = 'http://vod.walla.co.il/movie/2642630/one-direction-all-for-one'
        info_dict = ie._real_extract(url)
        self.assertEqual(info_dict['id'], '2642630')
        self.assertEqual(info_dict['display_id'], 'one-direction-all-for-one')
        self.assertEqual(info_dict['ext'], 'flv')
        self.assertEqual(info_dict['title'], 'וואן דיירקשן: ההיסטריה')
        self.assertEqual(info_dict['description'], 'md5:de9e2512a92442574cdb0913c49bc4d8')
        self.assertTrue(info_dict['thumbnail'].startswith('https://'))
        self.assertEqual(info_dict['duration'], 3600)

if __name__ == '__main__':
    unittest.main()