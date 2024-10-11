import unittest
from youtube_dl.extractor.nrk import *


class TestNRKTVSeasonIE(unittest.TestCase):
    def test_suitable(self):
        result = NRKTVSeasonIE.suitable('https://tv.nrk.no/serie/1234567890')
        self.assertEqual(result, False)

    def test_real_extract(self):
        instance = NRKTVSeasonIE()
        result = instance._real_extract('https://tv.nrk.no/serie/1234567890')
        self.assertEqual(result, None)

if __name__ == '__main__':
    unittest.main()