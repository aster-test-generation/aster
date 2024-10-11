import unittest
from youtube_dl.extractor.nrk import NRKPlaylistIE


class TestNRKPlaylistIE(unittest.TestCase):
    def setUp(self):
        self.instance = NRKPlaylistIE()

    def test_init(self):
        self.assertIsInstance(self.instance, NRKPlaylistIE)

    def test_extract_title(self):
        webpage = '<html><head><meta property="og:title" content="Test Title"></head></html>'
        result = self.instance._extract_title(webpage)
        self.assertEqual(result, "Test Title")

    def test_extract_description(self):
        webpage = '<html><head><meta property="og:description" content="Test Description"></head></html>'
        result = self.instance._extract_description(webpage)
        self.assertEqual(result, "Test Description")

if __name__ == '__main__':
    unittest.main()