import unittest
from youtube_dl.extractor.nrk import NRKTVEpisodesIE


class TestNRKTVEpisodesIE(unittest.TestCase):
    def test_extract_title(self):
        instance = NRKTVEpisodesIE()
        result = instance._extract_title("")
        self.assertEqual(result, None)

if __name__ == '__main__':
    unittest.main()