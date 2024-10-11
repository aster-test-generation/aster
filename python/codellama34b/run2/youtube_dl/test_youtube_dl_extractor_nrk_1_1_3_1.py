import unittest
from youtube_dl.extractor.nrk import NRKIE


class TestNRKTVIE(unittest.TestCase):
    def test_real_extract(self):
        instance = NRKTVIE()
        result = instance._real_extract('https://www.nrk.no/video/nrk_tv/2018/02/20/nrk-tv-20-februar-2018-100-spor-1.13169350')
        self.assertEqual(result, 'nrk:1.13169350')

if __name__ == '__main__':
    unittest.main()