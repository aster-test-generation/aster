import unittest
from youtube_dl.extractor.nrk import NRKIE


class TestNRKTVIE(unittest.TestCase):
    def test_real_extract(self):
        instance = NRKTVIE()
        result = instance._real_extract('https://www.nrk.no/video/nrk_tv/nrk_tv_100000002712/')
        self.assertEqual(result, 'nrk:100000002712')

    def test_match_id(self):
        instance = NRKTVIE()
        result = instance._match_id('https://www.nrk.no/video/nrk_tv/nrk_tv_100000002712/')
        self.assertEqual(result, '100000002712')

if __name__ == '__main__':
    unittest.main()