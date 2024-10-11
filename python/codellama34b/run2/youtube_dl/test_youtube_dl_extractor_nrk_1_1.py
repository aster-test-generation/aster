import unittest
from youtube_dl.extractor.nrk import NRKPlaylistIE


class TestNRKPlaylistIE(unittest.TestCase):
    def test_init(self):
        instance = NRKPlaylistIE()
        self.assertIsInstance(instance, NRKPlaylistIE)

    def test_extract_title(self):
        instance = NRKPlaylistIE()
        result = instance._extract_title("webpage")
        self.assertEqual(result, None)

    def test_extract_description(self):
        instance = NRKPlaylistIE()
        result = instance._extract_description("webpage")
        self.assertEqual(result, None)

if __name__ == '__main__':
    unittest.main()