import unittest
from youtube_dl.extractor.nrk import NRKTVSeasonIE


class TestNRKTVSeasonIE(unittest.TestCase):
    def test_suitable(self):
        result = NRKTVSeasonIE.suitable("https://tv.nrk.no/serie/fiskerlivet/sesong/fiskerlivet-sesong-1")
        self.assertEqual(result, True)

    def test_real_extract(self):
        instance = NRKTVSeasonIE()
        result = instance._real_extract("https://tv.nrk.no/serie/fiskerlivet/sesong/fiskerlivet-sesong-1")
        self.assertEqual(result, "https://tv.nrk.no/serie/fiskerlivet/sesong/fiskerlivet-sesong-1")

if __name__ == '__main__':
    unittest.main()