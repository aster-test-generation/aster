import unittest
from youtube_dl.extractor.nrk import NRKIE


class TestNRKPlaylistBaseIE(unittest.TestCase):
    def test_extract_description(self):
        instance = NRKPlaylistBaseIE()
        result = instance._extract_description("webpage")
        self.assertEqual(result, None)

    def test_real_extract(self):
        instance = NRKPlaylistBaseIE()
        result = instance._real_extract("url")
        self.assertEqual(result, None)

if __name__ == '__main__':
    unittest.main()