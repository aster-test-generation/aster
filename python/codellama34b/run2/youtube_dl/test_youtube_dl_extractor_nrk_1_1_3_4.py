import unittest
from youtube_dl.extractor.nrk import NRKTVSeasonIE


class TestNRKTVSeasonIE(unittest.TestCase):
    def test_suitable(self):
        result = NRKTVSeasonIE.suitable('https://tv.nrk.no/serie/sesong/')
        self.assertFalse(result)

    def test_real_extract(self):
        instance = NRKTVSeasonIE()
        result = instance._real_extract('https://tv.nrk.no/serie/sesong/')
        self.assertEqual(result, None)

if __name__ == '__main__':
    unittest.main()