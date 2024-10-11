import unittest
from youtube_dl.extractor.nrk import NRKPlaylistIE


class TestNRKPlaylistIE(unittest.TestCase):
    def test_extract_title(self):
        instance = NRKPlaylistIE()
        result = instance._extract_title("")
        self.assertEqual(result, "")

    def test_extract_description(self):
        instance = NRKPlaylistIE()
        result = instance._extract_description("")
        self.assertEqual(result, "")

if __name__ == '__main__':
    unittest.main()