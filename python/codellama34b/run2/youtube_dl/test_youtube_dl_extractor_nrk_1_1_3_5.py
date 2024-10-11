import unittest
from youtube_dl.extractor.nrk import *


class TestNRKTVSeriesIE(unittest.TestCase):
    def test_suitable(self):
        url = "https://tv.nrk.no/serie/123456789"
        result = NRKTVSeriesIE.suitable(url)
        self.assertEqual(result, True)

    def test_real_extract(self):
        url = "https://tv.nrk.no/serie/123456789"
        result = NRKTVSeriesIE._real_extract(url)
        self.assertEqual(result, "playlist_result")


if __name__ == '__main__':
    unittest.main()