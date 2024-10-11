import unittest
from youtube_dl.extractor.nrk import NRKTVSeriesIE


class TestNRKTVSeriesIE(unittest.TestCase):
    def test_suitable(self):
        result = NRKTVSeriesIE.suitable('https://tv.nrk.no/serie/1')
        self.assertEqual(result, True)

    def test_real_extract(self):
        result = NRKTVSeriesIE._real_extract('https://tv.nrk.no/serie/1')
        self.assertEqual(result, None)

if __name__ == '__main__':
    unittest.main()