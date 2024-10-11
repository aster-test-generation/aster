import unittest
from youtube_dl.extractor.nrk import NRKTVSeriesIE


class TestNRKTVSeriesIE(unittest.TestCase):
    def test_suitable(self):
        self.assertFalse(NRKTVSeriesIE.suitable('https://tv.nrk.no/program/ZDF-finland/'))
        self.assertFalse(NRKTVSeriesIE.suitable('https://tv.nrk.no/program/NRK-plass/'))
        self.assertFalse(NRKTVSeriesIE.suitable('https://radio.nrk.no/program/NRK-plass/'))
        self.assertTrue(NRKTVSeriesIE.suitable('https://tv.nrk.no/serier/123456/'))
        self.assertTrue(NRKTVSeriesIE.suitable('https://radio.nrk.no/serier/123456/'))

if __name__ == '__main__':
    unittest.main()